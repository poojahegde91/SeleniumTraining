package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CharecterSequenceForSendKeys {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String s1 = "Pooja";
		String s2 = "Hegde";
		StringBuffer s3 = new StringBuffer("Testing");
		StringBuilder s4 = new StringBuilder("Automation");

		driver.findElement(By.name("search")).sendKeys(s1 + " "+ s2 + " " + s3 + " " + s4);
		//driver.findElement(By.name("search")).sendKeys(null);
		//IllegalArgumentException: Keys to send should be a not null CharSequence
		
		driver.findElement(By.xpath("//input[@value='Login']")).sendKeys("testing");
		//no exception
		
		driver.findElement(By.id("input-email")).click();//no exception

	}

}
