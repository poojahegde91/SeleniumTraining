package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		String placeholder=driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		System.out.println(placeholder);
//		
//		String name=driver.findElement(By.id("input-firstname")).getAttribute("name");
//		System.out.println(name);
//		
//		String href=driver.findElement(By.linkText("Login")).getAttribute("href");
//		System.out.println(href);
//		
//		String type=driver.findElement(By.id("input-firstname")).getAttribute("type");
//		System.out.println(type);

		By firstName = By.id("input-firstname");
		By loginBtn = By.linkText("Login");

		String name = doGetAttributeValue(firstName, "name");
		String placeholder = doGetAttributeValue(firstName, "placeholder");
		String type = doGetAttributeValue(firstName, "type");
		String href = doGetAttributeValue(loginBtn, "href");
		
		System.out.println(name + "---" + placeholder + "--" + type +"---"+ href);

	}

	public static String doGetAttributeValue(By locator, String attribute) {
		return getElement(locator).getAttribute(attribute);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
