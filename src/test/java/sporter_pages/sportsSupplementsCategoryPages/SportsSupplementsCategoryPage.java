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
import org.testng.Assert;
import sporter_pages.megaMenuPages.MegaMenuPage;

import java.io.IOException;
import java.util.List;

import static org.testng.Assert.assertFalse;

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
    @FindBy(xpath="(//span[starts-with(@class,'sidebar_result')]/following-sibling::span)[2]")
    private WebElement resultLabel;
   @FindBy(xpath="(//span[starts-with(@class,'sidebar_result')]/following-sibling::span)[1]")
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
    public void accessAllPagesInsideTheProductsListPage(String numberOfProductInTheList, WebElement element, WebDriver webDriver) throws IOException {
        ///New
        String numberOfProductWithOutFirstCharacter= numberOfProductInTheList.replace(")","");
        String numberOfProductWithOutLastCharacter= numberOfProductWithOutFirstCharacter.replace("(","");
        double numberOfProductInTheListInInt=Double.parseDouble(numberOfProductWithOutLastCharacter);
        //End of new code
//        double numberOfProductInTheListInInt=Double.parseDouble(numberOfProductInTheList.substring(10,numberOfProductInTheList.length()-7));
        double numberOfThePagesInList=Math.ceil(numberOfProductInTheListInInt/24);
        System.out.println("The number of products in the list= "+numberOfProductInTheListInInt);
        System.out.println("The number of Pages in the list= "+numberOfThePagesInList);
        if(numberOfThePagesInList>1){
            int i = 2;
            do {
                String pageNumber = Integer.toString(i);
                DataHelperAndWait.waitToBeClickable(element,webDriver);
                element.click();
//                DataHelperAndWait.waitForTime(6000);
                DataHelperAndWait.waitForUrlContains(pageNumber,webDriver);
                this.verifyTheDisplayedPageDoesNotHaveErrors();
                i++;
            }
            while (i <= numberOfThePagesInList);
            System.out.println("The number of pages in the list is "+i);
        }
        else System.out.println("There's only a page in the list");
    }

    public  static Boolean isTheresNoPages(String numberOfProductInTheList){
        String numberOfProductWithOutItemLabel;
            numberOfProductWithOutItemLabel= numberOfProductInTheList.replace("(","");
            numberOfProductWithOutItemLabel= numberOfProductWithOutItemLabel.replace(")","");
        double numberOfProductInTheListInInt=Double.parseDouble(numberOfProductWithOutItemLabel);
        return numberOfProductInTheListInInt<=24;

    }
}
