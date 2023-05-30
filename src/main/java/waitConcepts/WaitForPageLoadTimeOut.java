package waitConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageLoadTimeOut {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		// pageLoadTimeout : Sets the amount of time to wait for a page load to complete
		// before throwing
		// an error.If the timeout is negative, not null, or greater than 2e16 - 1, an
		// error code withinvalid argument will be returned.
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		waitForPageLoad(10);

		driver.findElement(By.linkText("Courses")).click();
		
		if (isPageLoaded(10)) {
			System.out.println("Page loaded successfully ...");

		} else {
			System.out.println("Page not loaded.. ");
		}
	}

	public static void waitForPageLoad(int timeOut) {
		long currentTime = System.currentTimeMillis();
		System.out.println(currentTime);
		long endTime = currentTime + timeOut;
		while (currentTime < endTime) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String status = js.executeScript("return document.readyState").toString();
			if (status.equals("complete")) {
				System.out.println("Page loaded successfully ..." + status);
				break;
			} else {
				System.out.println("Page not loaded.. " + status);
			}
		}
	}

	public static boolean isPageLoaded(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		String flag = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == \'complete\'"))
				.toString();
		return Boolean.parseBoolean(flag);
	}
}
