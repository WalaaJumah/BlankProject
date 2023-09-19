package sporter_pages.homepage_classes;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Getter
public class IraqHomePage extends HomePage {
    @FindBy(xpath = "//li[@id='CountryItem_IQ']")
    private WebElement iraqCountry;

    public IraqHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
