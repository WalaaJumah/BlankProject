package helper_classes;

import helper_classes.reading_helper.XmlReader;
import org.openqa.selenium.*;
import org.testng.Assert;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssertionHelper extends Helper {
    public static void validateTheCurrentUrlContainsString(String expectedValue, WebDriver webDriver) {
        URLHelper.waitForUrlContains(expectedValue, webDriver);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedValue), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
    }

    public static boolean isPageScrolledUp(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Execute JavaScript to get the scroll position
        Long scrollPosition = (Long) js.executeScript("return window.pageYOffset;");
        // If scroll position is 0, it means the page is scrolled up
        return scrollPosition == 0;
    }

    public static void validateTheCurrentUrlNotContainsString(String expectedValue, WebDriver webDriver) {
        try {
//            WaitHelper.waitForTime(3000);
            Assert.assertFalse(webDriver.getCurrentUrl().contains(expectedValue), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        } catch (TimeoutException e) {
            Assert.assertFalse(webDriver.getCurrentUrl().contains(expectedValue), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        }
    }

    public static boolean containsArabic(String text) {
        // Regular expression to match Arabic Unicode characters
        Pattern arabicPattern = Pattern.compile("\\p{InArabic}");
        Matcher matcher = arabicPattern.matcher(text);
        return matcher.find();
    }

    public static boolean containsEnglish(String text) {
        // Regular expression to match English alphabet characters
        Pattern englishPattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = englishPattern.matcher(text);
        return matcher.find();
    }

    public static void validateTheElementIsDisplayed(By element, WebDriver webDriver) {
        WaitHelper.waitToBeVisible(element, webDriver);
        Assert.assertTrue(webDriver.findElement(element).isDisplayed(), "This element is not displayed: " + element + "And the URL is: " + webDriver.getCurrentUrl());

//        catch (Exception e){
////            WaitHelper.waitForTime(2000);
//            WaitHelper.waitToBeVisible(webElement,webDriver);
//            Assert.assertTrue(webElement.isDisplayed(), "This element is not displayed: "+ webElement);
//        }
    }

    public static void validateTheElementIsDisplayedWebElement(WebElement element, WebDriver webDriver) {
//        try{
        WaitHelper.waitWebElementToBeVisible(element, webDriver);
        Assert.assertTrue(element.isDisplayed(), "This element is not displayed: " + element + "And the URL is: " + webDriver.getCurrentUrl());
//        }
    }

    public static void assertionTextEqualsForElementAttribute(By webElement, WebDriver webDriver, String expectedResult) {
        WaitHelper.waitToBeVisible(webElement, webDriver);
        Assert.assertEquals(webDriver.findElement(webElement).getText(), expectedResult, "And the URL is: " + webDriver.getCurrentUrl());
    }

    public static boolean checkIfElementIsNull(By webElement) {
        return webElement == null;
    }

    public static void assertionTextIsEqual(By webElement, WebDriver webDriver, String text) {
        WaitHelper.waitToBeVisible(webElement, webDriver);
        Assert.assertEquals(webDriver.findElement(webElement).getText(), text, "The element contains : " + webDriver.findElement(webElement).getText() + "And the URL is: " + webDriver.getCurrentUrl());

    }

    public static void assertionElementEnable(By webElement, WebDriver webDriver) {
        WaitHelper.waitToBeVisible(webElement, webDriver);
        Assert.assertTrue(webDriver.findElement(webElement).isEnabled(), "The element is disable" + " The URL is: " + webDriver.getCurrentUrl());
    }

    public static void assertionElementNotEnable(By webElement, WebDriver webDriver) {
        WaitHelper.waitToBeVisible(webElement, webDriver);
        Assert.assertFalse(webDriver.findElement(webElement).isEnabled(), "The element is enable" + " The URL is: " + webDriver.getCurrentUrl());
    }

    public static void assertionTextIsNotEqual(By webElement, WebDriver webDriver, String text) {
        WaitHelper.waitToBeVisible(webElement, webDriver);
        Assert.assertNotEquals(webDriver.findElement(webElement).getText(), text, "The element contains : " + webDriver.findElement(webElement).getText() + " The URL is: " + webDriver.getCurrentUrl());

    }

    public static void assertionAttributeTrueForElement(By webElement, WebDriver webDriver, String attribute, String expectedAttribute) {
        WaitHelper.waitToBeVisible(webElement, webDriver);
        Assert.assertEquals(webDriver.findElement(webElement).getAttribute(attribute), expectedAttribute, "The " + webDriver.findElement(webElement).getAttribute(attribute) + " is not equal " + expectedAttribute + " The URL is: " + webDriver.getCurrentUrl());
    }

    public static void assertionAttributeTrueForWebElement(WebElement webElement, WebDriver webDriver, String attribute, String expectedAttribute) {
        WaitHelper.waitWebElementToBeVisible(webElement, webDriver);
        Assert.assertEquals(webElement.getAttribute(attribute), expectedAttribute, "The " + webElement.getAttribute(attribute) + " is not equal " + expectedAttribute + " The URL is: " + webDriver.getCurrentUrl());
    }

    public static void assertTheUrlEqualExpectedUrl(String actualUrl, String expectedUrl, WebDriver webDriver) {
        URLHelper.waitForUrlContains(expectedUrl, webDriver);
        Assert.assertEquals(actualUrl, expectedUrl, "The Current URL is: " + actualUrl + " But the expected URL is: " + expectedUrl);
    }

    public static void assertionWebElementEqualText(By webElement, WebDriver webDriver, String expectedText) {
        WaitHelper.waitToBeVisible(webElement, webDriver);
        Assert.assertEquals(webDriver.findElement(webElement).getText(), expectedText);
        Assert.assertEquals(webDriver.findElement(webElement).getText(), expectedText, "The element does not contains : " + expectedText + "And the Actual Text is: " + webDriver.findElement(webElement).getText() + " The URL is: " + webDriver.getCurrentUrl());

    }

    public static void assertionWebElementContainsText(By webElement, WebDriver webDriver, String expectedText) {
        WaitHelper.waitToBeVisible(webElement, webDriver);
        Assert.assertTrue(webDriver.findElement(webElement).getText().contains(expectedText), "The element does not contains : " + expectedText + "And the Actual Text is: " + webDriver.findElement(webElement).getText() + " The URL is: " + webDriver.getCurrentUrl());

    }

    public static void assertionWebElementContainsTextWebElement(WebElement webElement, WebDriver webDriver, String expectedText) {
        WaitHelper.waitWebElementToBeVisible(webElement, webDriver);
        Assert.assertTrue(webElement.getText().contains(expectedText), "The element does not contains : " + expectedText + "And the Actual Text is: " + webElement.getText() + " The URL is: " + webDriver.getCurrentUrl());

    }

    public static void assertAllListItemsAreDisplayed(List<By> webElement, WebDriver webDriver) {
        for (int i = 0; i < webElement.size(); i++) {
            ElementHelper.hoverOnElement(webElement.get(i), webDriver);
            WaitHelper.waitToBeVisible(webElement.get(i), webDriver);
            Assert.assertTrue(webDriver.findElement(webElement.get(i)).isDisplayed(), "This element is not displayed: " + webElement + " The URL is: " + webDriver.getCurrentUrl());
        }
    }

    public static void assertAllListItemsAreDisplayedForWebElement(List<WebElement> webElement, WebDriver webDriver) {
        if (webElement.size() > 4) {
            for (int i = 0; i < 4; i++) {
                System.out.println("Size: " + webElement.size());
                System.out.println(i);
                Assert.assertTrue(webElement.get(i).isDisplayed(), "This element is not displayed: " + i + webElement + " The URL is: " + webDriver.getCurrentUrl());
            }
        } else {
            for (int i = 0; i < webElement.size() - 1; i++) {
                System.out.println("Size: " + webElement.size());
                System.out.println(i);
                Assert.assertTrue(webElement.get(i).isDisplayed(), "This element is not displayed: " + i + webElement + " The URL is: " + webDriver.getCurrentUrl());
            }
        }
    }

    public static void assertAllListItemsAreContainsTextForWebElement(List<WebElement> webElement, String ExpectedText, WebDriver webDriver) {
        for (int i = 0; i < webElement.size(); i++) {
            Assert.assertTrue(webElement.get(i).getText().equalsIgnoreCase(ExpectedText));
        }
    }

    public static void assertAllListItemsAreDisplayedForWebElementWithScroll(List<WebElement> webElement, WebDriver webDriver) {
        for (int i = 0; i < webElement.size(); i++) {
            ElementHelper.scrollToWebElement(webElement.get(i), webDriver);
            Assert.assertTrue(webElement.get(i).isDisplayed(), "This element is not displayed: " + webElement + " The URL is: " + webDriver.getCurrentUrl());
        }
    }

    public static void assertAllListItemsContainsText(List<WebElement> webElement, String Text, WebDriver webDriver) {
        if (webElement.size() > 4) {
            for (int i = 0; i < 4; i++) {
                Assert.assertTrue(webElement.get(i).getText().contains(Text), "This displayed text is" + webElement.get(i).getText());
            }
        } else {
            for (int i = 0; i < webElement.size() - 1; i++) {
                Assert.assertTrue(webElement.get(i).getText().contains(Text), "This displayed text is" + webElement.get(i).getText());
            }
        }
    }

    public static void assertAllListItemsContainsTextWithScroll(List<WebElement> webElement, String Text, WebDriver webDriver) {
        if (webElement.size() > 4) {
            for (int i = 0; i < 4; i++) {
                ElementHelper.scrollToWebElement(webElement.get(i), webDriver);
                Assert.assertTrue(webElement.get(i).getText().contains(Text), "This displayed text is" + webElement.get(i).getText());
            }
        } else {
        }
        for (int i = 0; i < webElement.size(); i++) {
            ElementHelper.scrollToWebElement(webElement.get(i), webDriver);
            Assert.assertTrue(webElement.get(i).getText().contains(Text), "This displayed text is" + webElement.get(i).getText());
        }
    }


    public static void checkRequiredErrorMsgIsDisplayed(By webElement, WebDriver webDriver) {
        if (webDriver.getCurrentUrl().contains("sporter.com/ar")) {
            AssertionHelper.assertionWebElementEqualText(webElement, webDriver, XmlReader.getXMLData("requiredErrorMsAr"));
        }
        if (webDriver.getCurrentUrl().contains("sporter.com/en")) {
            AssertionHelper.assertionWebElementEqualText(webElement, webDriver, XmlReader.getXMLData("requiredErrorMsEn"));
        }

    }

    // Method to check if a string contains only Arabic characters
    public static boolean isArabic(String text) {
        // Range of Arabic Unicode characters
        return text.matches("\\p{InArabic}+");
    }

    // Method to check if a string contains only English alphabets
    public static boolean isEnglish(String text) {
        // Only English alphabets (case insensitive)
        return text.matches("[a-zA-Z]+");
    }

}