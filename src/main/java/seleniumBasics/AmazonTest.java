package seleniumBasics;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil bu = new BrowserUtil();
		bu.initDriver("chrome");
		bu.launchURL("https://www.amazon.com");

		String actualTitle = bu.getPageTitle();

		equalsText(actualTitle, "Amazon.com. Spend less. Smile more.");

		containsText(actualTitle, "iAmazon");

	}

	public static void equalsText(String actual, String expected) {
		if (actual.equals(expected)) {
			System.out.println(actual + " is equals to " + expected + " -- TC pass");
		} else {
			System.out.println(actual + " is equals to " + expected + " -- TC failed");
		}

	}

	public static void containsText(String actual, String expected) {
		if (actual.contains(expected)) {
			System.out.println(actual + " contains " + expected + " -- TC pass");
		} else {
			System.out.println(actual + " not contains " + expected + " - TC failed");
		}

	}

}
