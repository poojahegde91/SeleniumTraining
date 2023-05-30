package testNGConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures {
	//1
	@BeforeSuite
	public void DBConnection() {
		System.out.println("BS--DB connection ");
	}
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- createUSer");
	}
	//3
	@BeforeClass
	public void openBrowser() {
		System.out.println("BC -- openBrowser");
	}
	//4 //7	//10
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM -- loginToApp");
	}
	//11
	@Test 
	public void searchTest() {
		System.out.println("T -- searchTest");
	}
	//5
	@Test
	public void addToCartTest() {
		System.out.println("T -- addToCartTest");
	}
	//8
	@Test
	public void paymentTest() {
		System.out.println("T -- paymentTest");
	}
	//6	//9 //12
	@AfterMethod
	public void logOut() {
		System.out.println("AM-- logout");
	}
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-- closeBrowser");
	}
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT-- deleteUser");
	}
	//15
	@AfterSuite
	public void closeDBConnection() {
		System.out.println("AS-- closeConnection");
	}
}
