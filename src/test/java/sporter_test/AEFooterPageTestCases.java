//package sporter_test;
//
//import core.BaseTest;
//import core.DataHelperAndWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import sporter_pages.AEFooterPage;
//import sporter_pages.AEMegaMenuPage;
//
//import static org.testng.Assert.assertFalse;
//
//public class AEFooterPageTestCases extends BaseTest {
//    String trackOrderUrl = "https://www.sporter.com/en-ae/track/";
//    String shippingAndDeliveryUrl = "https://www.sporter.com/en-ae/orders-delivery/";
//    String refundAndReturnUrl = "https://www.sporter.com/en-ae/refund/";
//    String customerServiceUrl = "https://www.sporter.com/en-ae/customer-service/";
//    String fAQsUrl = "https://www.sporter.com/en-ae/faq/";
//    String grenadeReloadProteinOatBar = "https://www.sporter.com/en-ae/grenade-reload-protein-oat-bar-35229/";
//    String grenadeCrabKillaProteinBar = "https://www.sporter.com/en-ae/grenade-carb-killa-protein-bar";
//    String grenadeCrabKillaProteinBarBoxOf12 = "https://www.sporter.com/en-ae/grenade-carb-killa-protein-bar-box-of-12";
//    String dramatizeIso100Protein = "https://www.sporter.com/en-ae/dymatize-iso-100";
//    String questNutritionBarsBoxOf12 = "https://www.sporter.com/en-ae/quest-nutrition-bars-pack-of-12-00715";
//    String aboutSporterUrl = "https://www.sporter.com/en-ae/about/";
//    String productQualityUrl = "https://www.sporter.com/en-ae/products-quality/";
//    String productAuthenticityUrl = "https://www.sporter.com/en-ae/official-supplier/";
//    String wholesaleUrl = "https://www.sporter.com/en-ae/wholesale-offers/";
//    String careersUrl = "https://ae.linkedin.com/company/sporter.com";
//    String sporterBlogUrl = "https://www.sporter.com/en-ae/blog/";
//    String contactUsUrl = "https://www.sporter.com/en-ae/contacts-us/";
//    String trainingApparelUrl = "https://www.sporter.com/en-ae/accessories-apparel-1/training-apparel/";
//    String fitnessAccessoriesUrl = "https://www.sporter.com/en-ae/sportswear-accessories/fitness-accessories/";
//    String shakersUrl = "https://www.sporter.com/en-ae/sportswear-accessories/fitness-accessories/shakers/";
//    String homeGymEquipmentUrl = "https://www.sporter.com/en-ae/sportswear-accessories/strength-training/home-gyms/";
//    String watchesUrl = "https://www.sporter.com/en-ae/brands/other/fitbit/";
//    String strapsUrl = "https://www.sporter.com/en-ae/sportswear-accessories/strength-training/straps/";
//    String bagsUrl = "https://www.sporter.com/en-ae/sportswear-accessories/fitness-accessories/bags/";
//    String wheyProteinUrl = "https://www.sporter.com/en-ae/sport-supplements/protein/whey-protein/";
//    String wheyProteinIsolateUrl = "https://www.sporter.com/en-ae/sport-supplements/protein/whey-protein-isolate/";
//    String caseinProteinUrl = "https://www.sporter.com/en-ae/sport-supplements/protein/casein-protein/";
//    String weightGainAndMassGainerUrl = "https://www.sporter.com/en-ae/sport-supplements/protein/mass-gainer/";
//    String bCAAsAndAminoAcidsUrl = "https://www.sporter.com/en-ae/sport-supplements/amino-acids/";
//    String preWorkoutAndEnduranceUrl = "https://www.sporter.com/en-ae/sport-supplements/energy-endurance/";
//    String glutamineAndRecoveryUrl = "https://www.sporter.com/en-ae/sport-supplements/recovery/";
//    String fatBurnersUrl = "https://www.sporter.com/en-ae/sport-supplements/weight-management/";
//    String proteinBarsUrl = "https://www.sporter.com/en-ae/healthy-food/snacks-drinks/protein-bars/";
//    String healthySnacksUrl = "https://www.sporter.com/en-ae/healthy-food/";
//    String multivitaminsUrl = "https://www.sporter.com/en-ae/vitamins/multivitamins/";
//    String vitamindUrl = "https://www.sporter.com/en-ae/vitamins/essential-vitamins/vitamin-d/";
//    String vitamincUrl = "https://www.sporter.com/en-ae/vitamins/essential-vitamins/vitamin-c/";
//    String vitamineUrl = "https://www.sporter.com/en-ae/vitamins/essential-vitamins/vitamin-e/";
//    String fishOilOmegasUrl = "https://www.sporter.com/en-ae/vitamins/fish-oil-omegas/";
//    String folicAcidUrl = "https://www.sporter.com/en-ae/vitamins/essential-vitamins/folic-acid/";
//    String boneJointSupportUrl = "https://www.sporter.com/en-ae/vitamins/bone-joint/";
//    String collagenUrl = "https://www.sporter.com/en-ae/vitamins/beauty/collagen/";
//    String hairSkinNailsUrl = "https://www.sporter.com/en-ae/vitamins/beauty/hair-skin-nails/";
//    String testosteroneBoosterUrl = "https://www.sporter.com/en-ae/sport-supplements/muscles-boosters/testosterone-booster/";
//    String melatoninSleepSupportUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/sleep-support/";
//    String digestionSupportUrl = "https://www.sporter.com/en-ae/vitamins/digestion/";
//    String termsAndServiceUrl = "https://www.sporter.com/en-ae/terms/";
//    String privacyPolicyUrl = "https://www.sporter.com/en-ae/privacy-policy/";
//    String instagramURL = "https://www.instagram.com/sportercom/?hl=en";
//    String facebookURL = "https://www.facebook.com/sportercom";
//    String twitterURL = "https://twitter.com/sportercom?lang=en";
//    String youtubeURL = "https://www.youtube.com/user/SporterVideos";
//
//    AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//    @Test(description = "Switching to UAE store", priority = 1)
//    public void switchToUaeStore(){
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//    }
//
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks ", priority = 1)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
////        aeFooterPage.switchToAECountry();
//        Assert.assertTrue(aeFooterPage.getPageBottomSection().isDisplayed());
//        for (int i = 0; i < aeFooterPage.getPageBottomBlocksList().size(); i++) {
//            Assert.assertTrue(aeFooterPage.getPageBottomBlocksList().get(i).isDisplayed());
//            switch (i) {
//                case 0:
//                    Assert.assertEquals(aeFooterPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
//                    Assert.assertEquals(aeFooterPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
//                case 1:
//                    Assert.assertEquals(aeFooterPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
//                    Assert.assertEquals(aeFooterPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
//                case 2:
//                    Assert.assertEquals(aeFooterPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
//                    Assert.assertEquals(aeFooterPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
//            }
//        }
//    }
//
//    @Test(description = "Make sure the Join Our NEWSLETTER section that appears in the footer section is displayed correctly", priority = 2)
//    public void verifyJoinOurNewsletterSectionIsDisplayedCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        Assert.assertTrue(aeFooterPage.getNewsletterBlock().isDisplayed());
//        Assert.assertTrue(aeFooterPage.getEmailFieldInNewsletterBlock().isDisplayed());
//        Assert.assertTrue(aeFooterPage.getFemaleOptionInNewsletterBlock().isDisplayed());
//        Assert.assertTrue(aeFooterPage.getMaleOptionInNewsletterBlock().isDisplayed());
//        Assert.assertTrue(aeFooterPage.getJoinBtnInNewsletterBlock().isDisplayed());
//    }
//
//    @Test(description = "Make sure the user(Male) can join sporter NEWSLETTER correctly", priority = 3)
//    public void verifyAbilityToJoinSporterNewsletterWithMaleOptionCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.fillInemailFieldInNewsletterBlock(aeFooterPage.generateRandomEmail());
//        aeFooterPage.selectMaleOptionInNewsletterBlock();
//        aeFooterPage.clickOnJoinBtnInNewsletterBlock();
//        DataHelperAndWait.implicitWait(5);
//        DataHelperAndWait.waitToBeVisible(aeFooterPage.getSubscriptionSuccessfulMsg(), 15);
//        Assert.assertTrue(aeFooterPage.getSubscriptionSuccessfulMsg().isDisplayed());
//    }
//
//    @Test(description = "Make sure the user(Female) can join sporter NEWSLETTER correctly", priority = 4)
//    public void verifyAbilityToJoinSporterNewsletterWithFemaleOptionCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.fillInemailFieldInNewsletterBlock(aeFooterPage.generateRandomEmail());
//        aeFooterPage.selectFemaleOptionInNewsletterBlock();
//        aeFooterPage.clickOnJoinBtnInNewsletterBlock();
//        DataHelperAndWait.implicitWait(5);
//        DataHelperAndWait.waitToBeVisible(aeFooterPage.getSubscriptionSuccessfulMsg(), 15);
//        Assert.assertTrue(aeFooterPage.getSubscriptionSuccessfulMsg().isDisplayed());
//        Assert.assertEquals(aeFooterPage.getSubscriptionSuccessfulMsg().getText(), "Thank you for your subscription.");
//    }
//
//    // There's a bug here, when joining using email already joined then the system display 2 invalid messages
//    @Test(description = "Make sure inability to join sporter NEWSLETTER using email already joined", priority = 5)
//    public void verifyInabilityToJoinSporterNewsletterUsingEmailAlreadyJoined() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.fillInemailFieldInNewsletterBlock("a@a.com");
//        aeFooterPage.selectFemaleOptionInNewsletterBlock();
//        aeFooterPage.clickOnJoinBtnInNewsletterBlock();
//        DataHelperAndWait.waitToBeVisible(aeFooterPage.getSubscriptionSuccessfulMsg(), 15);
//        Assert.assertTrue(aeFooterPage.getSubscriptionSuccessfulMsg().isDisplayed());
//        Assert.assertEquals(aeFooterPage.getSubscriptionSuccessfulMsg().getText(), "This email address is already subscribed.");
//    }
//
//    //There's a UI issue when displaying the email formate message
//    @Test(description = "Make sure inability to join sporter NEWSLETTER using invalid email formate", priority = 6)
//    public void verifyInabilityToJoinSporterNewsletterUsingInvalidEmailFormate() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.fillInemailFieldInNewsletterBlock("a@a");
//        aeFooterPage.selectFemaleOptionInNewsletterBlock();
//        aeFooterPage.clickOnJoinBtnInNewsletterBlock();
//        DataHelperAndWait.waitToBeVisible(aeFooterPage.getEmailRequiredMsgInNewsletterSection(), 15);
//        Assert.assertEquals(aeFooterPage.getEmailRequiredMsgInNewsletterSection().getText(), "Please enter a valid email address (Ex: johndoe@domain.com).");
//    }
//
//    @Test(description = "Make sure inability to join sporter NEWSLETTER without filling email field", priority = 7)
//    public void verifyInabilityToJoinSporterNewsletterWithoutFillingEmailField() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.clickOnJoinBtnInNewsletterBlock();
//        DataHelperAndWait.waitToBeVisible(aeFooterPage.getEmailRequiredMsgInNewsletterSection(), 15);
//        Assert.assertEquals(aeFooterPage.getEmailRequiredMsgInNewsletterSection().getText(), "This is a required field.");
//    }
//
//    @Test(description = "Make sure the Orders And Shipping Section Appears Correctly In Footer", priority = 8)
//    public void verifyOrdersAndShippingSectionAppearsCorrectlyInFooter() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        Assert.assertEquals(aeFooterPage.getOrdersAndShippingHeader().getText(), "Orders & Shipping");
//        Assert.assertEquals(aeFooterPage.getTrackYourOrderOption().getText(), "Track Your Order");
//        Assert.assertEquals(aeFooterPage.getShippingAndDeliveryOption().getText(), "Shipping & Delivery");
//        Assert.assertEquals(aeFooterPage.getRefundAndReturnsOption().getText(), "Refund & Returns");
//    }
//
//    @Test(description = "Make sure the Track Your Order Link appears in the footer works correctly", priority = 9)
//    public void verifyTrackYourOrderLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getTrackYourOrderOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertEquals(webDriver.getCurrentUrl(), trackOrderUrl);
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Track Your Order page", priority = 10)
//    public void verifyTheFooterSectionAppearsInTheTrackYourOrderPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyTrackYourOrderLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Shipping And Delivery Link appears in the footer works correctly", priority = 11)
//    public void verifyShippingAndDeliveryLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getShippingAndDeliveryOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertEquals(webDriver.getCurrentUrl(), shippingAndDeliveryUrl);
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Shipping and Delivery page", priority = 12)
//    public void verifyTheFooterSectionAppearsInTheShippingAndDeliveryPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyShippingAndDeliveryLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Refund And Returns Link appears in the footer works correctly", priority = 13)
//    public void verifyRefundAndReturnLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getRefundAndReturnsOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertEquals(webDriver.getCurrentUrl(), refundAndReturnUrl," The Refund and return page is not opened");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Refund And Returns page", priority = 14)
//    public void verifyTheFooterSectionAppearsInTheRefundAndReturnPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyRefundAndReturnLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Let Us Help You Section Appears Correctly In Footer", priority = 15)
//    public void verifyLetUsHelpYouSectionAppearsCorrectlyInFooter() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        Assert.assertEquals(aeFooterPage.getLetUsHelpYouHeader().getText(), "Let Us Help You");
//        Assert.assertEquals(aeFooterPage.getWowCustomerServiceOption().getText(), "Wow Customer Service");
//        Assert.assertEquals(aeFooterPage.getFAQsOption().getText(), "FAQs");
//    }
//
//    @Test(description = "Make sure the Wow Customer Service Link appears in the footer works correctly", priority = 16)
//    public void verifyWowCustomerServiceLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getWowCustomerServiceOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertEquals(webDriver.getCurrentUrl(), customerServiceUrl," The Customer Service URL is not opened");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Wow Customer Service page", priority = 17)
//    public void verifyTheFooterSectionAppearsInTheWowCustomerServicePage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyWowCustomerServiceLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the FAQs Link appears in the footer works correctly", priority = 18)
//    public void verifyFAQsLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getFAQsOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertEquals(webDriver.getCurrentUrl(), fAQsUrl,"The current URL is not matched with the FAQs URL");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the FAQs page", priority = 19)
//    public void verifyTheFooterSectionAppearsInTheFAQsPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyFAQsLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Most Selling Products Section Appears Correctly In Footer", priority = 20)
//    public void verifyMostSellingProductsSectionAppearsCorrectlyInFooter() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        Assert.assertEquals(aeFooterPage.getMostSellingProductsHeader().getText(), "Most Selling Products");
//        Assert.assertEquals(aeFooterPage.getGrenadeReloadProteinOatBarOption().getText(), "Grenade Reload Protein Oat Bar");
//        Assert.assertEquals(aeFooterPage.getDymatizeISO100ProteinOption().getText(), "Dymatize ISO 100 Protein");
//        Assert.assertEquals(aeFooterPage.getGrenadeCarbKillaProteinBarOption().getText(), "Grenade Carb Killa Protein Bar");
//        Assert.assertEquals(aeFooterPage.getGrenadeCarbKillaProteinBarBoxOf12Option().getText(), "Grenade Carb Killa Protein Bar - Box of 12");
//        Assert.assertEquals(aeFooterPage.getQuestNutritionBarsBox12Option().getText(), "Quest Nutrition - Bars - Box of 12");
//    }
//
//    @Test(description = "Make sure the Grenade Reload Protein Oat Bar Link appears in the footer works correctly", priority = 21)
//    public void verifyGrenadeReloadProteinOatBarLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getGrenadeReloadProteinOatBarOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertEquals(webDriver.getCurrentUrl(), grenadeReloadProteinOatBar,"The Current URL is not matched with the grenadeReloadProteinOatBar product URL ");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Grenade Reload Protein Oat Bar page", priority = 22)
//    public void verifyTheFooterSectionAppearsInTheGrenadeReloadProteinOatBarPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyGrenadeReloadProteinOatBarLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Dramatize Iso 100 Protein Link appears in the footer works correctly", priority = 23)
//    public void verifyDramatizeIso100ProteinLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getDymatizeISO100ProteinOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(dramatizeIso100Protein),"The Current URL is not matched with the dramatizeIso100Protein product URL");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Dramatize Iso 100 Protein page", priority = 24)
//    public void verifyTheFooterSectionAppearsInTheDramatizeIso100ProteinPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyDramatizeIso100ProteinLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Grenade Carb Killa Protein Bar Link appears in the footer works correctly", priority = 25)
//    public void verifyGrenadeCarbKillaProteinBarLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getGrenadeCarbKillaProteinBarOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(grenadeCrabKillaProteinBar)," The Current URL is not matched with the grenadeCrabKillaProteinBar product URL");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Dramatize Iso 100 Protein page", priority = 26)
//    public void verifyTheFooterSectionAppearsInTheGrenadeCarbKillaProteinBarPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyGrenadeCarbKillaProteinBarLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Grenade Carb Killa Protein Bar Box Of 12 Link appears in the footer works correctly", priority = 27)
//    public void verifyGrenadeCarbKillaProteinBarBoxOf12LinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getGrenadeCarbKillaProteinBarBoxOf12Option().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(grenadeCrabKillaProteinBarBoxOf12)," The Current URL is not matched with the grenadeCrabKillaProteinBarBoxOf12 product URL");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Grenade Carb Killa Protein Bar Box Of 12 page", priority = 28)
//    public void verifyTheFooterSectionAppearsInTheGrenadeCarbKillaProteinBarBoxOf12Page() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyGrenadeCarbKillaProteinBarBoxOf12LinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Quest Nutrition Bars Box Of 12 Link appears in the footer works correctly", priority = 29)
//    public void verifyQuestNutritionBarsBoxOf12LinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getQuestNutritionBarsBox12Option().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(questNutritionBarsBoxOf12)," The current URL is not matched with the questNutritionBarsBoxOf12 product URL");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Quest Nutrition Bars Box Of 12 page", priority = 30)
//    public void verifyTheFooterSectionAppearsInTheQuestNutritionBarsBoxOf12Page() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyQuestNutritionBarsBoxOf12LinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Get To Know Us Section Appears Correctly In Footer", priority = 31)
//    public void verifyGetToKnowUsSectionAppearsCorrectlyInFooter() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        Assert.assertEquals(aeFooterPage.getGetToKnowUsHeader().getText(), "Get To Know Us");
//        Assert.assertEquals(aeFooterPage.getAboutSporterOption().getText(), "About Sporter");
//        Assert.assertEquals(aeFooterPage.getProductQualityOption().getText(), "Product Quality");
//        Assert.assertEquals(aeFooterPage.getProductAuthenticityOption().getText(), "Product Authenticity");
//        Assert.assertEquals(aeFooterPage.getWholesaleOption().getText(), "Wholesale");
//        Assert.assertEquals(aeFooterPage.getCareersOption().getText(), "Careers");
//        Assert.assertEquals(aeFooterPage.getSporterBlogOption().getText(), "Sporter Blog");
//    }
//
//    @Test(description = "Make sure the About Sporter appears in the footer works correctly", priority = 32)
//    public void verifyAboutSporterLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getAboutSporterOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(aboutSporterUrl)," The current URL is not matched with the aboutSporterUrl page");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the About Sporter page", priority = 33)
//    public void verifyTheFooterSectionAppearsInTheAboutSporterPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyAboutSporterLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Product Quality appears in the footer works correctly", priority = 34)
//    public void verifyProductQualityLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getProductQualityOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(productQualityUrl)," The Current URL is not matched with the productQuality Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Product Quality page", priority = 35)
//    public void verifyTheFooterSectionAppearsInTheProductQualityPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyProductQualityLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the  Quality Authenticity appears in the footer works correctly", priority = 36)
//    public void verifyProductAuthenticityLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getProductAuthenticityOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(productAuthenticityUrl)," The current URL is not matched with the productAuthenticity Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Product Authenticity page", priority = 37)
//    public void verifyTheFooterSectionAppearsInTheProductAuthenticityPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyProductAuthenticityLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Wholesale appears in the footer works correctly", priority = 38)
//    public void verifyWholesaleLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getWholesaleOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(wholesaleUrl),"The Current URL is not matched with the wholesale Url ");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    //Bug: The footer section is missing from Wholesale page.
//    @Test(description = "Make sure the footer section appears correctly in the Wholesale page", priority = 39)
//    public void verifyTheFooterSectionAppearsInTheWholesalePage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyWholesaleLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    //Bug: The system does not redirect the user to the Sporter LinkedIn page directly
//    @Test(description = "Make sure the Careers appears in the footer works correctly", priority = 40)
//    public void verifyCareersLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getCareersOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(careersUrl)," The Current URL is not matched with the careers Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    //Bug: Clicking on the Sporter Blog link redirect the user to 404 Page
//    @Test(description = "Make sure the Sporter Blog appears in the footer works correctly", priority = 41)
//    public void verifySporterBlogLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getSporterBlogOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(sporterBlogUrl)," The Current URL is not matched with the sporterBlog Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The Page is empty");
//    }
//
//    //Bug: Clicking on the Sporter Blog link redirect the user to 404 Page
//    @Test(description = "Make sure the footer section appears correctly in the Sporter Blog page", priority = 42)
//    public void verifyTheFooterSectionAppearsInTheSporterBlogPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifySporterBlogLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    //Bug: The address is missing
//    @Test(description = "Make sure the Contact Us Section Appears Correctly In Footer", priority = 43)
//    public void verifyContactUsSectionAppearsCorrectlyInFooter() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        Assert.assertEquals(aeFooterPage.getContactUsHeader().getText(), "Contact Us");
//        Assert.assertEquals(aeFooterPage.getContactInfoOption().getText(), "Contact info");
//        Assert.assertEquals(aeFooterPage.getPhoneNumberLabelOption().getText(), "Phone Number:");
//        Assert.assertEquals(aeFooterPage.getPhoneNumber().getText(), "+971 4 88 30 300");
//        Assert.assertEquals(aeFooterPage.getAddressLabel().getText(), "Address:");
//        Assert.assertEquals(aeFooterPage.getAddressValue().getText(), "There's bug here");
//    }
//
//    @Test(description = "Make sure the contact Info appears in the footer works correctly", priority = 44)
//    public void verifyContactInfoLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getContactInfoOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(contactUsUrl)," The Current URL is not matched with the contactUs Url ");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the contact US page", priority = 45)
//    public void verifyTheFooterSectionAppearsInTheContactUsPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyContactInfoLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    //Bug: Clicking on the phone number will redirect the user to HomePage and need to check with Khaled about its
//    @Test(description = "Make sure the phone number appears in the footer works correctly", priority = 46)
//    public void verifyPhoneNumberLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getPhoneNumber().click();
//        String myWindowHandle = webDriver.getWindowHandle();
//        webDriver.switchTo().window(myWindowHandle);
//    }
//
//    @Test(description = "Make sure the Accessories & Apparel Section Appears Correctly In Footer", priority = 47)
//    public void verifyAccessoriesAndApparelSectionAppearsCorrectlyInFooter() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        Assert.assertEquals(aeFooterPage.getAccessoriesAndApparelHeader().getText(), "Accessories & Apparel");
//        Assert.assertEquals(aeFooterPage.getTrainingApparelOption().getText(), "Training Apparel");
//        Assert.assertEquals(aeFooterPage.getFitnessAccessoriesOption().getText(), "Fitness Accessories");
//        Assert.assertEquals(aeFooterPage.getShakersOption().getText(), "Shakers");
//        Assert.assertEquals(aeFooterPage.getHomeGymEquipmentOption().getText(), "Home Gym Equipment");
//        Assert.assertEquals(aeFooterPage.getWatchesOption().getText(), "Watches");
//        Assert.assertEquals(aeFooterPage.getStrapsOption().getText(), "Straps");
//        Assert.assertEquals(aeFooterPage.getBagsOption().getText(), "Bags");
//    }
//
//    @Test(description = "Make sure the Training Apparel Link appears in the footer works correctly", priority = 48)
//    public void verifyTrainingApparelLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getTrainingApparelOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(trainingApparelUrl)," The Current URL is not matched with the trainingApparel Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Training Apparel page", priority = 49)
//    public void verifyTheFooterSectionAppearsInTheTrainingApparelPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyTrainingApparelLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Fitness Accessories Link appears in the footer works correctly", priority = 50)
//    public void verifyFitnessAccessoriesLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getFitnessAccessoriesOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(fitnessAccessoriesUrl)," The Current URL is not matched with the fitnessAccessories Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Fitness Accessories page", priority = 51)
//    public void verifyTheFooterSectionAppearsInTheFitnessAccessoriesPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyFitnessAccessoriesLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Shakers Link appears in the footer works correctly", priority = 52)
//    public void verifyShakersLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getShakersOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(shakersUrl)," The Current URL is not matched with the shakers Url ");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Shakers page", priority = 53)
//    public void verifyTheFooterSectionAppearsInTheShakersPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyShakersLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Home Gym Equipment Link appears in the footer works correctly", priority = 54)
//    public void verifyHomeGymEquipmentLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getHomeGymEquipmentOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(homeGymEquipmentUrl)," The Current URL is not matched with the homeGymEquipment Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Home Gym Equipment page", priority = 55)
//    public void verifyTheFooterSectionAppearsInTheHomeGymEquipmentPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyHomeGymEquipmentLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Watches Link appears in the footer works correctly", priority = 56)
//    public void verifyWatchesLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getWatchesOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(watchesUrl)," The Current URL is not matched with the watches Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Watches page", priority = 57)
//    public void verifyTheFooterSectionAppearsInTheWatchesPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyWatchesLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Straps Link appears in the footer works correctly", priority = 58)
//    public void verifyStrapsLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getStrapsOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(strapsUrl)," The Current URL is not matched with the straps Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Straps page", priority = 59)
//    public void verifyTheFooterSectionAppearsInTheStrapsPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyStrapsLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Bags Link appears in the footer works correctly", priority = 60)
//    public void verifyBagsLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getBagsOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(bagsUrl)," The Current URL is not matched with the bags Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Straps page", priority = 61)
//    public void verifyTheFooterSectionAppearsInTheBagsPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyBagsLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Protein & Fitness Section Appears Correctly In Footer", priority = 62)
//    public void verifyProteinAndFitnessSectionAppearsCorrectlyInFooter() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        Assert.assertEquals(aeFooterPage.getProteinAndFitnessHeader().getText(), "Protein & Fitness");
//        Assert.assertEquals(aeFooterPage.getWheyProteinOption().getText(), "Whey Protein");
//        Assert.assertEquals(aeFooterPage.getWheyProteinIsolateOption().getText(), "Whey Protein Isolate");
//        Assert.assertEquals(aeFooterPage.getCaseinProteinOption().getText(), "Casein Protein");
//        Assert.assertEquals(aeFooterPage.getWeightGainAndMassGainerOption().getText(), "Weight Gain & Mass Gainer");
//        Assert.assertEquals(aeFooterPage.getBCAAsAndAminoAcidsOption().getText(), "BCAAs & Amino Acids");
//        Assert.assertEquals(aeFooterPage.getPreWorkoutAndEnduranceOption().getText(), "Pre-Workout & Endurance");
//        Assert.assertEquals(aeFooterPage.getGlutamineAndRecoveryOption().getText(), "Glutamine & Recovery");
//        Assert.assertEquals(aeFooterPage.getFatBurnersOption().getText(), "Fat Burners");
//        Assert.assertEquals(aeFooterPage.getProteinBarsOption().getText(), "Protein Bars");
//        Assert.assertEquals(aeFooterPage.getHealthySnacksOption().getText(), "Healthy Snacks");
//    }
//
//    @Test(description = "Make sure the Whey Protein Link appears in the footer works correctly", priority = 63)
//    public void verifyWheyProteinLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getWheyProteinOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(wheyProteinUrl));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Whey Protein page", priority = 64)
//    public void verifyTheFooterSectionAppearsInTheWheyProteinPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyWheyProteinLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Whey Protein Isolate Link appears in the footer works correctly", priority = 65)
//    public void verifyWheyProteinIsolateLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getWheyProteinIsolateOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(wheyProteinIsolateUrl)," The Current URL is not matched with the wheyProteinIsolate Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Whey Protein Isolate page", priority = 66)
//    public void verifyTheFooterSectionAppearsInTheWheyProteinIsolatePage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyWheyProteinIsolateLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Casein Protein Link appears in the footer works correctly", priority = 67)
//    public void verifyCaseinProteinLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getCaseinProteinOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(caseinProteinUrl)," The Current URL is not matched with the caseinProtein Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Casein Protein page", priority = 68)
//    public void verifyTheFooterSectionAppearsInTheCaseinProteinPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyCaseinProteinLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Weight Gain And Mass Gainer Link appears in the footer works correctly", priority = 69)
//    public void verifyWeightGainAndMassGainerLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getWeightGainAndMassGainerOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(weightGainAndMassGainerUrl)," The Current URL is not matched with weightGainAndMassGainer Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Weight Gain And Mass Gainer page", priority = 70)
//    public void verifyTheFooterSectionAppearsInTheWeightGainAndMassGainerPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyWeightGainAndMassGainerLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the BCAAs And Amino Acids Link appears in the footer works correctly", priority = 71)
//    public void verifyBCAAsAndAminoAcidsLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getBCAAsAndAminoAcidsOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(bCAAsAndAminoAcidsUrl)," The Current URL is not matched with the bCAAsAndAminoAcids Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the BCAAs And Amino Acids page", priority = 72)
//    public void verifyTheFooterSectionAppearsInTheBCAAsAndAminoAcidsPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyBCAAsAndAminoAcidsLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Pre-Workout And Endurance Link appears in the footer works correctly", priority = 73)
//    public void verifyPreWorkoutAndEnduranceLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getPreWorkoutAndEnduranceOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(preWorkoutAndEnduranceUrl)," The Current URL is not matched with the preWorkoutAndEnduranceUrl");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Pre-Workout And Endurance page", priority = 74)
//    public void verifyTheFooterSectionAppearsInThePreWorkoutAndEndurancePage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyPreWorkoutAndEnduranceLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Glutamine And Recovery Link appears in the footer works correctly", priority = 75)
//    public void verifyGlutamineAndRecoveryLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getGlutamineAndRecoveryOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(glutamineAndRecoveryUrl)," The Current URL is not matched with the glutamineAndRecoveryUrl");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Glutamine And Recovery page", priority = 76)
//    public void verifyTheFooterSectionAppearsInTheGlutamineAndRecoveryPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyGlutamineAndRecoveryLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Fat Burners Link appears in the footer works correctly", priority = 77)
//    public void verifyFatBurnersLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getFatBurnersOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(fatBurnersUrl)," The Current URL is not matched wih the fatBurners Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Fat Burners page", priority = 78)
//    public void verifyTheFooterSectionAppearsInTheFatBurnersPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyFatBurnersLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Protein Bars Link appears in the footer works correctly", priority = 79)
//    public void verifyProteinBarsLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getProteinBarsOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(proteinBarsUrl)," The Current URL is not matched with the proteinBars Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Protein Bars page", priority = 80)
//    public void verifyTheFooterSectionAppearsInTheProteinBarsPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyProteinBarsLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Healthy Snacks Link appears in the footer works correctly", priority = 81)
//    public void verifyHealthySnacksLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getHealthySnacksOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(healthySnacksUrl)," The Current URL is not matched with the healthySnacks Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Healthy Snacks page", priority = 82)
//    public void verifyTheFooterSectionAppearsInTheHealthySnacksPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyHealthySnacksLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Vitamins & Health Section Appears Correctly In Footer", priority = 83)
//    public void verifyVitaminsAndHealthSectionAppearsCorrectlyInFooter() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        Assert.assertEquals(aeFooterPage.getVitaminsAndHealthHeader().getText(), "Vitamins & Health");
//        Assert.assertEquals(aeFooterPage.getMultivitaminsOption().getText(), "Multivitamins");
//        Assert.assertEquals(aeFooterPage.getVitaminsdOption().getText(), "Vitamin D");
//        Assert.assertEquals(aeFooterPage.getVitaminscOption().getText(), "Vitamin C");
//        Assert.assertEquals(aeFooterPage.getVitaminseOption().getText(), "Vitamin E");
//        Assert.assertEquals(aeFooterPage.getFishOilAndOmega3Option().getText(), "Fish Oil & Omega 3");
//        Assert.assertEquals(aeFooterPage.getFolicAcidOption().getText(), "Folic Acid");
//        Assert.assertEquals(aeFooterPage.getBoneAndJointSupportOption().getText(), "Bone & Joint Support");
//        Assert.assertEquals(aeFooterPage.getCollagenOption().getText(), "Collagen");
//        Assert.assertEquals(aeFooterPage.getHairSkinAndNailsOption().getText(), "Hair Skin & Nails");
//        Assert.assertEquals(aeFooterPage.getTestosteroneBoosterOption().getText(), "Testosterone Booster");
//        Assert.assertEquals(aeFooterPage.getMelatoninAndSleepSupportOption().getText(), "Melatonin & Sleep Support");
//        Assert.assertEquals(aeFooterPage.getDigestiveSupportOption().getText(), "Digestive Support");
//    }
//
//    @Test(description = "Make sure the Multivitamins Link appears in the footer works correctly", priority = 84)
//    public void verifyMultivitaminsLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getMultivitaminsOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(multivitaminsUrl)," The Current URL is not matched with the multivitamins Url");
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Multivitamins page", priority = 85)
//    public void verifyTheFooterSectionAppearsInTheMultivitaminsPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyMultivitaminsLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Vitamins D Link appears in the footer works correctly", priority = 86)
//    public void verifyVitaminsdLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getVitaminsdOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(vitamindUrl));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Vitamins D page", priority = 87)
//    public void verifyTheFooterSectionAppearsInTheVitaminsdPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyVitaminsdLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Vitamins C Link appears in the footer works correctly", priority = 88)
//    public void verifyVitaminscLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getVitaminscOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(vitamincUrl));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Vitamins C page", priority = 89)
//    public void verifyTheFooterSectionAppearsInTheVitaminscPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyVitaminscLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Vitamins E Link appears in the footer works correctly", priority = 90)
//    public void verifyVitaminseLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getVitaminseOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(vitamineUrl));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Vitamins E page", priority = 91)
//    public void verifyTheFooterSectionAppearsInTheVitaminsePage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyVitaminseLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Fish Oil & Omega 3 Link appears in the footer works correctly", priority = 92)
//    public void verifyFishOilAndOmega3LinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getFishOilAndOmega3Option().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(fishOilOmegasUrl));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Fish Oil & Omega 3 page", priority = 93)
//    public void verifyTheFooterSectionAppearsInTheFishOilAndOmega3Page() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyFishOilAndOmega3LinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Folic Acid Link appears in the footer works correctly", priority = 94)
//    public void verifyFolicAcidLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getFolicAcidOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(folicAcidUrl));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Folic Acid page", priority = 95)
//    public void verifyTheFooterSectionAppearsInTheFolicAcidPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyFolicAcidLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Bone & Joint Support Link appears in the footer works correctly", priority = 96)
//    public void verifyBoneAndJointSupportLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getBoneAndJointSupportOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(boneJointSupportUrl));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Bone & Joint Support page", priority = 97)
//    public void verifyTheFooterSectionAppearsInTheBoneAndJointSupportPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyBoneAndJointSupportLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Collagen Link appears in the footer works correctly", priority = 98)
//    public void verifyCollagenLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getCollagenOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(collagenUrl));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Collagen page", priority = 99)
//    public void verifyTheFooterSectionAppearsInTheCollagenPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyCollagenLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Hair Skin & Nails Link appears in the footer works correctly", priority = 100)
//    public void verifyHairSkinAndNailsLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getHairSkinAndNailsOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(hairSkinNailsUrl));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Hair Skin & Nails page", priority = 101)
//    public void verifyTheFooterSectionAppearsInTheHairSkinAndNailsPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyHairSkinAndNailsLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Testosterone Booster Link appears in the footer works correctly", priority = 102)
//    public void verifyTestosteroneBoosterLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getTestosteroneBoosterOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(testosteroneBoosterUrl));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Hair Testosterone Booster page", priority = 103)
//    public void verifyTheFooterSectionAppearsInTheTestosteroneBoosterPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyTestosteroneBoosterLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Melatonin & Sleep Support Link appears in the footer works correctly", priority = 104)
//    public void verifyMelatoninAndSleepSupportLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getMelatoninAndSleepSupportOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(melatoninSleepSupportUrl));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the  Melatonin & Sleep Support page", priority = 105)
//    public void verifyTheFooterSectionAppearsInTheMelatoninAndSleepSupportPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyMelatoninAndSleepSupportLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Digestive Support Link appears in the footer works correctly", priority = 106)
//    public void verifyDigestiveSupportLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getDigestiveSupportOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(digestionSupportUrl));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Digestive Support  page", priority = 107)
//    public void verifyTheFooterSectionAppearsInTheDigestiveSupportPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyDigestiveSupportLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Terms of Service Link appears in the footer works correctly", priority = 108)
//    public void verifyTermsAndServiceLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getTermsAndServiceOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(termsAndServiceUrl));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Terms of Service page", priority = 109)
//    public void verifyTheFooterSectionAppearsInTheTermsAndServicePage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyTermsAndServiceLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Privacy Policy Link appears in the footer works correctly", priority = 110)
//    public void verifyPrivacyPolicyLinkAppearsInFooterWorksCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getPrivacyPolicyOption().click();
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(privacyPolicyUrl));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//
//    @Test(description = "Make sure the footer section appears correctly in the Privacy Policy page", priority = 111)
//    public void verifyTheFooterSectionAppearsInThePrivacyPolicyPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyPrivacyPolicyLinkAppearsInFooterWorksCorrectly();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the ability to click on the instagram icon correctly", priority = 112)
//    public void verifyAbilityToClickOnInstagramIconCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getInstagramIcon().click();
//        DataHelperAndWait.implicitWait(5);
//        DataHelperAndWait.switchToTabBrowser(1);
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(instagramURL));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//    }
//
//    @Test(description = "Make sure the ability to click on the facebook icon correctly", priority = 113)
//    public void verifyAbilityToClickOnFacebookIconCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getFacebookIcon().click();
//        DataHelperAndWait.implicitWait(5);
//        DataHelperAndWait.switchToTabBrowser(1);
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(facebookURL));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//    }
//
//    @Test(description = "Make sure the ability to click on the twitter icon correctly", priority = 114)
//    public void verifyAbilityToClickOnTwitterIconCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getTwitterIcon().click();
//        DataHelperAndWait.implicitWait(5);
//        DataHelperAndWait.switchToTabBrowser(1);
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(twitterURL));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//    }
//
//    @Test(description = "Make sure the ability to click on the youtube icon correctly", priority = 115)
//    public void verifyAbilityToClickOnYouTubeIconCorrectly() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.switchToAECountry();
//        aeFooterPage.getYoutubeIcon().click();
//        DataHelperAndWait.implicitWait(5);
//        DataHelperAndWait.switchToTabBrowser(1);
//        DataHelperAndWait.implicitWait(5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(youtubeURL));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//    }
//
//    @Test(description = "Make sure the copyright statement appears correctly in the footer section", priority = 116)
//    public void verifyTheCopyRightStatementAppearsInTheFooter() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        Assert.assertTrue(aeFooterPage.getCopyright().isDisplayed());
//    }
//}