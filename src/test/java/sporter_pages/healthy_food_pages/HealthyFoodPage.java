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

import java.io.IOException;

@Getter
public class HealthyFoodPage extends BasePage {
    public HealthyFoodPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void clickOnHealthyFoodMainMenu() throws IOException {
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        DataHelperAndWait.waitToBeVisible(megaMenuPage.getHealthyFoodMenu(), webDriver);
//        actions.moveToElement(megaMenuPage.getHealthyFoodMenu()).click().perform();
        DataHelperAndWait.waitForTime(1500);
        DataHelperAndWait.clickOnElement(megaMenuPage.getHealthyFoodMenu(), webDriver);
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
//        DataHelperAndWait.waitToBeVisible(megaMenuPage.getSportsSupplementsMenu(),webDriver);
//        actions.moveToElement(megaMenuPage.getSportsSupplementsMenu()).perform();
//        DataHelperAndWait.clickOnElement(megaMenuPage.getSportsSupplementsMenu(),webDriver);
    }

    public void clickOnHealthyFoodFromShopByMenu() throws IOException {
        Actions actions = new Actions(webDriver);
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        try {
            DataHelperAndWait.waitToBeVisible(megaMenuPage.getShopByMenu(), webDriver);
            actions.moveToElement(megaMenuPage.getShopByMenu()).perform();
            DataHelperAndWait.clickOnElement(megaMenuPage.getHealthyFoodMenuFromShopBy(), webDriver);
            megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeVisible(megaMenuPage.getShopByMenu(), webDriver);
            actions.moveToElement(megaMenuPage.getShopByMenu()).perform();
            DataHelperAndWait.waitForTime(1500);
            DataHelperAndWait.clickOnElement(megaMenuPage.getHealthyFoodMenuFromShopBy(), webDriver);
            megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        }
    }

    public void navigateToHealthyFoodPage() throws IOException {
        webDriver.navigate().to(BaseURL + healthyFoodsUrl);
        verifyTheDisplayedPageDoesNotHaveErrors();
        DataHelperAndWait.waitForUrlContains(healthyFoodsUrl, webDriver);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
}
