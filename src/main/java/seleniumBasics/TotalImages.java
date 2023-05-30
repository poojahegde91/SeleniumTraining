package seleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com");

		By image = By.tagName("img");
		By links = By.tagName("a");
		
		int totalImgCount = getElements(image).size();
		System.out.println(totalImgCount);

		int totalLinksCount = getElements(links).size();
		System.out.println(totalLinksCount);
		
		List<String> imgesAttrList = getElemenetsAttributeValue(image, "alt");
		if(imgesAttrList.contains("Computer mice")) {
			System.out.println("PASS");
		}
	}
	
	//to get the attibute value from the list of links/images for varification
	
	public static List<String> getElemenetsAttributeValue(By locator, String attributeName)
	{
		List<WebElement> eleList = getElements(locator);
		List<String> attValue = new ArrayList<String>();
		for(WebElement e: eleList)
		{
		
			String text = e.getAttribute(attributeName);
			attValue.add(text);
		}
		return attValue;
	}
	
	public static List<WebElement> getElements(By locator)
	{
		List<WebElement> listElements= driver.findElements(locator);
		return listElements;
	}

}
