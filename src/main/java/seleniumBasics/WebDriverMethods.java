package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		// maximize the screen
		driver.manage().window().maximize();

		// full screen mode
		//driver.manage().window().fullscreen();

		// Get page source in console
		//String pgSource = driver.getPageSource();
	//	System.out.println(pgSource);
		
		driver.navigate().refresh();
		
		//driver.get(driver.getCurrentUrl());
		
		
		
	}

}
