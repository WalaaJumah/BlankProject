/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_pages.megaMenuPages;

import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Getter
public class EgyptMegaMenuPage extends MegaMenuPage {

    @FindBy(xpath = "//li[@id='cat_618']/a")
    private WebElement healthyFoodMenu;

    @FindBy(xpath = "//ul/li[@id='cat_686']/a")
    private WebElement vitaminsAndHealthMenu;
    public EgyptMegaMenuPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public void clickOnVitaminsAndHealthMainMenu() {
        Actions actions = new Actions(webDriver);
        try {
            DataHelperAndWait.waitToBeVisible(this.vitaminsAndHealthMenu, webDriver);
            actions.moveToElement(this.vitaminsAndHealthMenu).perform();
            DataHelperAndWait.clickOnElement(this.vitaminsAndHealthMenu, webDriver);
        } catch (Exception e) {
            DataHelperAndWait.waitToBeVisible(this.vitaminsAndHealthMenu, webDriver);
            actions.moveToElement(this.vitaminsAndHealthMenu).perform();
            DataHelperAndWait.clickOnElement(this.vitaminsAndHealthMenu, webDriver);
        }
    }
    public void clickOnVitaminsAndHealthFromShopByMenu() {
        Actions actions = new Actions(webDriver);
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        try {
            DataHelperAndWait.waitToBeVisible(this.getShopByMenu(), webDriver);
            actions.moveToElement(this.getShopByMenu()).perform();
            DataHelperAndWait.waitToBeVisible(this.getVitaminsAndHealthMenu(), webDriver);
        } catch (Exception e) {
            DataHelperAndWait.waitToBeVisible(this.getShopByMenu(), webDriver);
            actions.moveToElement(this.getShopByMenu()).perform();
            DataHelperAndWait.waitToBeVisible(this.getVitaminsAndHealthMenu(), webDriver);
        }
    }

    public void clickOnHealthyFoodMainMenu() {
        Actions actions = new Actions(webDriver);
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        EgyptMegaMenuPage egyptMegaMenuPage = new EgyptMegaMenuPage(webDriver);
        DataHelperAndWait.waitToBeVisible(egyptMegaMenuPage.getHealthyFoodMenu(), webDriver);
        actions.moveToElement(egyptMegaMenuPage.getHealthyFoodMenu()).perform();
//        actions.moveToElement(megaMenuPage.getHealthyFoodMenu()).click().perform();
        DataHelperAndWait.clickOnElement(egyptMegaMenuPage.getHealthyFoodMenu(), webDriver);
//        DataHelperAndWait.waitToBeVisible(megaMenuPage.getSportsSupplementsMenu(),webDriver);
//        actions.moveToElement(megaMenuPage.getSportsSupplementsMenu()).perform();
//        DataHelperAndWait.clickOnElement(megaMenuPage.getSportsSupplementsMenu(),webDriver);
    }
}
