/*
 * @author : Wala'a Mohammad
 *
 */
package extent_report_listner;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.*;
import org.testng.xml.XmlSuite;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportListener implements IReporter {

    String pattern = "yyyy-MM-dd-hh-mm-ss";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String date = simpleDateFormat.format(new Date());
    private ExtentReports extent;
    //    private ExtentSparkReporter spark;
    private ExtentTest test;

    //This method is to capture the screenshot and return the path of the screenshot.
    public static String getScreenshot(WebDriver driver, String screenshotName, ITestResult iTestResult) throws Exception {
        //below line is just to append the date format with the screenshot name to avoid duplicate names
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String failedTest = iTestResult.getName();

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        //after execution, you could see a folder "FailedTestsScreenshots" under src folder
        String destination = System.getProperty("user.dir") + "./FailedTestsScreenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
        //Returns the captured file path
        return destination;

    }

    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
                               String outputDirectory) {
        for (ISuite suite : suites) {
            Map<String, ISuiteResult> result = suite.getResults();

            for (ISuiteResult r : result.values()) {
                //The date will include with the file name
                extent = new ExtentReports("G:\\My Drive\\Automation Reports" + File.separator
                        + "Sporter2.1 Full Test" + "[" + r.getTestContext().getName() + "]" + date + ".html", true);
//        extent = new ExtentReports("C:\\Users\\w.jumaa\\Desktop\\Automation Reports" + File.separator
//                + "Magento-Sporter-Automation_Report " + "[" + r.getTestContext().getName() + "]" + date + ".html", true);

//            spark=new ExtentSparkReporter(File.separator + "Magento-Sporter-Automation_Report "+date+".html");
//            spark.viewConfigurer().viewOrder().as(new ViewName[]{ViewName.DASHBOARD, ViewName.TEST,ViewName.CATEGORY}).apply();

//        extent.addSystemInfo("Author", "Wala'a Mohammad");


                //Create Node

//                ExtentNode extentNode= extentTest.createNode(TestStep1);
//                ExtentTest node = test.createNode("Node");  // level = 1


//                ExtentTest parent = extent.startTest("Parent");
//
//                ExtentTest child1 = extent.startTest("Child 1");
//                child1.log(LogStatus.INFO, "Info");
//
//                ExtentTest child2 = extent.startTest("Child 2");
//                child2.log(LogStatus.PASS, "Pass");
//
//                parent
//                        .appendChild(child1)
//                        .appendChild(child2);


                //loading the external xml file
                extent.loadConfig(new File(System.getProperty("user.dir") + "./src/test/resources/extent-config.xml"));


                ITestContext context = r.getTestContext();


                buildTestNodes(context.getPassedTests(), LogStatus.PASS);
                buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
//                buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
                extent.flush();
                extent.close();


            }
        }

    }

    private void buildTestNodes(IResultMap tests, LogStatus status) {
        ExtentTest test;


        if (tests.size() > 0) {
            for (ITestResult result : tests.getAllResults()) {
                //             Class name test
                String countryName = result.getTestClass().getRealClass().getSimpleName().replace("TestCases", " ");
                String newDescription = result.getMethod().getDescription().replace("{{CountryName}}", countryName);
//*************
//                test = extent.startTest(result.getMethod().getDescription());
//                    test = extent.startTest(result.getMethod().getMethodName());

//             Class name test
//
                test = extent.startTest(newDescription);
//**************************************************
                test.setStartedTime(getTime(result.getStartMillis()));
                test.setEndedTime(getTime(result.getEndMillis()));

                for (String group : result.getMethod().getGroups()) {
                    //Retrieve Test Result in the Method description
//                    String countryName = result.getClass().getSimpleName();
                    //Retrieve TestNG Method
//                    String countryName =result.getMethod().getClass().getSimpleName();
                    //Get full class name
//                    String countryName =result.getTestClass().getName();
                    //Retrieve the exact className
//                    String countryName =result.getTestClass().getRealClass().getSimpleName().replace("TestCases"," ");
//
//                    String newDescription = result.getMethod().getDescription().replace("{{CountryName}}",countryName);
//                    test=extent.startTest(newDescription);
//                    test = extent.createTest(newDescription);
                    test.assignCategory(group);
                }

                //Create Node
//                if(test.assignCategory(group).getClass().getName().contains("HomePage")){
//                    test.appendChild(test);
//                  //
//                }

                if (result.getThrowable() != null) {
                    test.log(status, result.getThrowable());
                } else {
                    test.log(status, "Test " + status.toString().toLowerCase()
                            + "ed");
                }
                extent.endTest(test);
            }
        }


    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }

    public void onTestFailure(ITestResult result) throws Exception {
        ITestContext context = result.getTestContext();
        WebDriver driver = (WebDriver) context.getAttribute("driver");
        ExtentReportListener.getScreenshot(driver, result.getParameters().toString().trim(), result);
    }

}


