/**
 * @author w.jumaa
 * @projectName price_comparison_tool
 * @classDescription
 */

package helper_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataTypeConverter {
    public static float convertTheStringToFloat(WebElement element, WebDriver webDriver, String currency, int WaitTime) {
        WaitHelper.waitToBeVisible(element, webDriver, WaitTime);
        String elementValue = element.getText();
        String elementValueWithoutCurrency = elementValue.replaceAll(currency, "");
        String elementValueWithoutSpace = elementValueWithoutCurrency.replaceAll(" ", "");
        return Float.parseFloat(elementValueWithoutSpace);
    }

    public static int convertTheStringToInt(WebElement element, WebDriver webDriver, int WaitTime) {
        WaitHelper.waitToBeVisible(element, webDriver, WaitTime);
        String elementValue = element.getText();
        return Integer.parseInt(elementValue);
    }

    public static double convertStringToDouble(WebElement element, WebDriver webDriver, String currency, int WaitTime) {
        WaitHelper.waitToBeVisible(element, webDriver, WaitTime);
        String elementValue = element.getText();
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
        double finalValue = doubleValue / divisor;

        return finalValue;
    }

    public float convertTheStringToFloatLatest(WebElement element, WebDriver webDriver, String currency, int waitTime) {
        WaitHelper.waitToBeVisible(element, webDriver, waitTime);
        String elementValue = element.getText();
        String elementValueWithoutCurrency = elementValue.replaceAll(currency, "");
        String elementValueWithoutSpace = elementValueWithoutCurrency.replaceAll(" ", "");
        return Float.parseFloat(elementValueWithoutSpace);
    }

    public int convertTheStringToIntLatest(WebElement element, WebDriver webDriver, int waitTime) {
        WaitHelper.waitToBeVisible(element, webDriver, waitTime);
        String elementValue = element.getText();
        return Integer.parseInt(elementValue);
    }

    public Double convertStringToDoubleLatest(WebElement element, WebDriver webDriver, String currency, int waitTime) {
        WaitHelper.waitToBeVisible(element, webDriver, waitTime);
        String elementValue = element.getText();
        String elementValueWithoutCurrency = elementValue.replaceAll(currency, "");
        String elementValueWithoutSpace = elementValueWithoutCurrency.replaceAll(" ", "");
        return Double.parseDouble(elementValueWithoutSpace);
    }
}
