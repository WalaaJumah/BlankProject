package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AEFooterPage;

import java.util.ArrayList;
import java.util.List;

public class AEFooterPageTestCases extends BaseTest {
    AEFooterPage aeFooterPage= new AEFooterPage(webDriver);

    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks ", priority = 1)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly() {
        aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.switchToAECountry();
        Assert.assertTrue(aeFooterPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeFooterPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeFooterPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeFooterPage.getSecurePaymentTitle().getText(),"100% Secure Payments");
                    Assert.assertEquals(aeFooterPage.getSecurePaymentDescription().getText(),"Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeFooterPage.getAuthenticProductsTitle().getText(),"100% Authentic Products");
                    Assert.assertEquals(aeFooterPage.getAuthenticProductsDescription().getText(),"We only deal with original products");
                case 2:
                    Assert.assertEquals(aeFooterPage.getFastDeliveryTitle().getText(),"Fast Delivery Service");
                    Assert.assertEquals(aeFooterPage.getFastDeliveryDescription().getText(),"Fast delivery, competitive prices and excellent services");
            }
        }
    }
    @Test(description = "Make sure the Join Our NEWSLETTER section that appears in the footer section is displayed correctly", priority = 2)
    public void verifyJoinOurNewsletterSectionIsDisplayedCorrectly(){
        aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.switchToAECountry();
        Assert.assertTrue(aeFooterPage.getNewsletterBlock().isDisplayed());
        Assert.assertTrue(aeFooterPage.getEmailFieldInNewsletterBlock().isDisplayed());
        Assert.assertTrue(aeFooterPage.getFemaleOptionInNewsletterBlock().isDisplayed());
        Assert.assertTrue(aeFooterPage.getMaleOptionInNewsletterBlock().isDisplayed());
        Assert.assertTrue(aeFooterPage.getJoinBtnInNewsletterBlock().isDisplayed());
    }
    @Test(description = "Make sure the user(Male) can join sporter NEWSLETTER correctly", priority = 3)
    public void verifyAbilityToJoinSporterNewsletterWithMaleOptionCorrectly(){
        aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.switchToAECountry();
        aeFooterPage.fillInemailFieldInNewsletterBlock(aeFooterPage.generateRandomEmail());
        aeFooterPage.selectMaleOptionInNewsletterBlock();
        aeFooterPage.clickOnJoinBtnInNewsletterBlock();
        DataHelperAndWait.waitToBeVisible(aeFooterPage.getSubscriptionSuccessfulMsg(),15);
        Assert.assertTrue(aeFooterPage.getSubscriptionSuccessfulMsg().isDisplayed());
    }
    @Test(description = "Make sure the user(Female) can join sporter NEWSLETTER correctly", priority = 4)
    public void verifyAbilityToJoinSporterNewsletterWithFemaleOptionCorrectly(){
        aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.switchToAECountry();
        aeFooterPage.fillInemailFieldInNewsletterBlock(aeFooterPage.generateRandomEmail());
        aeFooterPage.selectFemaleOptionInNewsletterBlock();
        aeFooterPage.clickOnJoinBtnInNewsletterBlock();
        DataHelperAndWait.waitToBeVisible(aeFooterPage.getSubscriptionSuccessfulMsg(),15);
        Assert.assertTrue(aeFooterPage.getSubscriptionSuccessfulMsg().isDisplayed());
        Assert.assertEquals(aeFooterPage.getSubscriptionSuccessfulMsg().getText(),"Thank you for your subscription.");
    }
    // There's a bug here, when joining using email already joined then the system display 2 invalid messages
    @Test(description = "Make sure inability to join sporter NEWSLETTER using email already joined", priority = 5)
    public void verifyInabilityToJoinSporterNewsletterUsingEmailAlreadyJoined(){
        aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.switchToAECountry();
        aeFooterPage.fillInemailFieldInNewsletterBlock("a@a.com");
        aeFooterPage.selectFemaleOptionInNewsletterBlock();
        aeFooterPage.clickOnJoinBtnInNewsletterBlock();
        DataHelperAndWait.waitToBeVisible(aeFooterPage.getSubscriptionSuccessfulMsg(),15);
        Assert.assertTrue(aeFooterPage.getSubscriptionSuccessfulMsg().isDisplayed());
        Assert.assertEquals(aeFooterPage.getSubscriptionSuccessfulMsg().getText(),"This email address is already subscribed.");
    }
    //There's a UI issue when displaying the email formate message
    @Test(description = "Make sure inability to join sporter NEWSLETTER using invalid email formate", priority = 6)
    public void verifyInabilityToJoinSporterNewsletterUsingInvalidEmailFormate(){
        aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.switchToAECountry();
        aeFooterPage.fillInemailFieldInNewsletterBlock("a@a");
        aeFooterPage.selectFemaleOptionInNewsletterBlock();
        aeFooterPage.clickOnJoinBtnInNewsletterBlock();
        DataHelperAndWait.waitToBeVisible(aeFooterPage.getEmailRequiredMsgInNewsletterSection(),15);
        Assert.assertEquals(aeFooterPage.getEmailRequiredMsgInNewsletterSection().getText(),"Please enter a valid email address (Ex: johndoe@domain.com).");
    }
    @Test(description = "Make sure inability to join sporter NEWSLETTER without filling email field", priority = 7)
    public void verifyInabilityToJoinSporterNewsletterWithoutFillingEmailField(){
        aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.switchToAECountry();
        aeFooterPage.clickOnJoinBtnInNewsletterBlock();
        DataHelperAndWait.waitToBeVisible(aeFooterPage.getEmailRequiredMsgInNewsletterSection(),15);
        Assert.assertEquals(aeFooterPage.getEmailRequiredMsgInNewsletterSection().getText(),"This is a required field.");
    }
    @Test(description = "Make sure the Orders And Shipping Section Appears Correctly In Footer", priority = 8)
    public void verifyOrdersAndShippingSectionAppearsCorrectlyInFooter() {
        aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.switchToAECountry();
        Assert.assertEquals(aeFooterPage.getOrdersAndShippingHeader().getText(),"Orders & Shipping");
        Assert.assertEquals(aeFooterPage.getTrackYourOrderOption().getText(),"Track Your Order");
        Assert.assertEquals(aeFooterPage.getShippingAndDeliveryOption().getText(),"Shipping & Delivery");
        Assert.assertEquals(aeFooterPage.getRefundAndReturnsOption().getText(),"Refund & Returns");
    }






















}
