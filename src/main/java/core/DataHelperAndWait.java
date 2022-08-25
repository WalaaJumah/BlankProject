package core;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import javax.xml.crypto.Data;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
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
    public static boolean isPresent(WebElement webElement) {
        if (webElement.isDisplayed())
            return true;
        else
            return false;
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

    //JS Executor
    public static void JsExecutorToClickOnElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        //Find The element
        jse.executeScript("arguments[0].click()", element);
    }

    public static float convertTheStringToFloat(WebElement element) {
        String elementValue = element.getText();
        String elementValueWithoutCurrency = elementValue.replaceAll("AED", "");
        String elementValueWithoutSpace = elementValueWithoutCurrency.replaceAll(" ", "");
        float elemetdouble = Float.parseFloat(elementValueWithoutSpace);
        return elemetdouble;
    }
    public static void switchToTabBrowser(int tabIndex) {
        ArrayList<String> numberOfTabsTwo = new ArrayList<String>(webDriver.getWindowHandles());
        webDriver.switchTo().window(numberOfTabsTwo.get(tabIndex));
    }
    public String generateRandomEmail(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return "username"+ randomInt +"@gmail.com";
    }

    }