package Listeners;

import Report.ExtentReportManager;
import Utilities.Log;
import java.util.HashMap;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends ExtentReportManager implements ITestListener {

    private static ExtentReports extent;
    public static ExtentTest logger=ExtentReportManager.logger;
    static Map<Integer, ExtentTest> extentTestMap = new HashMap<Integer, ExtentTest>();

    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }
    public static void setExtent(ExtentReports extent) {
        TestListener.extent = extent;
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        Log.info("I am in onStart method " + iTestContext.getName());
        extent = ExtentReportManager.report();
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        Log.info("I am in onFinish method " + iTestContext.getName());
        extent.flush();
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        Log.info(getTestMethodName(iTestResult) + " test is starting.");
        extent.createTest(getTestMethodName(iTestResult));
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Log.info(getTestMethodName(iTestResult) + " test is succeed.");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("*** Test execution " + iTestResult.getMethod().getMethodName() + " failed...");
        getTest().log(Status.FAIL, "Test Failed");

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        Log.info(getTestMethodName(iTestResult) + " test is skipped.");
        //ExtentReports log operation for skipped tests.
//        logger.log(Status.SKIP, "Test Skipped");
        getTest().log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        Log.info("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
    }

    public static synchronized ExtentTest getTest() {
        return extentTestMap.get((int) Thread.currentThread().getId());
    }

}