package core;

import error_helper.EurekaErrorPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class BasePage {
    private String pageTitle = null;
    private String pageSource = null;
    public static String BaseURL = "";
    public static String registerAccountLink = "Account/Register";
    public static String loginLink = "Account/Login";
    public static String profileLink = "/UserProfile";
    public WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public String getTitle() {
        if (pageTitle == null) {
            pageTitle = webDriver.getTitle();
        }
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

    public void verifyTheDisplayedPageDoesNotHaveErrors(){
        Assert.assertFalse(this.getTitle().equalsIgnoreCase(EurekaErrorPage.internalServerErrorEn), "Internal Server Error! Please Try Later page is Displayed and the URL is " + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getSourcePage().contains(EurekaErrorPage.internalServerErrorEn), "Internal Server Error! Please Try Later page is Displayed and the URL is" + webDriver.getCurrentUrl());
             Assert.assertFalse(this.getTitle().equalsIgnoreCase(EurekaErrorPage.internalServerErrorAr), "Internal Server Error! Please Try Later page is Displayed and the URL is " + webDriver.getCurrentUrl());
        Assert.assertFalse(this.getSourcePage().contains(EurekaErrorPage.internalServerErrorAr), "Internal Server Error! Please Try Later page is Displayed and the URL is" + webDriver.getCurrentUrl());
    }

    public void navigateToHomePage(){
        webDriver.navigate().to(BaseURL);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
}