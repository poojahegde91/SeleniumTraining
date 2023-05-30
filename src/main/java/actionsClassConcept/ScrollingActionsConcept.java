package actionsClassConcept;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingActionsConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		Thread.sleep(2000);
		
		//refresh the page:
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
		
		
		
	}

}
