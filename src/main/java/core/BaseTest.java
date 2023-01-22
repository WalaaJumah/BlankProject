package core;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
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
    public final String cartURL= "/checkout/cart/";
    public final String aeSiteURL = "/en-ae/";
    public final String ksaSiteURL = "/en-sa/";
    public final String qaterSiteURL = "/en-qa/";
    public final String checkoutLoginStepURL = "/en-ae/checkout/#checkout-login-step";
    public final String freeCouponeCode= "spo15";
    public final String discaountCouponeCode= "";
    public final String product = "/en-ae/optimum-gold-standard-100-whey";
    public static String environmentName;
    public static String browserName;
    public static String countryUrl;
    public  WebDriver webDriver;
    public void CloseInitialDialog() {
        WebElement btnCloseElement = webDriver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        try{
            System.out.println("You are in CloseInitialDialog method ");
            DataHelperAndWait.waitToBeClickable(btnCloseElement,webDriver);
            if (btnCloseElement != null
                    && btnCloseElement.isDisplayed()) {
                DataHelperAndWait.clickOnElement(btnCloseElement,webDriver);
                System.out.println("You are in CloseInitialDialog method Yes");
            }
        }
        catch (NoSuchElementException ex) {
            try{
            if (btnCloseElement != null
                    && btnCloseElement.isDisplayed()) {
                DataHelperAndWait.clickOnElement(btnCloseElement,webDriver);
                System.out.println("You are in CloseInitialDialog method Yes2");
            }}
            catch (Exception e){
                e.getMessage();
            }
        }}

    // The Below Method to run the TCs on Onc Browser like Chrome

    @BeforeClass(alwaysRun = true)
    @Parameters({"environment", "browser", "country","bogoProduct"})
    public void setupBrowser( String environment, String browser,@Optional("") String country,String bogoProduct) throws Exception {
        environmentName=environment;
        this.browserName = browser;
        BasePage.BaseURL=environment;
        this.countryUrl=country;
        BasePage.bogoProduct=bogoProduct;
        //This ChromeWebDriver 108
        switch (browser) {
//    Check if parameter passed from TestNG is 'firefox'

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
                webDriver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                webDriver = new ChromeDriver();
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









//    @BeforeGroups(groups = "All Smoke Testing Result")
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