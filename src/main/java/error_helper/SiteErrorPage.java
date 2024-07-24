/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This Sporter Error Page
 */

package error_helper;

import core.BasePage;
import org.openqa.selenium.WebDriver;

public class SiteErrorPage extends BasePage {
    public static final String internalServerErrorMsgEn = "Internal Server Error! Please Try Later";
    public static final String internalServerErrorMsgAr = "حدث خطأ معين, الرجاء المحاولة لاحقا.";
    public static final String internalServerErrorTitleEn = "EurekaJo - Internal Server Error! Please Try Later";
    public static final String internalServerErrorTitleAr = "يوريكا جو - حدث خطأ معين, الرجاء المحاولة لاحقا.";
    public static final String pageNotFoundErrorMsgEn = "Page Not Found !";
    public static final String pageNotFoundErrorMsgAr = "الصفحة غير موجودة !";
    public static final String pageNotFoundErrorTitleEn = "EurekaJo - Page Not Found !";
    public static final String pageNotFoundErrorTitleAr = "يوريكا جو - الصفحة غير موجودة !";

    public SiteErrorPage(WebDriver webDriver) {
        super(webDriver);
    }
}
