/**
 * @author w.jumaa
 * @projectName price_comparison_tool
 * @classDescription
 */

package helper_classes;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class ElementHelper {

    public static boolean isDisplayed(WebElement element, WebDriver webDriver, int WaitTime) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }

    public static boolean isPresent(WebElement webElement, WebDriver webDriver) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException exception) {
            return false;
        }
    }

    public static void selectAllDropDownListOptions(Select select) {
        List<WebElement> elementCount = select.getOptions();
        int menuSize = elementCount.size();
        for (int i = 0; i < menuSize; i++) {
            select.selectByIndex(i);
        }
    }

    public static void JsExecutorToClickOnElement(WebElement element, WebDriver webDriver) {
        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("arguments[0]." +
                "focus(); arguments[0].click();", element);
    }

    public static ExpectedCondition<Alert> HandleAlertInner(WebDriver driver) {
        return new ExpectedCondition<Alert>() {
            @Override
            public Alert apply(WebDriver driver) {
                try {
                    return driver.switchTo().alert();
                } catch (NoAlertPresentException e) {
                    return null;
                }
            }
        };
    }
    public static boolean IsElementPresent(WebElement element) {

        try {
            if(element == null)
                return false;

            return element.isDisplayed() ;

        }catch (Exception e)
        {
            return false;
        }
    }
    public static void selectFromDropDownList(String element, List<WebElement> list) {
        for (WebElement option : list) {
            if (option.getText().equalsIgnoreCase(element)) {
                option.click();
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

    public static void scrollTo(WebElement element, WebDriver webDriver, int WaitTime) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(false);", element);
        WaitHelper.waitToBeVisible(element, webDriver, WaitTime);
    }

    public static void scrollToEnd(WebDriver webDriver) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public static void scrollToTop(WebDriver webDriver) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,-350)", "");
    }

    public static void scrollToEndThenTopMultiTime(int min, int max, WebDriver webDriver) throws IOException, InterruptedException {
        WaitHelper.RandomWaitTime(min, max);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        scrollToEnd(webDriver);
        WaitHelper.RandomWaitTime(min, max);
        js.executeScript("window.scrollBy(0,-350)", "");
        WaitHelper.RandomWaitTime(min, max);
        js.executeScript("window.scrollBy(0,0)", "");

    }


    public static void scrollToPositionZero(WebDriver webDriver) {
        ((JavascriptExecutor) webDriver).executeScript("window.scroll(0,0)", "");
    }

    public static void scrollBy(WebDriver webDriver) {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,2000)", "");
    }

    public static void HandlingWindowMethods(WebDriver webDriver) {
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

    public static void clearWebField(WebElement element, WebDriver webDriver) {
        while (!element.getAttribute("value").equals("")) {
            element.sendKeys(Keys.BACK_SPACE);
        }
    }

    public static void clearWebField(WebElement element) {
        while (!element.getAttribute("value").equals("")) {
            element.sendKeys(Keys.BACK_SPACE);
        }
    }

    public static void updateAllText(WebElement element, String newText) {
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"), newText);
    }

    public static void clickOnElement(WebElement webElement, WebDriver webDriver, int WaitTime) {
        try {
            WaitHelper.waitToBeVisible(webElement, webDriver, WaitTime);
            webElement.click();
        } catch (Exception e) {
            Actions action = new Actions(webDriver);
            WaitHelper.waitToBeVisible(webElement, webDriver, WaitTime);
            action.moveToElement(webElement).click();
        }
    }

    public static void typeTextInElement(WebElement webElement, WebDriver webDriver, String text, int WaitTime) {
        try {
            WaitHelper.waitToBeVisible(webElement, webDriver, WaitTime);
            webElement.sendKeys(text);
        } catch (Exception e) {
            WaitHelper.waitToBeVisible(webElement, webDriver, WaitTime);
            webElement.sendKeys(text);
        }
    }

    public static void slowType(WebElement element, String text, WebDriver webDriver, int WaitTime) throws IOException, InterruptedException {
        try {
            WaitHelper.waitToBeVisible(element, webDriver, WaitTime);
            for (char c : text.toCharArray()) {
                String character = String.valueOf(c);
                element.sendKeys(character);

                try {
                    Thread.sleep(WaitHelper.getRandomWaitTimeInMiliSec(1, 3));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            ElementHelper.clearWebField(element);
            WaitHelper.waitToBeVisible(element, webDriver, WaitTime);
            for (char c : text.toCharArray()) {
                String character = String.valueOf(c);
                element.sendKeys(character);

                try {
                    Thread.sleep(WaitHelper.getRandomWaitTimeInMiliSec(1, 3));
                } catch (InterruptedException e1) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static String getWebElementText(WebElement webElement, WebDriver webDriver, int WaitTime) {
        WaitHelper.waitToBeVisible(webElement, webDriver, WaitTime);
        return webElement.getText();
    }

    public static void hoverOnElement(WebElement webElement, WebDriver webDriver, int WaitTime) {
        Actions action = new Actions(webDriver);
        try {
            WaitHelper.waitToBeVisible(webElement, webDriver, WaitTime);
            action.moveToElement(webElement).perform();
        } catch (Exception e) {
            action.moveToElement(webElement).perform();
        }
    }

    public static void hoverOnElementAndClick(WebElement webElement, WebDriver webDriver, int WaitTime) {
        Actions action = new Actions(webDriver);
        try {
            WaitHelper.waitToBeVisible(webElement, webDriver, WaitTime);
            action.moveToElement(webElement).click();
        } catch (Exception e) {
            action.moveToElement(webElement).click().perform();
        }
    }

    public static void waitTillTextChanges(By element, WebDriver webDriver, String expectedText, int WaitTime) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.invisibilityOfElementWithText(element, expectedText));
    }

}
