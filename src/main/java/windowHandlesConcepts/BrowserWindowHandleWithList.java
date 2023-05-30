package windowHandlesConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); // parent window
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click(); // child window

		Set<String> handles = driver.getWindowHandles();
		
		List<String> handlesList = new ArrayList<String>(handles);
		
		String parentWindowId=handlesList.get(0);
		String childWindowId=handlesList.get(1);
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
	}

}
