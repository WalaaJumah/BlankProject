/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class is a base class contains for the pages
 */

package core;

import error_helper.SporterErrorPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasePage {


    public  static String siteURL = "https://www.sporter.com";
    public final String aeDomain = "/en-ae";
    public final String websiteEnglishLanguage = "/en";
    public  final String websiteArabicLanguage = "/ar";
    public final String uaeWebsite = "-ae/";
    public final String stgSiteURL = "https://stg.sporter.com";
    public final String stgTestSiteURL = "https://stg-test.sporter.com";
    public final String staging2SiteURL = "https://staging2.sporter.com";
    public final String cartURL= "/en-ae/checkout/cart/";
    public final String aeSiteURL = "/en-ae/";
    public final String ksaSiteURL = "/en-sa/";
    public final String qaterSiteURL = "/en-qa/";
    public final String checkoutLoginStepURL = "/en-ae/checkout/#checkout-login-step";
    public final String freeCouponeCode= "spo15";
    public final String discaountCouponeCode= "";
    public final String outOfStockProduct = "/en-ae/healthy-food/snacks-drinks/spreads/gymqueen-smooth-peanut-butter-spread";
    public final String product = "/en-ae/optimum-gold-standard-100-whey";
    public final String  womenOnlyUrl="/female/";
    public final String  sportSupplementsUrl="/sport-supplements/";
    public WebDriver webDriver;
    //Need to check
    public BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public String getTitle(){return webDriver.getTitle();}
    public String getSourcePage(){return webDriver.getPageSource();}
    public void verifyTheDisplayedPageDoesNotHaveErrors() {
        Assert.assertFalse(this.getTitle().equalsIgnoreCase(SporterErrorPage.pageNotFoundTitle), "Page Not Found Is Displayed and the URL is " + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.productsCannotFindMsg), "The page is empty and the URL is " + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.exceptionPageMsg), "An error has happened during application run. See exception log for details in page and the URL is " + webDriver.getCurrentUrl());
    }

}

