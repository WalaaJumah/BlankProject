/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_pages.healthy_food_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EgyptHealthyFoodPage extends HealthyFoodPage {
    public EgyptHealthyFoodPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
