package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// create a webelement + perform action (click, sendKeys, getText, isDisplayed...)
		// findElement() + click(), sendKeys();
		
		//1st way
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		
		//2nd way
		WebElement userName=driver.findElement(By.id("input-email"));
		userName.sendKeys("test");
		
		//3rd way: By locator
		By username = By.id("input-email");
		WebElement userName1=driver.findElement(username);
		userName1.sendKeys("test");
		
		//4th way: by locator and generic function
		By username1 = By.id("input-email");
		WebElement userName2=getElement(username1);
		userName2.sendKeys("test");
		
		//5th way : By locator and create generic functions for webelement and action
		By username2 = By.id("input-email");
		doSendKeys(username2, "Test");
		
		////6th: By locator and create generic functions for webelement and action in util class
		

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}

}
