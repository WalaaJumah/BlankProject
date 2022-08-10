package sporter_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecommendedProductsPage {
    public RecommendedProductsPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }
    //declare all locators related to the Cart Page
    @FindBy(xpath = "//a[@class='close-popup close-cart-popup']")
    private WebElement recommendedProductsCloseIcon;

    //Getter Methods

    //Define the main actions we need to execute our TCs
    public void clickOnRecommendedProductsCloseIcon(){
        DataHelperAndWait.waitToBeVisible(recommendedProductsCloseIcon,10);
        this.recommendedProductsCloseIcon.click();
    }
}
