package helper_classes;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class ElementHelper extends Helper {

    public static boolean isDisplayed(WebElement element, WebDriver webDriver) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }

    public static int getNumberOfOpenedTabs(WebDriver driver) {
        // Get handles of all open tabs/windows
        Set<String> handles = driver.getWindowHandles();
        // Return the number of opened tabs/windows
        return handles.size();
    }

    public static boolean isPresent(WebElement webElement, WebDriver webDriver) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException exception) {
            return false;
        }
    }

    public static Double getScrollPosition(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Object scrollPosition = js.executeScript("return window.pageYOffset;");
        return ((Number) scrollPosition).doubleValue();
    }

    public static void selectAllDropDownListOptions(Select select) {
        List<WebElement> elementCount = select.getOptions();
        int menuSize = elementCount.size();
        for (int i = 0; i < menuSize; i++) {
            select.selectByIndex(i);
        }
    }

    public static void JsExecutorToClickOnElement(By element, WebDriver webDriver) {
        WebElement webElement = webDriver.findElement(element);
        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("arguments[0].focus(); arguments[0].click();", webElement);
    }

    public static void JsExecutorToClickOnWebElement(WebElement element, WebDriver webDriver) {
        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("arguments[0].focus(); arguments[0].click();", element);
    }

    public static ExpectedCondition<Alert> HandleAlertInner(WebDriver driver) {
        return driver1 -> {
            try {
                return driver1.switchTo().alert();
            } catch (NoAlertPresentException e) {
                return null;
            }
        };
    }

    public static boolean IsElementPresent(WebElement element) {

        try {
            if (element == null)
                return false;

            return element.isDisplayed();

        } catch (Exception e) {
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

    public static void scrollTo(By element, WebDriver webDriver) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(false);", element);
        WaitHelper.waitToBeVisible(element, webDriver);
    }

    public static void scrollToWebElement(WebElement element, WebDriver webDriver) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(false);", element);
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

    public static void clearWebField(By element, WebDriver webDriver) {
        while (!webDriver.findElement(element).getAttribute("value").equals("")) {
            webDriver.findElement(element).sendKeys(Keys.BACK_SPACE);
        }
    }

    public static void pressKeyboardESCAPEKey(WebDriver webDriver) {
        // Create an instance of the Actions class
        Actions actions = new Actions(webDriver);

        // Send the ESC key to close the popup
        actions.sendKeys(Keys.ESCAPE).perform();
    }

    public static void pressEnterKey(WebDriver webDriver) {
        // Create an instance of the Actions class
        Actions actions = new Actions(webDriver);

        // Send the ESC key to close the popup
        actions.sendKeys(Keys.ENTER).perform();
    }

    public static void updateAllText(WebElement element, String newText) {
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"), newText);
    }

    public static void clickOnElement(By webElement, WebDriver webDriver) {
        try {
            WaitHelper.waitToBeVisible(webElement, webDriver);
            webDriver.findElement(webElement).click();
        } catch (Exception e) {
            Actions action = new Actions(webDriver);
            WaitHelper.waitToBeVisible(webElement, webDriver);
            action.moveToElement(webDriver.findElement(webElement)).click();
        }
    }

    public static void clickOnElementWebElement(WebElement webElement, WebDriver webDriver) {
        try {
            WaitHelper.waitWebElementToBeVisible(webElement, webDriver);
            webElement.click();
        } catch (Exception e) {
            Actions action = new Actions(webDriver);
            WaitHelper.waitWebElementToBeVisible(webElement, webDriver);
            action.moveToElement(webElement).click();
        }
    }

    public static void typeTextInElement(By webElement, WebDriver webDriver, String text) {
        try {
            WaitHelper.waitToBeVisible(webElement, webDriver);
            webDriver.findElement(webElement).sendKeys(text);
        } catch (Exception e) {
            WaitHelper.waitToBeVisible(webElement, webDriver);
            webDriver.findElement(webElement).sendKeys(text);
        }
    }

    public static void waitToBePresent(By webElement, WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        WebElement selectElement = wait.until(ExpectedConditions.presenceOfElementLocated(webElement));

    }

    public static void clickOnAnyBlankArea(WebDriver webDriver) {
        // Locate the body element
        WebElement body = webDriver.findElement(By.tagName("body"));

        // Click on the body element
        Actions actions = new Actions(webDriver);
        actions.moveToElement(body).click().perform();

    }

    public static void slowType(By element, String text, WebDriver webDriver, int WaitTime) throws IOException, InterruptedException {
        try {
            WaitHelper.waitToBeVisible(element, webDriver);
            for (char c : text.toCharArray()) {
                String character = String.valueOf(c);
                webDriver.findElement(element).sendKeys(character);

                try {
                    Thread.sleep(WaitHelper.getRandomWaitTimeInMilliSec(1, 3));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            ElementHelper.clearWebField(element, webDriver);
            WaitHelper.waitToBeVisible(element, webDriver);
            for (char c : text.toCharArray()) {
                String character = String.valueOf(c);
                webDriver.findElement(element).sendKeys(character);

                try {
                    Thread.sleep(WaitHelper.getRandomWaitTimeInMilliSec(1, 3));
                } catch (InterruptedException e1) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static String getWebElementText(By webElement, WebDriver webDriver, int WaitTime) {
        WaitHelper.waitToBeVisible(webElement, webDriver);
        return webDriver.findElement(webElement).getText();
    }

    public static void hoverOnElement(By webElement, WebDriver webDriver) {
        Actions action = new Actions(webDriver);
        try {
            WaitHelper.waitToBeVisible(webElement, webDriver);
            WebElement element = webDriver.findElement(webElement);
            action.moveToElement(element).moveByOffset(15, 15).perform();
        } catch (Exception e) {
            // Log or handle the exception as needed
            e.printStackTrace();
        }
    }

    public static void hoverOnElementAndClick(By webElement, WebDriver webDriver, int WaitTime) {
        Actions action = new Actions(webDriver);
        try {
            WaitHelper.waitToBeVisible(webElement, webDriver);
            action.moveToElement(webDriver.findElement(webElement)).click();
        } catch (Exception e) {
            action.moveToElement(webDriver.findElement(webElement)).click().perform();
        }
    }

    public static void waitTillTextChanges(By element, WebDriver webDriver, String expectedText, int WaitTime) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.invisibilityOfElementWithText(element, expectedText));
    }

    public static void uploadImage(String filePath) throws AWTException, InterruptedException {
        Thread.sleep(2000);
// Set the file path to be uploaded
        // Set the file path to be uploaded
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Use Java AWT Robot class to handle the system file dialog
        Robot robot = new Robot();

        // Simulate pressing Ctrl + V to paste the file path into the file dialog
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Add a delay to ensure the system has enough time to register the key events
        Thread.sleep(1000);

        // Simulate pressing Enter to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void uploadImage2(String fileName) throws AWTException, InterruptedException {
        // Convert the relative path to an absolute path
        File file = new File("/IdeaProjects/EurekaJo_Automation/src/test/resources/test_files");
        String absolutePath = file.getAbsolutePath();

        // Wait for the file dialog to open
        Thread.sleep(1000);

        // Extract the project path from the absolute path
        String projectPath = new File("").getAbsolutePath();

        // Combine the project path with the relative path
        String fullPath = projectPath + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "test_files";

        // Set the full path to the clipboard
        StringSelection fullPathSelection = new StringSelection(fullPath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fullPathSelection, null);

        // Use Java AWT Robot class to handle the system file dialog
        Robot robot = new Robot();

        // Simulate pressing Ctrl + L to focus the address bar (Windows specific)
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Add a delay to ensure the system has enough time to register the key events

        // Simulate pressing End to move to the end of the address bar
        robot.keyPress(KeyEvent.VK_END);
        robot.keyRelease(KeyEvent.VK_END);
        Thread.sleep(1000);
        // Simulate pressing Ctrl + V to paste the full path into the address bar
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Simulate pressing Enter to navigate to the full path
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Add a delay to ensure the system has enough time to navigate to the directory
        Thread.sleep(2000);

        // Simulate pressing Enter to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

}