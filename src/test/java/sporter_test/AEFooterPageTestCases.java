package sporter_test;

import core.BasePage;
import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sporter_pages.AEFooterPage;
import sporter_pages.AeWomenOnlyCategoryPage;

import static org.testng.Assert.assertFalse;

public class AEFooterPageTestCases extends BaseTest {
    @Parameters({"environment", "browser", "country"})
    public void setupBrowserFromTheClass(String environment, String browser, @Optional("") String country) throws Exception {
        System.out.println("SetUp Browser method");
        environmentName=environment;
        //This ChromeWebDriver 108
        this.browserName = browser;
        BasePage.BaseURL=environment;
        this.countryUrl=country;
        switch (browser) {
//    Check if parameter passed from TestNG is 'firefox'

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
                webDriver = new FirefoxDriver();
                break;
            case "chrome":
//                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriverV110.exe");
                webDriver = new ChromeDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
                webDriver = new EdgeDriver();
                break;
            default:
////If no browser passed throw exception
                throw new Exception("Browser is not correct");
        }
        webDriver.manage().window().maximize();
//        webDriver.navigate().to(environment);
        webDriver.navigate().to(environment+"/"+country);
        CloseInitialDialog();
    }

    @Test(groups = {"2.12 Footer Section", "All Smoke Testing Result"},description = " Footer Section- Switching to UAE store", priority = 1)
    public void switchToUaeStore(){
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.switchToAECountry();
        if(webDriver.getCurrentUrl().contains(aeFooterPage.aeDomain)){
            System.out.println("You are in UAE Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+aeDomain);
            CloseInitialDialog();          }
    }

    @Test(groups = "2.12 Footer Section",description = " Footer Section- Verify the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks ", priority = 1)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage=new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeFooterPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeFooterPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeFooterPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertTrue(aeWomenOnlyCategoryPage.getSecurePaymentTitle().isDisplayed());
                    Assert.assertTrue(aeWomenOnlyCategoryPage.getSecurePaymentDescription().isDisplayed());
                case 1:
                    Assert.assertTrue(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().isDisplayed());
                    Assert.assertTrue(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().isDisplayed());
                case 2:
                    Assert.assertTrue(aeWomenOnlyCategoryPage.getFastDeliveryTitle().isDisplayed());
                    Assert.assertTrue(aeWomenOnlyCategoryPage.getFastDeliveryDescription().isDisplayed());            }
        }
    }

    @Test(groups = {"2.12 Footer Section","All Smoke Testing Result","1.4  Low Severity"},description = " Footer Section- Verify the Join Our NEWSLETTER section that appears in the footer section is displayed correctly", priority = 2)
    public void verifyJoinOurNewsletterSectionIsDisplayedCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        Assert.assertTrue(aeFooterPage.getNewsletterBlock().isDisplayed());
        Assert.assertTrue(aeFooterPage.getEmailFieldInNewsletterBlock().isDisplayed());
        Assert.assertTrue(aeFooterPage.getFemaleOptionInNewsletterBlock().isDisplayed());
        Assert.assertTrue(aeFooterPage.getMaleOptionInNewsletterBlock().isDisplayed());
        Assert.assertTrue(aeFooterPage.getJoinBtnInNewsletterBlock().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section","All Smoke Testing Result","1.3 Medium Severity"},description = " Footer Section- Make sure the user(Male) can join sporter NEWSLETTER correctly", priority = 3)
    public void verifyAbilityToJoinSporterNewsletterWithMaleOptionCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.fillInemailFieldInNewsletterBlock(aeFooterPage.generateRandomEmail());
        aeFooterPage.selectMaleOptionInNewsletterBlock();
        aeFooterPage.clickOnJoinBtnInNewsletterBlock();
        Assert.assertTrue(aeFooterPage.getSubscriptionSuccessfulMsg().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section","All Smoke Testing Result","1.3 Medium Severity"},description = " Footer Section- Make sure the user(Female) can join sporter NEWSLETTER correctly", priority = 4)
    public void verifyAbilityToJoinSporterNewsletterWithFemaleOptionCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.clearEmailField();
        aeFooterPage.fillInemailFieldInNewsletterBlock(aeFooterPage.generateRandomEmail());
        aeFooterPage.selectFemaleOptionInNewsletterBlock();
        aeFooterPage.clickOnJoinBtnInNewsletterBlock();
        try{
        Assert.assertTrue(aeFooterPage.getSubscriptionSuccessfulMsg().isDisplayed());
        Assert.assertEquals(aeFooterPage.getSubscriptionSuccessfulMsg().getText(), "Thank you for your subscription.");}
        catch (AssertionError as){
            aeFooterPage.navigateToHomePage();
            aeFooterPage.clearEmailField();
            aeFooterPage.fillInemailFieldInNewsletterBlock(aeFooterPage.generateRandomEmail());
            aeFooterPage.selectFemaleOptionInNewsletterBlock();
            aeFooterPage.clickOnJoinBtnInNewsletterBlock();
            Assert.assertTrue(aeFooterPage.getSubscriptionSuccessfulMsg().isDisplayed());
            Assert.assertEquals(aeFooterPage.getSubscriptionSuccessfulMsg().getText(), "Thank you for your subscription.");}
        }


    // There's a bug here, when joining using email already joined then the system display 2 invalid messages
    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure inability to join sporter NEWSLETTER using email already joined", priority = 5)
    public void verifyInabilityToJoinSporterNewsletterUsingEmailAlreadyJoined() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.clearEmailField();
        aeFooterPage.fillInemailFieldInNewsletterBlock("a@a.com");
        aeFooterPage.selectFemaleOptionInNewsletterBlock();
        aeFooterPage.clickOnJoinBtnInNewsletterBlock();
        Assert.assertTrue(aeFooterPage.getSubscriptionSuccessfulMsg().isDisplayed());
        Assert.assertEquals(aeFooterPage.getSubscriptionSuccessfulMsg().getText(), "This email address is already subscribed.");
    }

    //There's a UI issue when displaying the email formate message
    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure inability to join sporter NEWSLETTER using invalid email formate", priority = 6)
    public void verifyInabilityToJoinSporterNewsletterUsingInvalidEmailFormate() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.clearEmailField();
        aeFooterPage.fillInemailFieldInNewsletterBlock("a@a");
        aeFooterPage.selectFemaleOptionInNewsletterBlock();
        aeFooterPage.clickOnJoinBtnInNewsletterBlock();
        Assert.assertEquals(aeFooterPage.getEmailRequiredMsgInNewsletterSection().getText(), "Please enter a valid email address (Ex: johndoe@domain.com).");
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure inability to join sporter NEWSLETTER without filling email field", priority = 7)
    public void verifyInabilityToJoinSporterNewsletterWithoutFillingEmailField() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.clearEmailField();
        aeFooterPage.clickOnJoinBtnInNewsletterBlock();
        Assert.assertEquals(aeFooterPage.getEmailRequiredMsgInNewsletterSection().getText(), "This is a required field.");
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure the Orders And Shipping Section Appears Correctly In Footer", priority = 8)
    public void verifyOrdersAndShippingSectionAppearsCorrectlyInFooter() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        Assert.assertEquals(aeFooterPage.getOrdersAndShippingHeader().getText(), "Orders & Shipping");
        Assert.assertEquals(aeFooterPage.getTrackYourOrderOption().getText(), "Track Your Order");
        Assert.assertEquals(aeFooterPage.getShippingAndDeliveryOption().getText(), "Shipping & Delivery");
        Assert.assertEquals(aeFooterPage.getRefundAndReturnsOption().getText(), "Refund & Returns");
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure the Track Your Order Link appears in the footer works correctly", priority = 9)
    public void verifyTrackYourOrderLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getTrackYourOrderOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.trackOrderUrl));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Track Your Order page", priority = 10)
    public void verifyTheFooterSectionAppearsInTheTrackYourOrderPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyTrackYourOrderLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure the Shipping And Delivery Link appears in the footer works correctly", priority = 11)
    public void verifyShippingAndDeliveryLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getShippingAndDeliveryOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.shippingAndDeliveryUrl) );
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Shipping and Delivery page", priority = 12)
    public void verifyTheFooterSectionAppearsInTheShippingAndDeliveryPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyShippingAndDeliveryLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure the Refund And Returns Link appears in the footer works correctly", priority = 13)
    public void verifyRefundAndReturnLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getRefundAndReturnsOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.refundAndReturnUrl)," The Refund and return page is not opened");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Refund And Returns page", priority = 14)
    public void verifyTheFooterSectionAppearsInTheRefundAndReturnPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyRefundAndReturnLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the Let Us Help You Section Appears Correctly In Footer", priority = 15)
    public void verifyLetUsHelpYouSectionAppearsCorrectlyInFooter() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        Assert.assertEquals(aeFooterPage.getLetUsHelpYouHeader().getText(), "Let Us Help You");
        Assert.assertEquals(aeFooterPage.getWowCustomerServiceOption().getText(), "Wow Customer Service");
        Assert.assertEquals(aeFooterPage.getFAQsOption().getText(), "FAQs");
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure the Wow Customer Service Link appears in the footer works correctly", priority = 16)
    public void verifyWowCustomerServiceLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.getWowCustomerServiceOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.customerServiceUrl)," The Customer Service URL is not opened");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Wow Customer Service page", priority = 17)
    public void verifyTheFooterSectionAppearsInTheWowCustomerServicePage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyWowCustomerServiceLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the FAQs Link appears in the footer works correctly", priority = 18)
    public void verifyFAQsLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getFAQsOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.fAQsUrl),"The current URL is not matched with the FAQs URL");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the FAQs page", priority = 19)
    public void verifyTheFooterSectionAppearsInTheFAQsPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyFAQsLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

//    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure the Most Selling Products Section Appears Correctly In Footer", priority = 20)
//    public void verifyMostSellingProductsSectionAppearsCorrectlyInFooter() {
//        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        aeFooterPage.navigateToHomePage();
//        Assert.assertEquals(aeFooterPage.getMostSellingProductsHeader().getText(), "Most Selling Products");
//        Assert.assertEquals(aeFooterPage.getGrenadeReloadProteinOatBarOption().getText(), "Dymatize ISO 100 Protein");
//        Assert.assertEquals(aeFooterPage.getDymatizeISO100ProteinOption().getText(), "Grenade Carb Killa Protein Bar");
//        Assert.assertEquals(aeFooterPage.getGrenadeCarbKillaProteinBarOption().getText(), "Grenade Carb Killa Protein Bar - Box of 12");
//    }
    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure ability to access all products listed in the Most Selling Products Section", priority = 20)
    public void verifyClickingOnProductsInsideMostSellingProductsSectionWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        for(int i=0; i<aeFooterPage.getMostSellingList().size();i++){
            aeFooterPage.getMostSellingList().get(i).click();
            aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
        }
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure the Grenade Reload Protein Oat Bar Link appears in the footer works correctly", priority = 21)
    public void verifyGrenadeReloadProteinOatBarLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.getGrenadeReloadProteinOatBarOption().click();
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Grenade Reload Protein Oat Bar page", priority = 22)
    public void verifyTheFooterSectionAppearsInTheGrenadeReloadProteinOatBarPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyGrenadeReloadProteinOatBarLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure the Dramatize Iso 100 Protein Link appears in the footer works correctly", priority = 23)
    public void verifyDramatizeIso100ProteinLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getDymatizeISO100ProteinOption().click();
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Dramatize Iso 100 Protein page", priority = 24)
    public void verifyTheFooterSectionAppearsInTheDramatizeIso100ProteinPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyDramatizeIso100ProteinLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Grenade Carb Killa Protein Bar Link appears in the footer works correctly", priority = 25)
    public void verifyGrenadeCarbKillaProteinBarLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getGrenadeCarbKillaProteinBarOption().click();
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Dramatize Iso 100 Protein page", priority = 26)
    public void verifyTheFooterSectionAppearsInTheGrenadeCarbKillaProteinBarPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyGrenadeCarbKillaProteinBarLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Quest Nutrition - Bars - Box of 12 Link appears in the footer works correctly", priority = 27)
    public void verifyGrenadeCarbKillaProteinBarBoxOf12LinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getGrenadeCarbKillaProteinBarBoxOf12Option().click();
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Grenade Carb Killa Protein Bar Box Of 12 page", priority = 28)
    public void verifyTheFooterSectionAppearsInTheGrenadeCarbKillaProteinBarBoxOf12Page() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyGrenadeCarbKillaProteinBarBoxOf12LinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Quest Nutrition Bars Box Of 12 Link appears in the footer works correctly", priority = 29)
    public void verifyQuestNutritionBarsBoxOf12LinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getQuestNutritionBarsBox12Option().click();
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Quest Nutrition Bars Box Of 12 page", priority = 30)
    public void verifyTheFooterSectionAppearsInTheQuestNutritionBarsBoxOf12Page() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyQuestNutritionBarsBoxOf12LinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure the Get To Know Us Section Appears Correctly In Footer", priority = 31)
    public void verifyGetToKnowUsSectionAppearsCorrectlyInFooter() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        Assert.assertEquals(aeFooterPage.getGetToKnowUsHeader().getText(), "Get To Know Us");
        Assert.assertEquals(aeFooterPage.getAboutSporterOption().getText(), "About Sporter");
        Assert.assertEquals(aeFooterPage.getProductQualityOption().getText(), "Product Quality");
        Assert.assertEquals(aeFooterPage.getProductAuthenticityOption().getText(), "Product Authenticity");
        Assert.assertEquals(aeFooterPage.getWholesaleOption().getText(), "Wholesale");
        Assert.assertEquals(aeFooterPage.getCareersOption().getText(), "Careers");
        Assert.assertEquals(aeFooterPage.getSporterBlogOption().getText(), "Sporter Blog");
    }

    @Test(groups = {"2.12 Footer Section", "1.1 Critical Severity"},description = " Footer Section- Make sure  About Sporter appears in the footer works correctly", priority = 32)
    public void verifyAboutSporterLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getAboutSporterOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.aboutSporterUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.aboutSporterUrl)," The current URL is not matched with the aboutSporterUrl page");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the About Sporter page", priority = 33)
    public void verifyTheFooterSectionAppearsInTheAboutSporterPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyAboutSporterLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.1 Critical Severity"},description = " Footer Section- Make sure the Product Quality appears in the footer works correctly", priority = 34)
    public void verifyProductQualityLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getProductQualityOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.productQualityUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.productQualityUrl)," The Current URL is not matched with the productQuality Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Product Quality page", priority = 35)
    public void verifyTheFooterSectionAppearsInTheProductQualityPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyProductQualityLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.1 Critical Severity"},description = " Footer Section- Make sure the  Quality Authenticity appears in the footer works correctly", priority = 36)
    public void verifyProductAuthenticityLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getProductAuthenticityOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.productAuthenticityUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.productAuthenticityUrl)," The current URL is not matched with the productAuthenticity Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Product Authenticity page", priority = 37)
    public void verifyTheFooterSectionAppearsInTheProductAuthenticityPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyProductAuthenticityLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.1 Critical Severity"},description = " Footer Section- Make sure the Wholesale appears in the footer works correctly", priority = 38)
    public void verifyWholesaleLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getWholesaleOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.wholesaleUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.wholesaleUrl),"The Current URL is not matched with the wholesale Url ");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    //Bug: The footer section is missing from Wholesale page.
    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Wholesale page", priority = 39)
    public void verifyTheFooterSectionAppearsInTheWholesalePage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyWholesaleLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    //Bug: The system does not redirect the user to the Sporter LinkedIn page directly
    @Test(groups = {"2.12 Footer Section", "1.1 Critical Severity"},description = " Footer Section- Make sure the Careers appears in the footer works correctly", priority = 40)
    public void verifyCareersLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getCareersOption().click();
        DataHelperAndWait.switchToTabBrowser(1,webDriver);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.careersUrl)," The Current URL is not matched with the careers Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
        webDriver.close();
        DataHelperAndWait.switchToTabBrowser(0,webDriver);
    }

    //Bug: Clicking on the Sporter Blog link redirect the user to 404 Page
    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure the Sporter Blog appears in the footer works correctly", priority = 41)
    public void verifySporterBlogLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getSporterBlogOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.sporterBlogUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.sporterBlogUrl)," The Current URL is not matched with the sporterBlog Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    //Bug: Clicking on the Sporter Blog link redirect the user to 404 Page
    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Sporter Blog page", priority = 42)
    public void verifyTheFooterSectionAppearsInTheSporterBlogPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifySporterBlogLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    //Bug: The address is missing
    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure the Contact Us Section Appears Correctly In Footer", priority = 43)
    public void verifyContactUsSectionAppearsCorrectlyInFooter() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        Assert.assertEquals(aeFooterPage.getContactUsHeader().getText(), "Contact Us");
        Assert.assertEquals(aeFooterPage.getContactInfoOption().getText(), "Contact info");
        Assert.assertEquals(aeFooterPage.getPhoneNumberLabelOption().getText(), "Phone Number:");
        Assert.assertEquals(aeFooterPage.getPhoneNumber().getText(), "+971 4 88 30 300");
        Assert.assertEquals(aeFooterPage.getAddressLabel().getText(), "Address:");
        Assert.assertEquals(aeFooterPage.getAddressValue().getText(), "There's bug here");
    }

    @Test(groups = {"2.12 Footer Section", "1.1 Critical Severity"},description = " Footer Section- Make sure the contact Info appears in the footer works correctly", priority = 44)
    public void verifyContactInfoLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getContactInfoOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.contactUsUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.contactUsUrl)," The Current URL is not matched with the contactUs Url ");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the contact US page", priority = 45)
    public void verifyTheFooterSectionAppearsInTheContactUsPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyContactInfoLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    //Bug: Clicking on the phone number will redirect the user to HomePage and need to check with Khaled about its
    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the phone number appears in the footer works correctly", priority = 46)
    public void verifyPhoneNumberLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getPhoneNumber().click();
        String myWindowHandle = webDriver.getWindowHandle();
        webDriver.switchTo().window(myWindowHandle);
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Accessories & Apparel Section Appears Correctly In Footer", priority = 47)
    public void verifyAccessoriesAndApparelSectionAppearsCorrectlyInFooter() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        Assert.assertEquals(aeFooterPage.getAccessoriesAndApparelHeader().getText(), "Accessories & Apparel");
        Assert.assertEquals(aeFooterPage.getTrainingApparelOption().getText(), "Training Apparel");
        Assert.assertEquals(aeFooterPage.getFitnessAccessoriesOption().getText(), "Fitness Accessories");
        Assert.assertEquals(aeFooterPage.getShakersOption().getText(), "Shakers");
        Assert.assertEquals(aeFooterPage.getHomeGymEquipmentOption().getText(), "Home Gym Equipment");
        Assert.assertEquals(aeFooterPage.getWatchesOption().getText(), "Watches");
        Assert.assertEquals(aeFooterPage.getStrapsOption().getText(), "Straps");
        Assert.assertEquals(aeFooterPage.getBagsOption().getText(), "Bags");
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Training Apparel Link appears in the footer works correctly", priority = 48)
    public void verifyTrainingApparelLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getTrainingApparelOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.trainingApparelUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.trainingApparelUrl)," The Current URL is not matched with the trainingApparel Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Training Apparel page", priority = 49)
    public void verifyTheFooterSectionAppearsInTheTrainingApparelPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyTrainingApparelLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Fitness Accessories Link appears in the footer works correctly", priority = 50)
    public void verifyFitnessAccessoriesLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getFitnessAccessoriesOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.fitnessAccessoriesUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.fitnessAccessoriesUrl)," The Current URL is not matched with the fitnessAccessories Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Fitness Accessories page", priority = 51)
    public void verifyTheFooterSectionAppearsInTheFitnessAccessoriesPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyFitnessAccessoriesLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Shakers Link appears in the footer works correctly", priority = 52)
    public void verifyShakersLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getShakersOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.shakersUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.shakersUrl)," The Current URL is not matched with the shakers Url ");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Shakers page", priority = 53)
    public void verifyTheFooterSectionAppearsInTheShakersPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyShakersLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure the Home Gym Equipment Link appears in the footer works correctly", priority = 54)
    public void verifyHomeGymEquipmentLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getHomeGymEquipmentOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.homeGymEquipmentUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.homeGymEquipmentUrl)," The Current URL is not matched with the homeGymEquipment Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Home Gym Equipment page", priority = 55)
    public void verifyTheFooterSectionAppearsInTheHomeGymEquipmentPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyHomeGymEquipmentLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Watches Link appears in the footer works correctly", priority = 56)
    public void verifyWatchesLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getWatchesOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.watchesUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.watchesUrl)," The Current URL is not matched with the watches Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Watches page", priority = 57)
    public void verifyTheFooterSectionAppearsInTheWatchesPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyWatchesLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Straps Link appears in the footer works correctly", priority = 58)
    public void verifyStrapsLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getStrapsOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.strapsUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.strapsUrl)," The Current URL is not matched with the straps Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Straps page", priority = 59)
    public void verifyTheFooterSectionAppearsInTheStrapsPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyStrapsLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Bags Link appears in the footer works correctly", priority = 60)
    public void verifyBagsLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getBagsOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.bagsUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.bagsUrl)," The Current URL is not matched with the bags Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Straps page", priority = 61)
    public void verifyTheFooterSectionAppearsInTheBagsPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyBagsLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure the Protein & Fitness Section Appears Correctly In Footer", priority = 62)
    public void verifyProteinAndFitnessSectionAppearsCorrectlyInFooter() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        Assert.assertEquals(aeFooterPage.getProteinAndFitnessHeader().getText(), "Protein & Fitness");
        Assert.assertEquals(aeFooterPage.getWheyProteinOption().getText(), "Whey Protein");
        Assert.assertEquals(aeFooterPage.getWheyProteinIsolateOption().getText(), "Whey Protein Isolate");
        Assert.assertEquals(aeFooterPage.getCaseinProteinOption().getText(), "Casein Protein");
        Assert.assertEquals(aeFooterPage.getWeightGainAndMassGainerOption().getText(), "Weight Gain & Mass Gainer");
        Assert.assertEquals(aeFooterPage.getBCAAsAndAminoAcidsOption().getText(), "BCAAs & Amino Acids");
        Assert.assertEquals(aeFooterPage.getPreWorkoutAndEnduranceOption().getText(), "Pre-Workout & Endurance");
        Assert.assertEquals(aeFooterPage.getGlutamineAndRecoveryOption().getText(), "Glutamine & Recovery");
        Assert.assertEquals(aeFooterPage.getFatBurnersOption().getText(), "Fat Burners");
        Assert.assertEquals(aeFooterPage.getProteinBarsOption().getText(), "Protein Bars");
        Assert.assertEquals(aeFooterPage.getHealthySnacksOption().getText(), "Healthy Snacks");
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Whey Protein Link appears in the footer works correctly", priority = 63)
    public void verifyWheyProteinLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.getWheyProteinOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.wheyProteinUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.wheyProteinUrl));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Whey Protein page", priority = 64)
    public void verifyTheFooterSectionAppearsInTheWheyProteinPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyWheyProteinLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Whey Protein Isolate Link appears in the footer works correctly", priority = 65)
    public void verifyWheyProteinIsolateLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getWheyProteinIsolateOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.wheyProteinIsolateUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.wheyProteinIsolateUrl)," The Current URL is not matched with the wheyProteinIsolate Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Whey Protein Isolate page", priority = 66)
    public void verifyTheFooterSectionAppearsInTheWheyProteinIsolatePage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyWheyProteinIsolateLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Casein Protein Link appears in the footer works correctly", priority = 67)
    public void verifyCaseinProteinLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getCaseinProteinOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.caseinProteinUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.caseinProteinUrl)," The Current URL is not matched with the caseinProtein Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Casein Protein page", priority = 68)
    public void verifyTheFooterSectionAppearsInTheCaseinProteinPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyCaseinProteinLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Weight Gain And Mass Gainer Link appears in the footer works correctly", priority = 69)
    public void verifyWeightGainAndMassGainerLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getWeightGainAndMassGainerOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.weightGainAndMassGainerUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.weightGainAndMassGainerUrl)," The Current URL is not matched with weightGainAndMassGainer Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Weight Gain And Mass Gainer page", priority = 70)
    public void verifyTheFooterSectionAppearsInTheWeightGainAndMassGainerPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyWeightGainAndMassGainerLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the BCAAs And Amino Acids Link appears in the footer works correctly", priority = 71)
    public void verifyBCAAsAndAminoAcidsLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getBCAAsAndAminoAcidsOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.bCAAsAndAminoAcidsUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.bCAAsAndAminoAcidsUrl)," The Current URL is not matched with the bCAAsAndAminoAcids Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the BCAAs And Amino Acids page", priority = 72)
    public void verifyTheFooterSectionAppearsInTheBCAAsAndAminoAcidsPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyBCAAsAndAminoAcidsLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Pre-Workout And Endurance Link appears in the footer works correctly", priority = 73)
    public void verifyPreWorkoutAndEnduranceLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getPreWorkoutAndEnduranceOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.preWorkoutAndEnduranceUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.preWorkoutAndEnduranceUrl)," The Current URL is not matched with the preWorkoutAndEnduranceUrl");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Pre-Workout And Endurance page", priority = 74)
    public void verifyTheFooterSectionAppearsInThePreWorkoutAndEndurancePage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyPreWorkoutAndEnduranceLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Glutamine And Recovery Link appears in the footer works correctly", priority = 75)
    public void verifyGlutamineAndRecoveryLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getGlutamineAndRecoveryOption().click();
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Glutamine And Recovery page", priority = 76)
    public void verifyTheFooterSectionAppearsInTheGlutamineAndRecoveryPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyGlutamineAndRecoveryLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Fat Burners Link appears in the footer works correctly", priority = 77)
    public void verifyFatBurnersLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getFatBurnersOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.fatBurnersUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.fatBurnersUrl)," The Current URL is not matched wih the fatBurners Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Fat Burners page", priority = 78)
    public void verifyTheFooterSectionAppearsInTheFatBurnersPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyFatBurnersLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Protein Bars Link appears in the footer works correctly", priority = 79)
    public void verifyProteinBarsLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getProteinBarsOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.proteinBarsUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.proteinBarsUrl)," The Current URL is not matched with the proteinBars Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Protein Bars page", priority = 80)
    public void verifyTheFooterSectionAppearsInTheProteinBarsPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyProteinBarsLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Healthy Snacks Link appears in the footer works correctly", priority = 81)
    public void verifyHealthySnacksLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getHealthySnacksOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.healthySnacksUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.healthySnacksUrl)," The Current URL is not matched with the healthySnacks Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Healthy Snacks page", priority = 82)
    public void verifyTheFooterSectionAppearsInTheHealthySnacksPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyHealthySnacksLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section- Make sure the Vitamins & Health Section Appears Correctly In Footer", priority = 83)
    public void verifyVitaminsAndHealthSectionAppearsCorrectlyInFooter() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        Assert.assertEquals(aeFooterPage.getVitaminsAndHealthHeader().getText(), "Vitamins & Health");
        Assert.assertEquals(aeFooterPage.getMultivitaminsOption().getText(), "Multivitamins");
        Assert.assertEquals(aeFooterPage.getVitaminsdOption().getText(), "Vitamin D");
        Assert.assertEquals(aeFooterPage.getVitaminscOption().getText(), "Vitamin C");
        Assert.assertEquals(aeFooterPage.getVitaminseOption().getText(), "Vitamin E");
        Assert.assertEquals(aeFooterPage.getFishOilAndOmega3Option().getText(), "Fish Oil & Omega 3");
        Assert.assertEquals(aeFooterPage.getFolicAcidOption().getText(), "Folic Acid");
        Assert.assertEquals(aeFooterPage.getBoneAndJointSupportOption().getText(), "Bone & Joint Support");
        Assert.assertEquals(aeFooterPage.getCollagenOption().getText(), "Collagen");
        Assert.assertEquals(aeFooterPage.getHairSkinAndNailsOption().getText(), "Hair Skin & Nails");
        Assert.assertEquals(aeFooterPage.getTestosteroneBoosterOption().getText(), "Testosterone Booster");
        Assert.assertEquals(aeFooterPage.getMelatoninAndSleepSupportOption().getText(), "Melatonin & Sleep Support");
        Assert.assertEquals(aeFooterPage.getDigestiveSupportOption().getText(), "Digestive Support");
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Multivitamins Link appears in the footer works correctly", priority = 84)
    public void verifyMultivitaminsLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getMultivitaminsOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.multivitaminsUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.multivitaminsUrl)," The Current URL is not matched with the multivitamins Url");
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Multivitamins page", priority = 85)
    public void verifyTheFooterSectionAppearsInTheMultivitaminsPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyMultivitaminsLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Vitamins D Link appears in the footer works correctly", priority = 86)
    public void verifyVitaminsdLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getVitaminsdOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.vitamindUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.vitamindUrl));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Vitamins D page", priority = 87)
    public void verifyTheFooterSectionAppearsInTheVitaminsdPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyVitaminsdLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Vitamins C Link appears in the footer works correctly", priority = 88)
    public void verifyVitaminscLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getVitaminscOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.vitamincUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.vitamincUrl));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Vitamins C page", priority = 89)
    public void verifyTheFooterSectionAppearsInTheVitaminscPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyVitaminscLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Vitamins E Link appears in the footer works correctly", priority = 90)
    public void verifyVitaminseLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getVitaminseOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.vitamineUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.vitamineUrl));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Vitamins E page", priority = 91)
    public void verifyTheFooterSectionAppearsInTheVitaminsePage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyVitaminseLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Fish Oil & Omega 3 Link appears in the footer works correctly", priority = 92)
    public void verifyFishOilAndOmega3LinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getFishOilAndOmega3Option().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.fishOilOmegasUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.fishOilOmegasUrl));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Fish Oil & Omega 3 page", priority = 93)
    public void verifyTheFooterSectionAppearsInTheFishOilAndOmega3Page() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyFishOilAndOmega3LinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Folic Acid Link appears in the footer works correctly", priority = 94)
    public void verifyFolicAcidLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getFolicAcidOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.folicAcidUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.folicAcidUrl));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Folic Acid page", priority = 95)
    public void verifyTheFooterSectionAppearsInTheFolicAcidPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyFolicAcidLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Bone & Joint Support Link appears in the footer works correctly", priority = 96)
    public void verifyBoneAndJointSupportLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getBoneAndJointSupportOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.boneJointSupportUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.boneJointSupportUrl));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Bone & Joint Support page", priority = 97)
    public void verifyTheFooterSectionAppearsInTheBoneAndJointSupportPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyBoneAndJointSupportLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Collagen Link appears in the footer works correctly", priority = 98)
    public void verifyCollagenLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getCollagenOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.collagenUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.collagenUrl));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Collagen page", priority = 99)
    public void verifyTheFooterSectionAppearsInTheCollagenPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyCollagenLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Hair Skin & Nails Link appears in the footer works correctly", priority = 100)
    public void verifyHairSkinAndNailsLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getHairSkinAndNailsOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.hairSkinNailsUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.hairSkinNailsUrl));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Hair Skin & Nails page", priority = 101)
    public void verifyTheFooterSectionAppearsInTheHairSkinAndNailsPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyHairSkinAndNailsLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Testosterone Booster Link appears in the footer works correctly", priority = 102)
    public void verifyTestosteroneBoosterLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getTestosteroneBoosterOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.testosteroneBoosterUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.testosteroneBoosterUrl));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Hair Testosterone Booster page", priority = 103)
    public void verifyTheFooterSectionAppearsInTheTestosteroneBoosterPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyTestosteroneBoosterLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Melatonin & Sleep Support Link appears in the footer works correctly", priority = 104)
    public void verifyMelatoninAndSleepSupportLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getMelatoninAndSleepSupportOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.melatoninSleepSupportUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.melatoninSleepSupportUrl));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the  Melatonin & Sleep Support page", priority = 105)
    public void verifyTheFooterSectionAppearsInTheMelatoninAndSleepSupportPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyMelatoninAndSleepSupportLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Digestive Support Link appears in the footer works correctly", priority = 106)
    public void verifyDigestiveSupportLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getDigestiveSupportOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.digestionSupportUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.digestionSupportUrl));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Digestive Support  page", priority = 107)
    public void verifyTheFooterSectionAppearsInTheDigestiveSupportPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyDigestiveSupportLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Terms of Service Link appears in the footer works correctly", priority = 108)
    public void verifyTermsAndServiceLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getTermsAndServiceOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.termsAndServiceUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.termsAndServiceUrl));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Terms of Service page", priority = 109)
    public void verifyTheFooterSectionAppearsInTheTermsAndServicePage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyTermsAndServiceLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }

    @Test(groups = {"2.12 Footer Section", "1.2 High Severity"},description = " Footer Section- Make sure the Privacy Policy Link appears in the footer works correctly", priority = 110)
    public void verifyPrivacyPolicyLinkAppearsInFooterWorksCorrectly() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        aeFooterPage.getPrivacyPolicyOption().click();
        DataHelperAndWait.waitForUrlContains(aeFooterPage.privacyPolicyUrl,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.privacyPolicyUrl));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the footer section appears correctly in the Privacy Policy page", priority = 111)
    public void verifyTheFooterSectionAppearsInThePrivacyPolicyPage() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyPrivacyPolicyLinkAppearsInFooterWorksCorrectly();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }
    @Test(groups = {"2.12 Footer Section", "1.4  Low Severity"},description = " Footer Section- Make sure the copyright statement appears correctly in the footer section", priority = 112)
    public void verifyTheCopyRightStatementAppearsInTheFooter() {
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.navigateToHomePage();
        Assert.assertTrue(aeFooterPage.getCopyright().isDisplayed());
    }
    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section/Social Media- Make sure the ability to click on the instagram icon correctly", priority = 113)
    public void verifyAbilityToClickOnInstagramIconCorrectly() throws Exception {
        tearDown();
        setupBrowserFromTheClass(environmentName,browserName,countryUrl);
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.switchToAECountry();
        aeFooterPage.getInstagramIcon().click();
        DataHelperAndWait.switchToTabBrowser(1,webDriver);
        DataHelperAndWait.waitForUrlContains(aeFooterPage.instagramURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.instagramURL));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section/Social Media- Make sure the ability to click on the facebook icon correctly", priority = 114)
    public void verifyAbilityToClickOnFacebookIconCorrectly() throws Exception {
        tearDown();
        setupBrowserFromTheClass(environmentName,browserName,countryUrl);
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.switchToAECountry();
        aeFooterPage.getFacebookIcon().click();
        DataHelperAndWait.switchToTabBrowser(1,webDriver);
        DataHelperAndWait.waitForUrlContains(aeFooterPage.facebookURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.facebookURL));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();
        webDriver.close();
        DataHelperAndWait.switchToTabBrowser(0,webDriver);
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section/Social Media- Make sure the ability to click on the twitter icon correctly", priority = 115)
    public void verifyAbilityToClickOnTwitterIconCorrectly() throws Exception {
        tearDown();
        setupBrowserFromTheClass(environmentName,browserName,countryUrl);
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.switchToAECountry();
        aeFooterPage.getTwitterIcon().click();
        DataHelperAndWait.switchToTabBrowser(1,webDriver);
        DataHelperAndWait.waitForUrlContains(aeFooterPage.twitterURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.twitterURL));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();;
        webDriver.close();
        DataHelperAndWait.switchToTabBrowser(0,webDriver);
    }

    @Test(groups = {"2.12 Footer Section", "1.3 Medium Severity"},description = " Footer Section/Social Media- Make sure the ability to click on the youtube icon correctly", priority = 116)
    public void verifyAbilityToClickOnYouTubeIconCorrectly() throws Exception {
        tearDown();
        setupBrowserFromTheClass(environmentName,browserName,countryUrl);
        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
        aeFooterPage.switchToAECountry();
        aeFooterPage.getYoutubeIcon().click();
        DataHelperAndWait.switchToTabBrowser(1,webDriver);
        DataHelperAndWait.waitForUrlContains(aeFooterPage.youtubeURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeFooterPage.youtubeURL));
        aeFooterPage.verifyTheDisplayedPageDoesNotHaveErrors();;
        webDriver.close();
        DataHelperAndWait.switchToTabBrowser(0,webDriver);
    }
}