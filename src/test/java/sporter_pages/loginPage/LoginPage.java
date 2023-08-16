/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription LoginPage
 */

package sporter_pages.loginPage;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.productPage.ProductDetailsPage;

import java.io.IOException;
import java.time.Duration;

@Getter
public class LoginPage extends BasePage {
    ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
    HomePage homePage = new HomePage(webDriver);
    HeaderSection headerSection = new HeaderSection(webDriver);
    //declare all locators related to the Cart Page
    @FindBy(id = "showPasswordIcon")
    private WebElement showPasswordIcon;
    @FindBy(id = "hidePasswordIcon")
    private WebElement HidePasswordIcon;
    @FindBy(id = "emailInput")
    private WebElement emailField;
    @FindBy(id = "passwordInput")
    private WebElement passwordField;
    @FindBy(id = "submitdBtn")
    private WebElement loginBtn;
    @FindBy(id = "forgetPasswordBtn")
    private WebElement forgetPasswordLink;
    @FindBy(id = "createAccountLink")
    private WebElement createAccountLink;
    @FindBy(xpath = "//div[@class='loginInputs_CAccountLabel__dS7KR']")
    private WebElement newToSporterLabel;
    @FindBy(id = "FBLabel")
    private WebElement signInWithSocialMediaLabel;
    @FindBy(id = "FBlogin")
    private WebElement faceBookLoginBtn;
    //TODO:To revisit after fixing the id by Moamen
    @FindBy(id = "backToLogin")
    private WebElement backToLoginLink;
    @FindBy(id = "submitBtn")
    private WebElement submitBtnInForgetPassword;
    @FindBy(xpath = "//div[starts-with(@class,'forgetPasswordPage_firstHead')]")
    private WebElement forgetPasswordHeader;
    @FindBy(xpath = "//div[starts-with(@class,'forgetPasswordPage_secondHead')]")
    private WebElement forgetPasswordSubHeader;
    @FindBy(xpath = "//div[starts-with(@class,'forgetPasswordPage_head')]")
    private WebElement forgetPasswordDescription;
    @FindBy(xpath = "//div[starts-with(@class,'forgetPasswordPage_error')]")
    private WebElement emailErrorMsgInForgetPassword;
    @FindBy(xpath = "//div[starts-with(@class,'loginInputs_serverError')]")
    private WebElement wrongCredentialsErrorMsg;
    @FindBy(xpath = "//div[starts-with(@class,'loginForm_redirectMsg')]")
    private WebElement ForgetPasswordToastMsg;
    @FindBy(id = "emailInput_errMsg")
    private WebElement emailErrorMsg;
    @FindBy(id = "passwordInput_errMsg")
    private WebElement passwordErrorMsg;
    @FindBy(id = "FaUserIcon")
    private WebElement signInOption;
    @FindBy(id = "FBBtn")
    private WebElement faceBookLoginOption;
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void navigateToLoginPage() throws IOException {
        webDriver.manage().deleteCookieNamed("guestCartId");
        webDriver.navigate().to(BaseURL + loginLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
        if (!webDriver.getCurrentUrl().contains(loginLink))
            webDriver.navigate().to(BaseURL + loginLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
    public  void waitTillCartSpinnerDisappear(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(this.pageLoader)));

    }
public void clickOnLoginBtn(){
        DataHelperAndWait.clickOnElement(loginBtn,webDriver);
        DataHelperAndWait.waitTillPageFullyLoaded(webDriver,50);
    DataHelperAndWait.waitToBeVisible(homePage.getSecondSideBanner(),webDriver);


}
    public void navigateToForgetPassword() throws IOException {
        webDriver.navigate().to(BaseURL + forgetPasswordURL);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void fillinLoginForm(String email, String password) {
        DataHelperAndWait.typeTextInElement(this.emailField, webDriver, email);
        DataHelperAndWait.typeTextInElement(this.passwordField, webDriver, password);
    }

    public void clickOnBackToLogin() {
//        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.waitToBeClickable(backToLoginLink, webDriver);
        backToLoginLink.click();
        DataHelperAndWait.waitToBeVisible(forgetPasswordLink, webDriver);

    }
}
