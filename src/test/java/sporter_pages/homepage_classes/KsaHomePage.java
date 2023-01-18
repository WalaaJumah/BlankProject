package sporter_pages.homepage_classes;

import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
@Getter
public class KsaHomePage extends HomePage {
    public KsaHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public final String saudiDomain = "/en-sa";

    DataHelperAndWait dataHelperAndWait;
    @FindBy(xpath ="//span[@id='symbol' and contains(text(),'SA')]" )
    private WebElement ksaCountry;





}