package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionIDWithClose {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		// session id = a8a7d3630156acd93cc332097b850cff
		System.out.println(driver.getCurrentUrl());
		// session id = a8a7d3630156acd93cc332097b850cff
		driver.close();
		// session id = a8a7d3630156acd93cc332097b850cff
		driver.getTitle();
		// org.openqa.selenium.NoSuchSessionException: invalid session id
	}

}
