/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This Sporter Error Page
 */

package error_helper;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SporterErrorPage extends BasePage {
    public SporterErrorPage(WebDriver webDriver) {
        super(webDriver);
    }
   public static final String pageNotFoundTitle= "Sporter.com - Page Not Found";
   public static final String productsCannotFindMsg= "We can't find products matching the selection.";
   public static final String exceptionPageMsg= "An error has happened during application run. See exception log for details.";
   public static final String offerNotAvailableMsg= "this offer is not available in your country";






}