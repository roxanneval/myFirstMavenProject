package loans;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class HomeLoan2 {
	
	@BeforeMethod 
	public void  beforeTest(){
		System.out.println("Run this before every test");
	}

	@Test
	public void home3() {
		System.out.println("Your Home Loan has been approved");
	}
	@Test
	public void homeFraud() {
		System.out.println("Your details have not been confirmed");
	}
}
