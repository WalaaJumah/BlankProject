/**
 * @author w.jumaa
 * @projectName EurekaJo_Automation
 * @classDescription
 */

package site_test.login_test_cases;

import site_pages.homepage.HomePage;
import org.testng.annotations.BeforeClass;

public class
EnglishLoginTestCases extends ArabicLoginTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToEnglish() {
        HomePage homePage = new HomePage(webDriver);
        homePage.switchToEnglish();
        Language = "En";
    }
}
