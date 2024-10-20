package seleniumjava;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	ExtentSparkReporter sparkreporter;
	ExtentReports extent;
	ExtentTest test;

	public void onStart(ITestContext context) {
		System.out.println("Execution started");
		sparkreporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/Myreports.html");

		sparkreporter.config().setDocumentTitle("Automation testing");
		sparkreporter.config().setReportName("functional testing");
		sparkreporter.config().setTheme(Theme.DARK);

		extent=new ExtentReports();
		extent.attachReporter(sparkreporter);

		// these data hard coded in real time scenario the dynamic values are captured
		extent.setSystemInfo("Computer Name", "Localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Ramesh");
		extent.setSystemInfo("OS", "MAC");
		extent.setSystemInfo("Browser Name", "Chrome");
	}


	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution success");
		test=extent.createTest(result.getName());//create test entry in report
		test.log(Status.PASS, "The Test is passed : "+result.getName());//update the test status p/f/s
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution Failed");

		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "The Test is Failed : "+result.getName());
		test.log(Status.FAIL, "The Test is Failed ause is : "+result.getThrowable());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Execution Skipped");
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "The Test is Skipped : "+result.getName());
	}
	public void onFinish(ITestContext context) {
		System.out.println(" Execution Finished");
		extent.flush();
	}

}
