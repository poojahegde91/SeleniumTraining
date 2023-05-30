package testNGConcepts;

import org.testng.annotations.Test;

public class ExpectedConditionsConcept {

	
	@Test(expectedExceptions = ArithmeticException.class)
	public void homePageTest() {
		System.out.println("homePage Test");
		int i = 9/0;
	}
	
	@Test(expectedExceptions = NullPointerException.class)
	public void someTest() {
		System.out.println("someTest Test");
		int i = 9/0;
	}
}
 