package windowHandlesConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); // parent window
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click(); // child window

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();

		String parentWindowId = itr.next();
		String childWindowId = itr.next();

		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());

	}

}
