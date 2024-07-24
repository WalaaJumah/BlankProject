package helper_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitHelper extends Helper {

    public static void waitForElement(By element, WebDriver webDriver) {
        WebDriverWait wait;

        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(element)));
    }

    public static void waitTillURLContains(String text, WebDriver webDriver) {
        WebDriverWait wait;

        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.urlContains(text));
    }

    public static void waitTillBrowserHaveNumberOfTabs(int numberOfBrowserTab, WebDriver webDriver) {
        // Wait for the new tab/window to open
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.numberOfWindowsToBe(numberOfBrowserTab));
    }


    public static void deleteCookies(WebDriver webDriver) {
        webDriver.manage().deleteAllCookies();
        webDriver.manage().deleteAllCookies();
    }

    private static int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static void waitForTime(int mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void RandomWaitTime(int min, int max) throws InterruptedException {
        int randomWaitTime = getRandomNumberInRange(min, max);
        System.out.println("The Random Wait time is: " + randomWaitTime + " sec");
        Thread.sleep(randomWaitTime * 1000L);
    }

    public static int getRandomWaitTimeInMilliSec(int min, int max) {
        int randomWaitTime = getRandomNumberInRange(min, max);
        System.out.println("The Random Wait time is: " + randomWaitTime + " sec");
        return randomWaitTime * 100;

    }


    public static void implicitWait(int timeSecond, WebDriver webDriver) {
        webDriver.manage().timeouts().implicitlyWait(timeSecond, TimeUnit.SECONDS);
    }

    public static void waitToBeClickable(By element, WebDriver webDriver) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitToBeClickableWebElement(WebElement element, WebDriver webDriver) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitToBePresent(String Xpath, WebDriver webDriver) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
    }

    public static void waitToBePresent(By elemet, WebDriver webDriver) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.presenceOfElementLocated(elemet));
    }

    public static void waitToBeVisible(By element, WebDriver webDriver) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        try {
            wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(element)));
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(element)));
        }
    }

    public static void waitWebElementToBeVisible(WebElement element, WebDriver webDriver) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void fluentWait(WebElement element, int pollingEveryTime, WebDriver webDriver) {
        Wait<WebDriver> FWait = new FluentWait<WebDriver>(webDriver)
                .withTimeout(Duration.ofSeconds(WaitTime))
                .pollingEvery(Duration.ofSeconds(pollingEveryTime))
                .ignoring(NoSuchElementException.class);
        WebElement waitElement = FWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                if (element.isDisplayed()) {
                }
                return element;
            }
        });
    }

    public static void SpentTimeInSecond(long begin) {
        long end = System.currentTimeMillis();
        float time = end - begin;
        float timeInSec = time / 1000F;
        float timeInMin = timeInSec / 60F;
        System.out.println("Elapsed time in sec: " + timeInSec + " sec");
        System.out.println("Elapsed time in minutes: " + timeInMin + " min");
    }

    public static void captureJavaScriptErrors(WebDriver webDriver) {
        LogEntries jsErrors = webDriver.manage().logs().get(LogType.BROWSER);
        for (int i = 0; i < jsErrors.getAll().size() - 1; i++) {
            System.out.println("Error # " + i + " : " + jsErrors.getAll().get(i));
        }
    }

    public static String getPageReadyState(WebDriver webDriver1) {
        Object readyState = ((JavascriptExecutor) webDriver1).executeScript("return document.readyState");
        if (readyState != null) {
            return readyState.toString();
//                  return readyState;
        }
        return "";
    }

    public static void waitTillPageFullyLoaded(WebDriver webDriver) {
        new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime)).until(
                webDriver1 -> getPageReadyState(webDriver).equals("complete"));
    }

    public static void waitTillPageFullyLoaded2(WebDriver webDriver) {
        new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime)).until(
                (ExpectedCondition<Boolean>) driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
    }

    //      public static void waitTillPageFullyLoaded(WebDriver webDriver1){
//          new WebDriverWait(webDriver1, WaitTime).until(
//                  webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
//    }
    public static void EAGERLoadingInJavaScript(WebDriver webDriver1) {
        new WebDriverWait(webDriver1, Duration.ofSeconds(WaitTime)).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("loading"));
    }

    public static void noneLoadingInJavaScript(WebDriver webDriver1) {
        new WebDriverWait(webDriver1, Duration.ofSeconds(WaitTime)).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("none"));
    }

}