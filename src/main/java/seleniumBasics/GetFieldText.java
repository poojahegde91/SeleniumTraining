package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFieldText {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement userName = driver.findElement(By.id("input-email"));
		userName.sendKeys("Pooja@gmail.com");
		System.out.println(userName.getAttribute("value"));

	}

}
