package actionsClassConcept;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));

		List<WebElement> menuList = driver.findElements(By.cssSelector("li.context-menu-item span"));
		System.out.println(menuList.size());

		// for all text click
		for (WebElement e : menuList) {
			Actions action = new Actions(driver);
			action.contextClick(rightClickBtn).build().perform();
			e.click();
			Alert alt = driver.switchTo().alert();
			System.out.println(alt.getText());
			alt.accept();
			Thread.sleep(2000);

		}

		// for any one text click

		for (WebElement e : menuList) {
			Actions action = new Actions(driver);
			action.contextClick(rightClickBtn).build().perform();
			String text = e.getText();
			if (text.equals("Copy")) {
				e.click();
				break;
			}
		}

	}

}
