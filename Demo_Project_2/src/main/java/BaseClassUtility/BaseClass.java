package BaseClassUtility;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
  
	
	@BeforeSuite
	public void BS() {
		System.out.println("config-Before Suite");
	}
	
	@BeforeClass
	public void BC() {
		System.out.println("config-Before Class");
	}
	
	@BeforeMethod
	public void BM() {
		System.out.println("config-Before Method");
	}
	
	@BeforeTest
	public void BT() {
		System.out.println("config-Before Test");
	}
	
	
	@AfterSuite
	public void AS() {
		System.out.println("config-After Suite");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("config-After Class");
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("config-After Method");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("config-After Test");
	}
}
