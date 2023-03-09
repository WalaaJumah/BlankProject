/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.cartRulesPages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
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
}
