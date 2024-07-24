/**
 * @author w.jumaa
 * @projectName EurekaJo_Automation
 * @classDescription
 */

package eureka_test.signup_test_cases;

import site_pages.homepage.HomePage;
import org.testng.annotations.BeforeClass;

public class EnglishSignUpTestCases extends ArabicSignUpTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToEnglish() {
        HomePage homePage = new HomePage(webDriver);
        homePage.switchToEnglish();
        Language = "En";
    }
}
