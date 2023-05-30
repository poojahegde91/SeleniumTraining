package seleniumBasics;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotPresentConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com");

		By searchBox = By.id("twotabsearchtextbox");

		getElement(searchBox);

		By searchBox1 = By.id("twotabsearchtextb1ox");

		getElement(searchBox1);

	}

	public static WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			System.out.println("Element is found using this locator..." + locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element is not found using this locator..." + locator);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			element = driver.findElement(locator);
		}
		return element;
	}

}
