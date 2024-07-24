import core.BaseTest;

import site_pages.login.ArabicLoginPage;
import helper_classes.AssertionHelper;
import helper_classes.ElementHelper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import files_reader.XmlReader;

import java.awt.*;

/**
 * @author w.jumaa
 * @projectName EurekaJo_Automation
 * @classDescription
 */

public class testclass extends BaseTest {
    public testclass() {
        Language = "Ar";
    }

    //Date Search
    @Test(groups = {"Priority 3 Modules", "1.1 Critical Severity"}, description = "{{CountryName}}: For Logged-in user, Verify clicking on the Add Apartment option will redirect user to the Add Apartment form", priority = 3)
    public void verifyClickingOnAddApartmentWorksCorrectly() {
        ArabicLoginPage loginPage = new ArabicLoginPage(webDriver);
        loginPage.login(XmlReader.getXMLData("phoneNumber"), XmlReader.getXMLData("password"));
    }


}