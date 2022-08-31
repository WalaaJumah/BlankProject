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
    public String siteURL = "http://www.sporter.com";
    public String stgSiteURL = "https://stg.sporter.com/en-ae";
    public String cartURL= "https://www.sporter.com/en-ae/checkout/cart/";
    public String aeSiteURL = "https://www.sporter.com/en-ae/";
    public String ksaSiteURL = "https://www.sporter.com/en-sa/";
    public String qaterSiteURL = "https://www.sporter.com/en-qa/";

    public String checkoutLoginStepURL = "https://www.sporter.com/en-ae/checkout/#checkout-login-step";
    public String freeCouponeCode= "spo15";
    public String discaountCouponeCode= "";


    public String outOfStockProduct = "https://www.sporter.com/en-ae/grenade-reload-protein-oat-bar";
    public static WebDriver webDriver;
    public static WebDriver driver;
//    The Below Methods we need to run the TCs across the broswers
//    @BeforeMethod
//    @Parameters("browser")
//    public void setupBrowser( String browser) throws Exception {
////Check if parameter passed from TestNG is 'firefox'
//        switch (browser) {
    //Check if parameter passed from TestNG is 'firefox'
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
    public void setupBrowser( ) throws Exception {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\w.jumaa\\chromedriver.exe");
    webDriver = new ChromeDriver();
    webDriver.manage().window().maximize();
    webDriver.navigate().to(siteURL);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown()  {
        webDriver.quit();
//        webDriver.close();
    }
}