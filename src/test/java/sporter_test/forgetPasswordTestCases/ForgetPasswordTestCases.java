/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription ForgetPasswordTestCases
 */

package sporter_test.forgetPasswordTestCases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.Test;
import sporter_pages.loginPage.LoginPage;
import xml_reader.XmlReader;

@Test(groups = "2.06 Forget Password Page")
//TODO: Move All locators related to Forget Password from Login Class To Forget Password Class
public class ForgetPasswordTestCases extends BaseTest {
    //TODO: Forget Password test cases related to the forget password email is not included
    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Verify Forget Password link works correctly", priority = 1)
    public void verifyForgetPasswordLinkWorksCorrectly() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToLoginPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(loginPage.getForgetPasswordLink(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(loginPage.forgetPasswordURL, webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Verify Back To Login Button that appears in the Forget Password page works correctly", priority = 2)
    public void verifyBackToLoginBtnAppearsInForgetPasswordPageWorksCorrectly() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToForgetPassword();
        DataHelperAndWait.clickOnElement(loginPage.getBackToLoginLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(loginPage.getEmailField(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severit"}, description = "{{CountryName}}: Verify Inability to click on Submit Button from the Forget Password page without filling Email Address", priority = 3)
    public void verifyInabilityToClickOnSubmitBtnInForgetPasswordWithoutFillingEmailAddress() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToForgetPassword();
        DataHelperAndWait.clickOnElement(loginPage.getSubmitBtnInForgetPassword(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(loginPage.getEmailErrorMsgInForgetPassword(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severit"}, description = "{{CountryName}}: Verify Inability to click on Submit Button with wrong email format and the correct error Msg appears", priority = 4)
    public void verifyInAbilityToClickOnSubmitInForgetPasswordWithIncorrectEmailFormat() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToForgetPassword();
        DataHelperAndWait.typeTextInElement(loginPage.getEmailField(), webDriver, XmlReader.getXMLData("incorrectEmailFormate"));
        DataHelperAndWait.clickOnElement(loginPage.getSubmitBtnInForgetPassword(), webDriver);
        if (webDriver.getCurrentUrl().contains("sporter.com/ar")) {
            WebElementsAssertion.assertionWebElementConatinsText(loginPage.getEmailErrorMsgInForgetPassword(), webDriver, XmlReader.getXMLData("emailFormatErrorAr"));
        }
        if (webDriver.getCurrentUrl().contains("sporter.com/en")) {
            WebElementsAssertion.assertionWebElementEqualText(loginPage.getEmailErrorMsgInForgetPassword(), webDriver, XmlReader.getXMLData("emailFormatErrorEn"));
        }
    }

    @Test(groups = {"1.3 Medium Severit"}, description = "{{CountryName}}: Verify All fields, labels & Components appear correctly in the Forget Password Page", priority = 5)
    public void verifyAllFieldsAppearCorrectlyInForgetPasswordPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToForgetPassword();
        WebElementsAssertion.validateTheElementIsDisplayed(loginPage.getSubmitBtnInForgetPassword(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(loginPage.getBackToLoginLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(loginPage.getEmailField(), webDriver);
        if (webDriver.getCurrentUrl().contains("sporter.com/ar")) {
            WebElementsAssertion.assertionTextIsEqual(loginPage.getForgetPasswordHeader(), webDriver, XmlReader.getXMLData("forgetPasswordHeaderAr"));
            WebElementsAssertion.assertionTextIsEqual(loginPage.getForgetPasswordSubHeader(), webDriver, XmlReader.getXMLData("forgetPasswordSubHeaderAr"));
            WebElementsAssertion.assertionTextIsEqual(loginPage.getForgetPasswordDescription(), webDriver, XmlReader.getXMLData("forgetPasswordDescriptionAr"));
        }
        if (webDriver.getCurrentUrl().contains("sporter.com/en")) {
            WebElementsAssertion.assertionTextIsEqual(loginPage.getForgetPasswordHeader(), webDriver, XmlReader.getXMLData("forgetPasswordHeaderEn"));
            WebElementsAssertion.assertionTextIsEqual(loginPage.getForgetPasswordSubHeader(), webDriver, XmlReader.getXMLData("forgetPasswordSubHeaderEn"));
            WebElementsAssertion.assertionTextIsEqual(loginPage.getForgetPasswordDescription(), webDriver, XmlReader.getXMLData("forgetPasswordDescriptionEn"));
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Verify Submit button in the Forget Password Page works correctly", priority = 6)
    public void verifySubmitInForgetPasswordPageWorksCorrectly() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToForgetPassword();
        DataHelperAndWait.typeTextInElement(loginPage.getEmailField(),webDriver, XmlReader.getXMLData("correctEmail"));
        DataHelperAndWait.clickOnElement(loginPage.getSubmitBtnInForgetPassword(),webDriver);
        if (webDriver.getCurrentUrl().contains("sporter.com/ar")) {
            WebElementsAssertion.assertionTextIsEqual(loginPage.getForgetPasswordToastMsg(), webDriver, XmlReader.getXMLData("forgetPasswordToastMsgAr"));
        }
        if (webDriver.getCurrentUrl().contains("sporter.com/en")) {
            WebElementsAssertion.assertionTextIsEqual(loginPage.getForgetPasswordToastMsg(), webDriver, XmlReader.getXMLData("forgetPasswordToastMsgEn"));
        }
    }
}