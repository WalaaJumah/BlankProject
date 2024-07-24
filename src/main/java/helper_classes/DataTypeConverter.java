package helper_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataTypeConverter extends Helper {
    public static float convertTheStringToFloat(By element, WebDriver webDriver, String currency) {
        WaitHelper.waitToBeVisible(element, webDriver);
        String elementValue = webDriver.findElement(element).getText();
        String elementValueWithoutCurrency = elementValue.replaceAll(currency, "");
        String elementValueWithoutSpace = elementValueWithoutCurrency.replaceAll(" ", "");
        return Float.parseFloat(elementValueWithoutSpace);
    }

    public static int convertTheStringToInt(By element, WebDriver webDriver) {
        WaitHelper.waitToBeVisible(element, webDriver);
        String elementValue = webDriver.findElement(element).getText();
        return Integer.parseInt(elementValue);
    }

    public static double convertStringToDouble(By element, WebDriver webDriver, String currency) {
        WaitHelper.waitToBeVisible(element, webDriver);
        String elementValue = webDriver.findElement(element).getText();
        String elementValueWithoutCurrency = elementValue.replaceAll(currency, "");
        String elementValueWithoutSpace = elementValueWithoutCurrency.replaceAll(" ", "");
        return Double.parseDouble(elementValueWithoutSpace);
    }

    public static double parseStringToDouble(String str) {
        int decimalIndex = str.indexOf('.');
        if (decimalIndex == -1) {
            return Double.parseDouble(str);
        }

        int digitsAfterDecimal = str.length() - decimalIndex - 1;
        String strippedString = str.replace(".", "");
        double doubleValue = Double.parseDouble(strippedString);
        double divisor = Math.pow(10, digitsAfterDecimal);
        return doubleValue / divisor;
    }

    public float convertTheStringToFloatLatest(By element, WebDriver webDriver, String currency) {
        WaitHelper.waitToBeVisible(element, webDriver);
        String elementValue = webDriver.findElement(element).getText();
        String elementValueWithoutCurrency = elementValue.replaceAll(currency, "");
        String elementValueWithoutSpace = elementValueWithoutCurrency.replaceAll(" ", "");
        return Float.parseFloat(elementValueWithoutSpace);
    }

    public int convertTheStringToIntLatest(By element, WebDriver webDriver) {
        WaitHelper.waitToBeVisible(element, webDriver);
        String elementValue = webDriver.findElement(element).getText();
        return Integer.parseInt(elementValue);
    }

    public Double convertStringToDoubleLatest(By element, WebDriver webDriver, String currency) {
        WaitHelper.waitToBeVisible(element, webDriver);
        String elementValue = webDriver.findElement(element).getText();
        String elementValueWithoutCurrency = elementValue.replaceAll(currency, "");
        String elementValueWithoutSpace = elementValueWithoutCurrency.replaceAll(" ", "");
        return Double.parseDouble(elementValueWithoutSpace);
    }
}