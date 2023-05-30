package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverBinaryConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		//monitor task manager where server will run in backend
		driver.quit();
		//once driver is quit it will disconnect the connection with server
		

	}

}
