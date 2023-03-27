/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription HeaderSection
 */

package sporter_pages.headerSection;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class HeaderSection extends BasePage {
    public HeaderSection(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    DataHelperAndWait dataHelperAndWait;

    @FindBy(xpath ="(//div[@id='LangSelector']/a)[1]" )
    private WebElement languageSelector;
    @FindBy(xpath ="//div[@class='customer-service']" )
    private WebElement customerServiceLabel;
    @FindBy(xpath ="//div[@class='customer-service']/a" )
    private WebElement customerServicePhoneNumber;
    @FindBy(xpath="//ul[@id='TextSlider']/li/i")
    private List<WebElement> textSlider;
    @FindBy(id="DesktopTopPanel")
    private WebElement headerPanel;
    @FindBy(id="logo_link")
    private WebElement sporterLogo;
    @FindBy(id="SearchBar")
    private WebElement searchSection;
    @FindBy(id="UserIconContainer")
    private WebElement accountProfileIcon;
    @FindBy(id="CartIconContainer")
    private WebElement cartIcon;
    @FindBy(id="SearchButton")
    private WebElement searchBtn;
    @FindBy(id="searchInput")
    private WebElement searchField;
    @FindBy(xpath="//form[contains(@class,'SearchBox')]")
    private WebElement searchSectionForm;

    @FindBy(xpath = "//div[@id='CountrySelector']//ul/li/a")
    private List<WebElement> countryList;
    @FindBy(id = "downArrow")
    private WebElement countryMenuIcon;
    @FindBy(id = "LangSelector")
    private WebElement LanguageBtn;
        @FindBy(id = "cartPagelink")
    private WebElement viewCartLinkInCartPopUp;

}