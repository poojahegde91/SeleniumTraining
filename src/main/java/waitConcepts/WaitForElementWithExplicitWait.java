package waitConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementWithExplicitWait {
	static WebDriver driver;
	static int DEFAULT_TIME_OUT;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		By userName = By.name("username");
//		By invalidUserName = By.name("username111");
		By password = By.name("password");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement username_ele = wait.until(ExpectedConditions.presenceOfElementLocated(userName));
//		username_ele.sendKeys("test@gmail.com");

		waitForElementPresence(userName, 5).sendKeys("Test@gmail.com");
		// waitForElementPresence(invalidUserName, 5).sendKeys("Test1@gmail.com");
		waitForElementVisible(password, 5).sendKeys("passwotrd");
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */

	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that isgreater than 0.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */

	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static WebElement getElement(By locator, int timeOut) {
		return waitForElementVisible(locator, timeOut);
	}

	public static WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			System.out.println("element is found with locator: " + locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element is not found using this locator..." + locator);
			element = waitForElementVisible(locator, DEFAULT_TIME_OUT);
		}
		return element;
	}

}
