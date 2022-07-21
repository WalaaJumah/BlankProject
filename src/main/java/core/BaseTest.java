package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public String siteURL= "http://www.sporter.com";
    public String productWithFreeGift= "https://www.sporter.com/en-ae/optimum-gold-standard-100-whey-8822/#";
    public String productWithoutGift= "https://www.sporter.com/en-ae/sleep-hair/";
    public String outOfStockProduct= "https://www.sporter.com/en-ae/grenade-reload-protein-oat-bar";
    public static WebDriver webDriver;
@BeforeTest
    public void defineDriver() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\w.jumaa\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.navigate().to(siteURL);
    }
    @AfterTest
    public void tearDown() {
        webDriver.close();

    }
}
