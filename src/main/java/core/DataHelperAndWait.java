package core;

import error_helper.SporterErrorPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;
import java.util.*;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public  class DataHelperAndWait  {
    private static int WaitTime=15;
    public static   void waitForElement(WebElement element, WebDriver webDriver) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, WaitTime);
        wait.until(ExpectedConditions.visibilityOf(element));
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
        wait = new WebDriverWait(webDriver, WaitTime);
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
        wait = new WebDriverWait(webDriver, WaitTime);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static  void waitToBePresent(String Xpath, WebDriver webDriver) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, WaitTime);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
    }

    public static  void waitToBeVisible(WebElement element, WebDriver webDriver) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, WaitTime);
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
        jse.executeScript("arguments[0].click()", element);
    }

    public static  float convertTheStringToFloat(WebElement element) {
        String elementValue = element.getText();
        String elementValueWithoutCurrency = elementValue.replaceAll("AED", "");
        String elementValueWithoutSpace = elementValueWithoutCurrency.replaceAll(" ", "");
        return Float.parseFloat(elementValueWithoutSpace);
    }
    public static  void switchToTabBrowser(int tabIndex,WebDriver webDriver) {
        ArrayList<String> numberOfTabsTwo = new ArrayList<String>(webDriver.getWindowHandles());
        webDriver.switchTo().window(numberOfTabsTwo.get(tabIndex));
    }
    public static String generateRandomEmail(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return "username"+ randomInt +"@gmail.com";
    }
    public static  void selectFromDropDownList(String element, List<WebElement> list) {
        for (WebElement option : list) {
            if (option.getText().equalsIgnoreCase(element)) {
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
    public static  void uploadImage(WebElement element, String imageName) {
        String path;
        path = System.getProperty("user.dir") + "/src/test/resources/Images/" + imageName;
        element.sendKeys(path);
    }
    public static  void scrollTo(WebElement element,WebDriver webDriver) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(false);", element);
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
        WebDriverWait wait = new WebDriverWait(driver, WaitTime);
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
            DataHelperAndWait.waitToBeVisible(webElement,webDriver);
            webElement.click();}
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

        public static void validateNextOrPreviousBtnInPanelWork(List<WebElement> productsList,WebElement productCardNum,WebElement nextOrPreviousButton,WebDriver driver){
        if(productsList.size()>4){
            clickOnElement(nextOrPreviousButton,driver);
            WebElementsAssertion.validateTheElementIsDisplayed(productCardNum,driver);
        }
        else{
            System.out.println("There's only "+ productsList.size()+1+" in the panel");
        }

        }

        public static void accessAllProductsInWidget(List<WebElement> productsList,WebElement nextOrPreviousBtnToClick,WebDriver driver,BasePage pageObj){
            Assert.assertTrue( productsList.size()>0,"There's no any products in the list");
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
            }
            public static String getWebElementText(WebElement webElement,WebDriver webDriver){
        waitToBeVisible( webElement,webDriver);
        return webElement.getText();
            }
}