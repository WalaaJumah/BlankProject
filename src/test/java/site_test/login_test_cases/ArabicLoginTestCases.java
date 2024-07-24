/**
 * @author w.jumaa
 * @projectName EurekaJo_Automation
 * @classDescription
 */

package site_test.login_test_cases;

import core.BaseTest;
import site_pages.login.ArabicLoginPage;
import helper_classes.AssertionHelper;
import org.testng.annotations.Test;
import files_reader.XmlReader;

@Test(groups = "2.04 Login Page")
public class ArabicLoginTestCases extends BaseTest {
    public ArabicLoginTestCases() {
        Language = "Ar";
    }

    @Test(groups = {"Priority 2 Modules", "1.1 Critical Severity"}, description = "{{CountryName}}: verify Ability to navigate to the Login Page via link directly", priority = 1)
    public void a_verifyAbilityToNavigateToLoginViaLink() {
        ArabicLoginPage loginPage = new ArabicLoginPage(webDriver);
        loginPage.navigateToLoginLink();
        AssertionHelper.validateTheElementIsDisplayed(loginPage.getLoginBtn(), webDriver);
    }

    @Test(groups = {"Priority 2 Modules", "1.3 Medium Severity"}, description = "{{CountryName}}: verify Jordan Country code is selected by default in the Phone Number field", priority = 4)
    public void verifyJordanCountryCodeIsSelected() {
        ArabicLoginPage loginPage = new ArabicLoginPage(webDriver);
        AssertionHelper.assertionTextIsEqual(loginPage.getSelectedCountry(), webDriver, "+962");
    }

    @Test(groups = {"Priority 2 Modules", "1.2 High Severity"}, description = "{{CountryName}}: verify inability to login without filling the Phone Number field", priority = 5)
    public void verifyPhoneNUmberFieldIsMandatory() {
        ArabicLoginPage loginPage = new ArabicLoginPage(webDriver);
        loginPage.fillLoginForm("", XmlReader.getXMLData("password"));
        AssertionHelper.validateTheElementIsDisplayed(loginPage.getPhoneNumberErrorMsg(), webDriver);

    }

}
