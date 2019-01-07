package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Result extends BaseTest implements ITestListener{
	public ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		exe.attachReporter(repoter);
		test = exe.createTest(result.getName());
		test.log(Status.PASS, "extent is running... ;)");
		exe.flush();
		log.info("pass");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		exe.attachReporter(repoter);
		test = exe.createTest(result.getName());
		test.log(Status.FAIL, "extent is not running... :(");
		exe.flush();
		log.info("fail");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
