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
@Getter
public class SportsSupplementsCategoryPage extends BasePage {
    public SportsSupplementsCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "(//ul[starts-with(@class,'topCategoryList_container')]/li/a)[2]")
    private WebElement sportsSupplementManinMenuInMegaMenu;
    @FindBy(xpath = "(//ul[starts-with(@class,'topCategoryList_container')]/li/a)[1]")
    private WebElement shopByMenu;
      @FindBy(id = "SortItem_Sports Supplements_span")
    private WebElement sportsSupplementOptionFromShopBy;

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
}
