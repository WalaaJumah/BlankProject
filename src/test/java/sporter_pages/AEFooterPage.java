package sporter_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class AEFooterPage {
    public AEFooterPage(WebDriver webDriver) {PageFactory.initElements(webDriver, this);}
    //declare all locators related to the Cart Page
    @FindBy(id = "switcher-store-trigger")
    private WebElement countryList;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='AE']")
    private WebElement aeCountry;
    @FindBy(xpath="//footer[@class='page-footer']")
    private WebElement footerSection;
    @FindBy(xpath = "//div[@class='container']/ul[@class='clearfix']")
    private List<WebElement> pageBottomBlocksList;
    @FindBy(xpath="//div[@class='block-footer-top']")
    private WebElement pageBottomSection;
    @FindBy(xpath="//em[@class='fas fa-unlock']/following-sibling::h3")
    private WebElement securePaymentTitle;
    @FindBy(xpath="//em[@class='fas fa-unlock']/following-sibling::span")
    private WebElement securePaymentDescription;
    @FindBy(xpath="//em[@class='fas fa-truck']/following-sibling::span")
    private WebElement fastDeliveryDescription;
    @FindBy(xpath="//em[@class='fas fa-truck']/following-sibling::h3")
    private WebElement fastDeliveryTitle;
    @FindBy(xpath="//div[2]/div/div/div/ul/li[2]/*/h3")
    private WebElement authenticProductsTitle;
    @FindBy(xpath="//div[2]/div/div/div/ul/li[2]/*/span")
    private WebElement authenticProductsDescription;
    @FindBy(xpath="//div[@class='block newsletter']")
    private WebElement newsletterBlock;
    @FindBy(xpath="//input[@id='newsletter']")
    private WebElement emailFieldInNewsletterBlock;
    @FindBy(xpath="//label[@for='newsletter_male']")
    private WebElement maleOptionInNewsletterBlock;
    @FindBy(xpath="//label[@for='newsletter_female']")
    private WebElement femaleOptionInNewsletterBlock;
    @FindBy(xpath="//button[@class='action subscribe primary']")
    private WebElement joinBtnInNewsletterBlock;
    @FindBy(xpath="//div[@for='newsletter']")
    private WebElement emailRequiredMsgInNewsletterSection;
    @FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    private WebElement subscriptionSuccessfulMsg;
    @FindBy(xpath="(//div[@class='footer-column'])[1]/span")
    private WebElement ordersAndShippingHeader;
    @FindBy(xpath="(//div[@class='footer-column'])[2]/span")
    private WebElement letUsHelpYouHeader;
    @FindBy(xpath="(//div[@class='footer-column'])[3]/span")
    private WebElement mostSellingProductsHeader;
    @FindBy(xpath="(//div[@class='footer-column'])[4]/span")
    private WebElement getToKnowUsHeader;
    @FindBy(xpath="(//div[@class='footer-column'])[5]/span")
    private WebElement contactUsHeader;
    @FindBy(xpath="(//div[@class='footer-column 3'])[1]/span")
    private WebElement accessoriesAndApparelHeader;
    @FindBy(xpath="(//div[@class='footer-column 1'])[1]/span")
    private WebElement proteinAndFitnessHeader;
    @FindBy(xpath="(//div[@class='footer-column 3'])[1]/ul/li[1]/a")
    private WebElement trainingApparelOption;
    @FindBy(xpath="(//div[@class='footer-column 3'])[1]/ul/li[2]/a")
    private WebElement fitnessAccessoriesOption;
    @FindBy(xpath="(//div[@class='footer-column 3'])[1]/ul/li[3]/a")
    private WebElement shakersOption;
    @FindBy(xpath="(//div[@class='footer-column 3'])[1]/ul/li[4]/a")
    private WebElement homeGymEquipmentOption;
    @FindBy(xpath="(//div[@class='footer-column 3'])[1]/ul/li[5]/a")
    private WebElement watchesOption;
    @FindBy(xpath="(//div[@class='footer-column 3'])[1]/ul/li[6]/a")
    private WebElement strapsOption;
    @FindBy(xpath="(//div[@class='footer-column 1'])[1]/ul/li[1]/a")
    private WebElement wheyProteinOption;
    @FindBy(xpath="(//div[@class='footer-column 1'])[1]/ul/li[2]/a")
    private WebElement wheyProteinIsolateOption;
    @FindBy(xpath="(//div[@class='footer-column 1'])[1]/ul/li[3]/a")
    private WebElement caseinProteinOption;
    @FindBy(xpath="(//div[@class='footer-column 1'])[1]/ul/li[4]/a")
    private WebElement weightGainAndMassGainerOption;
    @FindBy(xpath="(//div[@class='footer-column 1'])[1]/ul/li[5]/a")
    private WebElement bCAAsAndAminoAcidsOption;
    @FindBy(xpath="(//div[@class='footer-column 1'])[1]/ul/li[6]/a")
    private WebElement preWorkoutAndEnduranceOption;
    @FindBy(xpath="(//div[@class='footer-column 1'])[1]/ul/li[7]/a")
    private WebElement glutamineAndRecoveryOption;
    @FindBy(xpath="(//div[@class='footer-column 1'])[1]/ul/li[8]/a")
    private WebElement fatBurnersOption;
    @FindBy(xpath="(//div[@class='footer-column 1'])[1]/ul/li[9]/a")
    private WebElement proteinBarsOption;
    @FindBy(xpath="(//div[@class='footer-column 1'])[1]/ul/li[10]/a")
    private WebElement healthySnacksOption;
    @FindBy(xpath="(//div[@class='footer-column 3'])[1]/ul/li[7]/a")
    private WebElement bagsOption;
    @FindBy(xpath="(//ul[@class='footer-links'])[1]")
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
    public WebElement getMsgInfoEmpty() {return msgInfoEmpty;}
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
        return newsletterBlock;
    }

    public WebElement getEmailFieldInNewsletterBlock() {
        return emailFieldInNewsletterBlock;
    }

    public WebElement getFemaleOptionInNewsletterBlock() {
        return femaleOptionInNewsletterBlock;
    }
    public WebElement getMaleOptionInNewsletterBlock() {
        return maleOptionInNewsletterBlock;
    }
    public WebElement getWheyProteinOption() {return wheyProteinOption;}
    public WebElement getJoinBtnInNewsletterBlock() {
        return joinBtnInNewsletterBlock;
    }
    public WebElement getEmailRequiredMsgInNewsletterSection() {
        return emailRequiredMsgInNewsletterSection;
    }
    public WebElement getSubscriptionSuccessfulMsg() {
        return subscriptionSuccessfulMsg;
    }
    public WebElement getOrdersAndShippingHeader() {return ordersAndShippingHeader;}
    public WebElement getLetUsHelpYouHeader() {return letUsHelpYouHeader;}
    public WebElement getWowCustomerServiceOption() {return wowCustomerServiceOption;}
    public List<WebElement> getOrdersAndShippingList() {
        return ordersAndShippingList;
    }
    public WebElement getTrackYourOrderOption() {return trackYourOrderOption;}
    public WebElement getShippingAndDeliveryOption() {return shippingAndDeliveryOption;}
    public WebElement getRefundAndReturnsOption() {
        return refundAndReturns;
    }
    public WebElement getFooterSection() {return footerSection;}
    public WebElement getFAQsOption() {return fAQsOption;}
    public WebElement getMostSellingProductsHeader() {return mostSellingProductsHeader;}
    public WebElement getProteinAndFitnessHeader() {return proteinAndFitnessHeader;}
    public WebElement getGrenadeReloadProteinOatBarOption() {return grenadeReloadProteinOatBarOption;}
    public WebElement getDymatizeISO100ProteinOption() {return dymatizeISO100ProteinOption;}
    public WebElement getGrenadeCarbKillaProteinBarOption() {return grenadeCarbKillaProteinBarOption;}
    public WebElement getGrenadeCarbKillaProteinBarBoxOf12Option() {return grenadeCarbKillaProteinBarBoxOf12Option;}
    public WebElement getQuestNutritionBarsBox12Option() {return questNutritionBarsBox12Option;}
    public WebElement getGetToKnowUsHeader() {return getToKnowUsHeader;}
    public WebElement getAboutSporterOption() {return aboutSporterOption;}
    public WebElement getProductQualityOption() {return productQualityOption;}
    public WebElement getProductAuthenticityOption() {return productAuthenticityOption;}
    public WebElement getWholesaleOption() {return wholesaleOption;}
    public WebElement getCareersOption() {return careersOption;}
    public WebElement getSporterBlogOption() {return sporterBlogOption;}
    public WebElement getNotFoundPage() {return notFoundPage;}
    public WebElement getContactUsHeader() {return contactUsHeader;}
    public WebElement getContactInfoOption() {return contactInfoOption;}
    public WebElement getPhoneNumberLabelOption() {return phoneNumberLabelOption;}
    public WebElement getPhoneNumber() {return phoneNumber;}
    public WebElement getAddressLabel() {return addressLabel;}
    public WebElement getAddressValue() {return addressValue;}
    public WebElement getAccessoriesAndApparelHeader() {return accessoriesAndApparelHeader;}
    public WebElement getTrainingApparelOption() {return trainingApparelOption;}
    public WebElement getFitnessAccessoriesOption() {return fitnessAccessoriesOption;}
    public WebElement getShakersOption() {return shakersOption;}
    public WebElement getHomeGymEquipmentOption() {return homeGymEquipmentOption;}
    public WebElement getWatchesOption() {return watchesOption;}
    public WebElement getStrapsOption() {return strapsOption;}
    public WebElement getBagsOption() {return bagsOption;}
    public WebElement getWheyProteinIsolateOption() {return wheyProteinIsolateOption;}
    public WebElement getCaseinProteinOption() {return caseinProteinOption;}
    public WebElement getWeightGainAndMassGainerOption() {return weightGainAndMassGainerOption;}
    public WebElement getBCAAsAndAminoAcidsOption() {return bCAAsAndAminoAcidsOption;}
    public WebElement getPreWorkoutAndEnduranceOption() {return preWorkoutAndEnduranceOption;}
    public WebElement getGlutamineAndRecoveryOption() {return glutamineAndRecoveryOption;}
    public WebElement getFatBurnersOption() {return fatBurnersOption;}
    public WebElement getProteinBarsOption() {return proteinBarsOption;}
    public WebElement getHealthySnacksOption() {return healthySnacksOption;}

    //Define the main actions we need to execute our TCs
    public void switchToAECountry() {try{
        DataHelperAndWait.isDisplayed(countryList, 15);
        this.countryList.click();
        DataHelperAndWait.implicitWait(6);
        this.aeCountry.click();}
    catch(Exception e){
        DataHelperAndWait.isDisplayed(countryList, 15);
        this.countryList.click();
        DataHelperAndWait.implicitWait(6);
        this.aeCountry.click();
    }
    }
    public void fillInemailFieldInNewsletterBlock(String email){
        DataHelperAndWait.waitToBeVisible(this.emailFieldInNewsletterBlock,10);
        emailFieldInNewsletterBlock.sendKeys(email);
    }
    public void selectMaleOptionInNewsletterBlock(){
        DataHelperAndWait.waitToBeVisible(this.maleOptionInNewsletterBlock,10);
        maleOptionInNewsletterBlock.click();
    }
    public void selectFemaleOptionInNewsletterBlock(){
        DataHelperAndWait.waitToBeVisible(this.femaleOptionInNewsletterBlock,10);
        femaleOptionInNewsletterBlock.click();
    }

    public void clickOnJoinBtnInNewsletterBlock(){
        DataHelperAndWait.waitToBeVisible(this.joinBtnInNewsletterBlock,10);
        joinBtnInNewsletterBlock.click();
    }
    public String generateRandomEmail(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return "username"+ randomInt +"@gmail.com";
    }





























}
