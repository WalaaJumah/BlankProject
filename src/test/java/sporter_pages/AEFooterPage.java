package sporter_pages;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class AEFooterPage extends BasePage {
    //declare all locators related to the Cart Page
    @FindBy(id = "switcher-store-trigger")
    private WebElement countryList;
    @FindBy(xpath = "(//div[@class='footer-column']//ul)[3]/li")
    private List<WebElement> mostSellingList;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='AE']")
    private WebElement aeCountry;
    @FindBy(xpath = "//footer[@class='page-footer']")
    private WebElement footerSection;
    @FindBy(xpath = "//div[@class='container']/ul[@class='clearfix']")
    private List<WebElement> pageBottomBlocksList;
    @FindBy(xpath = "//div[@class='block-footer-top']")
    private WebElement pageBottomSection;
    @FindBy(xpath = "(//li[@class='secure-listing']//h3[1])[1]")
    private WebElement securePaymentTitle;
    @FindBy(xpath = "//em[@class='fas fa-unlock']/following-sibling::span")
    private WebElement securePaymentDescription;
    @FindBy(xpath = "(//a[@title='100% Secure payments']//span)[3]")
    private WebElement fastDeliveryDescription;
    @FindBy(xpath = "(//li[@class='secure-listing']//h3[1])[3]")
    private WebElement fastDeliveryTitle;
    @FindBy(xpath = "(//li[@class='secure-listing']//h3[1])[2]")
    private WebElement authenticProductsTitle;
    @FindBy(xpath = "(//a[@title='100% Secure payments']//span)[2]")
    private WebElement authenticProductsDescription;
    @FindBy(xpath = "//div[@class='block newsletter']")
    private WebElement newsletterBlock;
    @FindBy(id = "newsletter")
    private WebElement emailFieldInNewsletterBlock;
    @FindBy(xpath = "//label[@for='newsletter_male']")
    private WebElement maleOptionInNewsletterBlock;
    @FindBy(xpath = "//label[@for='newsletter_female']")
    private WebElement femaleOptionInNewsletterBlock;
    @FindBy(xpath = "//button[@class='action subscribe primary']")
    private WebElement joinBtnInNewsletterBlock;
    @FindBy(xpath = "//div[@for='newsletter']")
    private WebElement emailRequiredMsgInNewsletterSection;
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    private WebElement subscriptionSuccessfulMsg;
    @FindBy(xpath = "(//div[@class='footer-column'])[1]/span")
    private WebElement ordersAndShippingHeader;
    @FindBy(xpath = "(//div[@class='footer-column'])[2]/span")
    private WebElement letUsHelpYouHeader;
    @FindBy(xpath = "(//div[@class='footer-column'])[3]/span")
    private WebElement mostSellingProductsHeader;
    @FindBy(xpath = "(//div[@class='footer-column'])[4]/span")
    private WebElement getToKnowUsHeader;
    @FindBy(xpath = "(//div[@class='footer-column'])[5]/span")
    private WebElement contactUsHeader;
    @FindBy(xpath = "(//div[@class='footer-column 3'])[1]/span")
    private WebElement accessoriesAndApparelHeader;
    @FindBy(xpath = "(//div[@class='footer-column 1'])[1]/span")
    private WebElement proteinAndFitnessHeader;
    @FindBy(xpath = "(//div[@class='footer-column 2'])[1]/span")
    private WebElement vitaminsAndHealthHeader;
    @FindBy(xpath = "(//div[@class='footer-column 3'])[1]/ul/li[1]/a")
    private WebElement trainingApparelOption;
    @FindBy(xpath = "(//div[@class='footer-column 2'])[1]/ul/li[1]/a")
    private WebElement multivitaminsOption;
    @FindBy(xpath = "(//div[@class='footer-column 2'])[1]/ul/li[2]/a")
    private WebElement vitaminsdOption;
    @FindBy(xpath = "(//div[@class='footer-column 2'])[1]/ul/li[3]/a")
    private WebElement vitaminscOption;
    @FindBy(xpath = "(//div[@class='footer-column 2'])[1]/ul/li[4]/a")
    private WebElement vitaminseOption;
    @FindBy(xpath = "(//div[@class='footer-column 2'])[1]/ul/li[5]/a")
    private WebElement fishOilAndOmega3Option;
    @FindBy(xpath = "(//div[@class='footer-column 2'])[1]/ul/li[6]/a")
    private WebElement folicAcidOption;
    @FindBy(xpath = "(//div[@class='footer-column 2'])[1]/ul/li[7]/a")
    private WebElement boneAndJointSupportOption;
    @FindBy(xpath = "(//div[@class='footer-column 2'])[1]/ul/li[8]/a")
    private WebElement collagenOption;
    @FindBy(xpath = "(//div[@class='footer-column 2'])[1]/ul/li[9]/a")
    private WebElement hairSkinAndNailsOption;
    @FindBy(xpath = "(//div[@class='footer-column 2'])[1]/ul/li[10]/a")
    private WebElement testosteroneBoosterOption;
    @FindBy(xpath = "(//div[@class='footer-column 2'])[1]/ul/li[11]/a")
    private WebElement melatoninAndSleepSupportOption;
    @FindBy(xpath = "(//div[@class='footer-column 2'])[1]/ul/li[12]/a")
    private WebElement digestiveSupportOption;
    @FindBy(xpath = "(//li[@class='footer-links-wide-item footer-links-tc-item'])[1]/a")
    private WebElement termsAndServiceOption;
    @FindBy(xpath = "(//a[@class='footer-links-media-link'])[1]")
    private WebElement instagramIcon;
    @FindBy(xpath = "(//a[@class='footer-links-media-link'])[2]")
    private WebElement facebookIcon;
    @FindBy(xpath = "(//a[@class='footer-links-media-link'])[3]")
    private WebElement twitterIcon;
    @FindBy(xpath = "(//a[@class='footer-links-media-link'])[4]")
    private WebElement youtubeIcon;
    @FindBy(xpath = "(//div[@class='copyright'])[2]")
    private WebElement copyright;
    @FindBy(xpath = "(//li[@class='footer-links-wide-item footer-links-tc-item'])[2]/a")
    private WebElement privacyPolicyOption;
    @FindBy(xpath = "(//div[@class='footer-column 3'])[1]/ul/li[2]/a")
    private WebElement fitnessAccessoriesOption;
    @FindBy(xpath = "(//div[@class='footer-column 3'])[1]/ul/li[3]/a")
    private WebElement shakersOption;
    @FindBy(xpath = "(//div[@class='footer-column 3'])[1]/ul/li[4]/a")
    private WebElement homeGymEquipmentOption;
    @FindBy(xpath = "(//div[@class='footer-column 3'])[1]/ul/li[5]/a")
    private WebElement watchesOption;
    @FindBy(xpath = "(//div[@class='footer-column 3'])[1]/ul/li[6]/a")
    private WebElement strapsOption;
    @FindBy(xpath = "(//div[@class='footer-column 1'])[1]/ul/li[1]/a")
    private WebElement wheyProteinOption;
    @FindBy(xpath = "(//div[@class='footer-column 1'])[1]/ul/li[2]/a")
    private WebElement wheyProteinIsolateOption;
    @FindBy(xpath = "(//div[@class='footer-column 1'])[1]/ul/li[3]/a")
    private WebElement caseinProteinOption;
    @FindBy(xpath = "(//div[@class='footer-column 1'])[1]/ul/li[4]/a")
    private WebElement weightGainAndMassGainerOption;
    @FindBy(xpath = "(//div[@class='footer-column 1'])[1]/ul/li[5]/a")
    private WebElement bCAAsAndAminoAcidsOption;
    @FindBy(xpath = "(//div[@class='footer-column 1'])[1]/ul/li[6]/a")
    private WebElement preWorkoutAndEnduranceOption;
    @FindBy(xpath = "(//div[@class='footer-column 1'])[1]/ul/li[7]/a")
    private WebElement glutamineAndRecoveryOption;
    @FindBy(xpath = "(//div[@class='footer-column 1'])[1]/ul/li[8]/a")
    private WebElement fatBurnersOption;
    @FindBy(xpath = "(//div[@class='footer-column 1'])[1]/ul/li[9]/a")
    private WebElement proteinBarsOption;
    @FindBy(xpath = "(//div[@class='footer-column 1'])[1]/ul/li[10]/a")
    private WebElement healthySnacksOption;
    @FindBy(xpath = "(//div[@class='footer-column 3'])[1]/ul/li[7]/a")
    private WebElement bagsOption;
    @FindBy(xpath = "(//ul[@class='footer-links'])[1]")
    private List<WebElement> ordersAndShippingList;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[1]/a")
    private WebElement trackYourOrderOption;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[4]/a")
    private WebElement wowCustomerServiceOption;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[2]/a")
    private WebElement shippingAndDeliveryOption;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[5]/a")
    private WebElement fAQsOption;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[6]/a")
    private WebElement grenadeReloadProteinOatBarOption;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[7]/a")
    private WebElement dymatizeISO100ProteinOption;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[11]/a")
    private WebElement aboutSporterOption;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[17]/a")
    private WebElement contactInfoOption;
    @FindBy(xpath = "(//li[@class='footer-links-item address-block'])[1]/label")
    private WebElement phoneNumberLabelOption;
    @FindBy(xpath = "(//li[@class='footer-links-item address-block'])[2]/address")
    private WebElement addressValue;
    @FindBy(xpath = "(//li[@class='footer-links-item address-block'])[2]/label")
    private WebElement addressLabel;
    @FindBy(xpath = "(//li[@class='footer-links-item address-block'])[1]/a")
    private WebElement phoneNumber;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[12]/a")
    private WebElement productQualityOption;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[13]/a")
    private WebElement productAuthenticityOption;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[14]/a")
    private WebElement wholesaleOption;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[16]/a")
    private WebElement sporterBlogOption;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[15]/a")
    private WebElement careersOption;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[8]/a")
    private WebElement grenadeCarbKillaProteinBarOption;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[9]/a")
    private WebElement grenadeCarbKillaProteinBarBoxOf12Option;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[10]/a")
    private WebElement questNutritionBarsBox12Option;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[3]/a")
    private WebElement refundAndReturns;
    @FindBy(xpath = "(//h2[text()='404']")
    private WebElement notFoundPage;
    @FindBy(xpath = "//div[@class='message info empty']")
    private WebElement msgInfoEmpty;
    public AEFooterPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    //Getter Methods
    public List<WebElement> getPageBottomBlocksList() {
        return pageBottomBlocksList;
    }

    public WebElement getPageBottomSection() {
        return pageBottomSection;
    }

    public WebElement getSecurePaymentTitle() {
        return securePaymentTitle;
    }

    public WebElement getMsgInfoEmpty() {
        return msgInfoEmpty;
    }

    public WebElement getSecurePaymentDescription() {
        return securePaymentDescription;
    }

    public WebElement getFastDeliveryDescription() {
        return fastDeliveryDescription;
    }

    public WebElement getFastDeliveryTitle() {
        return fastDeliveryTitle;
    }

    public WebElement getAuthenticProductsTitle() {
        return authenticProductsTitle;
    }

    public WebElement getAuthenticProductsDescription() {
        return authenticProductsDescription;
    }

    public WebElement getNewsletterBlock() {
        DataHelperAndWait.waitToBeVisible(newsletterBlock, webDriver);
        return newsletterBlock;
    }

    public WebElement getEmailFieldInNewsletterBlock() {
        DataHelperAndWait.waitToBeVisible(emailFieldInNewsletterBlock, webDriver);
        return emailFieldInNewsletterBlock;
    }

    public WebElement getFemaleOptionInNewsletterBlock() {
        DataHelperAndWait.waitToBeVisible(femaleOptionInNewsletterBlock, webDriver);
        return femaleOptionInNewsletterBlock;
    }

    public WebElement getMaleOptionInNewsletterBlock() {
        DataHelperAndWait.waitToBeVisible(maleOptionInNewsletterBlock, webDriver);
        return maleOptionInNewsletterBlock;
    }

    public WebElement getWheyProteinOption() {
        DataHelperAndWait.waitToBeVisible(wheyProteinOption, webDriver);
        return wheyProteinOption;
    }

    public WebElement getJoinBtnInNewsletterBlock() {
        DataHelperAndWait.waitToBeVisible(joinBtnInNewsletterBlock, webDriver);
        return joinBtnInNewsletterBlock;
    }

    public WebElement getEmailRequiredMsgInNewsletterSection() {
        DataHelperAndWait.waitToBeVisible(emailRequiredMsgInNewsletterSection, webDriver);
        return emailRequiredMsgInNewsletterSection;
    }

    public WebElement getSubscriptionSuccessfulMsg() {
        DataHelperAndWait.waitToBeVisible(subscriptionSuccessfulMsg, webDriver);
        return subscriptionSuccessfulMsg;
    }

    public WebElement getOrdersAndShippingHeader() {
        return ordersAndShippingHeader;
    }

    public WebElement getLetUsHelpYouHeader() {
        return letUsHelpYouHeader;
    }

    public WebElement getWowCustomerServiceOption() {
        DataHelperAndWait.waitToBeVisible(wowCustomerServiceOption, webDriver);
        return wowCustomerServiceOption;
    }

    public List<WebElement> getOrdersAndShippingList() {
        return ordersAndShippingList;
    }

    public WebElement getTrackYourOrderOption() {
        DataHelperAndWait.waitToBeVisible(trackYourOrderOption, webDriver);
        return trackYourOrderOption;
    }

    public WebElement getShippingAndDeliveryOption() {
        DataHelperAndWait.waitToBeVisible(shippingAndDeliveryOption, webDriver);
        return shippingAndDeliveryOption;
    }

    public WebElement getRefundAndReturnsOption() {
        DataHelperAndWait.waitToBeVisible(refundAndReturns, webDriver);
        return refundAndReturns;
    }

    public WebElement getFooterSection() {
        DataHelperAndWait.waitToBeVisible(footerSection, webDriver);
        return footerSection;
    }

    public WebElement getFAQsOption() {
        DataHelperAndWait.waitToBeVisible(fAQsOption, webDriver);
        return fAQsOption;
    }

    public WebElement getMostSellingProductsHeader() {
        DataHelperAndWait.waitToBeVisible(mostSellingProductsHeader, webDriver);
        return mostSellingProductsHeader;
    }

    public WebElement getProteinAndFitnessHeader() {
        DataHelperAndWait.waitToBeVisible(proteinAndFitnessHeader, webDriver);
        return proteinAndFitnessHeader;
    }

    public WebElement getGrenadeReloadProteinOatBarOption() {
        DataHelperAndWait.waitToBeVisible(grenadeReloadProteinOatBarOption, webDriver);
        return grenadeReloadProteinOatBarOption;
    }

    public WebElement getDymatizeISO100ProteinOption() {
        DataHelperAndWait.waitToBeVisible(dymatizeISO100ProteinOption, webDriver);
        return dymatizeISO100ProteinOption;
    }

    public WebElement getGrenadeCarbKillaProteinBarOption() {
        DataHelperAndWait.waitToBeVisible(grenadeCarbKillaProteinBarOption, webDriver);
        return grenadeCarbKillaProteinBarOption;
    }

    public WebElement getGrenadeCarbKillaProteinBarBoxOf12Option() {
        DataHelperAndWait.waitToBeVisible(grenadeCarbKillaProteinBarBoxOf12Option, webDriver);
        return grenadeCarbKillaProteinBarBoxOf12Option;
    }

    public WebElement getQuestNutritionBarsBox12Option() {
        DataHelperAndWait.waitToBeVisible(questNutritionBarsBox12Option, webDriver);
        return questNutritionBarsBox12Option;
    }

    public WebElement getGetToKnowUsHeader() {
        DataHelperAndWait.waitToBeVisible(getToKnowUsHeader, webDriver);
        return getToKnowUsHeader;
    }

    public WebElement getAboutSporterOption() {
        DataHelperAndWait.waitToBeVisible(aboutSporterOption, webDriver);
        return aboutSporterOption;
    }

    public WebElement getProductQualityOption() {
        DataHelperAndWait.waitToBeVisible(productQualityOption, webDriver);
        return productQualityOption;
    }

    public WebElement getProductAuthenticityOption() {
        DataHelperAndWait.waitToBeVisible(productAuthenticityOption, webDriver);
        return productAuthenticityOption;
    }

    public WebElement getWholesaleOption() {
        DataHelperAndWait.waitToBeVisible(wholesaleOption, webDriver);
        return wholesaleOption;
    }

    public WebElement getCareersOption() {
        DataHelperAndWait.waitToBeVisible(careersOption, webDriver);
        return careersOption;
    }

    public WebElement getSporterBlogOption() {
        DataHelperAndWait.waitToBeVisible(sporterBlogOption, webDriver);
        return sporterBlogOption;
    }

    public WebElement getNotFoundPage() {
        return notFoundPage;
    }

    public WebElement getContactUsHeader() {
        DataHelperAndWait.waitToBeVisible(contactUsHeader, webDriver);
        return contactUsHeader;
    }

    public WebElement getContactInfoOption() {
        DataHelperAndWait.waitToBeVisible(contactInfoOption, webDriver);
        return contactInfoOption;
    }

    public WebElement getPhoneNumberLabelOption() {
        DataHelperAndWait.waitToBeVisible(phoneNumberLabelOption, webDriver);
        return phoneNumberLabelOption;
    }

    public WebElement getPhoneNumber() {
        DataHelperAndWait.waitToBeVisible(phoneNumber, webDriver);
        return phoneNumber;
    }

    public WebElement getAddressLabel() {
        DataHelperAndWait.waitToBeVisible(addressLabel, webDriver);
        return addressLabel;
    }

    public WebElement getAddressValue() {
        DataHelperAndWait.waitToBeVisible(addressValue, webDriver);
        return addressValue;
    }

    public WebElement getAccessoriesAndApparelHeader() {
        DataHelperAndWait.waitToBeVisible(accessoriesAndApparelHeader, webDriver);
        return accessoriesAndApparelHeader;
    }

    public WebElement getTrainingApparelOption() {
        DataHelperAndWait.waitToBeVisible(trainingApparelOption, webDriver);
        return trainingApparelOption;
    }

    public WebElement getFitnessAccessoriesOption() {
        DataHelperAndWait.waitToBeVisible(fitnessAccessoriesOption, webDriver);
        return fitnessAccessoriesOption;
    }

    public WebElement getShakersOption() {
        DataHelperAndWait.waitToBeVisible(shakersOption, webDriver);
        return shakersOption;
    }

    public WebElement getHomeGymEquipmentOption() {
        DataHelperAndWait.waitToBeVisible(homeGymEquipmentOption, webDriver);
        return homeGymEquipmentOption;
    }

    public WebElement getWatchesOption() {
        DataHelperAndWait.waitToBeVisible(watchesOption, webDriver);
        return watchesOption;
    }

    public WebElement getStrapsOption() {
        DataHelperAndWait.waitToBeVisible(strapsOption, webDriver);
        return strapsOption;
    }

    public WebElement getBagsOption() {
        DataHelperAndWait.waitToBeVisible(bagsOption, webDriver);
        return bagsOption;
    }

    public WebElement getWheyProteinIsolateOption() {
        DataHelperAndWait.waitToBeVisible(wheyProteinIsolateOption, webDriver);
        return wheyProteinIsolateOption;
    }

    public WebElement getCaseinProteinOption() {
        DataHelperAndWait.waitToBeVisible(caseinProteinOption, webDriver);
        return caseinProteinOption;
    }

    public WebElement getWeightGainAndMassGainerOption() {
        DataHelperAndWait.waitToBeVisible(weightGainAndMassGainerOption, webDriver);
        return weightGainAndMassGainerOption;
    }

    public WebElement getBCAAsAndAminoAcidsOption() {
        DataHelperAndWait.waitToBeVisible(bCAAsAndAminoAcidsOption, webDriver);
        return bCAAsAndAminoAcidsOption;
    }

    public WebElement getPreWorkoutAndEnduranceOption() {
        DataHelperAndWait.waitToBeVisible(preWorkoutAndEnduranceOption, webDriver);
        return preWorkoutAndEnduranceOption;
    }

    public WebElement getGlutamineAndRecoveryOption() {
        DataHelperAndWait.waitToBeVisible(glutamineAndRecoveryOption, webDriver);
        return glutamineAndRecoveryOption;
    }

    public WebElement getFatBurnersOption() {
        DataHelperAndWait.waitToBeVisible(fatBurnersOption, webDriver);
        return fatBurnersOption;
    }

    public WebElement getProteinBarsOption() {
        DataHelperAndWait.waitToBeVisible(proteinBarsOption, webDriver);
        return proteinBarsOption;
    }

    public WebElement getHealthySnacksOption() {
        DataHelperAndWait.waitToBeVisible(healthySnacksOption, webDriver);
        return healthySnacksOption;
    }

    public WebElement getVitaminsAndHealthHeader() {
        DataHelperAndWait.waitToBeVisible(vitaminsAndHealthHeader, webDriver);
        return vitaminsAndHealthHeader;
    }

    public WebElement getMultivitaminsOption() {
        DataHelperAndWait.waitToBeVisible(multivitaminsOption, webDriver);
        return multivitaminsOption;
    }

    public WebElement getVitaminsdOption() {
        DataHelperAndWait.waitToBeVisible(vitaminsdOption, webDriver);
        return vitaminsdOption;
    }

    public WebElement getVitaminscOption() {
        DataHelperAndWait.waitToBeVisible(vitaminscOption, webDriver);
        return vitaminscOption;
    }

    public WebElement getVitaminseOption() {
        DataHelperAndWait.waitToBeVisible(vitaminseOption, webDriver);
        return vitaminseOption;
    }

    public WebElement getFishOilAndOmega3Option() {
        DataHelperAndWait.waitToBeVisible(fishOilAndOmega3Option, webDriver);
        return fishOilAndOmega3Option;
    }

    public WebElement getFolicAcidOption() {
        DataHelperAndWait.waitToBeVisible(folicAcidOption, webDriver);
        return folicAcidOption;
    }

    public WebElement getBoneAndJointSupportOption() {
        DataHelperAndWait.waitToBeVisible(boneAndJointSupportOption, webDriver);
        return boneAndJointSupportOption;
    }

    public WebElement getCollagenOption() {
        DataHelperAndWait.waitToBeVisible(collagenOption, webDriver);
        return collagenOption;
    }

    public WebElement getHairSkinAndNailsOption() {
        DataHelperAndWait.waitToBeVisible(hairSkinAndNailsOption, webDriver);
        return hairSkinAndNailsOption;
    }

    public WebElement getTestosteroneBoosterOption() {
        DataHelperAndWait.waitToBeVisible(testosteroneBoosterOption, webDriver);
        return testosteroneBoosterOption;
    }

    public WebElement getMelatoninAndSleepSupportOption() {
        DataHelperAndWait.waitToBeVisible(melatoninAndSleepSupportOption, webDriver);
        return melatoninAndSleepSupportOption;
    }

    public WebElement getDigestiveSupportOption() {
        DataHelperAndWait.waitToBeVisible(digestiveSupportOption, webDriver);
        return digestiveSupportOption;
    }

    public WebElement getPrivacyPolicyOption() {
        DataHelperAndWait.waitToBeVisible(privacyPolicyOption, webDriver);
        return privacyPolicyOption;
    }

    public WebElement getTermsAndServiceOption() {
        DataHelperAndWait.waitToBeVisible(termsAndServiceOption, webDriver);
        return termsAndServiceOption;
    }

    public WebElement getInstagramIcon() {
        DataHelperAndWait.waitToBeVisible(instagramIcon, webDriver);
        return instagramIcon;
    }

    public WebElement getFacebookIcon() {
        DataHelperAndWait.waitToBeVisible(facebookIcon, webDriver);
        return facebookIcon;
    }

    public WebElement getTwitterIcon() {
        DataHelperAndWait.waitToBeVisible(twitterIcon, webDriver);
        return twitterIcon;
    }

    public WebElement getYoutubeIcon() {
        DataHelperAndWait.waitToBeVisible(youtubeIcon, webDriver);
        return youtubeIcon;
    }

    public WebElement getCopyright() {
        DataHelperAndWait.waitToBeVisible(copyright, webDriver);
        return copyright;
    }

    public List<WebElement> getMostSellingList() {
        return mostSellingList;
    }

    //Define the main actions we need to execute our TCs
    public void switchToAECountry() {
        try {
            DataHelperAndWait.isDisplayed(countryList, webDriver);
            this.countryList.click();
            this.aeCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.isDisplayed(countryList, webDriver);
            this.countryList.click();
            this.aeCountry.click();
        }
    }

    public void fillInemailFieldInNewsletterBlock(String email) {
        DataHelperAndWait.waitToBeVisible(this.emailFieldInNewsletterBlock, webDriver);
        emailFieldInNewsletterBlock.sendKeys(email);
    }

    public void selectMaleOptionInNewsletterBlock() {
        DataHelperAndWait.waitToBeVisible(this.maleOptionInNewsletterBlock, webDriver);
        maleOptionInNewsletterBlock.click();
    }

    public void selectFemaleOptionInNewsletterBlock() {
        DataHelperAndWait.waitToBeVisible(this.femaleOptionInNewsletterBlock, webDriver);
        femaleOptionInNewsletterBlock.click();
    }

    public void clickOnJoinBtnInNewsletterBlock() {
        DataHelperAndWait.waitToBeVisible(this.joinBtnInNewsletterBlock, webDriver);
        joinBtnInNewsletterBlock.click();
    }

    public String generateRandomEmail() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return "username" + randomInt + "@gmail.com";
    }

    public void navigateToHomePage() {
        webDriver.navigate().to(BaseURL);
    }

    public void clearEmailField() {
        DataHelperAndWait.waitToBeVisible(emailFieldInNewsletterBlock, webDriver);
        DataHelperAndWait.clearWebField(emailFieldInNewsletterBlock);
    }

}