package core;

import error_helper.SiteErrorPage;
import site_pages.search.ArabicSearchPage;
import helper_classes.AssertionHelper;
import helper_classes.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasePage {
    public static String BaseURL = "";
    public static String ApartmentAdNumber = "";
    public static String VillaAdNumber = "";
    public static String FarmAdNumber = "";
    public static String LandAdNumber = "";
    public static String RentApartmentAdNumber = "";
    public static String RentVillaAdNumber = "";
    public static String RentFarmAdNumber = "";
    public static String RentLandAdNumber = "";
    public static String FullAdName = "";

    public static String registerAccountLink = "Account/Register";
    public static String profileLink = "/UserProfile";
    public static String addApartmentLink = "/Realestates/Create?CategoryID=1";
    public static String myPropertiesLink = "/Realestates/MyRealestates?tab=2";
    public static String favoriteLink = "/Realestates/MyRealestates?tab=2";
    public static String addVillaLink = "/Realestates/Create?CategoryID=2";
    public static String addFarmLink = "/Realestates/Create?CategoryID=3";
    public static String myProfileLink = "/UserProfile/index";
    public static String editProfileLink = "/UserProfile/EditProfile";
    public static String addLandLink = "/Realestates/Create?CategoryID=4";
    public static String changePasswordLink = "/Manage/ChangePassword";
    public static String profileServiceLink = "/UserProfile/ProfileService";
    public static String customersStoriesLink = "/Pages/UserTestimonials";
    public static String forgetPasswordLink = "/Account/ForgotPassword";
    public static String threeDTourSubLink = "core.windows.net";
    public static String apartmentBuySearchLink = "/Realestates/Search/WestAmman/Apartment/Buy";
    public static String loginLink = "/Account/Login";
    public static String signUpLink = "/Account/Register";
    public static String verifyPhoneNumberOTPLink = "VerifyPhoneNumber?PhoneNumber=%2B9627999995478&UserId=100ef0ad-c9c0-4cc7-94cc-f5efd78da6da";
    public static String whyEurekaLink = "/Pages/WhyEureka";
    public static String aboutUsLink = "/Pages/AboutUs";
    public static String fAQLink = "/Pages/FAQ";
    public static String termsConditionsLink = "/Pages/TermsConditions";
    public static String privacyPolicyLink = "/Pages/PrivacyPolicy";
    public static String facebookLink = "facebook.com/Eurekajor";
    public static String instagramLink = "instagram.com/eurekajor/";
    public WebDriver webDriver;
    By languageSwitcher = By.xpath("//li[@class='language']//a");
    private String pageTitle = null;
    private String pageSource = null;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getTitle() {
//        if (pageTitle == null) {
        pageTitle = webDriver.getTitle();
//        }
        return pageTitle;
    }

    public String getSourcePage() {
//        if (pageSource == null) {
//            pageSource = webDriver.getPageSource();
//        }
//        return pageSource;
        pageSource = webDriver.getPageSource();
        return pageSource;
    }

    public void switchToEnglish() {
        webDriver.findElement(languageSwitcher).click();
        WaitHelper.waitTillPageFullyLoaded(webDriver);
        AssertionHelper.assertionWebElementEqualText(languageSwitcher, webDriver, "عربي");
    }

    public void verifyTheDisplayedPageDoesNotHaveErrors() {
        Assert.assertFalse(this.getTitle().equalsIgnoreCase(SiteErrorPage.pageNotFoundErrorTitleEn), "Page Not Found! Please Try Later page is Displayed and the URL is " + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getTitle().equalsIgnoreCase(SiteErrorPage.pageNotFoundErrorTitleAr), "Page Not Found! Please Try Later page is Displayed and the URL is " + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getSourcePage().contains(SiteErrorPage.pageNotFoundErrorMsgAr), "Page Not Found! Please Try Later page is Displayed and the URL is" + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getSourcePage().contains(SiteErrorPage.pageNotFoundErrorMsgEn), "Page Not Found! Please Try Later page is Displayed and the URL is" + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getTitle().equalsIgnoreCase(SiteErrorPage.internalServerErrorTitleAr), "Internal Server Error! Please Try Later page is Displayed and the URL is " + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getTitle().equalsIgnoreCase(SiteErrorPage.internalServerErrorTitleEn), "Internal Server Error! Please Try Later page is Displayed and the URL is " + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getSourcePage().contains(SiteErrorPage.internalServerErrorMsgAr), "Internal Server Error! Please Try Later page is Displayed and the URL is" + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getSourcePage().contains(SiteErrorPage.internalServerErrorMsgEn), "Internal Server Error! Please Try Later page is Displayed and the URL is" + webDriver.getCurrentUrl());
    }

    public void navigateToHomePage() {
        webDriver.navigate().to(BaseURL);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void navigateToCustomersStoriesLink() {
        webDriver.navigate().to(BaseURL + customersStoriesLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void navigateToApartmentBuySearchLink() {
        webDriver.navigate().to(BaseURL + apartmentBuySearchLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
        WaitHelper.waitForTime(500);
    }

    public void navigateToSignUpLink() {
        webDriver.navigate().to(BaseURL + signUpLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void navigateToForgetPasswordLink() {
        webDriver.navigate().to(BaseURL + forgetPasswordLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void navigateToLoginLink() {
        webDriver.navigate().to(BaseURL + loginLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void navigateToAddApartmentLink() {
        webDriver.navigate().to(BaseURL + addApartmentLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void navigateToMyPropertiesLink() {
        webDriver.navigate().to(BaseURL + myPropertiesLink);
        ArabicSearchPage searchPage = new ArabicSearchPage(webDriver);
        verifyTheDisplayedPageDoesNotHaveErrors();
        searchPage.waitTillCartLoaderDisappear(webDriver);
    }

    public void navigateToAddVillaLink() {
        webDriver.navigate().to(BaseURL + addVillaLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void navigateToAddFarmLink() {
        webDriver.navigate().to(BaseURL + addFarmLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void navigateToAddLandLink() {
        webDriver.navigate().to(BaseURL + addLandLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void navigateToFavoriteLink() {
        webDriver.navigate().to(BaseURL + favoriteLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void navigateToMyProfileLink() {
        webDriver.navigate().to(BaseURL + myProfileLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void navigateToEditProfileLink() {
        webDriver.navigate().to(BaseURL + editProfileLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void navigateToChangePasswordLink() {
        webDriver.navigate().to(BaseURL + changePasswordLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void navigateToProfileServiceLink() {
        webDriver.navigate().to(BaseURL + profileServiceLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

}