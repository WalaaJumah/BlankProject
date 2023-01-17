/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class is to make sure ability to switch between the stores correctly
 */

package sporter_pages;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
@Getter
public class AccessAllStoresCountriesPage extends BasePage {
    public AccessAllStoresCountriesPage( WebDriver webDriver ){
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "CountrySelector")
    private List<WebElement> countryList;
    @FindBy(id = "downArrow")
    private WebElement countryMenuIcon;
    @FindBy(id = "LangSelector")
    private WebElement LanguageBtn;



//Getter Methods
    //Main actions
    public void switchToBahrainCountryCountry(  ) {
        DataHelperAndWait.clickOnElement(countryList.get(4),webDriver);
    }
       public void switchToEgyptCountryCountry(  ) {
           DataHelperAndWait.clickOnElement(countryList.get(2),webDriver);
 }
       public void switchToKuwaitCountryCountry(  ) {
           DataHelperAndWait.clickOnElement(countryList.get(6),webDriver);

    }
       public void switchToOmanCountryCountry(  ) {
           DataHelperAndWait.clickOnElement(countryList.get(7),webDriver);
    }
       public void switchToInternationalCountryCountry(  ) {
           DataHelperAndWait.clickOnElement(countryList.get(10),webDriver);
    }
}