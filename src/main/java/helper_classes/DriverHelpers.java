/**
 * @author w.jumaa
 * @projectName Talent-Seeker_Tool
 * @classDescription
 */

package helper_classes;

import org.openqa.selenium.WebDriver;

public class DriverHelpers {
    public static void deleteAllCookies(WebDriver webDriver){
        webDriver.manage().deleteAllCookies();
    }
}
