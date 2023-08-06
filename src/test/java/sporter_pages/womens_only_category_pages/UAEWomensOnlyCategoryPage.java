/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_pages.womens_only_category_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.vitamins_and_health_category_pages.VitaminsAndHealthCategoryPage;

public class UAEWomensOnlyCategoryPage extends WomensOnlyCategoryPage {
    public UAEWomensOnlyCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
