package actionsClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		
		By contentParentMenu = By.className("menulink");
		By courseChildMenu = By.linkText("COURSES");
		
		handleTwoLevelMenu(contentParentMenu, courseChildMenu);
	}

	public static void handleTwoLevelMenu(By parentMenu, By childMenu) throws InterruptedException
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(getElement(parentMenu)).build().perform();
		Thread.sleep(2000);
		
		getElement(childMenu).click();
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
}
