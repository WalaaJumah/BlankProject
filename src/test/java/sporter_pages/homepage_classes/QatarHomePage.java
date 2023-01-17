package sporter_pages.homepage_classes;

import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
@Getter
public class QatarHomePage extends HomePage {

    public QatarHomePage( WebDriver webDriver ){
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public final String qatarDomain = "/en-qa";

    @FindBy(xpath ="//ul[@class='dropdown switcher-dropdown']/li[8]" )
    private WebElement qatarCountry;

}