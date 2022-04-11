package practical;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practical {

	@Test (groups= {"skip"})
	public void cashPayment() {
		System.out.println("I will make payment in cash");
	}
	
	@Test
	public void cardPayment() {
		System.out.println("Test Passed:Your card payment was successful");
	}
	
	@Test
	public void failedTest() {
		Assert.assertFalse(false);
		System.out.println("This Test has failed: Your card has been not been processed");
	}
}
