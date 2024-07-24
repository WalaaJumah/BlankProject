package retry_failed_test_cases;

import helper_classes.reading_helper.PropertiesHelpers;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {

    // If any failed testcases then it runs two times
//    private final int maxRetryCnt = 1;
    private int retryCnt = 0;

    //This method will be called everytime a test fails. It will return TRUE if a test fails and need to be retried, else it returns FALSE
    public boolean retry(ITestResult result) {
        if (retryCnt < Integer.parseInt(PropertiesHelpers.getValue("RETRY_TEST_FAIL"))) {
            System.out.println("Retrying " + result.getName() + " again and the count is " + (retryCnt + 1));
            retryCnt++;
            return true;
        }
        return false;
    }
}
