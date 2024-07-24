/**
 * @author w.jumaa
 * @projectName EurekaJo
 * @classDescription
 */

package helper_classes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserHelper extends Helper {
    public static void switchToNewTab(WebDriver driver) {
        // Get the window handles (tabs)
        for (String handle : driver.getWindowHandles()) {
            // Switch to the new tab
            driver.switchTo().window(handle);
        }
    }

    public static void switchToOriginalTab(WebDriver driver) {
        // Switch back to the original tab
        driver.switchTo().defaultContent();
    }

    public static void closeAlert(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitTime));
        wait.until(ExpectedConditions.alertIsPresent());

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Close the alert (accept/dismiss based on your requirement)
        alert.accept(); // To accept the alert
    }

}
