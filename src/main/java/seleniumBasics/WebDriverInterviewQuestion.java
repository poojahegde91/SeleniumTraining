package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInterviewQuestion {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com");
		
		driver=driver1; //here driver is pointing to driver1 
		
		System.out.println(driver.getTitle());
		//output will be Google
		

	}

}
