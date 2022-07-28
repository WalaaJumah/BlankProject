package core;

import com.google.googlejavaformat.Doc;
import org.apache.poi.hssf.record.PageBreakRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static com.utils.PropReader.readConfig;
import static com.utils.readers.XMLFileReader.getElementTextByTagName;

public class DataHelperAndWait extends BaseTest {
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
    public static void selectAllDropDownListOptions( Select select){
        List<WebElement> elementCount = select.getOptions();
        int menuSize= elementCount.size();
        for(int i = 0; i < menuSize ; i++){
            select.selectByIndex(i);
        }
    }



    /////////////////

//    public String getTestData(String tagName, String testKey ) {
//        String testData = null;
//        try {
//            String filePath = "C:\\Users\\w.jumaa\\IdeaProjects\\sporter-web-automation\\src\\test\\resources\\TestData.xml";
//            File file = new File(filePath);
//            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//            DocumentBuilder dBuilder = dbf.newDocumentBuilder();
//            Document doc = dBuilder.parse(file);
//            doc.getDocumentElement().normalize();
//            NodeList nodeList = doc.getElementsByTagName(tagName);
//            int tLength = nodeList.getLength();
//            for (int i = 0; i < tLength; i++) {
//                Node node = nodeList.item(i);
//
//                if (node.getNodeType() == Node.ELEMENT_NODE) {
//                    Element element = (Element) node;
//                    testData = element.getElementsByTagName(tagName).item(0).getTextContent();
//                    break;
//
//
//                }
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return testData;
//    }


    ////////////////////////
//    public static String getTestData(String testKey) {
//        String dataFile = readConfig("datafile");
//        return getElementTextByTagName(dataFile, testKey);
//    }

    ///////////////////////
//    public static void JavaScriptExecutor(WebDriver driver, String script, WebElement element) {
//        ((JavascriptExecutor) driver).executeScript(script, element);
//    }




////////////////////////////////////////////////////////////////////////////////////////////////////
    //Fluent Wait
    // Waiting 30 seconds for an element to be present on the page, checking
    // for its presence once every 5 seconds.
    public static void fluentWait(WebElement element, int timeOut, int pollingEveryTime) {
        Wait<WebDriver> Fwait = new FluentWait<WebDriver>(webDriver)
                .withTimeout(Duration.ofSeconds(timeOut))
                .pollingEvery(Duration.ofSeconds(pollingEveryTime))
                .ignoring(NoSuchElementException.class);

        WebElement waitElement = Fwait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
              if (element.isDisplayed()){
              }
              return element;
            }
        });
    }



}
