/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class contains all Assertion Methods
 */

package core;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import xml_reader.XmlReader;

import java.util.List;

public class WebElementsAssertion {
    public static void validateTheCurrentUrlContainsString(String expectedValue, WebDriver webDriver){
        DataHelperAndWait.waitForUrlContains(expectedValue,webDriver);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedValue), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
    }
     public static void validateTheCurrentUrlNotContainsString(String expectedValue, WebDriver webDriver){
        try{
            DataHelperAndWait.waitForTime(3000);
        Assert.assertFalse(webDriver.getCurrentUrl().contains(expectedValue), "Incorrect URL is displayed " + webDriver.getCurrentUrl());}
        catch (TimeoutException e){
            Assert.assertFalse(webDriver.getCurrentUrl().contains(expectedValue), "Incorrect URL is displayed " + webDriver.getCurrentUrl());}
     }
    public static void validateTheElementIsDisplayed(WebElement webElement, WebDriver webDriver){
        DataHelperAndWait.waitToBeVisible(webElement,webDriver);
        Assert.assertTrue(webElement.isDisplayed(), "This element is not displayed: "+ webElement);
    }

    public static void assertionTextEqualsForElementAttribute(WebElement webElement, WebDriver webDriver, String expectedResult){
        DataHelperAndWait.waitToBeVisible(webElement,webDriver);
        Assert.assertEquals(webElement.getText(), expectedResult);
    }

    public static boolean checkIfElementIsNull(WebElement webElement){
        if(webElement==null){
            return true;
        }
        else {
            return false;
        }

    }
    public static void assertionTextIsEqual(WebElement webElement,WebDriver webDriver, String text){
        DataHelperAndWait.waitToBeVisible(webElement,webDriver);
        Assert.assertEquals(webElement.getText(),text, "The element contains : "+webElement.getText());

    }
    public static void assertionTextIsNotEqual(WebElement webElement,WebDriver webDriver, String text){
        DataHelperAndWait.waitToBeVisible(webElement,webDriver);
        Assert.assertNotEquals(webElement.getText(),text, "The element contains : "+webElement.getText());

    }
    public static void assertionAttributeTrueForElement(WebElement webElement,WebDriver webDriver,String attribute, String expectedAttribute){
        DataHelperAndWait.waitToBeVisible(webElement,webDriver);
        Assert.assertEquals(webElement.getAttribute(attribute),expectedAttribute,"The "+webElement.getAttribute(attribute)+" is not equal "+ expectedAttribute);
    }
    public static void assertTheUrlEqualExpectedUrl(String actualUrl,String expectedUrl, WebDriver webDriver){
        DataHelperAndWait.waitForUrlContains(expectedUrl,webDriver);
        Assert.assertEquals(actualUrl,expectedUrl,"The Current URL is: "+ actualUrl+" But the expected URL is: "+expectedUrl);
    }
    public static void assertionWebElementEqualText(WebElement webElement, WebDriver webDriver, String expectedText){
        DataHelperAndWait.waitToBeVisible(webElement,webDriver);
        Assert.assertEquals(webElement.getText(),expectedText, "The element does not contains : "+expectedText+ "And the Actual Text is: "+webElement.getText());

    }
        public static void assertionWebElementConatinsText(WebElement webElement, WebDriver webDriver, String expectedText){
        DataHelperAndWait.waitToBeVisible(webElement,webDriver);
        Assert.assertEquals(webElement.getText().contains(expectedText), "The element does not contains : "+expectedText+ "And the Actual Text is: "+webElement.getText());

    }

    public static void assertAllListItemsAreDisplayed(List<WebElement> webElement, WebDriver webDriver){
        for (int i = 0; i < webElement.size(); i++){
            DataHelperAndWait.hoverOnElement(webElement.get(i),webDriver);
            DataHelperAndWait.waitToBeVisible(webElement.get(i),webDriver);
            Assert.assertTrue(webElement.get(i).isDisplayed(), "This element is not displayed: "+ webElement);
        }
    }
    public static void checkRequiredErrorMsgIsDisplayed(WebElement webElement,WebDriver webDriver){
        if(webDriver.getCurrentUrl().contains("sporter.com/ar")){
            WebElementsAssertion.assertionWebElementEqualText(webElement,webDriver, XmlReader.getXMLData("requiredErrorMsAr"));
        }
        if(webDriver.getCurrentUrl().contains("sporter.com/en")){
            WebElementsAssertion.assertionWebElementEqualText(webElement,webDriver, XmlReader.getXMLData("requiredErrorMsEn"));
        }

    }

}
