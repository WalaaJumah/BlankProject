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
    //Getter Methods
    public WebElement getItemsCounterInCartPage() {return itemsCounter;}
    public WebElement getRequestedQtyUnAvailableMsg(){return requestedQtyUnAvailableMsg;}










}
