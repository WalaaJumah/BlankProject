/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.megaMenuPages;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
@Getter
public class MegaMenuPage extends BasePage {

    public MegaMenuPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(id = "SortItem_SPORT SUPPLEMENTS")
    private WebElement SportsSupplementsMenuFromShopBy;
    @FindBy(id = "SortItem_Vitamins & Health")
    private WebElement vitaminsAndHealthMenuFromShopBy;
        @FindBy(id = "SortItem_HEALTHY FOOD")
    private WebElement healthyFoodMenuFromShopBy;

    @FindBy(id = "SortItem_Sports ")
    private WebElement sportsMenuFromShopBy;
     @FindBy(xpath = "//ul/li[@id='cat_686']/a")
    private WebElement vitaminsAndHealthMenu;
        @FindBy(id = "cat_583")
    private WebElement sportsSupplementsMenu;
        @FindBy(id = "cat_618")
    private WebElement healthyFoodMenu;

     @FindBy(id = "cat_1431")
    private WebElement sportsMenu;
    @FindBy(id = "shobBy")
    private WebElement shopByMenu;
    @FindBy(id = "SortItem_Sports Supplements_span")
    private WebElement sportsSupplementsInShopBy;
    @FindBy(id = "SubCategoriesContainer")
    private WebElement subCategoriesSectionInMegaMenu;
    @FindBy(id = "TopCategoryList")
    private List<WebElement> megaMenuList;
    @FindBy(xpath = "//li[@id='menu_105']//a")
    private WebElement healthyFoodMainMenu;
    @FindBy(xpath = "//li[@id='menu_146']//a")
    private WebElement sportsMainMenu;
    @FindBy(xpath = "//ul[@id='TopCategoryList']//a")
    private List<WebElement> mainCategoriesInMegaMenu;
    @FindBy(id="SortCategoriesContainer")
    private WebElement ShopBySubMenu;

    public void makeSureToDisplayShopByMenu(){
        try{
        Actions action = new Actions(webDriver);
        action.moveToElement(this.getShopByMenu()).perform();
        action.moveToElement(this.getShopByMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(this.getShopBySubMenu(),webDriver);}
        catch (Exception e){
            Actions action = new Actions(webDriver);
            action.moveToElement(this.getShopByMenu()).perform();
            action.moveToElement(this.getShopByMenu()).perform();
            WebElementsAssertion.validateTheElementIsDisplayed(this.getShopBySubMenu(),webDriver);
        }
    }
    public void clickOnVitaminsAndHealthMainMenu(){
        Actions actions= new Actions(webDriver);
        try {
        DataHelperAndWait.waitToBeVisible(this.vitaminsAndHealthMenu,webDriver);
        actions.moveToElement(this.vitaminsAndHealthMenu).perform();
        DataHelperAndWait.clickOnElement(this.vitaminsAndHealthMenu,webDriver);}
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.vitaminsAndHealthMenu,webDriver);
            actions.moveToElement(this.vitaminsAndHealthMenu).perform();
            DataHelperAndWait.clickOnElement(this.vitaminsAndHealthMenu,webDriver);
        }
    }
    public void clickOnHealthyFoodMainMenu(){
        Actions actions= new Actions(webDriver);
        try {
            DataHelperAndWait.waitToBeVisible(this.healthyFoodMenu, webDriver);
            actions.moveToElement(this.healthyFoodMenu).perform();
            DataHelperAndWait.clickOnElement(this.healthyFoodMenu, webDriver);
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.healthyFoodMenu, webDriver);
            actions.moveToElement(this.healthyFoodMenu).perform();
            DataHelperAndWait.clickOnElement(this.healthyFoodMenu, webDriver);
        }
    }
    public void clickOnSportsMainMenu(){
        Actions actions= new Actions(webDriver);
        try{
        DataHelperAndWait.waitToBeVisible(this.sportsMenu,webDriver);
        actions.moveToElement(this.sportsMenu).perform();
        DataHelperAndWait.clickOnElement(this.sportsMenu,webDriver);}
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.sportsMenu,webDriver);
            actions.moveToElement(this.sportsMenu).perform();
            DataHelperAndWait.clickOnElement(this.sportsMenu,webDriver);
        }
    }

}
