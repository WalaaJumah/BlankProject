package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
    //    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static String browserName;
    public WebDriver webDriver;

    @BeforeClass(alwaysRun = true)
    @Parameters({"baseUrl", "browser"})
    public void setupBrowser(String baseUrl, String browser) throws Exception {
        this.browserName = browser;
        BasePage.BaseURL = baseUrl;
        try {
            switch (browser) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
                    webDriver = new FirefoxDriver(firefoxOptions);
                    break;
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
//                     options.addArguments("headless");
//                     options.addArguments("disable-gpu");
                    options.addArguments("--force-device-scale-factor=0.9");
                    options.addArguments("--disable-notifications");
                    options.addArguments("window-size=1200,1100");
                    webDriver = new ChromeDriver(options);
                    break;
                case "edge":
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
            webDriver.navigate().to(BasePage.BaseURL);
        } catch (Exception e) {
            tearDown();
            switch (browser) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
                    webDriver = new FirefoxDriver(firefoxOptions);
                    break;
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
//                     options.addArguments("headless");
//                     options.addArguments("disable-gpu");
                    options.addArguments("--force-device-scale-factor=0.9");
                    options.addArguments("--disable-notifications");
                    options.addArguments("window-size=1200,1100");
                    webDriver = new ChromeDriver(options);
                    break;
                case "edge":
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
            webDriver.navigate().to(BasePage.BaseURL);
        }
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (webDriver != null)
            webDriver.quit();
    }
}