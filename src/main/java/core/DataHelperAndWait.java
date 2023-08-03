package core;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.logging.Level;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public  class DataHelperAndWait  {

    private static int WaitTime=25;


    //test21add
public static void navigateToUrl(String uRL, WebDriver webDriver) {
    webDriver.navigate().to(uRL);
}
    public static   void waitForElement(WebElement element, WebDriver webDriver) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static String getPageReadyState(WebDriver webDriver1) {
        Object readyState = ((JavascriptExecutor) webDriver1).executeScript("return document.readyState");
        if (readyState != null) {
            return readyState.toString();
//                  return readyState;
        }
        return "";
    }
    public static void waitTillPageFullyLoaded(WebDriver webDriver, int WaitTime) {
        new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime)).until(
                webDriver1 -> getPageReadyState(webDriver).equals("complete"));
    }
    public static  void waitForTime(int milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static  boolean isDisplayed(WebElement element, WebDriver webDriver) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }
    public static  boolean isPresent(WebElement webElement,WebDriver webDriver) {
        try{
            return webElement.isDisplayed();
        }
        catch (NoSuchElementException exception){
            return false;
        }

    }

    public static  void implicitWait(int timeSecond,WebDriver webDriver) {
        webDriver.manage().timeouts().implicitlyWait(timeSecond, TimeUnit.SECONDS);
    }

    public static  void waitToBeClickable(WebElement element, WebDriver webDriver) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static  void waitToBePresent(String Xpath, WebDriver webDriver) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
    }

    public static  void waitToBeVisible(WebElement element, WebDriver webDriver) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static  void refreshPage(WebDriver webDriver) {
        webDriver.navigate().refresh();
    }

    public static  void selectAllDropDownListOptions(Select select) {
        List<WebElement> elementCount = select.getOptions();
        int menuSize = elementCount.size();
        for (int i = 0; i < menuSize; i++) {
            select.selectByIndex(i);
        }
    }

    public static  void fluentWait(WebElement element, int pollingEveryTime, WebDriver webDriver) {
        Wait<WebDriver> Fwait = new FluentWait<WebDriver>(webDriver)
                .withTimeout(Duration.ofSeconds(WaitTime))
                .pollingEvery(Duration.ofSeconds(pollingEveryTime))
                .ignoring(NoSuchElementException.class);
        WebElement waitElement = Fwait.until(new Function<WebDriver, WebElement>() {
            public  WebElement apply(WebDriver driver) {
                if (element.isDisplayed()) {
                }
                return element;
            }
        });
    }

    //JS Executor
    public static  void JsExecutorToClickOnElement(WebElement element,WebDriver webDriver) {
        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        //Find The element
        //jse.executeScript("arguments[0].click();", element);
        jse.executeScript("arguments[0]." +
                "focus(); arguments[0].click();", element);
//        jse.executeScript("if(document.getElementById('submitShippingAddressBtn')!= null){ document.getElementById('submitShippingAddressBtn').click();}", element);
    }
    public static void HandleAlert(WebDriver driver, WebDriverWait wait) {
        if (wait == null) {
            wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        }

        try {
            Alert alert = wait.until(HandleAlertInner(driver));
            alert.accept();
        } catch (TimeoutException E) { /* Ignore */ }
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

    public static  float convertTheStringToFloat(WebElement element,WebDriver webDriver,String currency) {
        DataHelperAndWait.waitToBeVisible(element,webDriver);
        String elementValue = element.getText();
        String elementValueWithoutCurrency = elementValue.replaceAll(currency, "");
        String elementValueWithoutSpace = elementValueWithoutCurrency.replaceAll(" ", "");
        return Float.parseFloat(elementValueWithoutSpace);
    }

        public static  int convertTheStringToInt(WebElement element,WebDriver webDriver) {
        DataHelperAndWait.waitToBeVisible(element,webDriver);
        String elementValue = element.getText();
        return Integer.parseInt(elementValue);
    }

    public static  void switchToTabBrowser(int tabIndex,WebDriver webDriver) {
        ArrayList<String> numberOfTabsTwo = new ArrayList<String>(webDriver.getWindowHandles());
        webDriver.switchTo().window(numberOfTabsTwo.get(tabIndex));
    }
    public static String generateRandomEmail(){
        String  pattern2 = "ss";
        SimpleDateFormat  simpleDateFormat2 = new SimpleDateFormat(pattern2);
        String  date2 = simpleDateFormat2.format(new Date());
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return "Victor"+ randomInt +date2+"@gmail.com";
    }
    public static  void selectFromDropDownList(String element, List<WebElement> list) {
        for (WebElement option : list) {
            if (option.getText().equalsIgnoreCase(element)) {
                option.click();
                option.click();
                break;
            }
        }
    }
    public static  boolean isWebElementPresent(WebElement webElement) {
        try {
            webElement.isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static void waitTillFrameVisible(WebDriver webDriver, WebElement frame){
     WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
    }
    public static  void uploadImage(WebElement element, String imageName) {
        String path;
        path = System.getProperty("user.dir") + "/src/test/resources/Images/" + imageName;
        element.sendKeys(path);
    }
    public static  void scrollTo(WebElement element,WebDriver webDriver) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(false);", element);
        DataHelperAndWait.waitToBeVisible(element,webDriver);
    }
     public static  void scrollToEnd(WebDriver webDriver) {
         JavascriptExecutor js = (JavascriptExecutor) webDriver;
         js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
}
     public static  void scrollToTop(WebDriver webDriver) {
         JavascriptExecutor js = (JavascriptExecutor) webDriver;
         js.executeScript("window.scrollBy(0,-350)", "");
}
     public static  void scrollDown(WebDriver webDriver) {
         JavascriptExecutor js = (JavascriptExecutor) webDriver;
         js.executeScript("window.scrollBy(0,500)", "");
         js.executeScript("window.scrollBy(0,500)", "");
}


    public static  void scrollToPositionZero(WebDriver webDriver) {
        ((JavascriptExecutor) webDriver).executeScript("window.scroll(0,0)", "");
    }
    public static  void scrollBy(WebDriver webDriver) {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,2000)", "");
    }
    public static  void HandlingWindowMethods(WebDriver webDriver) {
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

    public static  void clearWebField(WebElement element,WebDriver webDriver) {
        while (!element.getAttribute("value").equals("")) {
            element.sendKeys(Keys.BACK_SPACE);
        }
    }
    public static  void waitForUrlContains(String expectedString, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitTime));
        ExpectedCondition<Boolean> urlIsCorrect = arg0 ->    driver.getCurrentUrl().contains(expectedString);
        wait.until(urlIsCorrect);
    }

    public static  void accessAllPagesInsideTheProductsListPage( String numberOfProductInTheList, WebElement element,WebDriver webDriver ){
        ///New
        String numberOfProductWithOutItemLabel= numberOfProductInTheList.replace(") Items","");
        String numberOfProductWithOutResultLabel= numberOfProductWithOutItemLabel.substring(10);
        double numberOfProductInTheListInInt=Double.parseDouble(numberOfProductWithOutResultLabel);
        //End of new code
//        double numberOfProductInTheListInInt=Double.parseDouble(numberOfProductInTheList.substring(10,numberOfProductInTheList.length()-7));
        double numberOfThePagesInList=Math.ceil(numberOfProductInTheListInInt/24);
        if(numberOfThePagesInList>1){
            int i = 2;
            do {
                String pageNumber = Integer.toString(i);
                DataHelperAndWait.waitToBeClickable(element,webDriver);
                element.click();
//                DataHelperAndWait.waitForTime(6000);
                DataHelperAndWait.waitForUrlContains(pageNumber,webDriver);
                Assert.assertTrue(webDriver.getCurrentUrl().endsWith(pageNumber),"The URL is wrong in page"+pageNumber);
                boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
                assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
                boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
                assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
                boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
                boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
                assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
                assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+pageNumber+ "The URL is"+webDriver.getCurrentUrl());
                i++;
            }
            while (i <= numberOfThePagesInList);
            System.out.println("The number of pages in the list is "+i);
        }
        else System.out.println("There's only a page in the list");
    }
    public static void clearWebField(WebElement element) {
        while (!element.getAttribute("value").equals("")) {
            element.sendKeys(Keys.BACK_SPACE);
        }
    }
    public  static Boolean isTheresNoPages(String numberOfProductInTheList){
        String numberOfProductWithOutItemLabel;
        if(numberOfProductInTheList.contains("Items"))
            numberOfProductWithOutItemLabel= numberOfProductInTheList.replace(") Items","");
        else
            numberOfProductWithOutItemLabel= numberOfProductInTheList.replace(") Item","");
        String numberOfProductWithOutResultLabel= numberOfProductWithOutItemLabel.replace("Results: (","");
        double numberOfProductInTheListInInt=Double.parseDouble(numberOfProductWithOutResultLabel);
        return numberOfProductInTheListInInt<=24;

    }
    public static void updateAllText(WebElement element, String newText) {
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"), newText);
    }
    public static void clickOnElement(WebElement webElement,WebDriver webDriver){
        try {
        DataHelperAndWait.waitToBeVisible(webElement,webDriver);
        webElement.click();}
        catch (Exception e){
            Actions action = new Actions(webDriver);
            DataHelperAndWait.waitToBeVisible(webElement,webDriver);
            action.moveToElement(webElement).click();}
        }
    public static void typeTextInElement(WebElement webElement,WebDriver webDriver, String text){
        try {
            DataHelperAndWait.waitToBeVisible(webElement,webDriver);
            webElement.sendKeys(text);}
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(webElement,webDriver);
            webElement.sendKeys(text);}
    }
        public static void clickOnPreviousOrNextProductsInTheWidget(List<WebElement> productsList,WebElement nextOrPreviousButton,WebDriver driver){
        if(productsList.size()>5){
            clickOnElement(nextOrPreviousButton,driver);
        }
        else{
            System.out.println("There's only "+ productsList.size()+1+" in the panel");
        }

        }

        public static void validateNextOrPreviousBtnInPanelWork(List<WebElement> productsList,WebElement productCardNum,WebElement nextOrPreviousButton,WebDriver driver) {
            try {
                if (!nextOrPreviousButton.isDisplayed()) {
                    System.out.println("There's no Next/previous button");
                }
            } catch (Exception ee) {
                if (productsList.size() > 5) {
                    try {
                        clickOnElement(nextOrPreviousButton, driver);
                        WebElementsAssertion.validateTheElementIsDisplayed(productCardNum, driver);
                    } catch (Exception e) {
                        driver.navigate().refresh();
                        clickOnElement(nextOrPreviousButton, driver);
                        WebElementsAssertion.validateTheElementIsDisplayed(productCardNum, driver);
                    }
                } else {
                    System.out.println("There's only " + productsList.size() + 1 + " in the panel");
                }

            }
        }
        public static void accessAllProductsInWidget(List<WebElement> productsList,WebElement nextOrPreviousBtnToClick,WebDriver driver,BasePage pageObj) throws IOException {
            try{
                if(!nextOrPreviousBtnToClick.isDisplayed()){
                    System.out.println("There's no Next/previous button");
                }
            }
            catch (Exception e){
            if ( productsList.size()>0){
                System.out.println("There's no any products in the list");}

            else{
            for (int i = 0; i < productsList.size()-1; i++) {
                if(!productsList.get(i).isDisplayed()){
                    do{
               clickOnElement(nextOrPreviousBtnToClick,driver);}
                while (!productsList.get(i).isDisplayed());
                }
                    String expectedUrl = productsList.get(i).getAttribute("href");
                    clickOnElement(productsList.get(i),driver);
                    pageObj.verifyTheDisplayedPageDoesNotHaveErrors();
                    pageObj.navigateToHomePage();}
            }}

}
            public static String getWebElementText(WebElement webElement,WebDriver webDriver){
        waitToBeVisible( webElement,webDriver);
        return webElement.getText();
            }
            public static void hoverOnElement(WebElement webElement, WebDriver webDriver){
        Actions action = new Actions(webDriver);
        try{
            waitToBeVisible(webElement,webDriver);
                action.moveToElement(webElement).perform();}
        catch (Exception e){
            action.moveToElement(webElement).perform();}}

        public static void hoverOnElementAndClick(WebElement webElement, WebDriver webDriver){
        Actions action = new Actions(webDriver);
        try{
            waitToBeVisible(webElement,webDriver);
                action.moveToElement(webElement).click();}
        catch (Exception e){
            action.moveToElement(webElement).click();}

            }
        public static String extractDigitsFromString(WebElement element,WebDriver webDriver){
        DataHelperAndWait.waitToBeVisible(element,webDriver);
        String text=element.getText();
        String numberOnly= text.replaceAll("[^0-9]", "");
        return numberOnly;
    }
    public static void waitTillTextChanges(By element,WebDriver webDriver, String expectedText){
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.invisibilityOfElementWithText(element,expectedText));
    }
    public static void captureJavaScriptErrors(WebDriver webDriver){
//        LogEntries jsErrors=webDriver.manage().logs().get(LogType.BROWSER);
//        System.out.println("All Java Script Error log: "+jsErrors.getAll());
//        System.out.println("First Java Script Error log: "+jsErrors.getAll().get(0));

        LogEntries jsErrors=webDriver.manage().logs().get(LogType.BROWSER);
for(int i=0;i<jsErrors.getAll().size()-1;i++){
            System.out.println("Error # "+i+" : "+jsErrors.getAll().get(i));}

    }
}