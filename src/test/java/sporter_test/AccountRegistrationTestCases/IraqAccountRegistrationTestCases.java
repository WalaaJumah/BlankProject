package sporter_test.AccountRegistrationTestCases;

import core.BasePage;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.myAccountPages.BahrainMyAccountPage;

public class IraqAccountRegistrationTestCases extends AccountRegistrationTestCases{
    public void switchToIraqStore() {
        BahrainMyAccountPage bahrainMyAccountPage = new BahrainMyAccountPage(webDriver);
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(bahrainMyAccountPage.getBahrainCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.iraqDomain)) {
            System.out.println("You are in Iraq Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.iraqDomain);
            CloseInitialDialog();
        }
    }
}
