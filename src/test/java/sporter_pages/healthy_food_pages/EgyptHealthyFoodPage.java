/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_pages.healthy_food_pages;

import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.megaMenuPages.MegaMenuPage;

@Getter
public class EgyptHealthyFoodPage extends HealthyFoodPage {

    @FindBy(xpath = "//ul/li[@id='menu_healthy-food_']/a")
    private WebElement healthyFoodMenu;

    public EgyptHealthyFoodPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void clickOnHealthyFoodMainMenu() {
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        DataHelperAndWait.waitToBeVisible(this.getHealthyFoodMenu(), webDriver);
//        actions.moveToElement(megaMenuPage.getHealthyFoodMenu()).click().perform();
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.clickOnElement(this.getHealthyFoodMenu(), webDriver);
//        DataHelperAndWait.waitToBeVisible(megaMenuPage.getSportsSupplementsMenu(),webDriver);
//        actions.moveToElement(megaMenuPage.getSportsSupplementsMenu()).perform();
//        DataHelperAndWait.clickOnElement(megaMenuPage.getSportsSupplementsMenu(),webDriver);
    }

}
