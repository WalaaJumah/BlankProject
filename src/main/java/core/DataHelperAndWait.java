package core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
public class DataHelperAndWait extends BaseTest {
    public static WebDriverWait wait;
    public static void waitForElement(WebElement element, int Time) {
        wait = new WebDriverWait(webDriver, Time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForTime(int milis) {
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
    public static boolean isWebElementPresent(WebElement webElement) {
        try {
            webElement.isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static void implicitWait(int timeSecond) {
        webDriver.manage().timeouts().implicitlyWait(timeSecond, TimeUnit.SECONDS);
    }
    public static void waitToBeClickable(WebElement element, int Time) {
        wait = new WebDriverWait(webDriver, Time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void waitToBePresent(String Xpath, int Time) {
        wait = new WebDriverWait(webDriver, Time);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
    }
    public static void waitToBeVisible(WebElement element, int Time) {
        wait = new WebDriverWait(webDriver, Time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void refreshPage() {
        webDriver.navigate().refresh();
    }
    public static void selectAllDropDownListOptions(Select select) {
        List<WebElement> elementCount = select.getOptions();
        int menuSize = elementCount.size();
        for (int i = 0; i < menuSize; i++) {
            select.selectByIndex(i);
        }
    }
    public static void fluentWait(WebElement element, int timeOut, int pollingEveryTime) {
        Wait<WebDriver> Fwait = new FluentWait<WebDriver>(webDriver)
                .withTimeout(Duration.ofSeconds(timeOut))
                .pollingEvery(Duration.ofSeconds(pollingEveryTime))
                .ignoring(NoSuchElementException.class);
        WebElement waitElement = Fwait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                if (element.isDisplayed()) {
                }
                return element;
            }
        });
    }
}