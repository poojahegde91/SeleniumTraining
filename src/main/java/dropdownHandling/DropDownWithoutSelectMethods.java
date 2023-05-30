package dropdownHandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithoutSelectMethods {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By countryField = By.id("Form_getForm_Country");

		getAllDropdownOptions(countryField);
		doSelectDropdownValue(countryField, "India");

	}

	public static int getDropdownValueCount(By locator)
	{
		return getAllDropdownOptions(locator).size();
	}
	
	public static List<String> getAllDropdownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsValueList = new ArrayList<String>();
		
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			optionsValueList.add(text);
		}
		return optionsValueList;
	}

	private static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}
	
	public static boolean doSelectDropdownValue(By locator, String dropDownValue)
	{
		boolean flag = false;
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		
		for (WebElement e : optionsList) {
			String text = e.getText();
			if(text.equals(dropDownValue))
			{
				flag =true;
				e.click();
				break;
			}
			
		}
		if(flag==false)
		{
			System.out.println("No such value found in dropdown list");
		}
		
		return flag;
	}

}
