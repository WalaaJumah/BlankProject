/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.sports_category_pages;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.megaMenuPages.MegaMenuPage;

public class SportsCategoryPage extends BasePage {
    public SportsCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }




    public void clickOnSportsMainMenu(){
        Actions actions= new Actions(webDriver);
        MegaMenuPage megaMenuPage= new MegaMenuPage(webDriver);
        DataHelperAndWait.waitToBeVisible(megaMenuPage.getSportsMainMenu(),webDriver);
        actions.moveToElement(megaMenuPage.getSportsMainMenu()).perform();
        DataHelperAndWait.clickOnElement(megaMenuPage.getSportsMainMenu(),webDriver);
    }
}
