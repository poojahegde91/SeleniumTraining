package actionsClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithKEYSConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(driver.findElement(firstName), "Pooja")
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys("Hegde")
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys("pooja@gmail.com")
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys("9874561235")
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys("pooja!233")
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys("pooja!233")
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys(Keys.TAB)
			.pause(1000)
			.click(driver.findElement(By.xpath("//input[@type='checkbox']")))
			.pause(1000)
			.sendKeys(Keys.TAB)
			.pause(1000)
			.click(driver.findElement(By.xpath("//input[@type='submit']")))
			.pause(1000)
			.build().perform();

	}

}
