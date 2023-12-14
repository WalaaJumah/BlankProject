/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.vitamins_and_health_category_pages;

import core.WebElementsAssertion;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

@Getter
public class JordanVitaminsAndHealthCategoryPage extends VitaminsAndHealthCategoryPage {
    public JordanVitaminsAndHealthCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(id = "Swiper_10")
    private WebElement melatoninSection;
    @FindBy(id = "Swiper_10")
    private WebElement collagenSection;
}
