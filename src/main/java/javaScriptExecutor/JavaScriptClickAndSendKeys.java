package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptClickAndSendKeys {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");

		WebElement checkbox = driver.findElement(By.xpath("//div[@class='helper-item '] "));
		// normal click method
//		checkbox.click();

		//with actions class
//		Actions act = new Actions(driver);
//		act.click(checkbox).build().perform();
		
		//with javascript executor
		WebElement checkbox1 = driver.findElement(By.id("persistent"));
		JavaScriptUtil jsutil = new JavaScriptUtil(driver);
		jsutil.clickElementByJS(checkbox1);

	}

}
