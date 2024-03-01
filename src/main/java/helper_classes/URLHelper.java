/**
 * @author w.jumaa
 * @projectName price_comparison_tool
 * @classDescription
 */

package helper_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class URLHelper {
    public static void navigateToUrl(String uRL, WebDriver webDriver) {
        webDriver.navigate().to(uRL);
    }

    public static void waitForUrlContains(String expectedString, WebDriver driver, int WaitTime) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitTime));
        ExpectedCondition<Boolean> urlIsCorrect = arg0 -> driver.getCurrentUrl().contains(expectedString);
        wait.until(urlIsCorrect);
    }

    public static void refreshPage(WebDriver webDriver) {
        webDriver.navigate().refresh();
    }

    public static void switchToTabBrowser(int tabIndex, WebDriver webDriver) {
        ArrayList<String> numberOfTabsTwo = new ArrayList<String>(webDriver.getWindowHandles());
        webDriver.switchTo().window(numberOfTabsTwo.get(tabIndex));
    }

}
