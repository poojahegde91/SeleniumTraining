package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
//		boolean isDisplayed = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
//		System.out.println(isDisplayed);
		
		By search = By.id("twotabsearchtextbox");
		boolean isDisplayed = IsElementDisplayed(search);
		System.out.println(isDisplayed);
	}

	
	
	public static boolean IsElementDisplayed(By locator) {
		if(getElementsCount(locator)>0) {
			System.out.println("Element present on the page");
			return true;
		}
		else
			return false;
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
