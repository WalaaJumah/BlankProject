/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This Sporter Error Page
 */

package error_helper;

import core.BasePage;
import org.openqa.selenium.WebDriver;

public class SporterErrorPage extends BasePage {
    public static final String pageNotFoundTitle = "Sporter.com - Page Not Found";
    public static final String pageNotFoundMsg = "The page you requested was not found on this store. You can go to homepage or search here";
    public static final String productsCannotFindMsg = "We can't find products matching the selection.";
    public static final String pageUnderMaintenanceMsg = "This page is currently under maintenance";
    public static final String exceptionPageMsg = "An error has happened during application run. See exception log for details.";
    public static final String exceptionPageMsg2 = "An error occurred on client";
    public static final String offerNotAvailableMsg = "this offer is not available in your country";
    public static final String facebookError = "App not active";
    public SporterErrorPage(WebDriver webDriver) {
        super(webDriver);
    }


}
