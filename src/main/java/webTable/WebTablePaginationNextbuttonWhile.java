package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationNextbuttonWhile {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);

		while (true) {
			Thread.sleep(2000);
			// for single element
			if (driver.findElements(By.xpath("//td[text()='Brazil']")).size() > 0) {
				selectCountry("Brazil");
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
		}
	}

	public static void selectCountry(String CountryName) {
		driver.findElement(By.xpath("//td[text()='" + CountryName + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

}
