package locatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExamples {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//by.id
		driver.findElement(By.id("input-firstname")).sendKeys("Pooja");
		
		//by.name
		driver.findElement(By.name("lastname")).sendKeys("Hegde");
		
		//by.classname
		driver.findElement(By.className("form-control")).sendKeys("pooja@gmail.com");
		
		//by.linkText
		driver.findElement(By.linkText("Register")).click();
		
		//by.tagName
		driver.findElement(By.tagName("a"));
		
		//by.partialLinkText
		driver.findElement(By.partialLinkText("Forgotten"));
		
		//by.cssSelector
		driver.findElement(By.cssSelector("input[value='0']")).click();
		
		//By.xpath
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567898");
		

	}

}
