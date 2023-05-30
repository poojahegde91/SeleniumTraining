package dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleSelectMethods {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");

		By week = By.id("select-demo");
		By state = By.id("multi-select");

		Select select1 = new Select(driver.findElement(week));
		Select select2 = new Select(driver.findElement(state));

		System.out.println(select1.isMultiple());
		System.out.println(select2.isMultiple());
		
		select2.selectByIndex(2);
		select2.selectByValue("Texas");
		select2.selectByVisibleText("Washington");
		select2.selectByVisibleText("Florida");
		
		List<WebElement> allStateSelectionList =select2.getAllSelectedOptions();
		for(WebElement e: allStateSelectionList)
		{
			String text= e.getText();
			System.out.println(text);
		}
		
		System.out.println(select2.getFirstSelectedOption().getText());
		
		select2.deselectByIndex(2);
		select2.deselectByValue("Texas");
		select2.deselectByVisibleText("Washington");
		select2.deselectAll();
		
		
	}

}
