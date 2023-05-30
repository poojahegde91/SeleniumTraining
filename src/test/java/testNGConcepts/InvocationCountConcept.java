package testNGConcepts;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	@Test(invocationCount = 10)
	public void testPgae()
	{
		System.out.println("I am test");
	}
}
