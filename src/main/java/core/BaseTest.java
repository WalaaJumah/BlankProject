package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public String siteURL= "http://www.sporter.com";
    public String aeSiteURL="https://www.sporter.com/en-ae/";
    public String productWithFreeGift= "https://www.sporter.com/en-ae/all-max-classic-all-whey-protein-100-49235/#";
    public String productWithoutGift= "https://www.sporter.com/en-ae/sleep-hair/";
    public String outOfStockProduct= "https://www.sporter.com/en-ae/grenade-reload-protein-oat-bar";
    public static WebDriver webDriver;
@BeforeMethod
    public void defineDriver() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\w.jumaa\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.navigate().to(siteURL);
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown()throws Exception {
        webDriver.close();
//        webDriver.quit();
    }
}
