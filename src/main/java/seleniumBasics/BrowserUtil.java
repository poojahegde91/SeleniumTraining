package seleniumBasics;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This is a utility class
 * @author Pooja Hegde
 * Date: 03/04/2023	
 */
public class BrowserUtil {

	WebDriver driver;

	/**
	 * This method is used to initialize the driver on the basis of given browsername
	 * Possible browsers are chrome, edge, firefox, safari
	 * @param browserName
	 * @return 
	 */
	public WebDriver initDriver(String browserName) {

		System.out.println("Launching browser : " + browserName);

		if (browserName == null) {
			System.out.println("Browser name cannot be NULL");
			throw new MySeleniumException("BROWSERNAMECANNOTBENULLEXCEPTION");
		}

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please enter valid browser name");
			throw new MySeleniumException("INVALIDBROWSERNAMEEXCEPTION");
		}
		return driver;
	}
	
	/**
	 * This method is used to launch the application URL. Please pass the URL with http/https
	 * @param url
	 */
	
	public void launchURL(String url)
	{
		if(url==null)
		{
			System.out.println("URL cannot be NULL");
			throw new MySeleniumException("URLNULLEXCEPTION");
		}
		
		if(url.contains("http"))
		{
			driver.get(url);
		}
		else
			System.out.println("http(s) is missing");
	}
	
	public void launchURL(URL url)
	{
		if(url==null)
		{
			System.out.println("URL can not be null");
			throw new MySeleniumException("URLNULLXCEPTION");
		}
		String mainURL = String.valueOf(url);
		if(mainURL.contains("http"))
		{
			driver.navigate().to(url);
		}
		else
		{
			System.out.println("http(s) is missing");
		}
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getPageURL()
	{
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	public void closeBrowser()
	{
		driver.close();
	}

}
