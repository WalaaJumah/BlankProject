/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class is to make sure ability to switch between the stores correctly
 */

package sporter_pages;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessAllStoresCountriesPage extends BasePage {
    public AccessAllStoresCountriesPage( WebDriver webDriver ){
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(id = "switcher-store-trigger")
    private WebElement countryList;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='BH']")
    private WebElement bahrainCountry;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='EG']")
    private WebElement egyptCountry;

    @FindBy(xpath = "//li[@class='country_switch']/span[@class='KW']")
    private WebElement kuwaitCountry;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='OM']")
    private WebElement omanCountry;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='US']")
    private WebElement internationalCountry;
    @FindBy(xpath = "//div[@id='form-language']//label[@for='arabic']")
    private WebElement arabicLanguageBtn;
    @FindBy(xpath = "//div[@id='form-language']//label[@for='english']")
    private WebElement englishLanguageBtn;


//Getter Methods
public WebElement getArabicLanguageBtn() {
    DataHelperAndWait.waitToBeVisible(arabicLanguageBtn,6,webDriver);
    return arabicLanguageBtn;
}

    public WebElement getEnglishLanguageBtn() {
        DataHelperAndWait.waitToBeVisible(englishLanguageBtn,6,webDriver);
        return englishLanguageBtn;
    }
    //Main actions
    public void switchToBahrainCountryCountry(  ) {
        try {
            DataHelperAndWait.isDisplayed(countryList, 5,webDriver);
            this.countryList.click();
            this.bahrainCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.isDisplayed(countryList, 5,webDriver);
            this.countryList.click();
            this.bahrainCountry.click();
        }
    }
       public void switchToEgyptCountryCountry(  ) {
        try {
            DataHelperAndWait.isDisplayed(countryList, 5,webDriver);
            this.countryList.click();
            this.egyptCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.isDisplayed(countryList, 5,webDriver);
            this.countryList.click();
            this.egyptCountry.click();
        }
    }
       public void switchToKuwaitCountryCountry(  ) {
        try {
            DataHelperAndWait.isDisplayed(countryList, 5,webDriver);
            this.countryList.click();
            this.kuwaitCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.isDisplayed(countryList, 5,webDriver);
            this.countryList.click();
            this.kuwaitCountry.click();
        }
    }
       public void switchToOmanCountryCountry(  ) {
        try {
            DataHelperAndWait.isDisplayed(countryList, 5,webDriver);
            this.countryList.click();
            this.omanCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.isDisplayed(countryList, 5,webDriver);
            this.countryList.click();
            this.omanCountry.click();
        }
    }
       public void switchToInternationalCountryCountry(  ) {
        try {
            DataHelperAndWait.isDisplayed(countryList, 5,webDriver);
            this.countryList.click();
            this.internationalCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.isDisplayed(countryList, 5,webDriver);
            this.countryList.click();
            this.internationalCountry.click();
        }
    }






}
