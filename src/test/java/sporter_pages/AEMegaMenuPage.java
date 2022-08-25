package sporter_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AEMegaMenuPage {

    public AEMegaMenuPage(WebDriver webDriver) {PageFactory.initElements(webDriver, this);}
    //declare all locators related to the AEMegaMenuPage
    @FindBy(xpath = "//ul[@class='nav-primary']")
    private List<WebElement> megaMenuList;
    @FindBy(xpath = "//ul[@class='cd-dropdown-content']")
    private WebElement shopByList;
    @FindBy(xpath = "//ul[@class='nav-primary']")
    private WebElement megaMenuSection;
    @FindBy(id = "switcher-store-trigger")
    private WebElement countryList;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='AE']")
    private WebElement aeCountry;
    @FindBy(xpath = ".//*[@class='nav-primary']/li[1]")
    private WebElement shopeByMenu;
    @FindBy(xpath = "//ul[@class='cd-dropdown-content']/li[1]/a")
    private WebElement sportsSupplementsOption;
    @FindBy(xpath = "//nav[@id='nav']/ul/li/nav/ul/li[1]/a/i")
    private WebElement sportsSupplementsArrowIcon;
    @FindBy(xpath = "//ul[@class='cd-dropdown-content']/li[2]/a")
    private WebElement vitaminsAndHealthOption;
    @FindBy(xpath = "//nav[@id='nav']/ul/li/nav/ul/li[2]/a/i")
    private WebElement vitaminsAndHealthArrowIcon;
    @FindBy(xpath = "//ul[@class='cd-dropdown-content']/li[3]/a")
    private WebElement healthFoodOption;
    @FindBy(xpath = "//nav[@id='nav']/ul/li/nav/ul/li[3]/a/i")
    private WebElement healthFoodArrowIcon;
    @FindBy(xpath = "//ul[@class='cd-dropdown-content']/li[4]/a")
    private WebElement sportsOption;
    @FindBy(xpath = "//nav[@id='nav']/ul/li/nav/ul/li[4]/a/i")
    private WebElement sportsArrowIcon;
    @FindBy(xpath = "//ul[@class='cd-dropdown-content']/li[5]/a")
    private WebElement womensOnlyOption;
    @FindBy(xpath = "//ul[@class='cd-dropdown-content']/li[6]/a")
    private WebElement byBrandOption;
    @FindBy(xpath = "//nav[@id='nav']/ul/li/nav/ul/li[6]/a/i")
    private WebElement byBrandArrowIcon;
    @FindBy(xpath = "//ul[@class='cd-dropdown-content']/li[7]/a")
    private WebElement byGoalOption;
    @FindBy(xpath = "//ul[@class='cd-dropdown-content']/li[8]/a")
    private WebElement salesAndOffersOption;
    @FindBy(xpath = "//ul[@class='cd-dropdown-content']/li[9]/a")
    private WebElement sporterStacksOption;
    @FindBy(xpath = "//nav[@id='nav']/ul/li/nav/ul/li/ul")
    private WebElement subMenuSection;
    @FindBy(xpath = "//nav[@id='nav']/ul/li/nav/ul/li/ul")
    private List<WebElement> subMenuList;
    @FindBy(xpath = ".//*[@class='nav-primary']/li[1]//i[@class='fas fa-bars']")
    private WebElement hamburgerMenuIcon;
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Sports Supplements'])[1]/following::a[1]")
    private WebElement proteinOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//*/span/a[text()='CREATINE'])[1]")
    private WebElement creatineOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//*/span/a[text()='AMINO ACIDS'])[1]")
    private WebElement aminoAcidsOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//*/span/a[text()='Muscle Boosters'])[1]")
    private WebElement muscleBoostersOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//*/span/a[text()='WEIGHT MANAGEMENT'])[1]")
    private WebElement weightManagementOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//*/span/a[text()='RECOVERY'])[1]")
    private WebElement recoveryOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//*/span/a[text()='CARBOHYDRATES'])[1]")
    private WebElement carbohydratesOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//*/span/a[text()='ENERGY & ENDURANCE'])[1]")
    private WebElement energyAndEnduranceOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//*/span/a[text()='Gaming & Focus '])[1]")
    private WebElement gamingAndFocusOptionInSportSupplementsMenu;
    @FindBy(xpath = "//nav[@id='nav']/ul/li/nav/ul/li[6]/ul/li")
    private WebElement byBrandSubMenuSection;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[2]")
    private WebElement wheyProteinOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[3]")
    private WebElement wheyProteinIsolateOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[4]")
    private WebElement proteinBlendsOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[5]")
    private WebElement nonDairyProteinOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[6]")
    private WebElement caseinProteinOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[7]")
    private WebElement dietProteinOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[8]")
    private WebElement massGainersOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[10]")
    private WebElement creatineMonohydrateOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[11]")
    private WebElement creatineBlendsOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[13]")
    private WebElement bCAAOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[14]")
    private WebElement eAAOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[15]")
    private WebElement arginineOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[16]")
    private WebElement betaAlanineOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[17]")
    private WebElement hMBOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[18]")
    private WebElement aminoAcidPowdersOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[19]")
    private WebElement aminoAcidPillsOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[20]")
    private WebElement citrullineOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[21]")
    private WebElement aminoAcidLiquidsOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[23]")
    private WebElement testosteroneBoostersOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[24]")
    private WebElement ghBoostersOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[26]")
    private WebElement stimulantWeightLossOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[27]")
    private WebElement nonStimulantWeightLossOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[28]")
    private WebElement mealReplacementsOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[29]")
    private WebElement metabolismSupportOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[30]")
    private WebElement toningCreamsOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[31]")
    private WebElement mctOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[33]")
    private WebElement glutamineOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[34]")
    private WebElement recoveryBlendOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[35]")
    private WebElement electrolytesAndHydrationOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[37]")
    private WebElement carbohydratePowdersOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[39]")
    private WebElement stimulantEnergyOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[40]")
    private WebElement nonStimulantEnergyOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sports Supplements']/a)[42]")
    private WebElement gamingSupplementsOptionInSportSupplementsMenu;
    //Getter Methods
    public List<WebElement> getMegaMenuList(){return megaMenuList;}
    public List<WebElement> getSubMenuList(){return subMenuList;}
    public WebElement getShopByList(){return shopByList;}
    public WebElement getMegaMenuSection(){return megaMenuSection;}
    public WebElement getShopeByMenu(){return shopeByMenu;}
    public WebElement getSportsSupplementsOption(){return sportsSupplementsOption;}
    public WebElement getVitaminsAndHealthOption(){return vitaminsAndHealthOption;}
    public WebElement getHealthFoodOption(){return healthFoodOption;}
    public WebElement getSportsOption(){return sportsOption;}
    public WebElement getWomensOnlyOption(){return womensOnlyOption;}
    public WebElement getByBrandOption(){return byBrandOption;}
    public WebElement getByGoalOption(){return byGoalOption;}
    public WebElement getSalesAndOffersOption(){return salesAndOffersOption;}
    public WebElement getSporterStacksOption(){return sporterStacksOption;}
    public WebElement getSubMenuSection(){return subMenuSection;}
    public WebElement getByBrandSubMenuSection(){return byBrandSubMenuSection;}
    public WebElement getProteinOptionInSportSupplementsMenu(){return proteinOptionInSportSupplementsMenu;}
    public WebElement getHamburgerMenuIcon(){return hamburgerMenuIcon;}
    public WebElement getSportsArrowIcon(){return sportsArrowIcon;}
    public WebElement getSportsSupplementsArrowIcon(){return sportsSupplementsArrowIcon;}
    public WebElement getByBrandArrowIcon(){return byBrandArrowIcon;}
    public WebElement getHealthFoodArrowIcon(){return healthFoodArrowIcon;}
    public WebElement getVitaminsAndHealthArrowIcon(){return vitaminsAndHealthArrowIcon;}
    public WebElement getCreatineOptionInSportSupplementsMenu(){return creatineOptionInSportSupplementsMenu;}
    public WebElement getAminoAcidsOptionInSportSupplementsMenu(){return aminoAcidsOptionInSportSupplementsMenu;}
    public WebElement getMuscleBoostersOptionInSportSupplementsMenu(){return muscleBoostersOptionInSportSupplementsMenu;}
    public WebElement getWeightManagementOptionInSportSupplementsMenu(){return weightManagementOptionInSportSupplementsMenu;}
    public WebElement getRecoveryOptionInSportSupplementsMenu(){return recoveryOptionInSportSupplementsMenu;}
    public WebElement getCarbohydratesOptionInSportSupplementsMenu(){return carbohydratesOptionInSportSupplementsMenu;}
    public WebElement getEnergyAndEnduranceOptionInSportSupplementsMenu(){return energyAndEnduranceOptionInSportSupplementsMenu;}
    public WebElement getGamingAndFocusOptionInSportSupplementsMenu(){return gamingAndFocusOptionInSportSupplementsMenu;}
    public WebElement getWheyProteinOptionInSportSupplementsMenu(){return wheyProteinOptionInSportSupplementsMenu;}
    public WebElement getWheyProteinIsolateOptionInSportSupplementsMenu(){return wheyProteinIsolateOptionInSportSupplementsMenu;}
    public WebElement getProteinBlendsOptionInSportSupplementsMenu(){return proteinBlendsOptionInSportSupplementsMenu;}
    public WebElement getNonDairyProteinOptionInSportSupplementsMenu(){return nonDairyProteinOptionInSportSupplementsMenu;}
    public WebElement getCaseinProteinOptionInSportSupplementsMenu(){return caseinProteinOptionInSportSupplementsMenu;}
    public WebElement getDietProteinOptionInSportSupplementsMenu(){return dietProteinOptionInSportSupplementsMenu;}
    public WebElement getMassGainersOptionInSportSupplementsMenu(){return massGainersOptionInSportSupplementsMenu;}
    public WebElement getCreatineMonohydrateOptionInSportSupplementsMenu(){return creatineMonohydrateOptionInSportSupplementsMenu;}
    public WebElement getCreatineBlendsOptionInSportSupplementsMenu(){return creatineBlendsOptionInSportSupplementsMenu;}
    public WebElement getbCAAOptionInSportSupplementsMenu(){return bCAAOptionInSportSupplementsMenu;}
    public WebElement getEAAOptionInSportSupplementsMenu(){return eAAOptionInSportSupplementsMenu;}
    public WebElement getArginineOptionInSportSupplementsMenu(){return arginineOptionInSportSupplementsMenu;}
    public WebElement getBetaAlanineOptionInSportSupplementsMenu(){return betaAlanineOptionInSportSupplementsMenu;}
    public WebElement getHMBOptionInSportSupplementsMenu(){return hMBOptionInSportSupplementsMenu;}
    public WebElement getAminoAcidPowdersOptionInSportSupplementsMenu(){return aminoAcidPowdersOptionInSportSupplementsMenu;}
    public WebElement getAminoAcidPillsOptionInSportSupplementsMenu(){return aminoAcidPillsOptionInSportSupplementsMenu;}
    public WebElement getCitrullineOptionInSportSupplementsMenu(){return citrullineOptionInSportSupplementsMenu;}
    public WebElement getAminoAcidLiquidsOptionInSportSupplementsMenu(){return aminoAcidLiquidsOptionInSportSupplementsMenu;}
    public WebElement getTestosteroneBoostersOptionInSportSupplementsMenu(){return testosteroneBoostersOptionInSportSupplementsMenu;}
    public WebElement getGhBoostersOptionInSportSupplementsMenu(){return ghBoostersOptionInSportSupplementsMenu;}
    public WebElement getStimulantWeightLossOptionInSportSupplementsMenu(){return stimulantWeightLossOptionInSportSupplementsMenu;}
    public WebElement getNonStimulantWeightLossOptionInSportSupplementsMenu(){return nonStimulantWeightLossOptionInSportSupplementsMenu;}
    public WebElement getMealReplacementsOptionInSportSupplementsMenu(){return mealReplacementsOptionInSportSupplementsMenu;}
    public WebElement getMetabolismSupportOptionInSportSupplementsMenu(){return metabolismSupportOptionInSportSupplementsMenu;}
    public WebElement getToningCreamsOptionInSportSupplementsMenu(){return toningCreamsOptionInSportSupplementsMenu;}
    public WebElement getMctOptionInSportSupplementsMenu(){return mctOptionInSportSupplementsMenu;}
    public WebElement getGlutamineOptionInSportSupplementsMenu(){return glutamineOptionInSportSupplementsMenu;}
    public WebElement getRecoveryBlendOptionInSportSupplementsMenu(){return recoveryBlendOptionInSportSupplementsMenu;}
    public WebElement getElectrolytesAndHydrationOptionInSportSupplementsMenu(){return electrolytesAndHydrationOptionInSportSupplementsMenu;}
    public WebElement getCarbohydratePowdersOptionInSportSupplementsMenu(){return carbohydratePowdersOptionInSportSupplementsMenu;}
    public WebElement getStimulantEnergyOptionInSportSupplementsMenu(){return stimulantEnergyOptionInSportSupplementsMenu;}
    public WebElement getNonStimulantEnergyOptionInSportSupplementsMenu(){return nonStimulantEnergyOptionInSportSupplementsMenu;}
    public WebElement getGamingSupplementsOptionInSportSupplementsMenu(){return gamingSupplementsOptionInSportSupplementsMenu;}

    //Define the main actions we need to execute our TCs
    public void switchToAECountry() {try{
        DataHelperAndWait.isDisplayed(countryList, 15);
        this.countryList.click();
        DataHelperAndWait.implicitWait(6);
        this.aeCountry.click();}
    catch(Exception e){
        DataHelperAndWait.isDisplayed(countryList, 15);
        this.countryList.click();
        DataHelperAndWait.implicitWait(6);
        this.aeCountry.click();
    }
    }
}
