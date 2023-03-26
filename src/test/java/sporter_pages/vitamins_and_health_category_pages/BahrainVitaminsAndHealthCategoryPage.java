/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.vitamins_and_health_category_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.sportsSupplementsCategoryPages.SportsSupplementsCategoryPage;

public class BahrainVitaminsAndHealthCategoryPage extends VitaminsAndHealthCategoryPage {
    public BahrainVitaminsAndHealthCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
