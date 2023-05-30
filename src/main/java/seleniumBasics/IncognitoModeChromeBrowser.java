package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoModeChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

	}

}
