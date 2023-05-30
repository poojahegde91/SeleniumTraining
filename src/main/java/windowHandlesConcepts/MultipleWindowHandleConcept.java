package windowHandlesConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); // parent window
		Thread.sleep(5000);
		String parentWindowId = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]")).click(); // child window
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'youtube')]")).click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();

		while (itr.hasNext()) {
			String WindowId = itr.next();
			driver.switchTo().window(WindowId);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(2000);

			if (!WindowId.equals(parentWindowId)) {
				driver.close();
			}

		}
		driver.switchTo().window(parentWindowId);

	}

}
