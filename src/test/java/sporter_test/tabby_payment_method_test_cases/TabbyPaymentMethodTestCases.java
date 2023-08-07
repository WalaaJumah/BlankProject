/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.tabby_payment_method_test_cases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.JordanGuestCheckoutCyclePage;
import sporter_pages.loginPage.LoginPage;
import sporter_pages.myAccountPages.MyAccountPage;
import sporter_pages.productPage.ProductDetailsPage;
import xml_reader.XmlReader;

import java.io.IOException;

@Test(groups = "2.12 My Account Screens")

public class TabbyPaymentMethodTestCases extends BaseTest {
    String storeCountry;
    String countryCode;

    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Verify all My account options appear correctly ", priority = 1)
    public void test() throws IOException {

        }
    }

