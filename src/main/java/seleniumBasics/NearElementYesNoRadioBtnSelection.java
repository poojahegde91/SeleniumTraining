package seleniumBasics;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NearElementYesNoRadioBtnSelection {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		WebElement ele = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
		Thread.sleep(4000);
		driver.findElement(with(By.xpath("//input[@value=1 and @type='radio' and @name='newsletter']")).near(ele))
				.click();
	}
}
