package dataProvider;

import org.testng.annotations.Dataprovider;
import org.testng.annotations.Test;


public class DataProvider {
	
	@Test (dataProvider="getData")
	public void getCustomerDetails (String userName, String lastName) {
		System.out.println("Customer Details");
		System.out.println(userName +" " + lastName);
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[3][2];
		
		//1st Set
		data[0][0] = "Roxanne";
		data[0][1] = "Valentine";

		//2nd Set
		data[1][0] = "Iman";
		data[1][1] = "Isaacs";
		
		//3rd Set
		data[2][0] = "Eli";
		data[2][1] = "Valentine";
}
