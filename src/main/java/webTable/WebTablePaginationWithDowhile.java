package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationWithDowhile {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(4000);

		do {
			if (driver.findElements(By.xpath("//td[text()='Denmark']")).size() > 0) {
				selectCountry("Denmark");
				break;
			} else {
				WebElement next = driver.findElement(By.linkText("Next"));

				if (next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagination is over.. Country not found");
					break;
				}

				next.click();
				Thread.sleep(1500);
			}
		} while (true);

	}

	public static void selectCountry(String CountryName) {
		driver.findElement(By.xpath("//td[text()='" + CountryName + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

}
