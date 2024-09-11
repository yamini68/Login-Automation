package ReportsTestNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    // Get the ExtentReports object from ExtentReportTestNG
    ExtentReports extent = ExtentReportTestNG.getReportObject();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        // Create a test entry in the Extent report for each test start
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Log success in the report
        test.log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Log failure and the throwable in the report
        test.fail(result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        // Flush the report once all tests are finished
        extent.flush();
    }
}
