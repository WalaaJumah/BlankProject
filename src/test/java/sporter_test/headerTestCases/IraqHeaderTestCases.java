/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.headerTestCases;

import core.BasePage;
import core.WebElementsAssertion;
import lombok.Getter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.IraqHomePage;
import xml_reader.XmlReader;

@Getter
public class IraqHeaderTestCases extends HeaderTestCases{

    @BeforeClass(alwaysRun = true)
    public void switchToIraqStore() {
        IraqHomePage iraqHomePage = new IraqHomePage(webDriver);
        iraqHomePage.switchCountry(iraqHomePage.getIraqCountry());
        if (!webDriver.getCurrentUrl().contains(iraqHomePage.iraqDomain)) {
            webDriver.navigate().to(BasePage.BaseURL + iraqHomePage.iraqDomain);
        }
    }
    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the Customer Service label & Phone Number appearing correctly", priority = 3)
    public void verifyCustomerServiceAppearingCorrectly() {
        HeaderSection headerSection = new HeaderSection(webDriver);
        if (webDriver.getCurrentUrl().contains("com/ar-"))
            WebElementsAssertion.assertionTextIsEqual(headerSection.getCustomerServiceLabel(), webDriver, XmlReader.getXMLData("CustomerServiceArLabelIraq"));
        else
            WebElementsAssertion.assertionTextIsEqual(headerSection.getCustomerServiceLabel(), webDriver, XmlReader.getXMLData("CustomerServiceEnLabel"));
    }
}
