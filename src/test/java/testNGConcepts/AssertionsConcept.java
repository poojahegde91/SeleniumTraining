package testNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsConcept {

	@Test
	public void searchTest() {
		String search = "Pooja";
		Assert.assertEquals(search, "Pooja");	
	}
	
	@Test
	public void nameTest() {
		String name = "Hegde";
		Assert.assertNotNull(name);	
	}
	

	@Test
	public void sumTest() {
		int a=10;
		int b=20;
		
		int sum = a+b;
		Assert.assertEquals(sum, 30);
	}
	@Test
	public void isElementDisplayedTest() {
		String text = "userLoginPage";
		Assert.assertTrue(text.contains("Login123"));
	}
	
	@Test
	public void isUserActiveTest() {
		boolean flag = false;
		Assert.assertFalse(flag);
	}
}
