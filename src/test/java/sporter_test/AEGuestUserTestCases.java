//package sporter_test;
//
//import core.BaseTest;
//import core.DataHelperAndWait;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import sporter_pages.AEGuestUserPage;
//
//public class AEGuestUserTestCases extends BaseTest {
//    private AEGuestUserPage aeGuestUserPage;
//    String firstName = "Automation";
//    String firstNameAr = "محمد";
//    String lastName = "User";
//    String lastNameAr = "احمد";
//    String phone = "2222222";
//    String email = "SporterTesta@gmail.com";
//    String address = "Automation Address";
//    String addressAr = "عنوان البيت";
//    String streetLineOne = "Automation street Line 1";
//    String streetLineOneAr = "شارع خالد بن الوليد";
//    String streetLineTwo = "Automation street Line 2";
//    String streetLineTwoAr = "طريق رقم 10";
//    String longLengthText = "Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length 10";
//
//    @Test(description = "Make sure to access the Guest Checkout page from the cart page correctly", priority = 1)
//    public void verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        aeGuestUserPage.switchToAECountry();
//        aeGuestUserPage.clickOnProductInHomePage();
//        aeGuestUserPage.addToCart();
//        aeGuestUserPage.viewCart();
//        aeGuestUserPage.clickOnProceedCheckoutBtn();
//        aeGuestUserPage.clickOnGuestCheckoutBtn();
//        Assert.assertTrue(aeGuestUserPage.getRegisterAtSporterOption().isDisplayed());
//    }
//
//    @Test(description = "Make sure to access the Guest Checkout page from the cart pop up correctly", priority = 2)
//    public void verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPopUpCorrectly() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        aeGuestUserPage.switchToAECountry();
//        aeGuestUserPage.clickOnProductInHomePage();
//        aeGuestUserPage.addToCart();
//        aeGuestUserPage.viewCart();
//        aeGuestUserPage.clickOnCartIcon();
//        aeGuestUserPage.clickOnProceedCheckoutBtnInCartPopup();
//        aeGuestUserPage.clickOnGuestCheckoutBtn();
//        Assert.assertTrue(aeGuestUserPage.getRegisterAtSporterOption().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Guest user can filling the shipping information correctly", priority = 3)
//    public void verifyTheGuestUserCanFillTheShippingInformationCorrectly() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
//        aeGuestUserPage.fillInShippingInformationInputField(firstName, lastName, email, phone, address, streetLineOne, streetLineTwo);
//        Select select = new Select(aeGuestUserPage.getCityMenu());
//        WebElement cityOption = select.getOptions().get(2);
//        cityOption.click();
//        aeGuestUserPage.clickOnContinueBtn();
//        DataHelperAndWait.implicitWait(10);
//        Assert.assertTrue(aeGuestUserPage.getShippingMethodSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the system displays the store country by default in country field", priority = 4)
//    public void verifyTheCountryRetrievedInCountryFieldBasedOnStoreCountry() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
//        Assert.assertEquals(aeGuestUserPage.getCountryField().getText(), "United Arab Emirates");
//    }
//
//    @Test(description = "Make sure the Guest user can filling the shipping information correctly", priority = 5)
//    public void verifyTheGuestUserCanFillTheShippingInformationWhenSwitchingToArabicCorrectly() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        aeGuestUserPage.switchToArabicVersion();
//        aeGuestUserPage.switchToAECountry();
//        aeGuestUserPage.clickOnProductInHomePageAr();
//        aeGuestUserPage.addToCart();
//        aeGuestUserPage.viewCart();
//        aeGuestUserPage.clickOnProceedCheckoutBtn();
//        aeGuestUserPage.clickOnGuestCheckoutBtn();
//        aeGuestUserPage.fillInShippingInformationInputField(firstNameAr, lastNameAr, email, phone, addressAr, streetLineOneAr, streetLineTwoAr);
//        Select select = new Select(aeGuestUserPage.getCityMenu());
//        WebElement cityOption = select.getOptions().get(2);
//        cityOption.click();
//        aeGuestUserPage.clickOnContinueBtn();
//        DataHelperAndWait.implicitWait(10);
//        Assert.assertTrue(aeGuestUserPage.getShippingMethodSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Guest user cannot submit the shipping information when keeping the required fields empty", priority = 6)
//    public void verifyTheGuestUserCannotSubmitTheShippingInformationWithoutFillingTheRequiredFields() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
//        aeGuestUserPage.fillInShippingInformationInputField(" ", " ", " ", " ", " ", " ", streetLineTwo);
//        Select select = new Select(aeGuestUserPage.getCityMenu());
//        WebElement cityOption = select.getOptions().get(0);
//        cityOption.click();
//        aeGuestUserPage.clickOnContinueBtn();
//        DataHelperAndWait.implicitWait(15);
//        Assert.assertEquals(aeGuestUserPage.getFirstnameRequiredFieldMsg().getText(), "This is a required field.");
//        Assert.assertEquals(aeGuestUserPage.getLastNameRequiredFieldMsg().getText(), "This is a required field.");
//        Assert.assertEquals(aeGuestUserPage.getemailRequiredFieldMsg().getText(), "This is a required field.");
//        Assert.assertEquals(aeGuestUserPage.getPhoneRequiredFieldMsg().getText(), "Text length does not satisfy specified text range.");
//        Assert.assertEquals(aeGuestUserPage.getAddressRequiredFieldMsg().getText(), "This is a required field.");
//        Assert.assertEquals(aeGuestUserPage.getStreetlineOneRequiredFieldMsg().getText(), "This is a required field.");
//        //There's a bug in the following statement
//        Assert.assertEquals(aeGuestUserPage.getCityRequiredFieldMsg().getText(), "This is a required field.");
//    }
//
//    @Test(description = "Make sure the Guest user cannot submit the shipping information when the phone number length is small ", priority = 7)
//    public void verifyTheGuestUserCannotSubmitTheShippingInformationWhenPhoneFieldHaveSmallTextLength() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        aeGuestUserPage.switchToAECountry();
//        aeGuestUserPage.clickOnProductInHomePage();
//        aeGuestUserPage.addToCart();
//        aeGuestUserPage.viewCart();
//        aeGuestUserPage.clickOnProceedCheckoutBtn();
//        aeGuestUserPage.clickOnGuestCheckoutBtn();
//        aeGuestUserPage.fillInShippingInformationInputField(firstName, lastName, email, "2222", address, streetLineOne, streetLineTwo);
//        Select select = new Select(aeGuestUserPage.getCityMenu());
//        WebElement cityOption = select.getOptions().get(2);
//        cityOption.click();
//        aeGuestUserPage.clickOnContinueBtn();
//        DataHelperAndWait.implicitWait(10);
//        Assert.assertEquals(aeGuestUserPage.getPhoneRequiredFieldMsg().getText(), "Text length does not satisfy specified text range.");
//    }
//
//    @Test(description = "Make sure the Guest user cannot submit the shipping information with incorrect email format ", priority = 8)
//    public void verifyTheGuestUserCannotSubmitTheShippingInformationWithIncorrectEmailFormat() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        aeGuestUserPage.switchToAECountry();
//        aeGuestUserPage.clickOnProductInHomePage();
//        aeGuestUserPage.addToCart();
//        aeGuestUserPage.viewCart();
//        aeGuestUserPage.clickOnProceedCheckoutBtn();
//        aeGuestUserPage.clickOnGuestCheckoutBtn();
//        aeGuestUserPage.fillInShippingInformationInputField(firstName, lastName, "email@email", phone, address, streetLineOne, streetLineTwo);
//        Select select = new Select(aeGuestUserPage.getCityMenu());
//        WebElement cityOption = select.getOptions().get(2);
//        cityOption.click();
//        aeGuestUserPage.clickOnContinueBtn();
//        DataHelperAndWait.waitToBeVisible(aeGuestUserPage.getEmailValidationFormateMsg(), 15);
//        Assert.assertEquals(aeGuestUserPage.getEmailValidationFormateMsg().getText(), "Please enter a valid email address.");
//    }
//
//    @Test(description = "Make sure the city Search field works correctly and retrieved the matched result ", priority = 9)
//    public void verifyCitySearchWorksFineAndRetrievedTheMatchedResult() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
//        aeGuestUserPage.getCityListField().click();
//        aeGuestUserPage.getCitySearchField().sendKeys("D");
//        for (WebElement webElement : aeGuestUserPage.getSearchMenu()) {
//            webElement.getText();
//            Assert.assertTrue(webElement.getText().startsWith("D"));
//        }
//    }
//
//    @Test(description = "Make sure the city Search field works correctly when searching for option does not exist in the list ", priority = 10)
//    public void verifyCitySearchWorksFineWhenSearchingForOptionDoesNotExist() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
//        aeGuestUserPage.getCityListField().click();
//        aeGuestUserPage.getCitySearchField().sendKeys("test");
//        for (WebElement webElement : aeGuestUserPage.getSearchMenu()) {
//            webElement.getText();
//            Assert.assertEquals(webElement.getText(), "No city found");
//        }
//    }
//
//    @Test(description = "Make sure the city Search list will retrieve all city options when searching using Space", priority = 11)
//    public void verifyCitySearchListRetrieveAllOptionWhenEnteringSpace() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
//        aeGuestUserPage.getCityListField().click();
//        aeGuestUserPage.getCitySearchField().sendKeys(" ");
//        for (WebElement webElement : aeGuestUserPage.getSearchMenu()) {
//            Assert.assertEquals(webElement.getText(), "Select city\n" + "Dubai\n" + "Abu Dhabi\n" + "Sharjah\n" + "Ajman\n" + "Al Ain\n" + "Ras Al Khaimah\n" + "Fujairah\n" + "Umm Al Quwain");
//        }
//    }
//
//    @Test(description = "Make sure  ability to fill and navigate between the shipping information form using Tab key and keyboard shortcuts", priority = 12)
//    public void verifyAbilityToFillAndNavigateBetweenTheShippingInformationFormUsingTabKeyAndKeyboardShortCut() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        Actions act = new Actions(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
//        aeGuestUserPage.clickOnFirstNameField();
//        aeGuestUserPage.getFirstNameField().sendKeys(firstName);
//        act.sendKeys(Keys.TAB).build().perform();
//        aeGuestUserPage.getLastNameField().sendKeys(lastName);
//        act.sendKeys(Keys.TAB).build().perform();
//        aeGuestUserPage.getEmailField().sendKeys(email);
//        act.sendKeys(Keys.TAB).build().perform();
//        aeGuestUserPage.getPhoneField().sendKeys(phone);
//        act.sendKeys(Keys.TAB).build().perform();
//        act.sendKeys(Keys.TAB).build().perform();
//        act.sendKeys(Keys.ENTER).build().perform();
//        act.sendKeys(Keys.DOWN).build().perform();
//        act.sendKeys(Keys.ENTER).build().perform();
//        act.sendKeys(Keys.TAB).build().perform();
//        aeGuestUserPage.getAddressField().sendKeys(address);
//        act.sendKeys(Keys.TAB).build().perform();
//        aeGuestUserPage.getStreetLineOneField().sendKeys(streetLineOne);
//        act.sendKeys(Keys.TAB).build().perform();
//        aeGuestUserPage.getStreetLineTwoField().sendKeys(streetLineTwo);
//        act.sendKeys(Keys.TAB).build().perform();
//        act.sendKeys(Keys.ENTER).build().perform();
//        DataHelperAndWait.waitToBeVisible(aeGuestUserPage.getShippingMethodSection(), 15);
//        Assert.assertTrue(aeGuestUserPage.getShippingMethodSection().isDisplayed());
//    }
//
//    /////////////////////
//    @Test(description = "Make sure inability to submit the shipping information when filling " +
//            "streetLine 1&2 & First Name & Last Name fields with the text length>=255 symbols & the validation message appears correctly", priority = 13)
//    public void verifyInabilityToSubmitTheShippingInformationFormWhenFillingFieldsWithTextLengthGreaterThan255Symbols() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
//        aeGuestUserPage.fillInShippingInformationInputField(longLengthText, longLengthText, email, phone, address, longLengthText, longLengthText);
//        Select select = new Select(aeGuestUserPage.getCityMenu());
//        WebElement cityOption = select.getOptions().get(0);
//        cityOption.click();
//        aeGuestUserPage.clickOnContinueBtn();
//        DataHelperAndWait.implicitWait(10);
//        Assert.assertEquals(aeGuestUserPage.getFirstnameRequiredFieldMsg().getText(), "Please enter less or equal than 255 symbols.");
//        Assert.assertEquals(aeGuestUserPage.getLastNameRequiredFieldMsg().getText(), "Please enter less or equal than 255 symbols.");
//        Assert.assertEquals(aeGuestUserPage.getStreetlineOneRequiredFieldMsg().getText(), "Please enter less or equal than 255 symbols.");
//        Assert.assertEquals(aeGuestUserPage.getStreetlineTwoRequiredFieldMsg().getText(), "Please enter less or equal than 255 symbols.");
//    }
//
//    @Test(description = "Make sure the Select a billing address from your address book or enter a new address header appears correctly ", priority = 14)
//    public void verifyTheHeaderOfShippingInformationFormIsDisplayed() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeGuestUserPage.getTitleOfGuectUserShippingInformationScreen(), 10);
//        Assert.assertTrue(aeGuestUserPage.getTitleOfGuectUserShippingInformationScreen().isDisplayed());
//    }
//
//    @Test(description = "Make sure the return to the cart link works correctly  ", priority = 15)
//    public void verifyBackToCartLinkWorksCorrectly() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
//        aeGuestUserPage.clickOnReturnToCartIcon();
//        Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.sporter.com/en-ae/checkout/cart/");
//    }
//
//    @Test(description = "Make sure ability to navigate to the home page by clicking on the sporter logo ", priority = 16)
//    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogo() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyAbilityToAccessTheGuestCheckoutPageFormTheCartPageCorrectly();
//        aeGuestUserPage.clickOnSporterLogo();
//        Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.sporter.com/en-ae/");
//    }
//
//    @Test(description = "Make sure inability to navigate to the shipping information  directly from the URL without adding any item to the Cart ", priority = 17)
//    public void verifyInabilityToNavigateToShippingInformationViaUrlWithoutAddingProductToCart() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        aeGuestUserPage.switchToAECountry();
//        webDriver.navigate().to("https://www.sporter.com/en-ae/checkout/cart/#shipping");
//        DataHelperAndWait.waitToBeVisible(aeGuestUserPage.getNoItemInCartLabel(), 15);
//        Assert.assertTrue(aeGuestUserPage.getNoItemInCartLabel().isDisplayed());
//    }
//}