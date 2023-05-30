package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");

//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		String title = jsUtil.getTitleByJS();
		System.out.println(title);

//		jsUtil.generateAlert("This is my js alert");

//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
		
//		jsUtil.zoomChromeEdge("400.0");
		//responsive testing --> 50% 100% 60% 400%
		
//		WebElement search = driver.findElement(By.xpath("//div[@class='nav-search-field ']"));
//		jsUtil.drawBorder(search);
//		jsUtil.flash(search);
		
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUp();
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Frequently repurchased in Drugstore']"));
		jsUtil.scrollIntoView(ele);
		
//		Horizontal Scrolling
		
//		window.scrollBy(100,200); //rightside move
//		window.scrollBy(-100, -200); //left side move
		
	}

}
