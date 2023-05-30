package dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(1500);

		driver.findElement(By.id("justAnInputBox")).click();

		By listOfOptions = By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//li/span[contains(@class, 'comboTreeItemTitle')]");
		//doSelectValuesFromJquery(listOfOptions, "choice 7", "choice 2", "choice 3", "choice 6 2 1");
		//doSelectValuesFromJquery(listOfOptions, "choice 1");
		doSelectValuesFromJquery(listOfOptions, "all");
		Thread.sleep(5000);
		doSelectValuesFromJquery(listOfOptions, "all");
	}

	public static void doSelectValuesFromJquery(By locator, String... value) {
		List<WebElement> choiceList = driver.findElements(locator);

		System.out.println(choiceList.size());

		if (!value[0].equalsIgnoreCase("all")) {
			for (WebElement e : choiceList) {
				String text = e.getText();
				System.out.println(text);
				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						e.click();
						break;
					}
				}
			}
		}

		else {
			for (WebElement e : choiceList) {
				e.click();
			}
		}
	}

}
