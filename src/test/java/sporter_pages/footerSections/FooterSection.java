/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.footerSections;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

@Getter
public class FooterSection extends BasePage {
    public FooterSection(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//div[@class='footer_badges_badges']/div")
    private List<WebElement> pageBottomBlocksList;
    @FindBy(xpath = "//div[@class='block-footer-top']")
    private WebElement pageBottomSection;
    @FindBy(xpath = "(//li[@class='secure-listing']//h3[1])[1]")
    private WebElement securePaymentTitle;
    @FindBy(xpath = "//em[@class='fas fa-unlock']/following-sibling::span")
    private WebElement securePaymentDescription;
    @FindBy(xpath = "(//a[@title='100% Secure payments']//span)[3]")
    private WebElement fastDeliveryDescription;
    @FindBy(xpath = "(//li[@class='secure-listing']//h3[1])[3]")
    private WebElement fastDeliveryTitle;
    @FindBy(xpath = "(//li[@class='secure-listing']//h3[1])[2]")
    private WebElement authenticProductsTitle;
    @FindBy(xpath = "(//a[@title='100% Secure payments']//span)[2]")
    private WebElement authenticProductsDescription;
    @FindBy(xpath = "//*[@id=\"FooterLinks\"]/div[1]/div/div[1]/ul/li/a")
    private List<WebElement> ordersAndShippingList;
    @FindBy(xpath = "//*[@id=\"FooterLinks\"]/div[1]/div/div[2]/ul/li/a")
    private List<WebElement> letsUsHelpYouList;
    @FindBy(xpath = "//*[@id=\"FooterLinks\"]/div[1]/div/div[3]/ul/li/a")
    private List<WebElement> proteinAndFitnessList;
    @FindBy(xpath = "//*[@id=\"FooterLinks\"]/div[1]/div/div[4]/ul/li/a")
    private List<WebElement> vitaminsAndHealthList;
    @FindBy(xpath = "//*[@id=\"FooterLinks\"]/div[1]/div/div[5]/ul/li/a")
    private List<WebElement> accessoriesAndApparelList;
    @FindBy(xpath = "//*[@id=\"FooterLinks\"]/div[1]/div/div[6]/ul/li/a")
    private List<WebElement> mostSellingProductsList;
    @FindBy(xpath = "//*[@id=\"FooterLinks\"]/div[1]/div/div[7]/ul/li/a")
    private List<WebElement> getToKnowUsList;
    @FindBy(xpath = "//*[@id=\"FooterLinks\"]/div[1]/div/div[8]/ul/li/a")
    private List<WebElement> contactUsList;
    @FindBy(xpath = "//div[contains(@class,'copyRight')]")
    private WebElement copyRightLabel;
    @FindBy(xpath = "//div[contains(@class,'socialLinks')]")
    private WebElement socialMediaSection;

    public void accessAllLinksInTheList(List<WebElement> elements) throws IOException {
        for (int i = 0; i < elements.size(); i++) {
            System.out.println("The List size is = "+elements.size());
            DataHelperAndWait.waitToBeVisible(elements.get(i), webDriver);
            DataHelperAndWait.clickOnElement(elements.get(i), webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
            navigateToHomePage();
        }
    }

}
