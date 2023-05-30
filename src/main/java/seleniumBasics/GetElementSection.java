package seleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementSection {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By listRightPane = By.className("list-group-item");
		clickElementFromPageSection(listRightPane, "Register");

	}

	public static void clickElementFromPageSection(By locator, String eleText) {
		List<WebElement> eleList = getElements(locator);

		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.equals(eleText)) {
				e.click();
				break;
			}
		}

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> getElementsTextList(By locator) {
		List<WebElement> linkList = getElements(locator);

		System.out.println(linkList.size());

		List<String> linkListValue = new ArrayList<String>();
		for (WebElement e : linkList) {
			String text = e.getText();
			linkListValue.add(text);

		}
		return linkListValue;
	}

}
