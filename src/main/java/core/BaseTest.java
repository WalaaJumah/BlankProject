package core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;

public class BaseTest {
//    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static String siteURL = "https://www.sporter.com";
    public static String aeDomain = "/en-ae";
    public static String websiteEnglishLanguage = "/en";
    public static String websiteArabicLanguage = "/ar";
    public static String websiteLanguage ;

    public static String uaeWebsite = "-ae/";
    public String stgSiteURL = "https://stg.sporter.com";
    public String stgTestSiteURL = "https://stg-test.sporter.com";
    public String staging2SiteURL = "https://staging2.sporter.com";
    public String cartURL= "/en-ae/checkout/cart/";
    public String aeSiteURL = "/en-ae/";
    public String ksaSiteURL = "/en-sa/";
    public String qaterSiteURL = "/en-qa/";
    public String checkoutLoginStepURL = "/en-ae/checkout/#checkout-login-step";
    public String freeCouponeCode= "spo15";
    public String discaountCouponeCode= "";
    public String outOfStockProduct = "/en-ae/healthy-food/snacks-drinks/spreads/gymqueen-smooth-peanut-butter-spread";
    public String product = "/en-ae/optimum-gold-standard-100-whey";
    public static String environmentName;
    public static WebDriver webDriver;
//    The Below Methods we need to run the TCs across the broswers
//    @BeforeMethod
//    @Parameters("browser")
//    public void setupBrowser( String browser) throws Exception {
////Check if parameter passed from TestNG is 'firefox'
//        switch (browser) {
////    Check if parameter passed from TestNG is 'firefox'
//            case "firefox":
//                System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
//                webDriver = new FirefoxDriver();
//                webDriver.manage().window().maximize();
//                webDriver.navigate().to(siteURL);
//                break;
//            case "chrome":
//                System.setProperty("webdriver.chrome.driver","C:\\Users\\w.jumaa\\chromedriver.exe");
//                webDriver = new ChromeDriver();
//                webDriver.manage().window().maximize();
//                webDriver.navigate().to(siteURL);
//                break;
//            case "Edge":
//                System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe");
//                webDriver = new EdgeDriver();
//                webDriver.manage().window().maximize();
//                webDriver.navigate().to(siteURL);
//                break;
//            default:
//////If no browser passed throw exception
//                throw new Exception("Browser is not correct");
//        }
//    }

    // The Below Method to run the TCs on Onc Browser like Chrome
    @BeforeMethod
    @Parameters({"environment"})
    public void setupBrowser( String environment) throws Exception {
        environmentName=environment;
        //This ChromeWebDriver 108

        switch (environment){
            case "production":
//                System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
                System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
                siteURL = "https://www.sporter.com";
                webDriver = new ChromeDriver();
                webDriver.manage().window().maximize();
                webDriver.navigate().to(siteURL);
                break;
            case "stg":
                System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
                siteURL = "https://stg.sporter.com";
                webDriver = new ChromeDriver();
                webDriver.manage().window().maximize();
                webDriver.navigate().to(siteURL);
                break;
            case "stgTest":
                System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
                siteURL ="https://stg-test.sporter.com";
                webDriver = new ChromeDriver();
                webDriver.manage().window().maximize();
                webDriver.navigate().to(siteURL);
                break;
            case "staging2":
                System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
                siteURL ="https://staging2.sporter.com";
                webDriver = new ChromeDriver();
                webDriver.manage().window().maximize();
                webDriver.navigate().to(siteURL);
                break;
            default:
                throw new Exception("environment is not correct");

        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown()  {webDriver.quit();}
}