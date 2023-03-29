/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_pages.healthy_food_pages;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.megaMenuPages.MegaMenuPage;

@Getter
public class HealthyFoodPage extends BasePage {
    public HealthyFoodPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void clickOnHealthyFoodMainMenu() {
        Actions actions = new Actions(webDriver);
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        DataHelperAndWait.waitToBeVisible(megaMenuPage.getHealthyFoodMenu(), webDriver);
//        actions.moveToElement(megaMenuPage.getHealthyFoodMenu()).click().perform();
        DataHelperAndWait.waitForTime(1500);
        DataHelperAndWait.clickOnElement(megaMenuPage.getHealthyFoodMenu(), webDriver);
//        DataHelperAndWait.waitToBeVisible(megaMenuPage.getSportsSupplementsMenu(),webDriver);
//        actions.moveToElement(megaMenuPage.getSportsSupplementsMenu()).perform();
//        DataHelperAndWait.clickOnElement(megaMenuPage.getSportsSupplementsMenu(),webDriver);
    }

    public void clickOnHealthyFoodFromShopByMenu() {
        Actions actions = new Actions(webDriver);
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        try {
            DataHelperAndWait.waitToBeVisible(megaMenuPage.getShopByMenu(), webDriver);
            actions.moveToElement(megaMenuPage.getShopByMenu()).perform();
            DataHelperAndWait.clickOnElement(megaMenuPage.getHealthyFoodMenuFromShopBy(), webDriver);
        } catch (Exception e) {
            DataHelperAndWait.waitToBeVisible(megaMenuPage.getShopByMenu(), webDriver);
            actions.moveToElement(megaMenuPage.getShopByMenu()).perform();
            DataHelperAndWait.clickOnElement(megaMenuPage.getHealthyFoodMenuFromShopBy(), webDriver);
        }
    }

    public void navigateToHealthyFoodPage() {
        webDriver.navigate().to(BaseURL + healthyFoodsUrl);
        DataHelperAndWait.waitForUrlContains(healthyFoodsUrl, webDriver);
    }
}
