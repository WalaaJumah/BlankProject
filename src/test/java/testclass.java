import core.BaseTest;
import site_pages.headerSection.ArabicHeaderPage;
import site_pages.list_property_pages.AddApartmentPage;
import site_pages.login.ArabicLoginPage;
import site_pages.search.ArabicSearchPage;
import helper_classes.AssertionHelper;
import helper_classes.ElementHelper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import xml_reader.XmlReader;

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
        ArabicHeaderPage headerPage = new ArabicHeaderPage(webDriver);
        ArabicLoginPage loginPage = new ArabicLoginPage(webDriver);
        ElementHelper.clickOnElement(headerPage.getLoginIcon(), webDriver);
        loginPage.login(XmlReader.getXMLData("phoneNumber"), XmlReader.getXMLData("password"));
        ElementHelper.clickOnElement(headerPage.getListPropertiesIcon(), webDriver);
        ElementHelper.clickOnElement(headerPage.getApartmentOptionInListProperties(), webDriver);
        AddApartmentPage addApartmentPage = new AddApartmentPage(webDriver);
        AssertionHelper.validateTheCurrentUrlContainsString(addApartmentPage.addApartmentLink, webDriver);
    }

    @Test(groups = {"Priority 2 Modules", "1.3 Medium Severity"}, description = "{{CountryName}}: Search for Apartment- Buy Page: Verify that the Floor Number search menu contains all its options correctly", priority = 299)
    public void test() throws AWTException, InterruptedException {
        AddApartmentPage addApartmentPage = new AddApartmentPage(webDriver);
        ArabicSearchPage searchPage = new ArabicSearchPage(webDriver);
        ElementHelper.clickOnElement(addApartmentPage.getAddMainImageIcon(), webDriver);
        ElementHelper.uploadImage("C:\\Users\\w.jumaa\\Desktop\\Auto.jpg");
        ElementHelper.clickOnElement(addApartmentPage.getAddOtherImageIcon(), webDriver);
        ElementHelper.uploadImage("C:\\Users\\w.jumaa\\Desktop\\Auto.jpg");
        ElementHelper.typeTextInElement(addApartmentPage.getTitleField(), webDriver, "Home Super Deluxe ");
        ElementHelper.clickOnElement(addApartmentPage.getRentRadioBtn(), webDriver);
        ElementHelper.typeTextInElement(addApartmentPage.getPriceField(), webDriver, "10000");
        ElementHelper.clickOnElement(addApartmentPage.getAcceptInstallmentsCheckBox(), webDriver);
        ElementHelper.clickOnElement(addApartmentPage.getFixedOrNegotiableCheckBox(), webDriver);
        Select neighbounrhood = new Select(webDriver.findElement(addApartmentPage.getNeighbourhoodSelect()));
        neighbounrhood.selectByIndex(1);
        ElementHelper.typeTextInElement(addApartmentPage.getLocationField(), webDriver, "https://www.google.com/maps/place/Al-Ahliyya+Amman+University/@32.0469879,35.6970906,12z/data=!4m6!3m5!1s0x151c986153c594b1:0xc6019ac0fe954392!8m2!3d32.0469879!4d35.7794774!16zL20vMGQ4bGx5?entry=ttu");
        ElementHelper.typeTextInElement(addApartmentPage.getAddressField(), webDriver, "Khalda-Amman");
        ElementHelper.typeTextInElement(addApartmentPage.getLandMarkField(), webDriver, "Super Market 911");
        ElementHelper.typeTextInElement(addApartmentPage.getSurroundingField(), webDriver, "Super Market 911");
        ElementHelper.typeTextInElement(addApartmentPage.getSizeField(), webDriver, "150");
        ElementHelper.typeTextInElement(addApartmentPage.getNumberBedroomsField(), webDriver, "2");
        ElementHelper.typeTextInElement(addApartmentPage.getNumberBedroomsMasterField(), webDriver, "1");
        ElementHelper.typeTextInElement(addApartmentPage.getNumberApartmentsBuildingField(), webDriver, "2");
        ElementHelper.typeTextInElement(addApartmentPage.getNumberBathrooms(), webDriver, "2");
        ElementHelper.typeTextInElement(addApartmentPage.getTerraceGardenSize(), webDriver, "50   ");
        Select yearsOldOptions = new Select(webDriver.findElement(searchPage.getYearsOldSearchField()));
        yearsOldOptions.selectByIndex(1);
        Select floorNumber = new Select(webDriver.findElement(addApartmentPage.getFloorNumber()));
        floorNumber.selectByIndex(1);
        ElementHelper.clickOnElement(addApartmentPage.getIndependentEntranceCheckBox(), webDriver);
        ElementHelper.clickOnElement(addApartmentPage.getIndependentGarageCheckBox(), webDriver);
        ElementHelper.clickOnElement(addApartmentPage.getRoofCheckBox(), webDriver);
        addApartmentPage.selectRandomOptionFromExtraFeaturesOptions();
        ElementHelper.typeTextInElement(addApartmentPage.getFeaturesField(), webDriver, "Central Gaz");
        ElementHelper.typeTextInElement(addApartmentPage.getKeywordsField(), webDriver, "Please note that these words will not appear in the advertisement, and they are for the purposes of searching for the advertisement only");
        ElementHelper.clickOnElement(addApartmentPage.getRequest3DTourCheckBox(), webDriver);
        ElementHelper.clickOnElement(addApartmentPage.getAcceptTermsAndConditionsCheckBox(), webDriver);
        ElementHelper.clickOnElement(addApartmentPage.getSaveAsDraftBtn(), webDriver);
        AssertionHelper.validateTheElementIsDisplayed(addApartmentPage.getCaptcha_error(), webDriver);


    }


//    @Test(groups = {"Priority 2 Modules", ".3 Medium Severity"}, description = "{{CountryName}}: Search for Apartment- Buy Page: Verify that searching using the 2 options (-2 & More than 8 Options) inside the Floor Number search menu works correctly", priority = 423)
//    public void a_verifySearchingUsingMinus2AndMoreThan8OptionsOptionInsideFloorNumberFieldForBuyApartmentWorksCorrectly() {
//        ArabicSearchPage searchPage = new ArabicSearchPage(webDriver);
//        searchPage.navigateToApartmentBuySearchLink();
//        searchPage.waitTillCartLoaderDisappear(webDriver);
//        int oldItemCounter = Integer.parseInt(DataExtractor.extractDigitsFromString(searchPage.getItemsCounter(), webDriver));
//        Select FloorNumberOptions = new Select(webDriver.findElement(searchPage.getFloorNumberSearchField()));
//        FloorNumberOptions.deselectAll();
//        FloorNumberOptions.selectByIndex(10);
//        searchPage.waitTillCartLoaderDisappear(webDriver);
//        FloorNumberOptions.selectByIndex(1);
//        searchPage.waitTillCartLoaderDisappear(webDriver);
//        int newItemCounter = Integer.parseInt(DataExtractor.extractDigitsFromString(searchPage.getItemsCounter(), webDriver));
//        Assert.assertFalse(oldItemCounter == newItemCounter);
//    }
//    @Test(groups = {"Priority 2 Modules", ".3 Medium Severity"}, description = "{{CountryName}}: Search for Apartment- Buy Page: Verify that searching using the 2 options (-2 & 7 Floor Options) inside the Floor Number search menu works correctly", priority = 424)
//    public void a_verifySearchingUsingMinus2And7FloorOptionsOptionInsideFloorNumberFieldForBuyApartmentWorksCorrectly() {
//        ArabicSearchPage searchPage = new ArabicSearchPage(webDriver);
//        Select FloorNumberOptions = new Select(webDriver.findElement(searchPage.getFloorNumberSearchField()));
//        FloorNumberOptions.deselectAll();
//        FloorNumberOptions.selectByIndex(10);
//        searchPage.waitTillCartLoaderDisappear(webDriver);
//        int oldItemCounter = Integer.parseInt(DataExtractor.extractDigitsFromString(searchPage.getItemsCounter(), webDriver));
//        FloorNumberOptions.selectByIndex(2);
//        searchPage.waitTillCartLoaderDisappear(webDriver);
//        int newItemCounter = Integer.parseInt(DataExtractor.extractDigitsFromString(searchPage.getItemsCounter(), webDriver));
//        Assert.assertFalse(oldItemCounter == newItemCounter);
//    }
//    @Test(groups = {"Priority 2 Modules", ".3 Medium Severity"}, description = "{{CountryName}}: Search for Apartment- Buy Page: Verify that searching using the 2 options (-2 & 6 Floor Options) inside the Floor Number search menu works correctly", priority = 425)
//    public void a_verifySearchingUsingMinus2And6FloorOptionsOptionInsideFloorNumberFieldForBuyApartmentWorksCorrectly() {
//        ArabicSearchPage searchPage = new ArabicSearchPage(webDriver);
//        Select FloorNumberOptions = new Select(webDriver.findElement(searchPage.getFloorNumberSearchField()));
//        FloorNumberOptions.deselectAll();
//        FloorNumberOptions.selectByIndex(10);
//        searchPage.waitTillCartLoaderDisappear(webDriver);
//        int oldItemCounter = Integer.parseInt(DataExtractor.extractDigitsFromString(searchPage.getItemsCounter(), webDriver));
//        FloorNumberOptions.selectByIndex(3);
//        searchPage.waitTillCartLoaderDisappear(webDriver);
//        int newItemCounter = Integer.parseInt(DataExtractor.extractDigitsFromString(searchPage.getItemsCounter(), webDriver));
//        Assert.assertFalse(oldItemCounter == newItemCounter);
//    }
//    @Test(groups = {"Priority 2 Modules", ".3 Medium Severity"}, description = "{{CountryName}}: Search for Apartment- Buy Page: Verify that searching using the 2 options (-2 & 5 Floor Options) inside the Floor Number search menu works correctly", priority = 426)
//    public void a_verifySearchingUsingMinus2And5FloorOptionsOptionInsideFloorNumberFieldForBuyApartmentWorksCorrectly() {
//        ArabicSearchPage searchPage = new ArabicSearchPage(webDriver);
//        Select FloorNumberOptions = new Select(webDriver.findElement(searchPage.getFloorNumberSearchField()));
//        FloorNumberOptions.deselectAll();
//        FloorNumberOptions.selectByIndex(10);
//        searchPage.waitTillCartLoaderDisappear(webDriver);
//        int oldItemCounter = Integer.parseInt(DataExtractor.extractDigitsFromString(searchPage.getItemsCounter(), webDriver));
//        FloorNumberOptions.selectByIndex(4);
//        searchPage.waitTillCartLoaderDisappear(webDriver);
//        int newItemCounter = Integer.parseInt(DataExtractor.extractDigitsFromString(searchPage.getItemsCounter(), webDriver));
//        Assert.assertFalse(oldItemCounter == newItemCounter);
//    }
//    @Test(groups = {"Priority 2 Modules", ".3 Medium Severity"}, description = "{{CountryName}}: Search for Apartment- Buy Page: Verify that searching using the 2 options (-2 & 4 Floor Options) inside the Floor Number search menu works correctly", priority = 427)
//    public void a_verifySearchingUsingMinus2And4FloorOptionsOptionInsideFloorNumberFieldForBuyApartmentWorksCorrectly() {
//        ArabicSearchPage searchPage = new ArabicSearchPage(webDriver);
//        Select FloorNumberOptions = new Select(webDriver.findElement(searchPage.getFloorNumberSearchField()));
//        FloorNumberOptions.deselectAll();
//        FloorNumberOptions.selectByIndex(10);
//        searchPage.waitTillCartLoaderDisappear(webDriver);
//        int oldItemCounter = Integer.parseInt(DataExtractor.extractDigitsFromString(searchPage.getItemsCounter(), webDriver));
//        FloorNumberOptions.selectByIndex(5);
//        searchPage.waitTillCartLoaderDisappear(webDriver);
//        int newItemCounter = Integer.parseInt(DataExtractor.extractDigitsFromString(searchPage.getItemsCounter(), webDriver));
//        Assert.assertFalse(oldItemCounter == newItemCounter);
//    }
//    @Test(groups = {"Priority 2 Modules", ".3 Medium Severity"}, description = "{{CountryName}}: Search for Apartment- Buy Page: Verify that searching using the 2 options (-2 &3 Floor Options) inside the Floor Number search menu works correctly", priority = 428)
//    public void a_verifySearchingUsingMinus2And3FloorOptionsOptionInsideFloorNumberFieldForBuyApartmentWorksCorrectly() {
//        ArabicSearchPage searchPage = new ArabicSearchPage(webDriver);
//        Select FloorNumberOptions = new Select(webDriver.findElement(searchPage.getFloorNumberSearchField()));
//        FloorNumberOptions.deselectAll();
//        FloorNumberOptions.selectByIndex(10);
//        searchPage.waitTillCartLoaderDisappear(webDriver);
//        int oldItemCounter = Integer.parseInt(DataExtractor.extractDigitsFromString(searchPage.getItemsCounter(), webDriver));
//        FloorNumberOptions.selectByIndex(6);
//        searchPage.waitTillCartLoaderDisappear(webDriver);
//        int newItemCounter = Integer.parseInt(DataExtractor.extractDigitsFromString(searchPage.getItemsCounter(), webDriver));
//        Assert.assertFalse(oldItemCounter == newItemCounter);
//    }

}