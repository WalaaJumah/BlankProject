/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.sportsSupplementsCategoryPages;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class SportsSupplementsCategoryPage extends BasePage {
    public SportsSupplementsCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(id = "TopCategoryItem_3_span")
    private WebElement sportsSupplementManinMenuInMegaMenu;
    @FindBy(id = "TopCategoryItem_undefined")
    private WebElement shopByMenu;
      @FindBy(id = "SortItem_Sports Supplements_span")
    private WebElement sportsSupplementOptionFromShopBy;
      //TODO: The banners are missing from the site
      @FindBy(id="missing")
      private List<WebElement> mainBanners;
       @FindBy(id="missing")
      private WebElement mainBannersSection;

      @FindBy(id = "pathSegment_0")
      private WebElement homePageBreadCrumb;
      //TODO: Make sure to add id for each result label & it's value
    @FindBy(id="test")
    private WebElement resultLabel;
   @FindBy(id="test")
    private WebElement searchResultValue;
   //TODO: SortBy Needs to ID
   @FindBy(id="test")
   private WebElement SortByMenu;
   @FindBy(id="test")
   private WebElement maninImage;
   @FindBy(id="footer_container")
   private WebElement mainFooter;
@FindBy(id="NewsLetter_container")
private WebElement newsLetterSection;
    public void clickOnSportsSupplementMainMenu(){
        Actions actions= new Actions(webDriver);
        DataHelperAndWait.waitToBeVisible(this.sportsSupplementManinMenuInMegaMenu,webDriver);
        actions.moveToElement(this.sportsSupplementManinMenuInMegaMenu).perform();
        DataHelperAndWait.clickOnElement(this.sportsSupplementManinMenuInMegaMenu,webDriver);
    }
    public void clickOnSportsSupplementFromShopByMenu(){
        Actions actions= new Actions(webDriver);
        DataHelperAndWait.waitToBeVisible(this.shopByMenu,webDriver);
        actions.moveToElement(this.shopByMenu).perform();
        DataHelperAndWait.clickOnElement(this.sportsSupplementOptionFromShopBy,webDriver);
    }
    public void navigateToSportsSupplementPage(){
        webDriver.navigate().to(BaseURL+sportSupplementsUrl);
        DataHelperAndWait.waitForUrlContains(sportSupplementsUrl,webDriver);
    }
}
