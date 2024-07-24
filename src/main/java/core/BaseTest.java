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
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import services.ScreenshotService;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseTest {
    //    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static String browserName;
    public WebDriver webDriver;
    public String Language;

    @BeforeClass(alwaysRun = true)
    @Parameters({
            "baseUrl", "browser", "ApartmentAdNumber", "VillaAdNumber", "FarmAdNumber", "LandAdNumber",
            "RentApartmentAdNumber", "RentVillaAdNumber", "RentFarmAdNumber", "RentLandAdNumber", "FullAdName"
    })
    public void setupBrowser(String baseUrl, String browser, String ApartmentAdNumber, String VillaAdNumber, String FarmAdNumber, String LandAdNumber, String RentApartmentAdNumber, String RentVillaAdNumber, String RentFarmAdNumber, String RentLandAdNumber, String FullAdName) throws Exception {
        browserName = browser;
        BasePage.BaseURL = baseUrl;
        BasePage.ApartmentAdNumber = ApartmentAdNumber;
        BasePage.VillaAdNumber = VillaAdNumber;
        BasePage.FarmAdNumber = FarmAdNumber;
        BasePage.LandAdNumber = LandAdNumber;
        BasePage.ApartmentAdNumber = RentApartmentAdNumber;
        BasePage.VillaAdNumber = RentVillaAdNumber;
        BasePage.FarmAdNumber = RentFarmAdNumber;
        BasePage.LandAdNumber = RentLandAdNumber;
        BasePage.FullAdName = FullAdName;

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
//                    options.addArguments("--force-device-scale-factor=0.9");
//                    options.addArguments("--disable-notifications");
//                    options.addArguments("--force-device-scale-factor=0.9");
//                    options.addArguments("--disable-notifications");
                    options.addArguments("window-size=1200,1100");
                    webDriver = new ChromeDriver(options);
                    break;
                case "edge":
//                    WebDriverManager.edgedriver().setup();
                    EdgeOptions edgeOptions = new EdgeOptions();
//                    edgeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
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
//                    options.addArguments("--force-device-scale-factor=0.9");
                    options.addArguments("--disable-notifications");
//                    options.addArguments("window-size=1200,1100");
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

    protected WebDriver createWebDriver(String browser) throws Exception {
        switch (browser) {
            case "chrome":
//                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--disable-notifications");
//                chromeOptions.addArguments("--remote-allow-origins=*");
//                chromeOptions.addArguments("--headless");
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
                webDriver = new ChromeDriver(chromeOptions);
                webDriver.manage().window().maximize();
                //**Chrome Headless
//                WebDriverManager.chromedriver().setup();
//                ChromeOptions chromeOptions = new ChromeOptions();
//                 chromeOptions.addArguments("headless");
//                 chromeOptions.addArguments("disable-gpu");
//                  chromeOptions.addArguments("window-size=1200,1100");
//                chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
//                webDriver = new ChromeDriver(chromeOptions);
//                webDriver.manage().window().maximize();
                return webDriver;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
                webDriver = new FirefoxDriver(firefoxOptions);
                webDriver.manage().window().maximize();
                return webDriver;

            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
                webDriver = new EdgeDriver(edgeOptions);
                webDriver.manage().window().maximize();
                return webDriver;

            default:
////If no browser passed throw exception
                throw new Exception("Browser is not correct");
        }

    }

    protected void quit(WebDriver webDriver) {
        if (webDriver != null)
            webDriver.quit();
    }

    protected void resetDriver(WebDriver webDriver, String browser) throws Exception {
        quit(webDriver);
        createWebDriver(browser);
    }

    //    @AfterMethod // After any testcase
    public void takeScreenShotForFailure(ITestResult result) {
        String pattern = "yyyy-MM-dd-hh-mm-ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        String testCaseName = result.getMethod().getMethodName();
        File destFile = new File("src/test/resources" + File.separator + "screenshots" + File.separator + getClass().getSimpleName() + "/" + testCaseName + "/" + date + ".png");
        if (ITestResult.FAILURE == result.getStatus()) {
            ScreenshotService.takeScreenShot(destFile, webDriver);
        }
    }
}