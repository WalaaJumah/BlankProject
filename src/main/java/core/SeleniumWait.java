package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumWait extends BaseTest {
    public static WebDriverWait wait;
    public static void waitForElement(WebElement element, int Time) {
         wait = new WebDriverWait(webDriver, Time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public  void waitForTime(int milis) {

        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static boolean isDisplayed(WebElement element, int Time) {
         wait = new WebDriverWait(webDriver, Time);
        return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }
    public  boolean isWebElementPresent(WebElement webElement) {
        try {
            webElement.isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public  void implicitWait(int timeSecond) {
        webDriver.manage().timeouts().implicitlyWait(timeSecond, TimeUnit.SECONDS);
    }
    public void waitToBeClickable(WebElement element, int Time) {
        wait = new WebDriverWait(webDriver, Time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitToBePresent(String Xpath, int Time) {
        wait = new WebDriverWait(webDriver, Time);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
    }
    public  void refreshPage() {
        webDriver.navigate().refresh();
    }
}
