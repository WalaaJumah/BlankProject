package sporter_test;

import core.BasePage;
import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AEGuestUserPage;
import sporter_pages.AeProductDetailsPage;

import static core.BasePage.BaseURL;

public class AEGuestUserTestCases extends BaseTest {

    public void accessShippingInformationScreen(){
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);

        try{
        aeGuestUserPage.clickOnCartIcon();}
        catch (Exception e){
            aeGuestUserPage.clickOnCartIcon();
        }
        aeGuestUserPage.clickOnProceedCheckoutBtnInCartPopup();
        aeGuestUserPage.clickOnGuestCheckoutBtn();
    }
    @Test(groups = "Smoke Testing Result",description = "Guest User- Switching to UAE store", priority = 1)
    public void switchToUaeStore(){
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        aeGuestUserPage.switchToAECountry();
        if(webDriver.getCurrentUrl().contains(aeGuestUserPage.aeDomain)){
            System.out.println("You are in UAE Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+aeDomain);
            CloseInitialDialog();          }
    }
    @Test(groups = "Smoke Testing Result",description = "Make sure to access the Guest Checkout page from the cart page correctly", priority = 2)
    public void verifyAbilityToAccessTheGuestCheckoutPageFromTheCartPageCorrectly() {
         AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
         aeProductDetailsPage.displayTheProduct();
        aeGuestUserPage.addToCart();
        aeGuestUserPage.viewCart();
        aeGuestUserPage.clickOnProceedCheckoutBtn();
        aeGuestUserPage.clickOnGuestCheckoutBtn();
        Assert.assertTrue(aeGuestUserPage.getRegisterAtSporterOption().isDisplayed());
    }
    @Test(groups = "Smoke Testing Result",description = "Make sure to access the Guest Checkout page from the cart pop up correctly", priority = 3)
    public void verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPopUpCorrectly() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        aeGuestUserPage.navigateToHomePage();
        this.accessShippingInformationScreen();
        Assert.assertTrue(aeGuestUserPage.getRegisterAtSporterOption().isDisplayed());
    }
    @Test(description = "Make sure the title section appearing in the Shipping information screen is displayed correctly ", priority = 4)
    public void verifyTheHeaderOfShippingInformationFormIsDisplayed() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
        Assert.assertTrue(aeGuestUserPage.getTitleOfGuectUserShippingInformationScreen().isDisplayed());
    }
    @Test(groups = "Smoke Testing Result",description = "Guest Checkout- Make sure the system fills the store country by default in the country field in the shipping information form", priority = 5)
    public void verifyTheCountryRetrievedInCountryFieldBasedOnStoreCountry() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        //        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
        Assert.assertEquals(aeGuestUserPage.getCountryField().getText(), "United Arab Emirates");
    }
    @Test(groups = "Smoke Testing Result",description = "Make sure the Guest user cannot submit the shipping information without filling the required fields empty", priority = 6)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationWithoutFillingTheRequiredFields() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
        aeGuestUserPage.fillInShippingInformationInputField(" ", " ", " ", " ", " ", " ", aeGuestUserPage.streetLineTwo);
        Select select = new Select(aeGuestUserPage.getCityMenu());
//        WebElement cityOption = select.getOptions().get(0);
        select.getOptions().get(0).click();
        DataHelperAndWait.scrollTo(aeGuestUserPage.getContinueBtn(),webDriver);
aeGuestUserPage.clickOnContinueBtn();
        Assert.assertEquals(aeGuestUserPage.getFirstnameRequiredFieldMsg().getText(), "This is a required field.");
        Assert.assertEquals(aeGuestUserPage.getLastNameRequiredFieldMsg().getText(), "This is a required field.");
        Assert.assertEquals(aeGuestUserPage.getemailRequiredFieldMsg().getText(), "This is a required field.");
        Assert.assertEquals(aeGuestUserPage.getPhoneRequiredFieldMsg().getText(), "Text length does not satisfy specified text range.");
        Assert.assertEquals(aeGuestUserPage.getAddressRequiredFieldMsg().getText(), "This is a required field.");
        Assert.assertEquals(aeGuestUserPage.getStreetlineOneRequiredFieldMsg().getText(), "This is a required field.");
    }
    @Test(groups = "Smoke Testing Result",description = "Make sure the Guest user cannot submit the shipping information when the phone number length is small ", priority = 7)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationWhenPhoneFieldHaveSmallTextLength() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        //        aeGuestUserPage.clearShippingInformationFields();
//                aeProductDetailsPage.displayTheProduct();

//        aeGuestUserPage.addToCart();
//        aeGuestUserPage.viewCart();
//        aeGuestUserPage.clickOnProceedCheckoutBtn();
//        aeGuestUserPage.clickOnGuestCheckoutBtn();
        Select select = new Select(aeGuestUserPage.getCityMenu());
        select.getOptions().get(0).click();
        aeGuestUserPage.fillInShippingInformationInputField(aeGuestUserPage.firstName,aeGuestUserPage.lastName,aeGuestUserPage.email, "2222", aeGuestUserPage.address, aeGuestUserPage.streetLineOne, aeGuestUserPage.streetLineTwo);
        DataHelperAndWait.scrollTo(aeGuestUserPage.getContinueBtn(),webDriver);
aeGuestUserPage.clickOnContinueBtn();
        Assert.assertEquals(aeGuestUserPage.getPhoneRequiredFieldMsg().getText(), "Text length does not satisfy specified text range.");
    }
    @Test(groups = "Smoke Testing Result",description = "Make sure the Guest user cannot submit the shipping information with incorrect email format ", priority = 8)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationWithIncorrectEmailFormat() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
//                aeProductDetailsPage.displayTheProduct();

//        aeGuestUserPage.addToCart();
//        aeGuestUserPage.viewCart();
//        aeGuestUserPage.clickOnProceedCheckoutBtn();
//        aeGuestUserPage.clickOnGuestCheckoutBtn();
        //        aeGuestUserPage.clearShippingInformationFields();
        aeGuestUserPage.fillInShippingInformationInputField(aeGuestUserPage.firstName, aeGuestUserPage.lastName, "email@email", aeGuestUserPage.phone, aeGuestUserPage.address, aeGuestUserPage.streetLineOne, aeGuestUserPage.streetLineTwo);
        Select select = new Select(aeGuestUserPage.getCityMenu());
        WebElement cityOption = select.getOptions().get(2);
        cityOption.click();
        DataHelperAndWait.scrollTo(aeGuestUserPage.getContinueBtn(),webDriver);
aeGuestUserPage.clickOnContinueBtn();
        Assert.assertEquals(aeGuestUserPage.getEmailValidationFormateMsg().getText(), "Please enter a valid email address.");
    }
    @Test(groups = "Smoke Testing Result",description = "Guest Checkout- Make sure the city Search field in the shipping information form works correctly and retrieved the matched result ", priority = 9)
    public void verifyCitySearchWorksFineAndRetrievedTheMatchedResult() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
        aeGuestUserPage.getCityListField().click();
        aeGuestUserPage.getCitySearchField().sendKeys("D");
        for (WebElement webElement : aeGuestUserPage.getSearchMenu()) {
            webElement.getText();
            Assert.assertTrue(webElement.getText().startsWith("D"));
        }
    }
    @Test(description = "Guest Checkout- Make sure the city Search field in the shipping information form works correctly when searching for option does not exist in the list ", priority = 10)
    public void verifyCitySearchWorksFineWhenSearchingForOptionDoesNotExist() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
        aeGuestUserPage.getCityListField().click();
        aeGuestUserPage.getCitySearchField().sendKeys("test");
        for (WebElement webElement : aeGuestUserPage.getSearchMenu()) {
            webElement.getText();
            Assert.assertEquals(webElement.getText(), "No city found");
        }
    }
    @Test(description = "Guest Checkout- Make sure the city Search list in the shipping information form will retrieve all city options when searching using Space", priority = 11)
    public void verifyCitySearchListRetrieveAllOptionWhenEnteringSpace() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
        aeGuestUserPage.getCityListField().click();
        aeGuestUserPage.getCitySearchField().sendKeys(" ");
        for (WebElement webElement : aeGuestUserPage.getSearchMenu()) {
            Assert.assertEquals(webElement.getText(), "Select city\n" + "Dubai\n" + "Abu Dhabi\n" + "Sharjah\n" + "Ajman\n" + "Al Ain\n" + "Ras Al Khaimah\n" + "Fujairah\n" + "Umm Al Quwain");
        }
    }
    @Test(groups = "Smoke Testing Result",description = "Guest Checkout- Make sure  ability to fill and navigate between the shipping information form using Tab key and keyboard shortcuts", priority = 12)
    public void verifyAbilityToFillAndNavigateBetweenTheShippingInformationFormUsingTabKeyAndKeyboardShortCut() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        Actions act = new Actions(webDriver);
                aeGuestUserPage.clearShippingInformationFields();
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
        aeGuestUserPage.clickOnFirstNameField();
        aeGuestUserPage.getFirstNameField().sendKeys(aeGuestUserPage.firstName);
        act.sendKeys(Keys.TAB).build().perform();
        aeGuestUserPage.getLastNameField().sendKeys(aeGuestUserPage.lastName);
        act.sendKeys(Keys.TAB).build().perform();
        aeGuestUserPage.getEmailField().sendKeys(aeGuestUserPage.email);
        act.sendKeys(Keys.TAB).build().perform();
        aeGuestUserPage.getPhoneField().sendKeys(aeGuestUserPage.phone);
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(Keys.ENTER).build().perform();
        act.sendKeys(Keys.DOWN).build().perform();
        act.sendKeys(Keys.ENTER).build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        aeGuestUserPage.getAddressField().sendKeys(aeGuestUserPage.address);
        act.sendKeys(Keys.TAB).build().perform();
        aeGuestUserPage.getStreetLineOneField().sendKeys(aeGuestUserPage.streetLineOne);
        act.sendKeys(Keys.TAB).build().perform();
        aeGuestUserPage.getStreetLineTwoField().sendKeys(aeGuestUserPage.streetLineTwo);
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(Keys.ENTER).build().perform();
        Assert.assertTrue(aeGuestUserPage.getShippingMethodSection().isDisplayed());
    }
    @Test(description = "Guest Checkout- Make sure inability to submit the shipping information when filling " +
            "streetLine 1&2 & First Name & Last Name fields with the text length>=255 symbols & the validation message appears correctly", priority = 13)
    public void verifyInabilityToSubmitTheShippingInformationFormWhenFillingFieldsWithTextLengthGreaterThan255Symbols() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        aeGuestUserPage.navigateToHomePage();
        this.accessShippingInformationScreen();
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
        aeGuestUserPage.fillInShippingInformationInputField(aeGuestUserPage.longLengthText,aeGuestUserPage.longLengthText, aeGuestUserPage.email, aeGuestUserPage.phone, aeGuestUserPage.address, aeGuestUserPage.longLengthText,aeGuestUserPage.longLengthText);
        Select select = new Select(aeGuestUserPage.getCityMenu());
        WebElement cityOption = select.getOptions().get(2);
        cityOption.click();
        DataHelperAndWait.scrollTo(aeGuestUserPage.getContinueBtn(),webDriver);
        Assert.assertEquals(aeGuestUserPage.getFirstnameRequiredFieldMsg().getText(), "Please enter less or equal than 255 symbols.");
        Assert.assertEquals(aeGuestUserPage.getLastNameRequiredFieldMsg().getText(), "Please enter less or equal than 255 symbols.");
        Assert.assertEquals(aeGuestUserPage.getStreetlineOneRequiredFieldMsg().getText(), "Please enter less or equal than 255 symbols.");
        Assert.assertEquals(aeGuestUserPage.getStreetlineTwoRequiredFieldMsg().getText(), "Please enter less or equal than 255 symbols.");
    }
    @Test(groups = {"Smoke Testing Result","High Severity","Low Severity","Meduim Severity"},description = "Make sure the Guest user can filling the shipping information correctly", priority = 14)
    public void verifyTheGuestUserCanFillTheShippingInformationCorrectly() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        aeGuestUserPage.navigateToHomePage();
        this.accessShippingInformationScreen();
        //        aeGuestUserPage.clearShippingInformationFields();
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
        aeGuestUserPage.fillInShippingInformationInputField(aeGuestUserPage.firstName, aeGuestUserPage.lastName, aeGuestUserPage.email, aeGuestUserPage.phone, aeGuestUserPage.address, aeGuestUserPage.streetLineOne,aeGuestUserPage. streetLineTwo);
        Select select = new Select(aeGuestUserPage.getCityMenu());
        WebElement cityOption = select.getOptions().get(2);
        cityOption.click();
        DataHelperAndWait.scrollTo(aeGuestUserPage.getContinueBtn(),webDriver);
aeGuestUserPage.clickOnContinueBtn();
        Assert.assertTrue(aeGuestUserPage.getShippingMethodSection().isDisplayed());
    }
    @Test(groups = "Smoke Testing Result",description = "Make sure the return to the cart button appearing in the shipping information screen for the Guest User works correctly  ", priority = 15)
    public void verifyBackToCartLinkWorksCorrectly() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        aeGuestUserPage.navigateToHomePage();
        this.verifyAbilityToAccessTheGuestCheckoutPageFromTheCartPageCorrectly();
        aeGuestUserPage.clickOnReturnToCartIcon();
        DataHelperAndWait.waitForUrlContains(aeGuestUserPage.cartURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(cartURL) );
    }

    @Test(description = "Make sure ability to navigate to the home page by clicking on the sporter logo from the shipping information form for the Guest User ", priority = 16)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogo() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
        this.accessShippingInformationScreen();
        aeGuestUserPage.clickOnSporterLogo();
        DataHelperAndWait.waitForUrlContains(BaseURL,webDriver,10);
        Assert.assertEquals(webDriver.getCurrentUrl(), BaseURL +aeDomain+"/");
    }

    @Test(description = "Guest Checkout- Make sure ability to navigate to the shipping information directly from the URL", priority = 17)
    public void verifyInabilityToNavigateToShippingInformationViaUrlWithoutAddingProductToCart() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        webDriver.navigate().to("https://www.sporter.com/en-ae/checkout/cart/#shipping");
        aeGuestUserPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(description = "Make sure the Guest user can filling the shipping information correctly when switching to Arabic version", priority = 18)
    public void verifyTheGuestUserCanFillTheShippingInformationWhenSwitchingToArabicCorrectly() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        aeGuestUserPage.navigateToHomePage();
        aeGuestUserPage.switchToArabicVersion();
        aeGuestUserPage.getCounterIconOnCartBtn();
        this.accessShippingInformationScreen();
        //        aeGuestUserPage.clearShippingInformationFields();
        aeGuestUserPage.fillInShippingInformationInputField(aeGuestUserPage.firstNameAr, aeGuestUserPage.lastNameAr, aeGuestUserPage.email, aeGuestUserPage.phone, aeGuestUserPage.addressAr, aeGuestUserPage.streetLineOneAr, aeGuestUserPage.streetLineTwoAr);
        Select select = new Select(aeGuestUserPage.getCityMenu());
        WebElement cityOption = select.getOptions().get(2);
        cityOption.click();
        DataHelperAndWait.scrollTo(aeGuestUserPage.getContinueBtn(),webDriver);
aeGuestUserPage.clickOnContinueBtn();
        Assert.assertTrue(aeGuestUserPage.getShippingMethodSection().isDisplayed());
    }
    //There's a bug here
    @Test( description = "Guest User- Make sure the validation message appears when submiting tGhe shipping information without filling the city field", priority = 19)
    public void verifyTheValidationMsgAppearingWhenSubmittingTheShippingFormWithoutFillingTheCityField() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        aeGuestUserPage.navigateToHomePage();
        this.accessShippingInformationScreen();
        aeGuestUserPage.fillInShippingInformationInputField(" ", " ", " ", " ", " ", " ", aeGuestUserPage.streetLineTwo);
//        Select select = new Select(aeGuestUserPage.getCityMenu());
//        WebElement cityOption = select.getOptions().get(0);
//        select.getOptions().get(0).click();
        DataHelperAndWait.scrollTo(aeGuestUserPage.getContinueBtn(),webDriver);
aeGuestUserPage.clickOnContinueBtn();
        Assert.assertEquals(aeGuestUserPage.getFirstnameRequiredFieldMsg().getText(), "This is a required field.");
        Assert.assertEquals(aeGuestUserPage.getLastNameRequiredFieldMsg().getText(), "This is a required field.");
        Assert.assertEquals(aeGuestUserPage.getemailRequiredFieldMsg().getText(), "This is a required field.");
        Assert.assertEquals(aeGuestUserPage.getPhoneRequiredFieldMsg().getText(), "Text length does not satisfy specified text range.");
        Assert.assertEquals(aeGuestUserPage.getAddressRequiredFieldMsg().getText(), "This is a required field.");
        Assert.assertEquals(aeGuestUserPage.getStreetlineOneRequiredFieldMsg().getText(), "This is a required field.");
        //There's a bug in the following statement
        Assert.assertEquals(aeGuestUserPage.getCityRequiredFieldMsg().getText(), "This is a required field.");
    }
}