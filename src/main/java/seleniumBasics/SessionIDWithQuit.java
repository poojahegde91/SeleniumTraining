package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionIDWithQuit {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		// session id = ae178939670c9cae2cccca7477cd9a22
		System.out.println(driver.getCurrentUrl());
		// session id = ae178939670c9cae2cccca7477cd9a22
		driver.quit();
		// session id = null
		driver.getTitle();
		// org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	}

}
