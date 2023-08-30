/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription RelatedProductSection
 */

package sporter_pages.related_products_sections;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import sporter_pages.homepage_classes.HomePage;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

@Getter
public class RelatedProductSection extends BasePage {
    //https://app.qa1.sporter.com/admin_1uidvr/catalog/product/edit/id/6875/set/16/key/ba40f6ed3583beafdcb4374b48c718cf31deb225ac6171a6ecaa4b0d6ba0dc32/type/configurable/store/0/back/edit/https://app.qa1.sporter.com/admin_1uidvr/catalog/product/edit/id/18422/key/ba40f6ed3583beafdcb4374b48c718cf31deb225ac6171a6ecaa4b0d6ba0dc32/
    //https://app.qa1.sporter.com/admin_1uidvr/catalog/product/edit/id/6527/key/ba40f6ed3583beafdcb4374b48c718cf31deb225ac6171a6ecaa4b0d6ba0dc32/


    @FindBy(xpath = "//div[starts-with(@class,'relatedProducts_container')]")
    private WebElement relatedProductsSection;
    @FindBy(xpath = "//div[starts-with(@class,'relatedProducts_label')]")
    private WebElement relatedProductsTitle;
    @FindBy(xpath = "//div[starts-with(@class,'relatedProductItem_container')]")
    private List<WebElement> relatedProductsItems;
    @FindBy(xpath = "//div[starts-with(@class,'relatedProductItem_img')]")
    private List<WebElement> relatedProductsImages;
    @FindBy(xpath = "//div[starts-with(@class,'relatedProductItem_name')]")
    private List<WebElement> relatedProductsNames;
    @FindBy(xpath = "//div[starts-with(@class,'relatedProductItem_price')]")
    private List<WebElement> relatedProductsPrices;
    @FindBy(id = "addRelatedProductToCart")
    private List<WebElement> addRelatedProductToCart;


    public RelatedProductSection(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void displayTheInStockProduct() throws IOException {
        webDriver.navigate().to(BaseURL +this. inStockProductHaveRelatedItems);
        waitTillLoaderComplete();
        verifyTheDisplayedPageDoesNotHaveErrors();
       waitTillLoaderComplete();
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductsSection)," The Related products section are missing");
        DataHelperAndWait.waitToBeVisible(relatedProductsSection,webDriver);
    }
      public void displayTheOutStockProduct() throws IOException {
          if(webDriver.getCurrentUrl().contains("-eg/"))
              webDriver.navigate().to(BaseURL + this.oOSProductUrlForEg);
else {
              webDriver.navigate().to(BaseURL + this.oOSProductUrl);
          }
        DataHelperAndWait.waitTillPageFullyLoaded(webDriver,10);
        verifyTheDisplayedPageDoesNotHaveErrors();
          waitTillLoaderComplete();
          Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductsSection)," The Related products section are missing");
          DataHelperAndWait.waitToBeVisible(relatedProductsSection,webDriver);
    }

    public void displayTheInStockBundle() throws IOException {
        if(webDriver.getCurrentUrl().contains("-eg/")){
            webDriver.navigate().to(BaseURL + inStockBundleHaveRelatedItemsEg);}
        else
        {            webDriver.navigate().to(BaseURL + inStockBundleHaveRelatedItems);}

        DataHelperAndWait.waitTillPageFullyLoaded(webDriver,15);
        verifyTheDisplayedPageDoesNotHaveErrors();
        waitTillLoaderComplete();
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductsSection)," The Related products section are missing");
        DataHelperAndWait.waitToBeVisible(relatedProductsSection,webDriver);
        DataHelperAndWait.waitToBeVisible(relatedProductsSection,webDriver);


    }

}