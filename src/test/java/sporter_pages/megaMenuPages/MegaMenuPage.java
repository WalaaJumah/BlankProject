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

import java.io.IOException;
import java.util.List;

@Getter
public class MegaMenuPage extends BasePage {

    @FindBy(id = "SortItem_SPORT SUPPLEMENTS")
    private WebElement SportsSupplementsMenuFromShopBy;
    @FindBy(id = "SortItem_Vitamins & Health")
    private WebElement vitaminsAndHealthMenuFromShopBy;
    @FindBy(xpath = "//ul/li[@id='menu_healthy-food_']/a")
    private WebElement healthyFoodMenuFromShopBy;
    @FindBy(xpath = "//li[@id='menu_sports_']/a")
    private WebElement sportsMenuFromShopBy;
    @FindBy(xpath = "//ul/li[@id='menu_health-vitamins_']/a")
    private WebElement vitaminsAndHealthInShopByMenu;
       @FindBy(xpath = "//ul/li[@id='menu_health-vitamins_']/a")
    private WebElement vitaminsAndHealthMenu;

//    @FindBy(id = "cat_583")
    @FindBy(xpath = "//ul/li[@id='menu_sport-supplements_']/a")
    private WebElement sportsSupplementsMenu;
    //        @FindBy(id = "cat_618")
//    private WebElement healthyFoodMenu;
    @FindBy(xpath = "//ul/li[@id='menu_healthy-food_']/a")
    private WebElement healthyFoodMenu;
    @FindBy(xpath = "//ul/li[@id='menu_sports_']/a")
    private WebElement sportsMenu;
    @FindBy(id = "shobBy")
    private WebElement shopByMenu;
    @FindBy(id = "SortItem_Sports Supplements_span")
    private WebElement sportsSupplementsInShopBy;
    @FindBy(id = "SubCategoriesContainer")
    private WebElement subCategoriesSectionInMegaMenu;
    @FindBy(id = "TopCategoryList")
    private List<WebElement> megaMenuList;
    @FindBy(xpath = "//ul/li[@id='menu_healthy-food_']/a")
    private WebElement healthyFoodMainMenu;
    @FindBy(xpath = "//li[@id='menu_sports_']//a")
    private WebElement sportsMainMenu;
    @FindBy(xpath = "//ul[@id='TopCategoryList']//a")
    private List<WebElement> mainCategoriesInMegaMenu;
    @FindBy(id = "SortCategoriesContainer")
    private WebElement ShopBySubMenu;
    @FindBy(id = "menu_female_")
    private WebElement womensOnlyMenu;
      @FindBy(xpath = "//a[@id='menu_female_']")
    private WebElement womensOnlyMenuFromShopBy;

    public MegaMenuPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void makeSureToDisplayShopByMenu() throws IOException {
        try {
            Actions action = new Actions(webDriver);
            action.moveToElement(this.getShopByMenu()).perform();
            WebElementsAssertion.validateTheElementIsDisplayed(this.getShopBySubMenu(), webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        } catch (Exception e) {
            Actions action = new Actions(webDriver);
            action.moveToElement(this.getSportsSupplementsMenu()).perform();
            action.moveToElement(this.getShopByMenu()).perform();
            WebElementsAssertion.validateTheElementIsDisplayed(this.getShopBySubMenu(), webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        }
    }

    public void clickOnVitaminsAndHealthMainMenu() throws IOException {
        Actions actions = new Actions(webDriver);
        try {
            DataHelperAndWait.waitForTime(1500);
            DataHelperAndWait.waitToBeVisible(this.vitaminsAndHealthMenu, webDriver);
            actions.moveToElement(this.vitaminsAndHealthMenu).perform();
           this.vitaminsAndHealthMenu.click();
//            DataHelperAndWait.clickOnElement(this.vitaminsAndHealthMenu, webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        } catch (Exception e) {

            DataHelperAndWait.waitToBeVisible(this.vitaminsAndHealthMenu, webDriver);
            actions.moveToElement(this.vitaminsAndHealthMenu).perform();
            DataHelperAndWait.clickOnElement(this.vitaminsAndHealthMenu, webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        }
    }

    public void clickOnHealthyFoodMainMenu() throws IOException {
        Actions actions = new Actions(webDriver);
        try {
            DataHelperAndWait.waitToBeVisible(this.healthyFoodMenu, webDriver);
            actions.moveToElement(this.healthyFoodMenu).perform();
            DataHelperAndWait.clickOnElement(this.healthyFoodMenu, webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeVisible(this.healthyFoodMenu, webDriver);
            actions.moveToElement(this.healthyFoodMenu).perform();
            DataHelperAndWait.clickOnElement(this.healthyFoodMenu, webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        }
    }

    public void clickOnSportsMainMenu() throws IOException {
        Actions actions = new Actions(webDriver);
        try {
            DataHelperAndWait.waitToBeVisible(this.sportsMenu, webDriver);
            actions.moveToElement(this.sportsMenu).perform();
            DataHelperAndWait.clickOnElement(this.sportsMenu, webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeVisible(this.sportsMenu, webDriver);
            actions.moveToElement(this.sportsMenu).perform();
            DataHelperAndWait.clickOnElement(this.sportsMenu, webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        }
    }
    public void clickOnWomensOnlyMainMenu() throws IOException {
        Actions actions = new Actions(webDriver);
        try {
            DataHelperAndWait.waitToBeVisible(this.womensOnlyMenu, webDriver);
            actions.moveToElement(this.womensOnlyMenu).perform();
            DataHelperAndWait.clickOnElement(this.womensOnlyMenu, webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeVisible(this.womensOnlyMenu, webDriver);
            actions.moveToElement(this.womensOnlyMenu).perform();
            DataHelperAndWait.clickOnElement(this.womensOnlyMenu, webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        }
    }
    public void clickOnWomensOnlyFromShopByMenu() throws IOException {
        Actions actions = new Actions(webDriver);
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        try {
            DataHelperAndWait.waitToBeVisible(megaMenuPage.getShopByMenu(), webDriver);
            actions.moveToElement(megaMenuPage.getShopByMenu()).perform();
            DataHelperAndWait.waitToBeVisible(megaMenuPage.getWomensOnlyMenuFromShopBy(), webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeVisible(megaMenuPage.getShopByMenu(), webDriver);
            actions.moveToElement(megaMenuPage.getShopByMenu()).perform();
            DataHelperAndWait.waitToBeVisible(megaMenuPage.getWomensOnlyMenuFromShopBy(), webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        }
    }
    public void clickOnVitaminsAndHealthFromShopByMenu() throws IOException {
        Actions actions = new Actions(webDriver);
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        try {
            DataHelperAndWait.waitToBeVisible(megaMenuPage.getShopByMenu(), webDriver);
            actions.moveToElement(megaMenuPage.getShopByMenu()).perform();
            DataHelperAndWait.waitForTime(1000);
            DataHelperAndWait.waitToBeVisible(megaMenuPage.getVitaminsAndHealthMenu(), webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeVisible(megaMenuPage.getShopByMenu(), webDriver);
            actions.moveToElement(megaMenuPage.getShopByMenu()).click().perform();
            verifyTheDisplayedPageDoesNotHaveErrors();
        }
    }

}
