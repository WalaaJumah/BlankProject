package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AEGuestUserPage;
import sporter_pages.KsaHomePage;

public class AEGuestUserTestCases extends BaseTest {
    private AEGuestUserPage aeGuestUserPage;
    String firstName="Automation";
    String lastName="User";
    String phone="2222222";
    String email="SporterTesta@gmail.com";
    String address="Automation Address";
    String streetLineOne="Automation street Line 1";
    String streetLineTwo="Automation street Line 2";

    @Test(description ="Make sure to access the Guest Checkout page from the cart page correctly",priority = 1)
    public void verifyAbilityToAccessTheGuestCheckoutPagefromTheCartPageCorrectly(){
        aeGuestUserPage=new AEGuestUserPage(webDriver);
        aeGuestUserPage.switchToAECountry();
        aeGuestUserPage.clickOnProductInHomePage();
        aeGuestUserPage.addToCart();
        aeGuestUserPage.viewCart();
        aeGuestUserPage.clickOnProceedCheckoutBtn();
        aeGuestUserPage.clickOnGuestCheckoutBtn();
        Assert.assertTrue(aeGuestUserPage.getRegisterAtSporterOption().isDisplayed());
    }
    @Test(description ="Make sure to access the Guest Checkout page from the cart pop up correctly",priority = 2)
    public void verifyAbilityToAccessTheGuestCheckoutPagefromTheCartPopUpCorrectly(){
        aeGuestUserPage=new AEGuestUserPage(webDriver);
        aeGuestUserPage.switchToAECountry();
        aeGuestUserPage.clickOnProductInHomePage();
        aeGuestUserPage.addToCart();
        aeGuestUserPage.viewCart();
        aeGuestUserPage.clickOnCartIcon();
        aeGuestUserPage.clickOnProceedCheckoutBtnInCartPopup();
        aeGuestUserPage.clickOnGuestCheckoutBtn();
        Assert.assertTrue(aeGuestUserPage.getRegisterAtSporterOption().isDisplayed());}
    @Test(description ="Make sure the Guest user can filling the shipping information correctly",priority = 3)
    public void verifyTheGuestUserCanFillTheShippingInformationCorrectly(){
        aeGuestUserPage=new AEGuestUserPage(webDriver);
        aeGuestUserPage.switchToAECountry();
        aeGuestUserPage.clickOnProductInHomePage();
        aeGuestUserPage.addToCart();
        aeGuestUserPage.viewCart();
        aeGuestUserPage.clickOnProceedCheckoutBtn();
        aeGuestUserPage.clickOnGuestCheckoutBtn();
        aeGuestUserPage.fillInShippingInformationInputField(firstName,lastName,email,phone,address,streetLineOne,streetLineTwo);
        Select select = new Select(aeGuestUserPage.getCityMenu());
        WebElement cityOption = select.getOptions().get(2);
        cityOption.click();
        aeGuestUserPage.clickOnContinueBtn();
        DataHelperAndWait.implicitWait(10);
        Assert.assertTrue(aeGuestUserPage.getShippingMethodSection().isDisplayed());

    }



















    }
