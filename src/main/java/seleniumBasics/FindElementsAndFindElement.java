package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsAndFindElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		List<WebElement> eleLists=driver.findElements(By.name("search123"));
		System.out.println(eleLists.size());
		//empty list will be returned when wrong element locator is passed
		
		driver.findElement(By.name("search111")).sendKeys("MacBook");
		//NoSuchElementException: no such element: Unable to locate element = when wrong element locator is passed
		

	}

}
