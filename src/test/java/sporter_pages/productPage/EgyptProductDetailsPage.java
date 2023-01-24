/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptProductDetailsPage
 */

package sporter_pages.productPage;

import core.WebElementsAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.homepage_classes.HomePage;

public class EgyptProductDetailsPage extends ProductDetailsPage {
    public EgyptProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    public void displayTheProduct() {
        webDriver.navigate().to(BaseURL + egyptDomain + productUrl);
        WebElementsAssertion.validateTheCurrentUrlContainsString(productUrl,webDriver);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
}
