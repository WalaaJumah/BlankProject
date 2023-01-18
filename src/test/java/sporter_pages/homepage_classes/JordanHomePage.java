/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription Jordan HomePage
 */

package sporter_pages.homepage_classes;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Getter
public class JordanHomePage extends HomePage {
    public JordanHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    @FindBy(xpath ="//span[@id='symbol' and contains(text(),'JO')] " )
    private WebElement jordanCountry;
}
