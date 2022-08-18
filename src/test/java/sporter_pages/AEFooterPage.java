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
    @FindBy(xpath="(//ul[@class='footer-links'])[1]")
    private List<WebElement> ordersAndShippingList;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[1]/a")
    private WebElement trackYourOrderOption;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[2]/a")
    private WebElement shippingAndDeliveryOption;
    @FindBy(xpath = "(//li[@class='footer-links-item'])[3]/a")
    private WebElement refundAndReturns;
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
    public WebElement getJoinBtnInNewsletterBlock() {
        return joinBtnInNewsletterBlock;
    }
    public WebElement getEmailRequiredMsgInNewsletterSection() {
        return emailRequiredMsgInNewsletterSection;
    }
    public WebElement getSubscriptionSuccessfulMsg() {
        return subscriptionSuccessfulMsg;
    }
    public WebElement getOrdersAndShippingHeader() {
        return ordersAndShippingHeader;
    }
    public List<WebElement> getOrdersAndShippingList() {
        return ordersAndShippingList;
    }
    public WebElement getTrackYourOrderOption() {
        return trackYourOrderOption;
    }
    public WebElement getShippingAndDeliveryOption() {
        return shippingAndDeliveryOption;
    }
    public WebElement getRefundAndReturnsOption() {
        return refundAndReturns;
    }

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
