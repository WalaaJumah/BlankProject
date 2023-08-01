package sporter_pages.homepage_classes;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class QatarHomePage extends HomePage {

    public final String qatarDomain = "/en-qa";
//    @FindBy(xpath = "(//li[@class='countryItem_container__StFb3']/a)[8]")
@FindBy(xpath = "//li[@id='CountryItem_QA']/a")
    private WebElement qatarCountry;

    public QatarHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

}