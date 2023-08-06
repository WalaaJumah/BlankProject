/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.vitamins_and_health_category_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UAEVitaminsAndHealthCategoryPage extends VitaminsAndHealthCategoryPage {
    public UAEVitaminsAndHealthCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
