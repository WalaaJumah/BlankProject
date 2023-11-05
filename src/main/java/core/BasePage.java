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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

public class BasePage {

    private String pageTitle = null;
    private String pageSource = null;
    //TODO: Add it as Config and remove static
    public static boolean enableWhoBoughtThisAlsoBoughtConfig;
//    public String cartLoaderXpath = "//div[starts-with(@class,'loading_container')]";
    public String cartLoaderXpath = "cart_loader";
    public String egyptLoaderInCheckOutForCreditCard = "background_loader";
    public String spinnerIcon = "spinnerContainer";
    public String spinnerIcon2 = "spinner";
    public String pageLoader = "//div[starts-with(@class,'spinner_container')]";
    public String loadingLayout = "//div[starts-with(@class,'loading_container')]";
    public static String BaseURL = "";
    public static String productUrl = "/optimum-gold-standard-100-whey-6202";
    public static String bogoProductIraq = "/catalog-pro-32569-32569/";
    public static String productUrlIraq = "/betancourt-nutrition-b-nox-androrush-34834/";
    public static String productUrlIraqHighPrice = "/evl-nutrition-100-isolate-protein-55121/";
    public static String productUrlIraqHighPrice2 = "/evl-nutrition-stacked-protein-55117/";
    public static String productUrlIraqHighPrice3 = "/evl-nutrition-100-whey-protein-55126/";
    public static String productUrlIraq2 = "/fade-fit-protein-munchies-54804/";
    public static String productUrlIraq3 = "/project-7-naturally-sweetened-chewing-gum-52184/";
    public static String productUrlIraq4 = "/organic-larder-canned-veg-edamame-soybean-25133/";
    public static String productUrlIraq5 = "/ellas-kitchen-organic-mangoes-puree-baby-pouch-58615/";

    public static String ksaDomainArabic = "/ar-sa";
    public static String iraqDomain = "/en-iq";
    public static String productUrl9 = "/cellucor-c4-26162";

    public static String productUrl7 = "/dymatize-iso-100-7164/";
    public static String productUrlKSA1 = "/fade-fit-protein-munchies-54805/";
    public static String productUrlKSA8 = "/the-pack-bcaas-flow-32569";
    public static String productUrlKSA2 = "/organic-larder-brown-fusilli-25030";
    public static String productUrlKSA3 = "/pandomar-squid-tentacles-in-organic-olive-oil-25187";
    public static String productUrlKSA4 = "/loma-linda-tuno-lemon-pepper-59015";
    public static String productUrlKSA5 = "/canderel-sweetener-jar-with-surcalose-54742";
    public static String productUrlKSA6 = "/yumearth-organic-assorted-vitamin-c-lollipops-14-pops";
    public static String productUrlKSAWithHighPrice1 = "/redcon1-isotope-51867";
    public static String productUrlKSAWithHighPrice2 = "/redcon1-isotope-51866";
    public static String productUrlKSAWithHighPrice3 = "/muscletech-nitro-tech-performance-series-16114/";
    public static String productUrlEgypt = "/optimum-gold-standard-100-whey-6202";
    public static String productUrlJordan = "/optimum-gold-standard-100-whey";
    public static String productUrlJordan7 = "/optimum-gold-standard-100-whey";
    public static String inStockProductHaveRelatedItems = "/optimum-gold-standard-100-whey";
//    public static String inStockProductHaveRelatedItems = "/optimum-gold-standard-100-whey-6200/";
    public static String inStockBundleHaveRelatedItems = "/grenade-carb-killa-protein-bar-box-of-12/";
    public static String inStockBundleHaveRelatedItemsEg = "/organic-nation-secrets-protein-bars-box-of-12";
    public static String productUrlJordanWithLowPrice = "/jack-links-beef-jerky-54840/";
    public static String productUrlJordanWithHighPrice = "/dymatize-iso-100-7164/";
    public static String productUrlQatarWithHighPrice = "/optimum-gold-standard-100-whey-6202";
    public static String productUrlQatarWithHighPrice2 = "/dymatize-iso-100-7164";
    public static String productUrlQatarWithHighPrice3 = "/dymatize-elite-whey-7161";
    public static String productUrlQatarWithHighPrice4 = "/evl-nutrition-100-whey-protein-55126";
    public static String productUrlJordanWithHighPrice2 = "/evl-nutrition-stacked-protein-55117";
    public static String oOSProductUrl = "";
    public static String oOSProductUrlForEg = "/organic-nation-cashew-spread-pro-added-whey-protein/";
    public static String bundleUrl = "";
    public static String bogoProduct = "";
    public final String aeDomain = "/en-ae";
    public final String EgyptDomain = "/en-eg";
    public final String aeArabicCurrency = "د.إ";
    public final String aeEnglishCurrency = "AED";
    public final String kSAEnglishCurrency = "SAR";
    public final String iraqCurrencySign = "$";
    public final String iraqCurrency = "USD";
    public final String bahrainCurrency = "BHD";
    public final String EGPCurrency = "EGP";
    public final String JODCurrency = "JOD";
    public final String KWDCurrency = "KWD";
    public final String OMRCurrency = "OMR";
    public final String QARCurrency = "QAR";
    public final String kSAArabicCurrency = "ر.س";
    public final String getkSAEnglishCurrency = "SAR";
    public static final String omanDomain = "/en-om";
    public static final String bahrainDomain = "/en-bh";
    public static final String kuwaitDomain = "/en-kw";
    public static final String egyptDomain = "/en-eg";
    public static final String jordanDomain = "/en-jo";
    public static final String qatarDomain = "/en-qa";
    public static final String saudiDomainEnglish = "/en-sa";
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
    public static final String bogoUrlKSA = "/optimum-gold-standard-100-whey-6202";
    public static  final String bogoUrlQatar = "/optimum-gold-standard-100-whey-6202";
    public final String bogoUrlEgypt = "/cellucor-c4";
    public static final String product2UrlLessQty = "/quest-nutrition-bars-pack-of-12-00715";
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

//    public String getTitle() {
////        DataHelperAndWait.waitForTime(500);
//        return webDriver.getTitle();
//    }
//
//    public String getSourcePage() {
////        DataHelperAndWait.waitForTime(500);
//        return webDriver.getPageSource();
//    }
public String getTitle() {
//        WaitHelper.waitForTime(500);
    if (pageTitle == null) {
        pageTitle = webDriver.getTitle();
    }
    return pageTitle;
}

    public String getSourcePage() {
//        WaitHelper.waitForTime(500);
        if (pageSource == null) {
            pageSource = webDriver.getPageSource();
        }
        return pageSource;
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
        try {
            Assert.assertFalse(this.getTitle().equalsIgnoreCase(SporterErrorPage.pageNotFoundTitle), "Page Not Found Is Displayed and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.productsCannotFindMsg), "The page is empty and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.exceptionPageMsg), "An error has happened during application run. See exception log for details in page and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.exceptionPageMsg2), "An error occurred on client and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.offerNotAvailableMsg), "The  offer is not available in your country page is displayed" + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.pageNotFoundMsg), "Page Not Found Is Displayed and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.productsCannotFindMsg), "This page is Empty and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.generatedContentErrorMsg), "We're sorry, an error has occurred while generating this content and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.backendError), "503 error and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.error503), "Backend fetch failed and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.pageUnderMaintenanceMsg), "Backend fetch failed and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.gatewayTimeOut), "Gateway TimeOut Error" + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.InvalidSSLCertificateMsg), "Invalid SSL certificate" + webDriver.getCurrentUrl());
//            this.getStatusCode(currentURL);
        }
        catch (Exception e){
            webDriver.navigate().refresh();
            Assert.assertFalse(this.getTitle().equalsIgnoreCase(SporterErrorPage.pageNotFoundTitle), "Page Not Found Is Displayed and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.productsCannotFindMsg), "The page is empty and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.exceptionPageMsg), "An error has happened during application run. See exception log for details in page and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.exceptionPageMsg2), "An error occurred on client and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.offerNotAvailableMsg), "The  offer is not available in your country page is displayed" + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.pageNotFoundMsg), "Page Not Found Is Displayed and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.productsCannotFindMsg), "This page is Empty and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.generatedContentErrorMsg), "We're sorry, an error has occurred while generating this content and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.backendError), "503 error and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.error503), "Backend fetch failed and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.pageUnderMaintenanceMsg), "Backend fetch failed and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.gatewayTimeOut), "Gateway TimeOut Error" + webDriver.getCurrentUrl());
            this.getStatusCode(currentURL);
        }
    }
    public void verifyTheDisplayedPageDoesNotHaveErrorsWithReDefiningSourcePage() throws IOException {
        String pageSource1 = webDriver.getPageSource();
        String currentURL = webDriver.getCurrentUrl();
            Assert.assertFalse(this.getTitle().equalsIgnoreCase(SporterErrorPage.pageNotFoundTitle), "Page Not Found Is Displayed and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(pageSource1.contains(SporterErrorPage.productsCannotFindMsg), "The page is empty and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(pageSource1.contains(SporterErrorPage.exceptionPageMsg), "An error has happened during application run. See exception log for details in page and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(pageSource1.contains(SporterErrorPage.exceptionPageMsg2), "An error occurred on client and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(pageSource1.contains(SporterErrorPage.offerNotAvailableMsg), "The  offer is not available in your country page is displayed" + webDriver.getCurrentUrl());
            Assert.assertFalse(pageSource1.contains(SporterErrorPage.pageNotFoundMsg), "Page Not Found Is Displayed and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(pageSource1.contains(SporterErrorPage.productsCannotFindMsg), "This page is Empty and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(pageSource1.contains(SporterErrorPage.generatedContentErrorMsg), "We're sorry, an error has occurred while generating this content and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(pageSource1.contains(SporterErrorPage.backendError), "503 error and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(pageSource1.contains(SporterErrorPage.error503), "Backend fetch failed and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(pageSource1.contains(SporterErrorPage.pageUnderMaintenanceMsg), "Backend fetch failed and the URL is " + webDriver.getCurrentUrl());
            Assert.assertFalse(pageSource1.contains(SporterErrorPage.gatewayTimeOut), "Gateway TimeOut Error" + webDriver.getCurrentUrl());
            Assert.assertFalse(pageSource1.contains(SporterErrorPage.InvalidSSLCertificateMsg), "Invalid SSL certificate" + webDriver.getCurrentUrl());
//            this.getStatusCode(currentURL);
        }


    public void checkIfProductOOS()  {
        String pageSource1 = webDriver.getPageSource();
        if(pageSource1.contains(SporterErrorPage.OOSMsgEn))
            throw new AssertionError("The product is OOS " + webDriver.getCurrentUrl());
        if(pageSource1.contains(SporterErrorPage.OOSMsgAr))
        throw new AssertionError("The product is OOS " + webDriver.getCurrentUrl());
    }
    public void navigateToBogoProduct() {
        if (webDriver.getCurrentUrl().contains("-sa/")) {
            webDriver.navigate().to(BaseURL + bogoUrlKSA);
        } else if (webDriver.getCurrentUrl().contains("-eg/")) {
            webDriver.navigate().to(BaseURL + productUrlEgypt);
        } else if (webDriver.getCurrentUrl().contains("-qa/")) {
            webDriver.navigate().to(BaseURL + bogoUrlQatar);
        }
    else if (webDriver.getCurrentUrl().contains("-kw/")) {
            webDriver.navigate().to(BaseURL + bogoProduct);
        }
       else if (webDriver.getCurrentUrl().contains("-iq/")) {
            webDriver.navigate().to(BaseURL + bogoProductIraq);
        }

        else {
            webDriver.navigate().to(BasePage.BaseURL + bogoProduct);

        }
        checkIfProductOOS();
    }

    public void displayBundle() throws IOException {
        try{
//        webDriver.navigate().to(BasePage.BaseURL + bundleUrl);
        this.verifyTheDisplayedPageDoesNotHaveErrors();
//        DataHelperAndWait.waitForUrlContains(bundleUrl, webDriver);
        System.out.println("The product URL is: " + webDriver.getCurrentUrl());}
        catch (AssertionError e){
            if(webDriver.getCurrentUrl().contains("/en-eg")) {
                System.out.println("This product is Disable on Egypt");
            }
        }
    }

    public void navigateToHomePage() throws IOException {
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
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
    public void waitTillLoaderComplete(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(this.loadingLayout)));
    }
    public  void waitTillCartSpinnerDisappear(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(this.pageLoader)));

    }
       public  void waitTillCartSpinnerIconDisappear(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(spinnerIcon2)));

    }

       public  void waitTillCartSpinnerAppear(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(this.spinnerIcon)));

    }
       public  void waitTillCartLoaderInCreditCardDisappear(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(this.egyptLoaderInCheckOutForCreditCard)));

    }

}

