package windowHandlesConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); // parent window
		Thread.sleep(5000);
		String parentWindowId = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");

		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com/");

		System.out.println(driver.getTitle());
		driver.close();

	}

}
