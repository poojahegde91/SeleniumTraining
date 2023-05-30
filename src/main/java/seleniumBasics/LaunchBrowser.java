package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String path = SeleniumManager.getInstance().getDriverPath(co);
		
		System.out.println(path);
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		//System.out.println(driver.getTitle());

	}

}
