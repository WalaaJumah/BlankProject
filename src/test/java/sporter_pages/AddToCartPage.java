package sporter_pages;

import core.SeleniumWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;


import java.util.ArrayList;
import java.util.List;

import static core.BaseTest.webDriver;

public class AddToCartPage {
    public AddToCartPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath= "//*[@id=\"algolia-searchbox\"]/button")
    private WebElement searchBtn;
    @FindBy(xpath="//*[@id=\"instant-search-results-container\"]/div/div/ol/li[1]/div/div/a" )
    private WebElement productCard;

    @FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div[3]/ul/li[1]/button" )
    private WebElement proceedToCheckOutBtn;

    @FindBy(xpath= "//*[@id=\"checkout_step_col1_col2\"]/div[2]/div/button")
    private WebElement guestCheckoutBtn;

    @FindBy(xpath= "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/dl[1]/dd[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    private WebElement firstNameField;
    @FindBy(xpath= "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/dl[1]/dd[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    private WebElement lastNameField;
    @FindBy(xpath= "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/dl[1]/dd[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    private WebElement emailField;
    @FindBy(xpath= "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/dl[1]/dd[2]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
    private WebElement phoneField;
    @FindBy(xpath= "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/dl[1]/dd[2]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/select[1]")
    private WebElement countryField;

    @FindBy(xpath= "/html/body/div[2]/main/div[2]/div/div[2]/div[3]/dl/dd[2]/div/div/form/div/div[7]/div/div/span/span[1]/span/span[1]")
    private WebElement cityField;

    @FindBy(xpath= "/html/body/span/span/span[1]/input")
    private WebElement CityFieldSearch;

    @FindBy(xpath="/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/dl[1]/dd[2]/div[1]/div[1]/form[1]/div[1]/div[8]/div[1]/div[1]/input[1]")
    private WebElement addressField;
    @FindBy(xpath="/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/dl[1]/dd[2]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    private WebElement addressLineTwoField;
    @FindBy(xpath= "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/dl[1]/dd[2]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    private WebElement addressLineOneField;
    @FindBy(xpath= "//*[@id=\"shipping\"]/button")
    private WebElement countinueBtn;

    @FindBy(xpath= "/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]")
    private WebElement cityMenu;

    @FindBy(xpath= "//*[@id=\"shipping-method-buttons-container\"]/div/button")
    private WebElement ContinueBtnInShippingPage;

    @FindBy(xpath= "//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[1]/label")
    private WebElement paymentOnDelivery;

    @FindBy(xpath= "//*[@id=\"checkoutcom_card_payment_container\"]/div[1]/label")
    private WebElement creditCard;

    @FindBy(xpath = "//*[@id=\"payment\"]/button")
     private WebElement continueBtnInPayemntPage;

    @FindBy(xpath="/html[1]/body[1]/div[3]/main[1]/div[2]/div[1]/div[2]/div[3]/dl[1]/dd[5]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/button[1]")
    private WebElement placeOrderBtn;

    Select citymenu= new Select(webDriver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[3]/dl/dd[2]/div/div/form/div/div[7]/div/div/span/span[1]/span/span[1]")));


    SeleniumWait seleniumWait= new SeleniumWait();;

    public void clickOnSearchBtn() {
        seleniumWait.waitToBeClickable(searchBtn,5);
        this.searchBtn.click();
        seleniumWait.waitToBeClickable(productCard,5);
        this.productCard.click();
    }
    public void clickOnSearchResult() {
        seleniumWait.waitToBeClickable(productCard,5);
        this.productCard.click();
    }
    public void clickOnProceedToCheckOutButton() {
        seleniumWait.waitToBeClickable(proceedToCheckOutBtn,5);
        this.proceedToCheckOutBtn.click();
    }
    public void clickOnGuestCheckoutBtn() {
        seleniumWait.waitToBeClickable(guestCheckoutBtn,5);
        this.guestCheckoutBtn.click();}

public void fillShippingInformation(){
        this.firstNameField.sendKeys("Walaa");
        this.lastNameField.sendKeys("Mohammad");
        this.emailField.sendKeys("guest@user.com");
        this.phoneField.sendKeys("123456789");
        this.addressField.sendKeys("Address");
        this.addressLineOneField.sendKeys("Ali Street");
        this.addressLineTwoField.sendKeys("Ali Street2");
        this.cityField.click();
        seleniumWait.implicitWait(10);
       // this.CityFieldSearch.sendKeys("Dubai");
       this.citymenu.selectByIndex(1);




        seleniumWait.implicitWait(10);
        this.countinueBtn.click();
}
public void clickOnContinueBtnInShippingPage(){
        this.ContinueBtnInShippingPage.click();
}
public void selectPaymentOnDelivery(){
        this.paymentOnDelivery.click();
}
    public void selectCreditCard(){
      this.creditCard.click();
    }

    public void clickOncontinueBtnInPayemntPage(){
        this.continueBtnInPayemntPage.click();
    }
    public void clickOnPlaceOrderButton(){
        this.placeOrderBtn.click();
    }
}


