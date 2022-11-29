package core;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import javax.xml.crypto.Data;
import java.time.Duration;
import java.util.*;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
public class DataHelperAndWait extends BaseTest {
    public static WebDriverWait wait;

    public static void waitForElement(WebElement element, int Time) {
        wait = new WebDriverWait(webDriver, Time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForTime(int milis) {
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
    public static void selectFromDropDownList(String element, List<WebElement> list) {
        for (WebElement option : list) {
            if (option.getText().equalsIgnoreCase(element)) {
                option.click();
                break;
            }
        }
    }
    public static boolean isWebElementPresent(WebElement webElement) {
        try {
            webElement.isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static void uploadImage(WebElement element, String imageName) {
        String path;
        path = System.getProperty("user.dir") + "/src/test/resources/Images/" + imageName;
        element.sendKeys(path);
    }
    public static void scrollTo(WebElement element) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public static void scrollBy() {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,2000)", "");
    }
    public static void HandlingWindowMethods() {
        String mainWindowHandle = webDriver.getWindowHandle();
        Set<String> allWindowHandles = webDriver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                webDriver.switchTo().window(ChildWindow);
            }
        }
    }

    public static void clearWebField(WebElement element) {
        while (!element.getAttribute("value").equals("")) {
            element.sendKeys(Keys.BACK_SPACE);
        }
    }
}