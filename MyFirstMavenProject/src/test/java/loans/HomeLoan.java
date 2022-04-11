package loans;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

;

public class HomeLoan {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Run this before the Test Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Run this after the Test Suite");
	}
	
	@BeforeTest	
	public void cleanDB() {
		System.out.println("Clean DB before next test");
	}
	
	@Test
	public void home1() {
		System.out.println("Thank you for applying for a Home Loan");
	}
	
	@Test
	public void home2() {
		System.out.println("How much is your estimated Bond");
	}

}
