package seleniumBasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().setSize(new Dimension(500,900));
		
		//OR
		
		Dimension dim = new Dimension(900, 900);
		driver.manage().window().setSize(dim);
	}

}
