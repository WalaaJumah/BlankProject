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
    public final String omanDomain = "/en-om";
    public final String bahrainDomain = "/en-bh";
    public final String kuwaitDomain = "/en-kw";
    public final String egyptDomain = "/en-eg";
    public final String jordanDomain = "/en-jo";
    public final String qatarDomain = "/en-qa";
    public final String saudiDomain = "/en-sa";
    public final String lebanonDomain = "/en-lb";
    public final String websiteEnglishLanguage = "/en";
    public  final String websiteArabicLanguage = "/ar";
    public final String uaeWebsite = "-ae/";
    public final String stgSiteURL = "https://stg.sporter.com";
    public final String stgTestSiteURL = "https://stg-test.sporter.com";
    public final String staging2SiteURL = "https://staging2.sporter.com";
    public final String cartURL= "/checkout/cart/";
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
    public final String healthyFoodsUrl = "/healthy-food/";
    public final String healthVitaminsUrl = "/health-vitamins/";
    public final String trackOrderUrl = "/track";
    public final String shippingAndDeliveryUrl = "/orders-delivery";
    public final  String refundAndReturnUrl = "/refund";
    public final  String customerServiceUrl = "/customer-service";
    public final  String fAQsUrl = "/faq/";
    public final  String grenadeReloadProteinOatBar = "/grenade-reload-protein-oat-bar-35229/";
    public final  String grenadeCrabKillaProteinBar = "/grenade-carb-killa-protein-bar";
    public final  String grenadeCrabKillaProteinBarBoxOf12 = "/grenade-carb-killa-protein-bar-box-of-12";
    public final  String dramatizeIso100Protein = "/dymatize-iso-100";
    public final String questNutritionBarsBoxOf12 = "/quest-nutrition-bars-pack-of-12-00715";
    public final String questNutritionBars = "quest-nutrition-bars";
    public final String aboutSporterUrl = "/about";
    public final  String productQualityUrl = "/products-quality";
    public final  String productAuthenticityUrl = "/official-supplier";
    public final  String wholesaleUrl = "/wholesale-offers";
    public final  String careersUrl = "https://ae.linkedin.com/company/sporter.com";
    public final  String sporterBlogUrl = "/blog/";
    public final  String contactUsUrl = "/contacts-us";
    public final  String trainingApparelUrl = "/training-apparel/";
    public final  String fitnessAccessoriesUrl = "/fitness-accessories/";
    public final  String shakersUrl = "/shakers/";
    public final  String homeGymEquipmentUrl = "/home-gyms/";
    public final  String watchesUrl = "/fitbit/";
    public final   String strapsUrl = "/straps/";
    public final  String bagsUrl = "/bags/";
    public final  String wheyProteinUrl = "/whey-protein/";
    public final  String wheyProteinIsolateUrl = "/whey-protein-isolate/";
    public final   String caseinProteinUrl = "/casein-protein/";
    public final  String weightGainAndMassGainerUrl = "/mass-gainer/";
    public final  String bCAAsAndAminoAcidsUrl = "/amino-acids/";
    public final  String preWorkoutAndEnduranceUrl = "/sport-supplements/energy-endurance/";
    public final  String glutamineAndRecoveryUrl = "h/sport-supplements/recovery/";
    public final  String fatBurnersUrl = "/sport-supplements/weight-management/";
    public final  String proteinBarsUrl = "/protein-bars/";
    public final  String healthySnacksUrl = "/healthy-food/";
    public final  String multivitaminsUrl = "/multivitamins/";
    public final  String vitamindUrl = "/vitamin-d/";
    public final  String vitamincUrl = "/vitamin-c/";
    public final  String vitamineUrl = "/vitamin-e/";
    public final  String fishOilOmegasUrl = "/fish-oil-omegas/";
    public final  String folicAcidUrl = "/folic-acid/";
    public final  String boneJointSupportUrl = "/bone-joint/";
    public final  String collagenUrl = "/collagen/";
    public final  String hairSkinNailsUrl = "/hair-skin-nails/";
    public final  String testosteroneBoosterUrl = "/testosterone-booster/";
    public final  String melatoninSleepSupportUrl = "/sleep-support/";
    public final  String digestionSupportUrl = "/digestion/";
    public final String termsAndServiceUrl = "/terms";
    public final   String privacyPolicyUrl = "/privacy-policy";
    public final  String instagramURL = "https://www.instagram.com/sportercom/?hl=en";
    public final  String facebookURL = "https://www.facebook.com/sportercom";
    public final  String twitterURL = "https://twitter.com/sportercom?lang=en";
    public final  String youtubeURL = "https://www.youtube.com/user/SporterVideos";
    public final String searchUrl="catalogsearch/result/?q=";
    public final String productUrl = "/optimum-gold-standard-100-whey-6202";
    public final String oOSProductUrl = "/healthy-food/snacks-drinks/spreads/healthyco-peanut-butter";
    public final String notAvailableOfferProduct = "/catalog/product/view/id/44012/s/olimp-chitosan-chromium-43840/";
    public final String sportsUrl = "/sports/";
    public final String toysAndGamesUrl = "/toys-and-games";
    public final String wearableTechUrl = "/wearable-tech";
    public final String shippingInformationUrl = "/checkout";

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
        Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.offerNotAvailableMsg), "The  offer is not available in your country page is displayed" + webDriver.getCurrentUrl());
    }

}
