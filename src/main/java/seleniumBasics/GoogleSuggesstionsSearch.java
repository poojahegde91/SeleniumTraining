package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggesstionsSearch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		By seachField = By.name("q");
		By suggList = By.xpath("//div[@class='wM6W7d']/span");

		searchSuggesstions(seachField, "Selenium", suggList, "gris");
	}

	public static void searchSuggesstions(By locator, String searchKey, By suggLocator, String suggText)
			throws InterruptedException {
		driver.findElement(locator).sendKeys(searchKey);
		Thread.sleep(3000);

		List<WebElement> searchList = driver.findElements(suggLocator);
		System.out.println(searchList.size());

		if (searchList.size() > 0) {
			for (WebElement e : searchList) {
				String text = e.getText();
				if (text.length() > 0) {
					System.out.println("list is --" + text);
					if (e.getText().contains(suggText)) {
						e.click();
						break;
					} else {
						System.out.println(suggText + "is not present in suggestions "+ text);
					}
				}
				else
				{
					System.out.println("blank values -- but no sugeestions");
					break;
				}
			}

		} else {
			System.out.println("No such suggestions found");
		}
	}

}
