package practical;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerPractical implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		System.out.println("This is my start listerner for my Test: " + result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("This is my listener for when my test has passed");
	
	}
	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("This is my listener for my failed test");
}
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		System.out.println("The Skipped Test is: " + result.getName());
	}
}
