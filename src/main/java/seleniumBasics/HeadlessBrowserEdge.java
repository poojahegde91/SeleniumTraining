package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessBrowserEdge {

	public static void main(String[] args) {
		
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--headless");
		
		WebDriver driver = new EdgeDriver(eo);
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		

	}

}
