/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.megaMenuPages;

import core.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    @FindBy(id = "SortItem_Sports ")
    private WebElement sportsMenuFromShopBy;
     @FindBy(id = "cat_686")
    private WebElement vitaminsAndHealthMenu;
     @FindBy(id = "cat_686")
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
}
