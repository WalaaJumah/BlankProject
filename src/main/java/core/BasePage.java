/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class is a base class contains for the pages
 */

/*
 * this is just a test comment by Tobji
 */
package core;

import error_helper.SporterErrorPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class BasePage {


    public static String BaseURL = "https://sporter.com";
    public static String productUrl = "/nutrend-100-whey-protein-53915";
//    public static String productUrl = "/optimum-gold-standard-100-whey";

//    public void setStoreCountry(String storeCountry) {
//        this.storeCountry = storeCountry;
//    }
    public static String productUrl7 = "/venum-gldtr-4-0-t-shirt-53531";
//    public static String productUrl7 = "/dymatize-iso-100";
    public static String productUrlKSA1 = "/the-pack-wild-pre-workout";
    public static String productUrlKSA8 = "/venum-gldtr-4-0-t-shirt-53531";
//    public static String productUrlKSA8 = "/dymatize-iso-100";
    public static String productUrlKSA2 = "/efx-karbolyn-fuel";
    public static String productUrlKSA3 = "/windmill-natural-vitamins-omega-3-1000mg-with-epa-dha";
    public static String productUrlKSA4 = "/webber-naturals-joint-ease-glucosamine-chondroitin";
    public static String productUrlKSA5 = "/optimum-platinum-hydrowhey-6220";
    public static String productUrlKSA6 = "/yumearth-organic-assorted-vitamin-c-lollipops-14-pops";
    public static String productUrlKSAWithHighPrice1 = "/puma-speed-orbiter-black-nrgy-red-yellow-33980";
    public static String productUrlKSAWithHighPrice2 = "/asics-gel-kayano-26-ls-graphite-grey-piedmont-grey-32131";
    public static String productUrlEgypt = "/optimum-gold-standard-100-whey";
    public static String productUrlJordan = "/optimum-gold-standard-100-whey";
    public static String productUrlJordan7 = "/dymatize-iso-100";
    public static String productUrlJordanWithLowPrice = "/jack-links-beef-jerky-54840/";
    public static String productUrlJordanWithHighPrice = "/climaqx-gym-bag-21711";
    public static String productUrlQatarWithHighPrice = "/optimum-gold-standard-100-whey-6202";
    public static String productUrlQatarWithHighPrice2 = "/dymatize-iso-100-7164";
    public static String productUrlQatarWithHighPrice3 = "/dymatize-elite-whey-7161";
    public static String productUrlQatarWithHighPrice4 = "/evl-nutrition-100-whey-protein-55126";
    public static String productUrlJordanWithHighPrice2 = "/optimum-serious-mass";
    public static String oOSProductUrl = "";
    public static String bundleUrl = "";
    public static String bogoProduct = "";
    public final String aeDomain = "/en-ae";
    public final String omanDomain = "/en-om";
    public final String bahrainDomain = "/en-bh";
    public final String kuwaitDomain = "/en-kw";
    public final String egyptDomain = "/en-eg";
    public final String jordanDomain = "/en-jo";
    public final String qatarDomain = "/en-qa";
    public final String saudiDomainEnglish = "/en-sa";
    public final String registerAccountLink = "/register/signup";
    public final String loginLink = "/register/login";
    public final String forgetPasswordURL = "/forget_Password";
    public final String saudiDomainArabic = "/ar-sa";
    public final String lebanonDomain = "/en-lb";
    public final String websiteEnglishLanguage = "/en";
    public final String websiteArabicLanguage = "/ar";
    public final String uaeWebsite = "-ae/";
    public final String stgSiteURL = "https://stg.sporter.com";
    public final String stgTestSiteURL = "https://stg-test.sporter.com";
    public final String staging2SiteURL = "https://staging2.sporter.com";
    public final String cartURL = "/cart";
    public final String aeSiteURL = "/en-ae/";
    public final String ksaSiteURL = "/en-sa/";
    public final String qaterSiteURL = "/en-qa/";
    public final String checkoutLoginStepURL = "/en-ae/checkout/#checkout-login-step";
    public final String freeCouponeCode = "spo15";
    public final String discaountCouponeCode = "";
    public final String outOfStockProduct = "/en-ae/healthy-food/snacks-drinks/spreads/gymqueen-smooth-peanut-butter-spread";
    public final String product = "/en-ae/optimum-gold-standard-100-whey";
    public final String womenOnlyUrl = "/female";
    public final String sportSupplementsUrl = "/sport-supplements";
    public final String sportUrl = "/sports";
    public final String healthyFoodsUrl = "/healthy-food";
    public final String healthVitaminsUrl = "/health-vitamins";
    public final String trackOrderUrl = "/track";
    public final String shippingAndDeliveryUrl = "/orders-delivery";
    public final String refundAndReturnUrl = "/refund";
    public final String customerServiceUrl = "/customer-service";
    public final String fAQsUrl = "/faq/";
    public final String grenadeReloadProteinOatBar = "/grenade-reload-protein-oat-bar-35229/";
    public final String grenadeCrabKillaProteinBar = "/grenade-carb-killa-protein-bar";
    public final String grenadeCrabKillaProteinBarBoxOf12 = "/grenade-carb-killa-protein-bar-box-of-12";
    public final String dramatizeIso100Protein = "/dymatize-iso-100";
    public final String questNutritionBarsBoxOf12 = "/quest-nutrition-bars-pack-of-12-00715";
    public final String questNutritionBars = "quest-nutrition-bars";
    public final String aboutSporterUrl = "/about";
    public final String productQualityUrl = "/products-quality";
    public final String productAuthenticityUrl = "/official-supplier";
    public final String wholesaleUrl = "/wholesale-offers";
    public final String careersUrl = "linkedin.com/company/sporter.com";
    public final String sporterBlogUrl = "/blog/";
    public final String contactUsUrl = "/contacts-us";
    public final String trainingApparelUrl = "/training-apparel/";
    public final String fitnessAccessoriesUrl = "/fitness-accessories/";
    public final String shakersUrl = "/shakers/";
    public final String homeGymEquipmentUrl = "/home-gyms/";
    public final String watchesUrl = "/fitbit/";
    public final String strapsUrl = "/straps/";
    public final String bagsUrl = "/bags/";
    public final String wheyProteinUrl = "/whey-protein/";
    public final String wheyProteinIsolateUrl = "/whey-protein-isolate/";
    public final String caseinProteinUrl = "/casein-protein/";
    public final String weightGainAndMassGainerUrl = "/mass-gainer/";
    public final String bCAAsAndAminoAcidsUrl = "/amino-acids/";
    public final String preWorkoutAndEnduranceUrl = "/sport-supplements/energy-endurance/";
    public final String glutamineAndRecoveryUrl = "h/sport-supplements/recovery/";
    public final String fatBurnersUrl = "/sport-supplements/weight-management/";
    public final String proteinBarsUrl = "/protein-bars/";
    public final String healthySnacksUrl = "/healthy-food/";
    public final String multivitaminsUrl = "/multivitamins/";
    public final String vitamindUrl = "/vitamin-d/";
    public final String vitamincUrl = "/vitamin-c/";
    public final String vitamineUrl = "/vitamin-e/";
    public final String fishOilOmegasUrl = "/fish-oil-omegas/";
    public final String folicAcidUrl = "/folic-acid/";
    public final String boneJointSupportUrl = "/bone-joint/";
    public final String collagenUrl = "/collagen/";
    public final String hairSkinNailsUrl = "/hair-skin-nails/";
    public final String testosteroneBoosterUrl = "/testosterone-booster/";
    public final String melatoninSleepSupportUrl = "/sleep-support/";
    public final String digestionSupportUrl = "/digestion/";
    public final String termsAndServiceUrl = "/terms";
    public final String privacyPolicyUrl = "/privacy-policy";
    public final String instagramURL = "https://www.instagram.com/sportercom/?hl=en";
    public final String facebookURL = "https://www.facebook.com/sportercom";
    public final String twitterURL = "https://twitter.com/sportercom?lang=en";
    public final String youtubeURL = "https://www.youtube.com/user/SporterVideos";
    public final String searchUrl = "catalogsearch/result/?q=";
    public final String bogoUrlKSA = "/the-pack-bcaas-flow-32569";
    public final String bogoUrlQatar = "/catalog-pro-32569";
    public final String bogoUrlEgypt = "/cellucor-c4";
    public final String product2UrlLessQty = "/positive-nutrition-recharge-pods-53972";
    public final String notAvailableOfferProduct = "/catalog/product/view/id/44012/s/olimp-chitosan-chromium-43840/";
    public final String sportsUrl = "/sports";
    public final String toysAndGamesUrl = "/toys-and-games";
    public final String wearableTechUrl = "/wearable-tech";
    public final String shippingInformationUrl = "/checkout";
    public String storeCountry = "";
    public WebDriver webDriver;

    //Need to check
    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getTitle() {
//        DataHelperAndWait.waitForTime(500);
        return webDriver.getTitle();
    }

    public String getSourcePage() {
//        DataHelperAndWait.waitForTime(500);
        return webDriver.getPageSource();
    }

    public void getStatusCode(String uRL) throws IOException {
        HttpURLConnection cn = (HttpURLConnection) new
                URL(uRL)
                .openConnection();
        cn.setRequestMethod("HEAD");
        cn.connect();
        int c = cn.getResponseCode();
        System.out.println("Http status code: " + c);
        Assert.assertNotEquals(c, 500, "Http status code: " + c);
    }

    public void verifyTheDisplayedPageDoesNotHaveErrors() throws IOException {
        String currentURL = webDriver.getCurrentUrl();
        System.out.println(" The current URL is: " + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getTitle().equalsIgnoreCase(SporterErrorPage.pageNotFoundTitle), "Page Not Found Is Displayed and the URL is " + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.productsCannotFindMsg), "The page is empty and the URL is " + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.exceptionPageMsg), "An error has happened during application run. See exception log for details in page and the URL is " + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.exceptionPageMsg2), "An error occurred on client and the URL is " + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.offerNotAvailableMsg), "The  offer is not available in your country page is displayed" + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.pageNotFoundMsg), "Page Not Found Is Displayed and the URL is " + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.productsCannotFindMsg), "This page is currently under maintenance and the URL is " + webDriver.getCurrentUrl());
        this.getStatusCode(currentURL);
    }

    public void navigateToBogoProduct() {
        if (webDriver.getCurrentUrl().contains("ar-sa/")) {
            webDriver.navigate().to(BaseURL + bogoUrlKSA);
        } else if (webDriver.getCurrentUrl().contains("en-eg/")) {
            webDriver.navigate().to(BaseURL + productUrlEgypt);
        } else if (webDriver.getCurrentUrl().contains("en-qa/")) {
            webDriver.navigate().to(BaseURL + bogoUrlQatar);
        } else {
            webDriver.navigate().to(BasePage.BaseURL + bogoProduct);

        }
        System.out.println("The product URL is: " + webDriver.getCurrentUrl());
//        DataHelperAndWait.waitForUrlContains(bogoProduct,webDriver);
    }

    public void displayBundle() throws IOException {
        webDriver.navigate().to(BasePage.BaseURL + bundleUrl);
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        DataHelperAndWait.waitForUrlContains(bundleUrl, webDriver);
        System.out.println("The product URL is: " + webDriver.getCurrentUrl());
    }

    public void navigateToHomePage() {
        try {
            WebElement btnCloseElement = webDriver.findElement(By.xpath("//button[@class='button_btn__zg_G5 changeStorePopUp_btn__sggmr']/span"));
//            DataHelperAndWait.waitForTime(2000);
            DataHelperAndWait.waitToBeVisible(btnCloseElement, webDriver);

            if (btnCloseElement != null
                    && btnCloseElement.isDisplayed()) {
                btnCloseElement.click();
            }
        } catch (NoSuchElementException ex) {
//            System.out.println(e.getMessage());
            try {
                WebElement btnCloseElement = webDriver.findElement(By.id("//button[@class='button_btn__zg_G5 changeStorePopUp_btn__sggmr']/span"));
                DataHelperAndWait.waitToBeVisible(btnCloseElement, webDriver);

                if (btnCloseElement != null
                        && btnCloseElement.isDisplayed()) {
                    btnCloseElement.click();
                }
            } catch (NoSuchElementException e) {
                //            System.out.println(e.getMessage());

            }
        }


        webDriver.navigate().to(BaseURL);
    }


}

