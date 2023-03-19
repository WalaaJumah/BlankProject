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
import sporter_pages.megaMenuPages.MegaMenuPage;

import java.util.List;

@Getter
public class SportsSupplementsCategoryPage extends BasePage {
    public SportsSupplementsCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

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
   @FindBy(xpath="//*[@id=\"main\"]/div[1]/div[3]/div[2]/div[1]/div[1]/span[2]")
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
@FindBy(xpath="(//li[starts-with(@class,'pagination_arrow')])[1]")
private WebElement previousPageBtn;
@FindBy(xpath="(//li[starts-with(@class,'pagination_arrow')])[2]")
private WebElement nextPageBtn;
@FindBy(xpath="//ul[starts-with(@class,'pagination_innerPagination')]/li")
private List<WebElement> paginationBtns;

    public void clickOnSportsSupplementMainMenu(){
        Actions actions= new Actions(webDriver);
        MegaMenuPage megaMenuPage= new MegaMenuPage(webDriver);
        DataHelperAndWait.waitToBeVisible(megaMenuPage.getSportsSupplementsMenu(),webDriver);
        actions.moveToElement(megaMenuPage.getSportsSupplementsMenu()).perform();
        DataHelperAndWait.clickOnElement(megaMenuPage.getSportsSupplementsMenu(),webDriver);
    }
    public void clickOnSportsSupplementFromShopByMenu(){
        Actions actions= new Actions(webDriver);
        MegaMenuPage megaMenuPage= new MegaMenuPage(webDriver);
        DataHelperAndWait.waitToBeVisible(megaMenuPage.getShopByMenu(),webDriver);
        actions.moveToElement(megaMenuPage.getShopByMenu()).perform();
        DataHelperAndWait.waitToBeVisible(megaMenuPage.getSportsSupplementsMenu(),webDriver);
    }
    public void navigateToSportsSupplementPage(){
        webDriver.navigate().to(BaseURL+sportSupplementsUrl);
        DataHelperAndWait.waitForUrlContains(sportSupplementsUrl,webDriver);
    }
}
