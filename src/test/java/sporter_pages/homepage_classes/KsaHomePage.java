package sporter_pages.homepage_classes;

import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class KsaHomePage extends HomePage {
    public final String saudiDomain = "/en-sa";
    DataHelperAndWait dataHelperAndWait;
    @FindBy(xpath = "(//li[@class='countryItem_container__StFb3']/a)[3]")
    private WebElement ksaCountry;
    public KsaHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }


}