/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class contains all Assertion Methods
 */

package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebElementsAssertion {
    DataHelperAndWait dataHelperAndWait;
    public static void validateTheCurrentUrlContainsString(String expectedValue, WebDriver webDriver){
        DataHelperAndWait.waitForUrlContains(expectedValue,webDriver);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedValue), "Incorrect URL is displayed " + webDriver.getCurrentUrl());

    }
    public static void validateTheElementIsDisplayed(WebElement webElement, WebDriver webDriver){
        DataHelperAndWait.waitToBeVisible(webElement,webDriver);
        Assert.assertTrue(webElement.isDisplayed(), "This element is not displayed: "+ webElement);
    }
    public static void assertionEquals(WebElement webElement, WebDriver webDriver,String expectedResult){
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


}
