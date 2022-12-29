/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class make sure all pages related to the Brand pages from search screen works fine
 */

package sporter_pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AeBrandsPage extends BasePage {
    public AeBrandsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    //declare all locators related to the Brands Page

    //Getter Methods

}