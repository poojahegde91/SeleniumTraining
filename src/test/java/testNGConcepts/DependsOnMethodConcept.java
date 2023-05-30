package testNGConcepts;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test
	public void homePageTest() {
		System.out.println("homePage Test");
	}

	@Test(dependsOnMethods = "homePageTest")
	public void searchTest() {
		System.out.println(" searchTest");
	}

	@Test(dependsOnMethods = "searchTest")
	public void addToCartTest() {
		System.out.println("addToCartTest");
	}
}
