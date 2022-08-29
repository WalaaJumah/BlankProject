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
    @FindBy(xpath = "//ul[@class='cd-dropdown-content']/li[3]/a")
    private WebElement healthyFoodOption;
    @FindBy(css = "ul.cd-secondary-dropdown.full-height.is-hidden.is-active")
    private List<WebElement> vitaminsAndHealthList;
    @FindBy(css = "ul.cd-secondary-dropdown.full-height.is-hidden.is-active")
    private List<WebElement> HealthyFoodList;
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
    private WebElement gamingEssentialsOptionInSportSupplementsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[1]")
    private WebElement featuredOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[1]")
    private WebElement groceryOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[2]")
    private WebElement bakingAndCookingOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[3]")
    private WebElement cannedOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[4]")
    private WebElement coffeeOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[5]")
    private WebElement condimentsOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[6]")
    private WebElement milkAndCreamOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[7]")
    private WebElement nutsAndOatsOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[8]")
    private WebElement oilsOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[9]")
    private WebElement pastaOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[10]")
    private WebElement riceAndGrainsOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[11]")
    private WebElement seasoningsAndSpicesOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[12]")
    private WebElement sugarSweetenersOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[13]")
    private WebElement syrupsOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[14]")
    private WebElement teaAndHerbsOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[15]")
    private WebElement superfoodsOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[16]")
    private WebElement readyMixesOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[17]")
    private WebElement breakfastAndCerealOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[18]")
    private WebElement readyToDrinkOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[19]")
    private WebElement aminoAndBcaasOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[20]")
    private WebElement energyDrinksOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[21]")
    private WebElement proteinShakesOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[22]")
    private WebElement electrolytesAndHydrationOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[23]")
    private WebElement healthySnacksOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[24]")
    private WebElement proteinBarsOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[25]")
    private WebElement cookiesOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[26]")
    private WebElement chipsOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[27]")
    private WebElement browniesAndPancakesOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[28]")
    private WebElement snackBarsOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[29]")
    private WebElement spreadsOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[30]")
    private WebElement otherHealthySnacksOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[31]")
    private WebElement readyToEatOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[32]")
    private WebElement healthyMealsOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[33]")
    private WebElement featuredOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[34]")
    private WebElement healthyMealReplacementOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[35]")
    private WebElement proteinCoffeeOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[36]")
    private WebElement candiesOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[37]")
    private WebElement flavoringAgentsOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[38]")
    private WebElement ketoSnacksOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[39]")
    private WebElement manukaHoneyOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food']/a)[40]")
    private WebElement meatSnacksOptionInHealthyFoodMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[2]")
    private WebElement aliveVitaminsOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[3]")
    private WebElement sexualHealthOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[4]")
    private WebElement essentialVitaminsOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[5]")
    private WebElement folicAcidOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[6]")
    private WebElement vitaminAOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[7]")
    private WebElement vitaminBOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[8]")
    private WebElement vitaminCOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[9]")
    private WebElement vitaminDOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[10]")
    private WebElement vitaminEOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[11]")
    private WebElement vitaminKOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[12]")
    private WebElement multiVitaminsOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[13]")
    private WebElement vitaminsForKidsOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[14]")
    private WebElement vitaminsForMenOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[15]")
    private WebElement vitaminsForWomenOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[16]")
    private WebElement boneAndJointOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[17]")
    private WebElement boneHealthOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[18]")
    private WebElement jointHealthOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[19]")
    private WebElement beautyOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[20]")
    private WebElement collagenOptionInVitaminsAndHealthMenu;

    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[21]")
    private WebElement hairSkinAndNailsOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[22]")
    private WebElement fishOilOmegasOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[23]")
    private WebElement fishOilOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[24]")
    private WebElement omega369OptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[25]")
    private WebElement healthLifestyleOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[26]")
    private WebElement antioxidantsOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[27]")
    private WebElement bloodSugarSupportOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[28]")
    private WebElement brainSupportOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[29]")
    private WebElement heartHealthOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[43]")
    private WebElement digestionOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[30]")
    private WebElement detoxAndCleanseOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[31]")
    private WebElement energyFormulasOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[32]")
    private WebElement eyeHealthOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[46]")
    private WebElement sportVitaminsOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[47]")
    private WebElement aminoAcidOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[33]")
    private WebElement herbsOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[34]")
    private WebElement hormonesBalanceOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[48]")
    private WebElement mineralsOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[49]")
    private WebElement calciumOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[50]")
    private WebElement ironOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[51]")
    private WebElement magnesiumOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[52]")
    private WebElement multimineralFormulasOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[53]")
    private WebElement zincOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[54]")
    private WebElement potassiumOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[35]")
    private WebElement immuneSupportOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[36]")
    private WebElement mensHealthOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[37]")
    private WebElement stressReliefOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[38]")
    private WebElement sleepSupportOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[39]")
    private WebElement superFoodsOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[40]")
    private WebElement urinaryTractSupportOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[41]")
    private WebElement weightManagementOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[55]")
    private WebElement healthyDrinksOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[56]")
    private WebElement drinkableVitaminsOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[42]")
    private WebElement womensHealthOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[57]")
    private WebElement petsOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[58]")
    private WebElement supplementsMoreOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[44]")
    private WebElement digestiveSupportOptionInVitaminsAndHealthMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health']/a)[45]")
    private WebElement probioticsOptionInVitaminsAndHealthMenu;
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
    public WebElement getGamingEssentialsOptionInSportSupplementsMenu(){return gamingEssentialsOptionInSportSupplementsMenu;}
    public WebElement getFeaturedOptionInVitaminsAndHealthMenu(){return featuredOptionInVitaminsAndHealthMenu;}
    public WebElement getAliveVitaminsOptionInVitaminsAndHealthMenu(){return aliveVitaminsOptionInVitaminsAndHealthMenu;}
    public WebElement getSexualHealthOptionInVitaminsAndHealthMenu(){return sexualHealthOptionInVitaminsAndHealthMenu;}
    public WebElement getEssentialVitaminsOptionInVitaminsAndHealthMenu(){return essentialVitaminsOptionInVitaminsAndHealthMenu;}
    public WebElement getFolicAcidOptionInVitaminsAndHealthMenu(){return folicAcidOptionInVitaminsAndHealthMenu;}
    public WebElement getVitaminAOptionInVitaminsAndHealthMenu(){return vitaminAOptionInVitaminsAndHealthMenu;}
    public WebElement getVitaminBOptionInVitaminsAndHealthMenu(){return vitaminBOptionInVitaminsAndHealthMenu;}
    public WebElement getVitaminCOptionInVitaminsAndHealthMenu(){return vitaminCOptionInVitaminsAndHealthMenu;}
    public WebElement getVitaminDOptionInVitaminsAndHealthMenu(){return vitaminDOptionInVitaminsAndHealthMenu;}
    public WebElement getVitaminEOptionInVitaminsAndHealthMenu(){return vitaminEOptionInVitaminsAndHealthMenu;}
    public WebElement getVitaminKOptionInVitaminsAndHealthMenu(){return vitaminKOptionInVitaminsAndHealthMenu;}
    public WebElement getMultiVitaminsOptionInVitaminsAndHealthMenu(){return multiVitaminsOptionInVitaminsAndHealthMenu;}
    public WebElement getVitaminsForKidsOptionInVitaminsAndHealthMenu(){return vitaminsForKidsOptionInVitaminsAndHealthMenu;}
    public WebElement getVitaminsForMenOptionInVitaminsAndHealthMenu(){return vitaminsForMenOptionInVitaminsAndHealthMenu;}
    public WebElement getVitaminsForWomenOptionInVitaminsAndHealthMenu(){return vitaminsForWomenOptionInVitaminsAndHealthMenu;}
    public WebElement getBoneAndJointOptionInVitaminsAndHealthMenu(){return boneAndJointOptionInVitaminsAndHealthMenu;}
    public WebElement getBoneHealthOptionInVitaminsAndHealthMenu(){return boneHealthOptionInVitaminsAndHealthMenu;}
    public WebElement getJointHealthOptionInVitaminsAndHealthMenu(){return jointHealthOptionInVitaminsAndHealthMenu;}
    public WebElement getBeautyOptionInVitaminsAndHealthMenu(){return beautyOptionInVitaminsAndHealthMenu;}
    public WebElement getCollagenOptionInVitaminsAndHealthMenu(){return collagenOptionInVitaminsAndHealthMenu;}
    public WebElement getHairSkinAndNailsOptionInVitaminsAndHealthMenu(){return hairSkinAndNailsOptionInVitaminsAndHealthMenu;}
    public WebElement getFishOilOmegasOptionInVitaminsAndHealthMenu(){return fishOilOmegasOptionInVitaminsAndHealthMenu;}
    public WebElement getFishOilOptionInVitaminsAndHealthMenu(){return fishOilOptionInVitaminsAndHealthMenu;}
    public WebElement getOmega369OptionInVitaminsAndHealthMenu(){return omega369OptionInVitaminsAndHealthMenu;}
    public WebElement getHealthLifestyleOptionInVitaminsAndHealthMenu(){return healthLifestyleOptionInVitaminsAndHealthMenu;}
    public WebElement getBrainSupportOptionInVitaminsAndHealthMenu(){return brainSupportOptionInVitaminsAndHealthMenu;}
    public WebElement getDigestionOptionInVitaminsAndHealthMenu(){return digestionOptionInVitaminsAndHealthMenu;}
    public WebElement getDetoxAndCleanseOptionInVitaminsAndHealthMenu(){return detoxAndCleanseOptionInVitaminsAndHealthMenu;}
    public WebElement getEnergyFormulasOptionInVitaminsAndHealthMenu(){return energyFormulasOptionInVitaminsAndHealthMenu;}
    public WebElement getSportVitaminsOptionInVitaminsAndHealthMenu(){return sportVitaminsOptionInVitaminsAndHealthMenu;}
    public WebElement getHerbsOptionInVitaminsAndHealthMenu(){return herbsOptionInVitaminsAndHealthMenu;}
    public WebElement getMineralsOptionInVitaminsAndHealthMenu(){return mineralsOptionInVitaminsAndHealthMenu;}
    public WebElement getMensHealthOptionInVitaminsAndHealthMenu(){return mensHealthOptionInVitaminsAndHealthMenu;}
    public WebElement getStressReliefOptionInVitaminsAndHealthMenu(){return stressReliefOptionInVitaminsAndHealthMenu;}
    public WebElement getSleepSupportOptionInVitaminsAndHealthMenu(){return sleepSupportOptionInVitaminsAndHealthMenu;}
    public WebElement getSuperFoodsOptionInVitaminsAndHealthMenu(){return superFoodsOptionInVitaminsAndHealthMenu;}
    public WebElement getUrinaryTractSupportOptionInVitaminsAndHealthMenu(){return urinaryTractSupportOptionInVitaminsAndHealthMenu;}
    public WebElement getHealthyDrinksOptionInVitaminsAndHealthMenu(){return healthyDrinksOptionInVitaminsAndHealthMenu;}
    public WebElement getWomensHealthOptionInVitaminsAndHealthMenu(){return womensHealthOptionInVitaminsAndHealthMenu;}
    public WebElement getPetsOptionInVitaminsAndHealthMenu(){return petsOptionInVitaminsAndHealthMenu;}
    public WebElement getDigestiveSupportOptionInVitaminsAndHealthMenu(){return digestiveSupportOptionInVitaminsAndHealthMenu;}
    public List<WebElement> getVitaminsAndHealthList(){return vitaminsAndHealthList;}
    public List<WebElement> getHealthyFoodList(){return HealthyFoodList;}
    public WebElement getAntioxidantsOptionInVitaminsAndHealthMenu(){return antioxidantsOptionInVitaminsAndHealthMenu;}
    public WebElement getBloodSugarSupportOptionInVitaminsAndHealthMenu(){return bloodSugarSupportOptionInVitaminsAndHealthMenu;}
    public WebElement getHeartHealthOptionInVitaminsAndHealthMenu(){return heartHealthOptionInVitaminsAndHealthMenu;}
    public WebElement getEyeHealthOptionInVitaminsAndHealthMenu(){return eyeHealthOptionInVitaminsAndHealthMenu;}
    public WebElement getHormonesBalanceOptionInVitaminsAndHealthMenu(){return hormonesBalanceOptionInVitaminsAndHealthMenu;}
    public WebElement getImmuneSupportOptionInVitaminsAndHealthMenu(){return immuneSupportOptionInVitaminsAndHealthMenu;}
    public WebElement getWeightManagementOptionInVitaminsAndHealthMenu(){return weightManagementOptionInVitaminsAndHealthMenu;}
    public WebElement getProbioticsOptionInVitaminsAndHealthMenu(){return probioticsOptionInVitaminsAndHealthMenu;}
    public WebElement getAminoAcidOptionInVitaminsAndHealthMenu(){return aminoAcidOptionInVitaminsAndHealthMenu;}
    public WebElement getCalciumOptionInVitaminsAndHealthMenu(){return calciumOptionInVitaminsAndHealthMenu;}
    public WebElement getIronOptionInVitaminsAndHealthMenu(){return ironOptionInVitaminsAndHealthMenu;}
    public WebElement getMagnesiumOptionInVitaminsAndHealthMenu(){return magnesiumOptionInVitaminsAndHealthMenu;}
    public WebElement getMultimineralFormulasOptionInVitaminsAndHealthMenu(){return multimineralFormulasOptionInVitaminsAndHealthMenu;}
    public WebElement getZincOptionInVitaminsAndHealthMenu(){return zincOptionInVitaminsAndHealthMenu;}
    public WebElement getPotassiumOptionInVitaminsAndHealthMenu(){return potassiumOptionInVitaminsAndHealthMenu;}
    public WebElement getDrinkableVitaminsOptionInVitaminsAndHealthMenu(){return drinkableVitaminsOptionInVitaminsAndHealthMenu;}
    public WebElement getSupplementsMoreOptionInVitaminsAndHealthMenu(){return supplementsMoreOptionInVitaminsAndHealthMenu;}
    public WebElement getHealthyFoodOption(){return healthyFoodOption;}
    public WebElement getGroceryOptionInHealthyFoodMenu(){return groceryOptionInHealthyFoodMenu;}
    public WebElement getBakingAndCookingOptionInHealthyFoodMenu(){return bakingAndCookingOptionInHealthyFoodMenu;}
    public WebElement getCannedOptionInHealthyFoodMenu(){return cannedOptionInHealthyFoodMenu;}
    public WebElement getCoffeeOptionInHealthyFoodMenu(){return coffeeOptionInHealthyFoodMenu;}
    public WebElement getCondimentsOptionInHealthyFoodMenu(){return condimentsOptionInHealthyFoodMenu;}
    public WebElement getMilkAndCreamOptionInHealthyFoodMenu(){return milkAndCreamOptionInHealthyFoodMenu;}
    public WebElement getNutsAndOatsOptionInHealthyFoodMenu(){return nutsAndOatsOptionInHealthyFoodMenu;}
    public WebElement getOilsOptionInHealthyFoodMenu(){return oilsOptionInHealthyFoodMenu;}
    public WebElement getPastaOptionInHealthyFoodMenu(){return pastaOptionInHealthyFoodMenu;}
    public WebElement getRiceAndGrainsOptionInHealthyFoodMenu(){return riceAndGrainsOptionInHealthyFoodMenu;}
    public WebElement getSeasoningsAndSpicesOptionInHealthyFoodMenu(){return seasoningsAndSpicesOptionInHealthyFoodMenu;}
    public WebElement getSugarSweetenersOptionInHealthyFoodMenu(){return sugarSweetenersOptionInHealthyFoodMenu;}
    public WebElement getSyrupsOptionInHealthyFoodMenu(){return syrupsOptionInHealthyFoodMenu;}
    public WebElement getTeaAndHerbsOptionInHealthyFoodMenu(){return teaAndHerbsOptionInHealthyFoodMenu;}
    public WebElement getSuperfoodsOptionInHealthyFoodMenu(){return superfoodsOptionInHealthyFoodMenu;}
    public WebElement getReadyMixesOptionInHealthyFoodMenu(){return readyMixesOptionInHealthyFoodMenu;}
    public WebElement getBreakfastAndCerealOptionInHealthyFoodMenu(){return breakfastAndCerealOptionInHealthyFoodMenu;}
    public WebElement getReadyToDrinkOptionInHealthyFoodMenu(){return readyToDrinkOptionInHealthyFoodMenu;}
    public WebElement getAminoAndBcaasOptionInHealthyFoodMenu(){return aminoAndBcaasOptionInHealthyFoodMenu;}
    public WebElement getEnergyDrinksOptionInHealthyFoodMenu(){return energyDrinksOptionInHealthyFoodMenu;}
    public WebElement getProteinShakesOptionInHealthyFoodMenu(){return proteinShakesOptionInHealthyFoodMenu;}
    public WebElement getElectrolytesAndHydrationOptionInHealthyFoodMenu(){return electrolytesAndHydrationOptionInHealthyFoodMenu;}
    public WebElement getHealthySnacksOptionInHealthyFoodMenu(){return healthySnacksOptionInHealthyFoodMenu;}
    public WebElement getProteinBarsOptionInHealthyFoodMenu(){return proteinBarsOptionInHealthyFoodMenu;}
    public WebElement getCookiesOptionInHealthyFoodMenu(){return cookiesOptionInHealthyFoodMenu;}
    public WebElement getChipsOptionInHealthyFoodMenu(){return chipsOptionInHealthyFoodMenu;}
    public WebElement getBrowniesAndPancakesOptionInHealthyFoodMenu(){return browniesAndPancakesOptionInHealthyFoodMenu;}
    public WebElement getSnackBarsOptionInHealthyFoodMenu(){return snackBarsOptionInHealthyFoodMenu;}
    public WebElement getSpreadsOptionInHealthyFoodMenu(){return spreadsOptionInHealthyFoodMenu;}
    public WebElement getOtherHealthySnacksOptionInHealthyFoodMenu(){return otherHealthySnacksOptionInHealthyFoodMenu;}
    public WebElement getReadyToEatOptionInHealthyFoodMenu(){return readyToEatOptionInHealthyFoodMenu;}
    public WebElement getHealthyMealsOptionInHealthyFoodMenu(){return healthyMealsOptionInHealthyFoodMenu;}
    public WebElement getFeaturedOptionInHealthyFoodMenu(){return featuredOptionInHealthyFoodMenu;}
    public WebElement getHealthyMealReplacementOptionInHealthyFoodMenu(){return healthyMealReplacementOptionInHealthyFoodMenu;}
    public WebElement getProteinCoffeeOptionInHealthyFoodMenu(){return proteinCoffeeOptionInHealthyFoodMenu;}
    public WebElement getCandiesOptionInHealthyFoodMenu(){return candiesOptionInHealthyFoodMenu;}
    public WebElement getFlavoringAgentsOptionInHealthyFoodMenu(){return flavoringAgentsOptionInHealthyFoodMenu;}
    public WebElement getKetoSnacksOptionInHealthyFoodMenu(){return ketoSnacksOptionInHealthyFoodMenu;}
    public WebElement getManukaHoneyOptionInHealthyFoodMenu(){return manukaHoneyOptionInHealthyFoodMenu;}
    public WebElement getMeatSnacksOptionInHealthyFoodMenu(){return meatSnacksOptionInHealthyFoodMenu;}

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
