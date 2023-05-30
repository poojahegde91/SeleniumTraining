package testNGConcepts;

import org.testng.annotations.Test;

public class TestWithPriority {
	@Test(priority = 1)
	public void searchTest() {
		System.out.println("T -- searchTest");
	}

	@Test(priority = 3)
	public void addToCartTest() {
		System.out.println("T -- addToCartTest");
	}

	@Test(priority = 5)
	public void paymentTest() {
		System.out.println("T -- paymentTest");
	}
	
	@Test(priority = 4)
	public void aTest() {
		System.out.println("aTest");
	}
	
	@Test(priority = 2)
	public void bTest() {
		System.out.println("bTest");
	}
}
