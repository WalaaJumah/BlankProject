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

//    @Parameters({"environment"})
//
//    public BaseTest(@Optional("production") String environment) throws Exception {
//      this.setupBrowser(environment);
//        }



//    public  String siteURL = "https://www.sporter.com";
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
    public final String product = "/en-ae/optimum-gold-standard-100-whey";
    public static String environmentName;
    public  WebDriver webDriver;
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

    @BeforeClass(alwaysRun = true)
    @Parameters({"environment"})
    public void setupBrowser( String environment) throws Exception {
        System.out.println("SetUp Browser method");
        environmentName=environment;
        //This ChromeWebDriver 108

        switch (environment){
            case "production":
//                System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
                System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
                BasePage.siteURL = "https://www.sporter.com";
                webDriver = new ChromeDriver();
                webDriver.manage().window().maximize();
                webDriver.navigate().to(BasePage.siteURL);
                break;
            case "stg":
                System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
                BasePage.siteURL = "https://stg.sporter.com";
                webDriver = new ChromeDriver();
                webDriver.manage().window().maximize();
                webDriver.navigate().to(BasePage.siteURL);
                break;
            case "stgTest":
                System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
                BasePage.siteURL ="https://stg-test.sporter.com";
                webDriver = new ChromeDriver();
                webDriver.manage().window().maximize();
                webDriver.navigate().to(BasePage.siteURL);
                break;
            case "staging2":
                System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
                BasePage.siteURL ="https://staging2.sporter.com";
                webDriver = new ChromeDriver();
                webDriver.manage().window().maximize();
                webDriver.navigate().to(BasePage.siteURL);
                break;
            default:
                throw new Exception("environment is not correct");

        }
    }
//    @BeforeGroups(groups = "Smoke Testing Report")
//    @Parameters({"environment"})
//
//    public void setupBrowserForGroup(String environment) throws Exception {
//        this.setupBrowser( environment);}

    @AfterClass(alwaysRun = true)
    public void tearDown()  {
        if(webDriver != null)
        webDriver.quit();
    }
}