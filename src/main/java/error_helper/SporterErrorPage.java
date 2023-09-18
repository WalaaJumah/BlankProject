/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This Sporter Error Page
 */

package error_helper;

import core.BasePage;
import core.WebElementsAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SporterErrorPage extends BasePage {
    public static final String pageNotFoundTitle = "Sporter.com - Page Not Found";
    public static final String OOSMsgEn = "We're sorry for not being able to provide you with this product, please have a look at the similar available top-selling suggestions.";
    public static final String OOSMsgAr = "نعتذر لعدم تمكننا من تقديم هذا المنتج لك، الرجاء الاطلاع على البدائل المقترحة للمنتجات المشابهة و الأكثر مبيعا";
    public static final String cartErrorForTabbyMethod = "can not use this payment method";
    public static final String pageNotFoundAr = "نحن نعتذر";
    public static final String pageNotFoundEn = "we are sorry";
    public static final String pageNotFoundMsg = "The page you requested was not found on this store. You can go to homepage or search here";
    public static final String productsCannotFindMsg = "We can't find products matching the selection";
    public static final String InvalidSSLCertificateMsg = "Invalid SSL certificate";
    public static final String generatedContentErrorMsg = "We're sorry, an error has occurred while generating this content";
    public static final String error503 = "Error 503 Backend fetch failed";
    public static final String locationError = "Sorry But There is No Available Shipping Methods For your Location";
    public static final String backendError = "Backend fetch failed";
    public static final String pageUnderMaintenanceMsg = "This page is currently under maintenance";
    public static final String pageUnderMaintenanceMsg2 = "This page needs maintenance.";
    public static final String gatewayTimeOut = "Gateway time-out";
    public static final String exceptionPageMsg = "An error has happened during application run. See exception log for details";
    public static final String exceptionPageMsg2 = "An error occurred on client";
    public static final String offerNotAvailableMsg = "this offer is not available in your country";
    public static final String facebookError = "App not active";
    public static final String facebookError2 = "Feature Unavailable";
    public SporterErrorPage(WebDriver webDriver) {
        super(webDriver);
    }



}
