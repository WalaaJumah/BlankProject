package sporter_pages;

import core.SeleniumWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static core.BaseTest.webDriver;

public class ProductDetailsPage {
    private SeleniumWait wait= new SeleniumWait();

    public ProductDetailsPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id= "qty")
    public WebElement quantityField;

    @FindBy(xpath= "//*[@id=\"maincontent\"]/div[3]/div/div[1]/div[3]/div[2]/div/div/div[1]/div/div/a[2]")
    private WebElement qtyPlusButton;

    @FindBy(xpath= "//*[@id=\"maincontent\"]/div[3]/div/div[1]/div[3]/div[2]/div/div/div[1]/div/div/a[1]")
    private WebElement qtyMinusButton;
    @FindBy(id= "product-addtocart-button")
    private WebElement addToCartBtn;
    @FindBy(xpath= "//*[@id=\"popup-block\"]")
    private WebElement cartPopUp;
        @FindBy(xpath= "/html/body/div[5]/div/div[2]/a[1]")
    private WebElement keepShippingBtn;
    @FindBy(xpath= "//body/div[6]/div[1]/div[2]/a[2]")
    private WebElement viewCartBtn;
    @FindBy(id= "option-label-size-165-item-10037")
    private WebElement productAttrubuit;
    @FindBy(id="option-label-flavor-164-item-6939" )
    private WebElement productFlavor;
    @FindBy(xpath= "//*[@id=\"algolia-searchbox\"]/button")
    private WebElement searchBtn;
    @FindBy(xpath="//*[@id=\"instant-search-results-container\"]/div/div/ol/li[1]/div/div/a" )
    private WebElement productCard;
    @FindBy(xpath= "//*[@id=\"switcher-store-trigger\"]/a/strong")
    private WebElement countryList;
    @FindBy(xpath= "//*[@id=\"switcher-store\"]/div/ul/li[1]/span[2]")
    private WebElement aeCountry;
    @FindBy(xpath= "//*[@id=\"switcher-store\"]/div/ul/li[8]/span[2]")
    private WebElement leCountry;
    @FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/a[1]/picture/img")
    private WebElement firstProductInHomePage;
    @FindBy(xpath= "//body/div[2]/main[1]/div[3]/div[1]/div[6]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    private WebElement productInHomePage;

    @FindBy(id="Overall Evaluation_1_label")
    private WebElement oneStarReview;

    @FindBy(className = "button button-review orange-btn")
    private WebElement addReviewButton;

    @FindBy(id="review_field")
    private WebElement reviewDescField;

    @FindBy(id="summary_field")
    private WebElement reviewSummaryField;

    @FindBy(id="nickname_field")
    private WebElement nickeNameField;

    @FindBy(xpath= "//span[contains(text(),'Submit Review')]")
     private WebElement submitReviewButton;
    @FindBy(id="ratings[2]-error")
    public WebElement reviewErrorMsg;
    @FindBy(xpath= "//div[contains(text(),'You submitted your review for moderation.')]")
    public WebElement reviewToastMsg;


    @FindBy(xpath = "//a[normalize-space()='Home']")
    private WebElement HomeBreadcrumbs;

    @FindBy(id="arabic")
    private WebElement arabicLangBtn;

    @FindBy(id="english")
    public WebElement englishLangBtn;



    SeleniumWait seleniumWait= new SeleniumWait();

    //Define the main actions we need to execute our TCs
    public void clickOnTheProductAttrubuits() {
        SeleniumWait.isDisplayed(productAttrubuit,5);
        this.productAttrubuit.click();
        this.productFlavor.click();
    }
    public void addToCart() {
        seleniumWait.waitToBeClickable(addToCartBtn,20);
        this.addToCartBtn.click();
    }
    public void keepShopping() {
        this.cartPopUp.click();
        wait.implicitWait(5);
        this.keepShippingBtn.click();
    }
    public void viewCart() {
       //seleniumWait.waitToBeClickable(cartPopUp,10);
        this.cartPopUp.click();
        seleniumWait.implicitWait(10);
      this.viewCartBtn.click();
    }

    public void searchForTheProduct() {
        seleniumWait.waitToBeClickable(searchBtn,5);
        this.searchBtn.click();	  }

    public void clickOnTheProductCard() {
wait.implicitWait(20);
this.productCard.click();
    }
    public void switchCountry() {
        wait.implicitWait(5);
        this.countryList.click();
        wait.implicitWait(10);
        this.aeCountry.click();
    }
    public void switchToLebanonCountry() {
        wait.implicitWait(10);
        this.countryList.click();
        this.aeCountry.click();
    }
    public void clickOnProductQuantity(){
        this.quantityField.click();
    }
    public void increaseTheQuantity(){
        this.quantityField.click();
        this.qtyPlusButton.click();
    }
    public void decreaseTheQuantity(){
        this.quantityField.click();
        this.qtyMinusButton.click();
    }
    public void clickOnProductInHomePage() {
        this.productInHomePage.click();
    }
    public void selectStarInReview(){
        this.oneStarReview.click();
    }
    public void  submitProductReview(String reviewDesc, String reviewSummary, String nickeName){
    this.addReviewButton.click();
        this.reviewDescField.sendKeys(reviewDesc);
        this.reviewSummaryField.sendKeys(reviewSummary);
        this.nickeNameField.sendKeys(nickeName);
        this.submitReviewButton.click();
    }
    public void clickOnBreadcrumbHomePage(){this.HomeBreadcrumbs.click();}
    public void switchToArabicVersion(){this.arabicLangBtn.click();}
    public void switchCountryThenAddProductToCart(){
        this.switchCountry();
        wait.implicitWait(20);
        this.clickOnProductInHomePage();
        this.addToCart();
        wait.implicitWait(20);
    }

}
