package loans;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class PersonalLoan {
	
	@AfterTest
	public void afterTest() {
		System.out.println("Run this after every test");
	}
	
	@Test
	public void personal1() {
		System.out.println("Thank you for applying for a Personal Loan");
	}
	
	@Test
	public void personal2() {
		System.out.println("What is your Net Income");
	}
}
