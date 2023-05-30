package actionsClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultilevelMenu {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");

		By parentMenu = By.xpath("//a[@qa='categoryDD']");

		multiLevelMenuChildMenu(parentMenu, "Beverages", "Tea", "Tea Bags");
	}

	public static void multiLevelMenuChildMenu(By parentMenuLocator, String level2LinkText, String level3LinkText,
			String level4LinkText) throws InterruptedException {

		WebElement level1 = getElement(parentMenuLocator);

		Actions act = new Actions(driver);
		act.moveToElement(level1).build().perform();
		Thread.sleep(2000);
		WebElement level2 = getElement(By.linkText(level2LinkText));
		act.moveToElement(level2).build().perform();
		Thread.sleep(2000);
		WebElement level3 = getElement(By.linkText(level3LinkText));
		act.moveToElement(level3).build().perform();
		Thread.sleep(2000);

		getElement(By.linkText(level4LinkText)).click();
	}

	private static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

}
