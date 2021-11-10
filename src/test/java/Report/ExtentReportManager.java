package Report;

import Utilities.Log;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentKlovReporter;

import org.junit.BeforeClass;

import java.util.HashMap;
import java.util.Map;



public class ExtentReportManager  {


    private static Map<Integer, ExtentTest> extentTestMap = new HashMap<>();
    public static ExtentTest logger;
    public static ExtentTest parentTest;
    public static ExtentTest childTest;
    public static ExtentReports extent = new ExtentReports();


    @BeforeClass
    @SuppressWarnings("Duplicates")
    public static ExtentReports report() {
        String projectName = "REST";
        try {

            ExtentKlovReporter klovReporter = new ExtentKlovReporter(projectName);
            klovReporter.initMongoDbConnection("localhost", 27017);
            klovReporter.initKlovServerConnection("http://localhost");
            String css = ".r-img {width: 50%;}";
            extent.setSystemInfo("Operating System", System.getProperty("os.name"));
            extent.setSystemInfo("User Name", System.getProperty("user.name"));
            extent.setSystemInfo("Architecture", System.getProperty("os.arch"));
            extent.attachReporter(klovReporter);
        } catch (Exception e) {
            System.out.println(e);
        }
        return extent;

    }

    @SuppressWarnings("Duplicates")
    public static void testStepHandle(String teststatus, ExtentTest test, String throwable) {
        switch (teststatus) {
            case "FAIL":

               childTest.fail(MarkupHelper.createLabel("Test Case is Failedd : ", ExtentColor.RED));
               childTest.fail(throwable);
                break;

            case "PASS":
                childTest.pass(MarkupHelper.createLabel("Test Case is Passed : ", ExtentColor.GREEN));
                break;
            case "SKIP":
                childTest.skip(MarkupHelper.createLabel("Test Case is Skipped ", ExtentColor.YELLOW));
                break;
            default:
                break;
        }
    }


}