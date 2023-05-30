package dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSelectClass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://demo.1crmcloud.com/login.php");

		/*
		 * Select langDropDown = new Select(driver.findElement(By.id("login_lang")));
		 * 
		 * langDropDown.selectByIndex(2); Thread.sleep(2000);
		 * langDropDown.selectByValue("de_DE"); Thread.sleep(2000);
		 * langDropDown.selectByVisibleText("IT Italiano"); Thread.sleep(2000);
		 */
		
		By langDropDownField = By.id("login_lang");
		
		doSelectDropDownByID(langDropDownField, 2);
		
	}

	public static void doSelectDropDownByID(By locator, int index)
	{
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectDropDownByValue(By locator, String value)
	{
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void doSelectDropDownByID(By locator,  String value)
	{
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

	private static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
}
