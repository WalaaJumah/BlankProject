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
    public AEFooterPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

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
    @FindBy(xpath = "//input[@id='newsletter']")
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
        DataHelperAndWait.waitToBeVisible(newsletterBlock,5,webDriver);
        return newsletterBlock;
    }

    public WebElement getEmailFieldInNewsletterBlock() {
        DataHelperAndWait.waitToBeVisible(emailFieldInNewsletterBlock,5,webDriver);
        return emailFieldInNewsletterBlock;
    }

    public WebElement getFemaleOptionInNewsletterBlock() {
        DataHelperAndWait.waitToBeVisible(femaleOptionInNewsletterBlock,5,webDriver);
        return femaleOptionInNewsletterBlock;
    }

    public WebElement getMaleOptionInNewsletterBlock() {
        DataHelperAndWait.waitToBeVisible(maleOptionInNewsletterBlock,5,webDriver);
        return maleOptionInNewsletterBlock;
    }

    public WebElement getWheyProteinOption() {
        DataHelperAndWait.waitToBeVisible(wheyProteinOption,5,webDriver);
        return wheyProteinOption;
    }

    public WebElement getJoinBtnInNewsletterBlock() {
        DataHelperAndWait.waitToBeVisible(joinBtnInNewsletterBlock,5,webDriver);
        return joinBtnInNewsletterBlock;
    }

    public WebElement getEmailRequiredMsgInNewsletterSection() {
        DataHelperAndWait.waitToBeVisible(emailRequiredMsgInNewsletterSection,5,webDriver);
        return emailRequiredMsgInNewsletterSection;
    }

    public WebElement getSubscriptionSuccessfulMsg() {
        DataHelperAndWait.waitToBeVisible(subscriptionSuccessfulMsg,5,webDriver);
        return subscriptionSuccessfulMsg;
    }

    public WebElement getOrdersAndShippingHeader() {
        return ordersAndShippingHeader;
    }

    public WebElement getLetUsHelpYouHeader() {
        return letUsHelpYouHeader;
    }

    public WebElement getWowCustomerServiceOption() {
        DataHelperAndWait.waitToBeVisible(wowCustomerServiceOption,5,webDriver);
        return wowCustomerServiceOption;
    }

    public List<WebElement> getOrdersAndShippingList() {
        return ordersAndShippingList;
    }

    public WebElement getTrackYourOrderOption() {
        DataHelperAndWait.waitToBeVisible(trackYourOrderOption,5,webDriver);
        return trackYourOrderOption;
    }

    public WebElement getShippingAndDeliveryOption() {
        DataHelperAndWait.waitToBeVisible(shippingAndDeliveryOption,5,webDriver);
        return shippingAndDeliveryOption;
    }

    public WebElement getRefundAndReturnsOption() {
        DataHelperAndWait.waitToBeVisible(refundAndReturns,5,webDriver);
        return refundAndReturns;
    }

    public WebElement getFooterSection() {
        DataHelperAndWait.waitToBeVisible(footerSection,5,webDriver);
        return footerSection;
    }

    public WebElement getFAQsOption() {
        DataHelperAndWait.waitToBeVisible(fAQsOption,5,webDriver);
        return fAQsOption;
    }

    public WebElement getMostSellingProductsHeader() {
        DataHelperAndWait.waitToBeVisible(mostSellingProductsHeader,5,webDriver);
        return mostSellingProductsHeader;
    }

    public WebElement getProteinAndFitnessHeader() {
        DataHelperAndWait.waitToBeVisible(proteinAndFitnessHeader,5,webDriver);
        return proteinAndFitnessHeader;
    }

    public WebElement getGrenadeReloadProteinOatBarOption() {
        DataHelperAndWait.waitToBeVisible(grenadeReloadProteinOatBarOption,5,webDriver);
        return grenadeReloadProteinOatBarOption;
    }

    public WebElement getDymatizeISO100ProteinOption() {
        DataHelperAndWait.waitToBeVisible(dymatizeISO100ProteinOption,5,webDriver);
        return dymatizeISO100ProteinOption;
    }

    public WebElement getGrenadeCarbKillaProteinBarOption() {
        DataHelperAndWait.waitToBeVisible(grenadeCarbKillaProteinBarOption,5,webDriver);
        return grenadeCarbKillaProteinBarOption;
    }

    public WebElement getGrenadeCarbKillaProteinBarBoxOf12Option() {
        DataHelperAndWait.waitToBeVisible(grenadeCarbKillaProteinBarBoxOf12Option,5,webDriver);
        return grenadeCarbKillaProteinBarBoxOf12Option;
    }

    public WebElement getQuestNutritionBarsBox12Option() {
        DataHelperAndWait.waitToBeVisible(questNutritionBarsBox12Option,5,webDriver);
        return questNutritionBarsBox12Option;
    }

    public WebElement getGetToKnowUsHeader() {
        DataHelperAndWait.waitToBeVisible(getToKnowUsHeader,5,webDriver);
        return getToKnowUsHeader;
    }

    public WebElement getAboutSporterOption() {
        DataHelperAndWait.waitToBeVisible(aboutSporterOption,5,webDriver);
        return aboutSporterOption;
    }

    public WebElement getProductQualityOption() {
        DataHelperAndWait.waitToBeVisible(productQualityOption,5,webDriver);
        return productQualityOption;
    }

    public WebElement getProductAuthenticityOption() {
        DataHelperAndWait.waitToBeVisible(productAuthenticityOption,5,webDriver);
        return productAuthenticityOption;
    }

    public WebElement getWholesaleOption() {
        DataHelperAndWait.waitToBeVisible(wholesaleOption,5,webDriver);
        return wholesaleOption;
    }

    public WebElement getCareersOption() {
        DataHelperAndWait.waitToBeVisible(careersOption,5,webDriver);
        return careersOption;
    }

    public WebElement getSporterBlogOption() {
        DataHelperAndWait.waitToBeVisible(sporterBlogOption,5,webDriver);
        return sporterBlogOption;
    }

    public WebElement getNotFoundPage() {
        return notFoundPage;
    }

    public WebElement getContactUsHeader() {
        DataHelperAndWait.waitToBeVisible(contactUsHeader,5,webDriver);
        return contactUsHeader;
    }

    public WebElement getContactInfoOption() {
        DataHelperAndWait.waitToBeVisible(contactInfoOption,5,webDriver);
        return contactInfoOption;
    }

    public WebElement getPhoneNumberLabelOption() {
        DataHelperAndWait.waitToBeVisible(phoneNumberLabelOption,5,webDriver);
        return phoneNumberLabelOption;
    }

    public WebElement getPhoneNumber() {
        DataHelperAndWait.waitToBeVisible(phoneNumber,5,webDriver);
        return phoneNumber;
    }

    public WebElement getAddressLabel() {
        DataHelperAndWait.waitToBeVisible(addressLabel,5,webDriver);
        return addressLabel;
    }

    public WebElement getAddressValue() {
        DataHelperAndWait.waitToBeVisible(addressValue,5,webDriver);
        return addressValue;
    }

    public WebElement getAccessoriesAndApparelHeader() {
        DataHelperAndWait.waitToBeVisible(accessoriesAndApparelHeader,5,webDriver);
        return accessoriesAndApparelHeader;
    }

    public WebElement getTrainingApparelOption() {
        DataHelperAndWait.waitToBeVisible(trainingApparelOption,5,webDriver);
        return trainingApparelOption;
    }

    public WebElement getFitnessAccessoriesOption() {
        DataHelperAndWait.waitToBeVisible(fitnessAccessoriesOption,5,webDriver);
        return fitnessAccessoriesOption;
    }

    public WebElement getShakersOption() {
        DataHelperAndWait.waitToBeVisible(shakersOption,5,webDriver);
        return shakersOption;
    }

    public WebElement getHomeGymEquipmentOption() {
        DataHelperAndWait.waitToBeVisible(homeGymEquipmentOption,5,webDriver);
        return homeGymEquipmentOption;
    }

    public WebElement getWatchesOption() {
        DataHelperAndWait.waitToBeVisible(watchesOption,5,webDriver);
        return watchesOption;
    }

    public WebElement getStrapsOption() {
        DataHelperAndWait.waitToBeVisible(strapsOption,5,webDriver);
        return strapsOption;
    }

    public WebElement getBagsOption() {
        DataHelperAndWait.waitToBeVisible(bagsOption,5,webDriver);
        return bagsOption;
    }

    public WebElement getWheyProteinIsolateOption() {
        DataHelperAndWait.waitToBeVisible(wheyProteinIsolateOption,5,webDriver);
        return wheyProteinIsolateOption;
    }

    public WebElement getCaseinProteinOption() {
        DataHelperAndWait.waitToBeVisible(caseinProteinOption,5,webDriver);
        return caseinProteinOption;
    }

    public WebElement getWeightGainAndMassGainerOption() {
        DataHelperAndWait.waitToBeVisible(weightGainAndMassGainerOption,5,webDriver);
        return weightGainAndMassGainerOption;
    }

    public WebElement getBCAAsAndAminoAcidsOption() {
        DataHelperAndWait.waitToBeVisible(bCAAsAndAminoAcidsOption,5,webDriver);
        return bCAAsAndAminoAcidsOption;
    }

    public WebElement getPreWorkoutAndEnduranceOption() {
        DataHelperAndWait.waitToBeVisible(preWorkoutAndEnduranceOption,5,webDriver);
        return preWorkoutAndEnduranceOption;
    }

    public WebElement getGlutamineAndRecoveryOption() {
        DataHelperAndWait.waitToBeVisible(glutamineAndRecoveryOption,5,webDriver);
        return glutamineAndRecoveryOption;
    }

    public WebElement getFatBurnersOption() {
        DataHelperAndWait.waitToBeVisible(fatBurnersOption,5,webDriver);
        return fatBurnersOption;
    }

    public WebElement getProteinBarsOption() {
        DataHelperAndWait.waitToBeVisible(proteinBarsOption,5,webDriver);
        return proteinBarsOption;
    }

    public WebElement getHealthySnacksOption() {
        DataHelperAndWait.waitToBeVisible(healthySnacksOption,5,webDriver);
        return healthySnacksOption;
    }

    public WebElement getVitaminsAndHealthHeader() {
        DataHelperAndWait.waitToBeVisible(vitaminsAndHealthHeader,5,webDriver);
        return vitaminsAndHealthHeader;
    }

    public WebElement getMultivitaminsOption() {
        DataHelperAndWait.waitToBeVisible(multivitaminsOption,5,webDriver);
        return multivitaminsOption;
    }

    public WebElement getVitaminsdOption() {
        DataHelperAndWait.waitToBeVisible(vitaminsdOption,5,webDriver);
        return vitaminsdOption;
    }

    public WebElement getVitaminscOption() {
        DataHelperAndWait.waitToBeVisible(vitaminscOption,5,webDriver);
        return vitaminscOption;
    }

    public WebElement getVitaminseOption() {
        DataHelperAndWait.waitToBeVisible(vitaminseOption,5,webDriver);
        return vitaminseOption;
    }

    public WebElement getFishOilAndOmega3Option() {
        DataHelperAndWait.waitToBeVisible(fishOilAndOmega3Option,5,webDriver);
        return fishOilAndOmega3Option;
    }

    public WebElement getFolicAcidOption() {
        DataHelperAndWait.waitToBeVisible(folicAcidOption,5,webDriver);
        return folicAcidOption;
    }

    public WebElement getBoneAndJointSupportOption() {
        DataHelperAndWait.waitToBeVisible(boneAndJointSupportOption,5,webDriver);
        return boneAndJointSupportOption;
    }

    public WebElement getCollagenOption() {
        DataHelperAndWait.waitToBeVisible(collagenOption,5,webDriver);
        return collagenOption;
    }

    public WebElement getHairSkinAndNailsOption() {
        DataHelperAndWait.waitToBeVisible(hairSkinAndNailsOption,5,webDriver);
        return hairSkinAndNailsOption;
    }

    public WebElement getTestosteroneBoosterOption() {
        DataHelperAndWait.waitToBeVisible(testosteroneBoosterOption,5,webDriver);
        return testosteroneBoosterOption;
    }

    public WebElement getMelatoninAndSleepSupportOption() {
        DataHelperAndWait.waitToBeVisible(melatoninAndSleepSupportOption,5,webDriver);
        return melatoninAndSleepSupportOption;
    }

    public WebElement getDigestiveSupportOption() {
        DataHelperAndWait.waitToBeVisible(digestiveSupportOption,5,webDriver);
        return digestiveSupportOption;
    }

    public WebElement getPrivacyPolicyOption() {
        DataHelperAndWait.waitToBeVisible(privacyPolicyOption,5,webDriver);
        return privacyPolicyOption;
    }

    public WebElement getTermsAndServiceOption() {
        DataHelperAndWait.waitToBeVisible(termsAndServiceOption,5,webDriver);
        return termsAndServiceOption;
    }

    public WebElement getInstagramIcon() {
        DataHelperAndWait.waitToBeVisible(instagramIcon,5,webDriver);
        return instagramIcon;
    }

    public WebElement getFacebookIcon() {
        DataHelperAndWait.waitToBeVisible(facebookIcon,5,webDriver);
        return facebookIcon;
    }

    public WebElement getTwitterIcon() {
        DataHelperAndWait.waitToBeVisible(twitterIcon,5,webDriver);
        return twitterIcon;
    }

    public WebElement getYoutubeIcon() {
        DataHelperAndWait.waitToBeVisible(youtubeIcon,5,webDriver);
        return youtubeIcon;
    }

    public WebElement getCopyright() {
        DataHelperAndWait.waitToBeVisible(copyright,5,webDriver);
        return copyright;
    }
    public List<WebElement> getMostSellingList() {
        return mostSellingList;
    }

    //Define the main actions we need to execute our TCs
    public void switchToAECountry() {
        try {
            DataHelperAndWait.isDisplayed(countryList, 3,webDriver);
            this.countryList.click();
            this.aeCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.isDisplayed(countryList, 1,webDriver);
            this.countryList.click();
            this.aeCountry.click();
        }
    }

    public void fillInemailFieldInNewsletterBlock(String email) {
        DataHelperAndWait.waitToBeVisible(this.emailFieldInNewsletterBlock, 3,webDriver);
        emailFieldInNewsletterBlock.sendKeys(email);
    }

    public void selectMaleOptionInNewsletterBlock() {
        DataHelperAndWait.waitToBeVisible(this.maleOptionInNewsletterBlock, 3,webDriver);
        maleOptionInNewsletterBlock.click();
    }

    public void selectFemaleOptionInNewsletterBlock() {
        DataHelperAndWait.waitToBeVisible(this.femaleOptionInNewsletterBlock, 3,webDriver);
        femaleOptionInNewsletterBlock.click();
    }

    public void clickOnJoinBtnInNewsletterBlock() {
        DataHelperAndWait.waitToBeVisible(this.joinBtnInNewsletterBlock, 3,webDriver);
        joinBtnInNewsletterBlock.click();
    }

    public String generateRandomEmail() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return "username" + randomInt + "@gmail.com";
    }
    public void navigateToHomePage(){webDriver.navigate().to(BaseURL);}
    public void clearEmailField(){
        DataHelperAndWait.waitToBeVisible(emailFieldInNewsletterBlock,5,webDriver);
        DataHelperAndWait.clearWebField(emailFieldInNewsletterBlock);
    }

}