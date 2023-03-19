/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.footerSections;

import core.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.productPage.ProductDetailsPage;

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
}
