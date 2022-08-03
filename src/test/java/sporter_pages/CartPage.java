package sporter_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private DataHelperAndWait dataHelperAndWait= new DataHelperAndWait();
    public CartPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }
    //declare all locators related to the Cart Page
    @FindBy(xpath= "//span/i")
    private WebElement itemsCounter;
    @FindBy(xpath="//div[@class='inconvenience-left']/p")
    private WebElement requestedQtyUnAvailableMsg;
    @FindBy(xpath="//button[text()='CONTINUE SHOPPING']")
    private WebElement continueShoppingBtn;
    @FindBy(xpath="//*[@id=\"shopping-cart-table\"]/tbody[1]/tr/td[1]/div/a/span[2]")
    private WebElement removeItem;
    @FindBy(xpath="//p[text()='You have no items in your shopping cart.']")
    private WebElement noItemInCartLabel;
    @FindBy(xpath="//a[text()='here']")
    private WebElement hereLink;
    @FindBy(xpath="//a[@class='decreaseQty btn-qty-control btn-qty-control--minus']")
    private WebElement decreseQtyBtn;
    @FindBy(xpath="//a[@class='increaseQty btn-qty-control btn-qty-control--plus']")
    private WebElement increaseQtyBtn;
    @FindBy(css = "div[class='input-box input-with-value input-active']:nth-child(n) input")
    private WebElement qtyField;
    //Getter Methods
    public WebElement getItemsCounterInCartPage() {return itemsCounter;}
    public WebElement getRequestedQtyUnAvailableMsg(){return requestedQtyUnAvailableMsg;}
    public WebElement getContinueShoppingBtn(){return continueShoppingBtn;}
    public WebElement getNoItemInCartLabel(){return noItemInCartLabel;}
    public WebElement getHereLink(){return hereLink;}
    public WebElement getDecreseQtyBtn(){return decreseQtyBtn;}
    public WebElement getIncreaseQtyBtn(){return increaseQtyBtn;}
    public WebElement getQtyField(){return qtyField;}
    //Define the main actions we need to execute our TCs
    public void clickOnTheContinueShoppingBtn() {
        DataHelperAndWait.isDisplayed(continueShoppingBtn, 10);
        this.continueShoppingBtn.click();
    }
    public void clickOnRemoveItem(){
        DataHelperAndWait.isDisplayed(removeItem,10);
        this.removeItem.click();
    }
    public void clickOnHereLink(){
       DataHelperAndWait.isDisplayed(hereLink , 10);
       this.hereLink.click();
    }
    public void clickOnDecreseQtyBtn(){
//        DataHelperAndWait.waitToBeClickable(decreseQtyBtn,15);
//        this.decreseQtyBtn.click();
        DataHelperAndWait.JsExecutorToClickOnElement(this.decreseQtyBtn);   }
    public void clickOnIecreseQtyBtn(){
        DataHelperAndWait.waitToBeClickable(increaseQtyBtn,10);
        this.increaseQtyBtn.click();
    }








    }









