/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This Sporter Error Page
 */

package error_helper;

import core.BasePage;
import org.openqa.selenium.WebDriver;

public class EurekaErrorPage extends BasePage {
    public EurekaErrorPage(WebDriver webDriver) {
        super(webDriver);
    }
    public static final String internalServerErrorEn = "Internal Server Error! Please Try Later";
    public static final String internalServerErrorAr = "حدث خطأ معين, الرجاء المحاولة لاحقا.";
}
