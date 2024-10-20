package seleniumjava;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onStart(ITestContext context) {
		System.out.println("Execution started");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution started");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution success");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution Failed");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Execution Skipped");
	}
	public void onFinish(ITestContext context) {
		System.out.println(" Execution Finished");
	}
}
