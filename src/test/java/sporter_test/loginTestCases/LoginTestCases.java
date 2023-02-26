/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription LoginTestCases
 */

package sporter_test.loginTestCases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.Test;
import sporter_pages.AccountRegistrationPage.AccountRegistrationPage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.loginPage.LoginPage;
import xml_reader.XmlReader;

@Test(groups = "2.04 Login")
public class LoginTestCases extends BaseTest {
    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Ability to access login page From Account profile icon", priority = 1)
    public void verifyAbilityToAccessNewAccountRegistrationScreen() {
        HeaderSection header = new HeaderSection(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
        DataHelperAndWait.clickOnElement(loginPage.getSignInOption(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(loginPage.loginLink, webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Verify All fields, labels & Components appear correctly in Login page", priority = 2)
    public void verifyAllFieldsAppearCorrectlyInLogin() {
        LoginPage loginPage = new LoginPage(webDriver);
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        loginPage.navigateToLoginPage();
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getHaveAnAccountTab(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(loginPage.getEmailField(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(loginPage.getPasswordField(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(loginPage.getLoginBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(loginPage.getForgetPasswordLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(loginPage.getNewToSporterLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(loginPage.getCreateAccountLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(loginPage.getFaceBookLoginBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(loginPage.getSignInWithSocialMediaLabel(), webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to login using wrong email and the correct Error Msg appears", priority = 3)
    public void verifyInAbilityToLoginUsingWrongEmail() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToLoginPage();
        loginPage.fillinLoginForm(DataHelperAndWait.generateRandomEmail(), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(loginPage.getLoginBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(loginPage.getWrongCredentialsErrorMsg(), webDriver);
        WebElementsAssertion.assertionTextIsEqual(loginPage.getWrongCredentialsErrorMsg(), webDriver, XmlReader.getXMLData("loginErroEn"));
        if (webDriver.getCurrentUrl().contains("sporter.com/ar")) {
            WebElementsAssertion.assertionTextIsEqual(loginPage.getWrongCredentialsErrorMsg(), webDriver, XmlReader.getXMLData("loginErroAr"));
        }
        if (webDriver.getCurrentUrl().contains("sporter.com/en")) {
            WebElementsAssertion.assertionTextIsEqual(loginPage.getWrongCredentialsErrorMsg(), webDriver, XmlReader.getXMLData("loginErroEn"));
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Have Account tab is Active By Default when access Login Page", priority = 4)
    public void verifyHaveAccountTabActiveByDefault() {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        WebElementsAssertion.assertionAttributeTrueForElement(registerPage.getHaveAnAccountTab(), webDriver, "active", "1");
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Ability to login correctly using valid credential", priority = 5)
    public void verifyAbilityToLoginCorrectlyWithValidCredentials() {
        HeaderSection header = new HeaderSection(webDriver);
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToLoginPage();
        loginPage.fillinLoginForm(XmlReader.getXMLData("correctEmail"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(loginPage.getLoginBtn(), webDriver);
//        DataHelperAndWait.waitForTime(3000);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getMyAccountOption(), webDriver);
        DataHelperAndWait.clickOnElement(registerPage.getLogoutOption(), webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to login using correct Email & Wrong Password and the correct Error Msg appears", priority = 6)
    public void verifyInAbilityToLoginUsingCorrectEmailAndWrongPassword() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToLoginPage();
        loginPage.fillinLoginForm(XmlReader.getXMLData("correctEmail"), XmlReader.getXMLData("correctPassword") + "1");
        DataHelperAndWait.clickOnElement(loginPage.getLoginBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(loginPage.getWrongCredentialsErrorMsg(), webDriver);
        if (webDriver.getCurrentUrl().contains("sporter.com/ar")) {
            WebElementsAssertion.assertionTextIsEqual(loginPage.getWrongCredentialsErrorMsg(), webDriver, XmlReader.getXMLData("loginErroAr"));
        }
        if (webDriver.getCurrentUrl().contains("sporter.com/en")) {
            WebElementsAssertion.assertionTextIsEqual(loginPage.getWrongCredentialsErrorMsg(), webDriver, XmlReader.getXMLData("loginErroEn"));
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Verify Inability to login without filling Email & Password fields", priority = 7)
    public void verifyInAbilityToLoginWithoutEmailAndPassword() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToLoginPage();
        DataHelperAndWait.clickOnElement(loginPage.getLoginBtn(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(loginPage.getEmailErrorMsg(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(loginPage.getPasswordErrorMsg(), webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Verify Inability to login without filling Email field only", priority = 8)
    public void verifyInAbilityToLoginWithoutEmail() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToLoginPage();
        DataHelperAndWait.typeTextInElement(loginPage.getPasswordField(), webDriver, XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(loginPage.getLoginBtn(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(loginPage.getEmailErrorMsg(), webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Verify Inability to login without filling Password field only", priority = 9)
    public void verifyInAbilityToLoginWithoutPassword() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToLoginPage();
        DataHelperAndWait.typeTextInElement(loginPage.getEmailField(), webDriver, XmlReader.getXMLData("correctEmail"));
        DataHelperAndWait.clickOnElement(loginPage.getLoginBtn(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(loginPage.getPasswordErrorMsg(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to login with wrong email format and the correct error Msg appears", priority = 10)
    public void verifyInAbilityToLoginWithIncorrectEmailFormat() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToLoginPage();
        loginPage.fillinLoginForm(XmlReader.getXMLData("incorrectEmailFormate"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(loginPage.getLoginBtn(), webDriver);
        if (webDriver.getCurrentUrl().contains("sporter.com/ar")) {
            WebElementsAssertion.assertionWebElementConatinsText(loginPage.getEmailErrorMsg(), webDriver, XmlReader.getXMLData("emailFormatErrorAr"));
        }
        if (webDriver.getCurrentUrl().contains("sporter.com/en")) {
            WebElementsAssertion.assertionWebElementEqualText(loginPage.getEmailErrorMsg(), webDriver, XmlReader.getXMLData("emailFormatErrorEn"));
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Verify show password icon works correctly", priority = 11)
    public void verifyShowPasswordIconWorksCorrectly() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToLoginPage();
        loginPage.fillinLoginForm(XmlReader.getXMLData("correctEmail"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(loginPage.getShowPasswordIcon(), webDriver);
        WebElementsAssertion.assertionAttributeTrueForElement(loginPage.getPasswordField(), webDriver, "type", "text");
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Verify hide password icon works correctly", priority = 12)
    public void verifyHidePasswordIconWorksCorrectly() {
        LoginPage loginPage = new LoginPage(webDriver);
        DataHelperAndWait.clickOnElement(loginPage.getHidePasswordIcon(), webDriver);
        WebElementsAssertion.assertionAttributeTrueForElement(loginPage.getPasswordField(), webDriver, "type", "password");
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Verify Create Account Link works correctly", priority = 13)
    public void verifyCreateAccountLinkWorksCorrectly() {
        LoginPage loginPage = new LoginPage(webDriver);
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        DataHelperAndWait.clickOnElement(loginPage.getCreateAccountLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getEmailField(), webDriver);
    }

    //TODO: There's a bug here & we will revisit it after fixing: https://sporter1.atlassian.net/browse/NS-56
    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}:  Verify ability to login using FaceBook account from Login Page", priority = 14)
    public void verifyAbilityToSignInUsingFaceBook() {
        LoginPage loginPage = new LoginPage(webDriver);
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        loginPage.navigateToLoginPage();
        DataHelperAndWait.clickOnElement(loginPage.getFaceBookLoginBtn(), webDriver);
        registerPage.verifyFaceBookIsActive();
        DataHelperAndWait.typeTextInElement(registerPage.getFaceBookEmail(), webDriver, XmlReader.getXMLData("correctEmail"));
        DataHelperAndWait.typeTextInElement(registerPage.getFaceBookPassword(), webDriver, XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getLoginInFaceBookPage(), webDriver);
        registerPage.verifyFaceBookIsActive();
        loginPage.navigateToLoginPage();
        try {
            registerPage.logout();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    //TODO: There's a bug here & we will revisit it after fixing: https://sporter1.atlassian.net/browse/NS-56
    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}:  Verify ability to login using FaceBook account from FaceBook Option appearing in Account Menu", priority = 15)
    public void verifyAbilityToSignInUsingFaceBookOptionAppearsInAccountMenu() {
        LoginPage loginPage = new LoginPage(webDriver);
        HeaderSection header = new HeaderSection(webDriver);
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        loginPage.navigateToLoginPage();
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
        DataHelperAndWait.clickOnElement(loginPage.getFaceBookLoginOption(), webDriver);
        registerPage.verifyFaceBookIsActive();
        DataHelperAndWait.typeTextInElement(registerPage.getFaceBookEmail(), webDriver, XmlReader.getXMLData("correctEmail"));
        DataHelperAndWait.typeTextInElement(registerPage.getFaceBookPassword(), webDriver, XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getLoginInFaceBookPage(), webDriver);
        registerPage.verifyFaceBookIsActive();
        loginPage.navigateToLoginPage();
        try {
            registerPage.logout();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Verify the system keeps the user logged in after switching the country", priority = 16)
    public void verifyTheSystemKeepsTheCustomerLoggedInAfterSwitchingTheCountry() {
        HeaderSection header = new HeaderSection(webDriver);
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        HomePage homePage=new HomePage(webDriver);
        loginPage.navigateToLoginPage();
        loginPage.fillinLoginForm(XmlReader.getXMLData("correctEmail"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(loginPage.getLoginBtn(), webDriver);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getMyAccountOption(), webDriver);
        DataHelperAndWait.clickOnElement(header.getCountryMenuIcon(),webDriver);
         DataHelperAndWait.clickOnElement(header.getCountryList().get(8),webDriver);
        DataHelperAndWait.clickOnElement(header.getSporterLogo(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(),webDriver);
//        DataHelperAndWait.waitForTime(3000);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getMyAccountOption(), webDriver);
    }
}