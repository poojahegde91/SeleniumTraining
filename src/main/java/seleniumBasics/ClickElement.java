package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickElement {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		By userName = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
	
		doSendKeys(userName, "Pooja@gmail.com");
		doSendKeys(password, "Pooja@123");
		
		doClear(userName); //clear is not working in this site
		doSendKeys(userName, "PoojaHegde@gmail.com");
		
		doClick(loginBtn);

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
	public static void doSendKeys(By locator, String value )
	{
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}

	public static void doClear(By locator)
	{
		getElement(locator).clear();
	}
}
