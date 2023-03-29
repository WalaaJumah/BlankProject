/**
 * @author w.jumaa
 */

package sporter_pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AeAllPagesInsideCategoriesInMegaMenuPage extends BasePage {
    @FindBy(xpath = "(//div[@class='img-product']/a)[1]")
    private WebElement firstBannerInsideTheSportSupplementsMenu;

    //Declare all elements defined in the pages inside the MegaMenu
    @FindBy(xpath = "(//div[@class='img-product']/a)[2]")
    private WebElement secondBannerInsideTheSportSupplementsMenu;
    @FindBy(xpath = "(//div[@class='img-product']/a)[3]")
    private WebElement firstBannerInsideTheVitaminsAndHealthMenu;
    @FindBy(xpath = "(//div[@class='img-product']/a)[4]")
    private WebElement secondBannerInsideTheVitaminsAndHealthMenu;
    @FindBy(xpath = "(//div[@class='img-product']/a)[5]")
    private WebElement firstBannerInsideTheHealthyFoodMenu;
    @FindBy(xpath = "(//div[@class='img-product']/a)[6]")
    private WebElement secondBannerInsideTheHealthyFoodMenu;
    @FindBy(xpath = "(//div[@class='img-product']/a)[7]")
    private WebElement firstBannerInsideTheSportsMenu;
    @FindBy(xpath = "(//div[@class='img-product']/a)[8]")
    private WebElement secondBannerInsideTheSportsMenu;
    public AeAllPagesInsideCategoriesInMegaMenuPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    //Getter Methods
    public WebElement getFirstBannerInsideTheSportSupplementsMenu() {
        return firstBannerInsideTheSportSupplementsMenu;
    }

    public WebElement getSecondBannerInsideTheSportSupplementsMenu() {
        return secondBannerInsideTheSportSupplementsMenu;
    }

    public WebElement getFirstBannerInsideTheVitaminsAndHealthMenu() {
        return firstBannerInsideTheVitaminsAndHealthMenu;
    }

    public WebElement getSecondBannerInsideTheVitaminsAndHealthMenu() {
        return secondBannerInsideTheVitaminsAndHealthMenu;
    }

    public WebElement getFirstBannerInsideTheHealthyFoodMenu() {
        return firstBannerInsideTheHealthyFoodMenu;
    }

    public WebElement getSecondBannerInsideTheHealthyFoodMenu() {
        return secondBannerInsideTheHealthyFoodMenu;
    }

    public WebElement getFirstBannerInsideTheSportsMenu() {
        return firstBannerInsideTheSportsMenu;
    }

    public WebElement getSecondBannerInsideTheSportsMenu() {
        return secondBannerInsideTheSportsMenu;
    }
}
