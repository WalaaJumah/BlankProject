/*
 * @author : Wala'a Mohammad
 *
 */
package extent_report_listner;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.*;
import org.testng.xml.XmlSuite;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class ExtentReportListener implements IReporter {
    String pattern = "yyyy-MM-dd-hh-mm-ss";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String date = simpleDateFormat.format(new Date());
    private ExtentReports extent;

    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
                               String outputDirectory) {
        for (ISuite suite : suites) {
            Map<String, ISuiteResult> result = suite.getResults();

            for (ISuiteResult r : result.values()) {
                extent = new ExtentReports("G:\\My Drive\\Automation Reports" + File.separator
                        + "[" + r.getTestContext().getName() + "]" + date + ".html", true);
                extent.loadConfig(new File(System.getProperty("user.dir") + "./src/test/resources/extent-config.xml"));
                ITestContext context = r.getTestContext();
                buildTestNodes(context.getPassedTests(), LogStatus.PASS);
                buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
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
                test = extent.startTest(newDescription);
                test.setStartedTime(getTime(result.getStartMillis()));
                test.setEndedTime(getTime(result.getEndMillis()));
                for (String group : result.getMethod().getGroups()) {
                    test.assignCategory(group);
                }
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
}