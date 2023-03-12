/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.cartRulesPages;

import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sporter_pages.cartPages.CartPage;
@Getter
public class CartRulesPage extends CartPage {
    public CartRulesPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public void clearCart()
    {
        CartPage cartPage= new CartPage(webDriver);
            this.navigateToCartPage();

                if (cartPage.getNoItemInCartLabel().isDisplayed()) {
                    System.out.println("");
                }

        else{
            cartPage.removeItem();
        }
    }
    private String removeItemBtn11="(//div[@id='removeItemBtn'])";
    public void clearAllItems(int productNumber) {
         String removeItemBtn1="(//div[@id='removeItemBtn'])";
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, 20);
        for(int i=1;i<=productNumber;i++){
            wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(By.xpath(removeItemBtn1+"["+i+"]")))).click();
            DataHelperAndWait.waitForTime(2000);
        }
        }
}
