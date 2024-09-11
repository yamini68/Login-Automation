package ReportsTestNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTestNG {

    // Method to configure and return ExtentReports object
    public static ExtentReports getReportObject() {
        String path = System.getProperty("user.dir") + "//Reports//index.html"; // Ensure path is correct
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Login Automation Results");
        reporter.config().setDocumentTitle("Test Results");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Yamini Anala");

        return extent;
    }
}
