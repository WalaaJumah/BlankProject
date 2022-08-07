package core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class BaseTest {
    public String siteURL = "http://www.sporter.com";
    public String cartURL= "https://www.sporter.com/en-ae/checkout/cart/";
    public String aeSiteURL = "https://www.sporter.com/en-ae/";
    public String productWithFreeGift = "https://www.sporter.com/en-ae/all-max-classic-all-whey-protein-100-49235/#";
    public String productWithoutGift = "https://www.sporter.com/en-ae/sleep-hair/";
    public String outOfStockProduct = "https://www.sporter.com/en-ae/grenade-reload-protein-oat-bar";
    public static WebDriver webDriver;
    @BeforeMethod
    @Parameters("browser")
    public void setupBrowser(String browser) throws Exception {
//Check if parameter passed from TestNG is 'firefox'
        switch (browser) {
            case "firefox":
//                System.setProperty("webdriver.gecko.driver", "C:\\Users\\w.jumaa\\geckodriver.exe");
                System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
                webDriver = new FirefoxDriver();
                webDriver.manage().window().maximize();
                webDriver.navigate().to(siteURL);
                break;
            case "chrome":
//                System.setProperty("webdriver.chrome.driver", "C:\\Users\\w.jumaa\\chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                webDriver = new ChromeDriver();
                webDriver.manage().window().maximize();
                webDriver.navigate().to(siteURL);
                break;
            case "Edge":
//                System.setProperty("webdriver.edge.driver", "C:\\Users\\w.jumaa\\msedgedriver.exe");
                System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe");
                webDriver = new EdgeDriver();
                webDriver.manage().window().maximize();
                webDriver.navigate().to(siteURL);
                break;
            default:
////If no browser passed throw exception
                throw new Exception("Browser is not correct");
        }
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        webDriver.close();
    }
}