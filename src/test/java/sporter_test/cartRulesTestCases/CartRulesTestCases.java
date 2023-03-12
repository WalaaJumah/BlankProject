/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.cartRulesTestCases;

import core.BasePage;
import core.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class CartRulesTestCases extends BaseTest {
    String storeCountry;
    String countryCode;
    @Parameters({"environment", "browser", "country","bogoProduct","oOSProduct","bundleProductUrl"})
    public void setupBrowserFromTheClass(String environment, String browser,@Optional("") String country,String bogoProduct, String oOSProduct,String bundleProductUrl) throws Exception {
            environmentName=environment;
            this.browserName = browser;
            BasePage.BaseURL=environment;
            this.countryUrl=country;
            BasePage.bogoProduct=bogoProduct;
            BasePage.oOSProductUrl=oOSProduct;
            BasePage.bundleUrl=bundleProductUrl;
            //This ChromeWebDriver 108
            switch (browser) {
//    Check if parameter passed from TestNG is 'firefox'
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
                    webDriver = new FirefoxDriver();
                    //FirefoxDriver headless
//                FirefoxOptions options  = new FirefoxOptions();
//                options.addArguments("headless");
//                webDriver = new FirefoxDriver(options);
                    break;
                case "chrome":
                    //This Statement will run always
//                System.setProperty("webdriver.chrome.driver", "C:\\Users\\w.jumaa\\Downloads\\chromedriver1.exe");
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriverVersion110.exe");
                    //This if we need to run the Script using the Normal WebDriver
                    webDriver = new ChromeDriver();
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
                    break;
                case "edge":
                    System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
                    webDriver = new EdgeDriver();
                    break;
                default:
////If no browser passed throw exception
                    throw new Exception("Browser is not correct");
            }
            webDriver.manage().window().maximize();
//        webDriver.navigate().to(environment);
            webDriver.navigate().to(environment+"/"+country);
            this.CloseInitialDialog();
        }
    public void tearDown()  {
        if(webDriver != null)
            webDriver.quit();
    }
}
