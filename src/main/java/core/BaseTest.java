package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
//    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

//    @Parameters({"environment"})
//
//    public BaseTest(@Optional("production") String environment) throws Exception {
//      this.setupBrowser(environment);
//        }


    public static String environmentName;
    public static String browserName;
    public static String countryUrl;
    //    public  String siteURL = "https://www.sporter.com";
    public final String aeDomain = "/en-ae";
    public final String websiteEnglishLanguage = "/en";
    public final String websiteArabicLanguage = "/ar";
    public final String stgSiteURL = "https://stg.sporter.com";
    public final String stgTestSiteURL = "https://stg-test.sporter.com";
    public final String staging2SiteURL = "https://staging2.sporter.com";
    public final String cartURL = "/checkout/cart/";
    public final String aeSiteURL = "/en-ae/";
    public final String ksaSiteURL = "/ar-sa/";
    public final String qatarSiteURL = "/en-qa/";
    public final String checkoutLoginStepURL = "/checkout";
    public final String freeCouponeCode = "spo15";
    public final String discaountCouponeCode = "";
    public final String product = "/en-ae/optimum-gold-standard-100-whey";
    public WebDriver webDriver;

    public void CloseInitialDialog() {
        try {
            WebElement btnCloseElement = webDriver.findElement(By.xpath("(//button[@type='submit'])[1]"));
            DataHelperAndWait.waitToBeClickable(btnCloseElement, webDriver);
            if (btnCloseElement != null
                    && btnCloseElement.isDisplayed()) {
                DataHelperAndWait.clickOnElement(btnCloseElement, webDriver);
            }
        } catch (NoSuchElementException ex) {
            try {
                WebElement btnCloseElement = webDriver.findElement(By.xpath("(//button[@type='submit'])[1]"));
                if (btnCloseElement != null
                        && btnCloseElement.isDisplayed()) {
                    DataHelperAndWait.clickOnElement(btnCloseElement, webDriver);
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    // The Below Method to run the TCs on Onc Browser like Chrome

    @BeforeClass(alwaysRun = true)
    @Parameters({"environment", "browser", "country", "bogoProduct", "oOSProduct", "bundleProductUrl"})
    public void setupBrowser(String environment, String browser, @Optional("") String country, String bogoProduct, String oOSProduct, String bundleProductUrl) throws Exception {
        environmentName = environment;
        this.browserName = browser;
        BasePage.BaseURL = environment;
        this.countryUrl = country;
        BasePage.bogoProduct = bogoProduct;
        BasePage.oOSProductUrl = oOSProduct;
        BasePage.bundleUrl = bundleProductUrl;
        try {
            //This ChromeWebDriver 108
            switch (browser) {
//    Check if parameter passed from TestNG is 'firefox'

                case "firefox":
                    //Selenium 3.151
//                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
//                webDriver = new FirefoxDriver();
//                //FirefoxDriver headless
//                FirefoxOptions options  = new FirefoxOptions();
//                options.addArguments("headless");
//                webDriver = new FirefoxDriver(options);

                    //selenium 4.10
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
                    webDriver = new FirefoxDriver(firefoxOptions);
                    break;
                case "chrome":
                    //Selenium Version 3
                    //This Statement will run always
//                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver114.exe");
//                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriverVersion110.exe");

//                ChromeOptions chromeOptions=new ChromeOptions();
//                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//                webDriver = new ChromeDriver(chromeOptions);
//                webDriver = new ChromeDriver();
                    //Chrome headless
//                ChromeOptions opt = new ChromeOptions();
//                opt.addArguments("headless");
//                 webDriver = new ChromeDriver(opt);

                    //Chrome Headless from https://stackoverflow.com/questions/45562750/elementnotvisibleexception-when-use-headless-chrome-browser
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("headless");
//                options.addArguments("disable-gpu");
//                options.addArguments("window-size=1200,1100");
//                webDriver = new ChromeDriver(options);
//                webDriver.navigate().to("https://www.sporter.com");

                    //Selenium Version4.10
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
//                    chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
                    webDriver = new ChromeDriver();
                    webDriver.navigate().to("https://www.sporter.com");
                    //**Chrome Headless
//                WebDriverManager.chromedriver().setup();
//                ChromeOptions chromeOptions = new ChromeOptions();
//                 chromeOptions.addArguments("headless");
//                 chromeOptions.addArguments("disable-gpu");
//                  chromeOptions.addArguments("window-size=1200,1100");
//                chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
//                webDriver = new ChromeDriver(chromeOptions);
//                webDriver.manage().window().maximize();

                    break;
                case "edge":
                    //Selenium 3
//                System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
//                webDriver = new EdgeDriver();
//                Selenium 4.10
                    WebDriverManager.edgedriver().setup();
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
                    webDriver = new EdgeDriver(edgeOptions);
                    break;
                default:
////If no browser passed throw exception
                    throw new Exception("Browser is not correct");
            }
            webDriver.manage().window().maximize();
//        webDriver.navigate().to(environment);
            webDriver.navigate().to(environment + "/" + country);
            //this.CloseInitialDialog();
        }
        catch (Exception ee){
            if(webDriver!=null)
                tearDown();
            //This ChromeWebDriver 108
            switch (browser) {
//    Check if parameter passed from TestNG is 'firefox'

                case "firefox":
                    //Selenium 3.151
//                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
//                webDriver = new FirefoxDriver();
//                //FirefoxDriver headless
//                FirefoxOptions options  = new FirefoxOptions();
//                options.addArguments("headless");
//                webDriver = new FirefoxDriver(options);

                    //selenium 4.10
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
                    webDriver = new FirefoxDriver(firefoxOptions);
                    break;
                case "chrome":
                    //Selenium Version 3
                    //This Statement will run always
//                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver114.exe");
//                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriverVersion110.exe");

//                ChromeOptions chromeOptions=new ChromeOptions();
//                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//                webDriver = new ChromeDriver(chromeOptions);
//                webDriver = new ChromeDriver();
                    //Chrome headless
//                ChromeOptions opt = new ChromeOptions();
//                opt.addArguments("headless");
//                 webDriver = new ChromeDriver(opt);

                    //Chrome Headless from https://stackoverflow.com/questions/45562750/elementnotvisibleexception-when-use-headless-chrome-browser
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("headless");
//                options.addArguments("disable-gpu");
//                options.addArguments("window-size=1200,1100");
//                webDriver = new ChromeDriver(options);
//                webDriver.navigate().to("https://www.sporter.com");

                    //Selenium Version4.10
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
                    webDriver = new ChromeDriver(chromeOptions);
                    webDriver.navigate().to("https://www.sporter.com");
                    //**Chrome Headless
//                WebDriverManager.chromedriver().setup();
//                ChromeOptions chromeOptions = new ChromeOptions();
//                 chromeOptions.addArguments("headless");
//                 chromeOptions.addArguments("disable-gpu");
//                  chromeOptions.addArguments("window-size=1200,1100");
//                chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
//                webDriver = new ChromeDriver(chromeOptions);
//                webDriver.manage().window().maximize();

                    break;
                case "edge":
                    //Selenium 3
//                System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
//                webDriver = new EdgeDriver();
//                Selenium 4.10
                    WebDriverManager.edgedriver().setup();
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
                    webDriver = new EdgeDriver(edgeOptions);
                    break;
                default:
////If no browser passed throw exception
                    throw new Exception("Browser is not correct");
            }
            webDriver.manage().window().maximize();
//        webDriver.navigate().to(environment);
            webDriver.navigate().to(environment + "/" + country);
            //this.CloseInitialDialog();
        }
    }


//    @BeforeGroups(groups = "All Smoke Testing Result")
//    @Parameters({"environment"})
//
//    public void setupBrowserForGroup(String environment) throws Exception {
//        this.setupBrowser( environment);}

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (webDriver != null)
            webDriver.quit();
    }
}