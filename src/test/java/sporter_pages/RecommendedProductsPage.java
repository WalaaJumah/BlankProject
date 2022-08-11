package sporter_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.html.CSS;
import javax.xml.xpath.XPath;

public class RecommendedProductsPage {
    public RecommendedProductsPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }
    //declare all locators related to the Cart Page
    @FindBy(xpath = "//a[@class='close-popup close-cart-popup']")
    private WebElement recommendedProductsCloseIcon;
    @FindBy(xpath="//h2/i[1]")
    private WebElement circleIcon;
    @FindBy(xpath="//h2[normalize-space()='Thumbs Up']")
    private WebElement thumbsUpTitle;
    @FindBy(xpath="//*[@id='popup-block']/p")
    private WebElement addedProductToCartMsg;
    @FindBy(xpath="//*[@class='prod-img']")
    private WebElement productImages;
    @FindBy(xpath="//div[@class='item-price']")
    private WebElement productPrice;
    @FindBy(css="div[id='popup-block'] h2:nth-child(1)")
    private WebElement recommendedProductsTitle;
    @FindBy(xpath = "//div[@class='cart-button']")
    private WebElement addToCartBtns;
    @FindBy(xpath="//div[3]/div/div/div[2]/div[2]/button")
    private WebElement addToCart;

    //Getter Methods
    public WebElement getCircleIcon(){return circleIcon;}
    public WebElement getThumbsUpTitle(){return thumbsUpTitle;}
    public WebElement getAddedProductToCartMsg(){return addedProductToCartMsg;}
    public WebElement getRecommendedProductsTitle(){return recommendedProductsTitle;}
    public WebElement getProductPrice(){return productPrice;}
    public WebElement getProductImages(){return productImages;}
    public WebElement getAddToCartBtns(){return addToCartBtns;}
    //Define the main actions we need to execute our TCs
    public void clickOnRecommendedProductsCloseIcon(){
        DataHelperAndWait.waitToBeVisible(recommendedProductsCloseIcon,10);
        this.recommendedProductsCloseIcon.click();
    }    public void clickOnAddToCart(){
        DataHelperAndWait.waitToBeVisible(addToCart,10);
        this.addToCart.click();
    }
}
