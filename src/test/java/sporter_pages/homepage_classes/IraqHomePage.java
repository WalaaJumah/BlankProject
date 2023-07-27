package sporter_pages.homepage_classes;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Getter
public class IraqHomePage extends HomePage {
    @FindBy(xpath = "(//li[@class='countryItem_container__StFb3']/a)[10]")
    private WebElement iraqCountry;

    public IraqHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
