package generic;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;


public class CoustomeListners extends BaseTest implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Browser Opened and Tsrt will Start",true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("!!..Test executed successfully..!!",true);
	}

	public void onTestFailure(ITestResult result) {
	  String failedMethod = result.getMethod().getMethodName();
	  Reporter.log("Test Failed due to:"+failedMethod,true);
	  
		failedMethodtoTakeSS(failedMethod);
	
		
	
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
	
	}

}
