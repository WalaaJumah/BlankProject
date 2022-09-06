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
    @FindBy(xpath = "//ul[@class='nav-primary']")
    private WebElement megaMenuListSection;
    @FindBy(xpath = "//ul[@class='cd-dropdown-content']")
    private WebElement shopByList;
    @FindBy(xpath = "(//ul[@class='groupmenu-drop'])[1]")
    private List<WebElement> sportsSupplementsMainMenuList;
    @FindBy(xpath = "(//ul[@class='groupmenu-drop'])[1]")
    private WebElement sportsSupplementsSubMenuSection;
    @FindBy(xpath = "(//ul[@class='groupmenu-drop'])[2]")
    private WebElement vitaminsAndHealthSubMenuSection;
    @FindBy(xpath = "(//ul[@class='groupmenu-drop'])[3]")
    private WebElement healthyFoodSubMenuSection;
    @FindBy(xpath = "(//ul[@class='groupmenu-drop'])[4]")
    private WebElement sportsSubMenuSection;
    @FindBy(xpath = "(//ul[@class='groupmenu-drop'])[2]")
    private List<WebElement> VitaminsAndHealthMainMenuList;
    @FindBy(xpath = "//ul[@class='nav-primary']")
    private WebElement megaMenuSection;
    @FindBy(id = "switcher-store-trigger")
    private WebElement countryList;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='AE']")
    private WebElement aeCountry;
    @FindBy(xpath = ".//*[@class='nav-primary']/li[1]")
    private WebElement shopeByMenu;
    @FindBy(xpath = ".//*[@class='nav-primary']/li[2]")
    private WebElement sportSupplementsMainMenu;
    @FindBy(xpath = ".//*[@class='nav-primary']/li[3]")
    private WebElement vitaminsAndHealthMainMenu;
    @FindBy(xpath = ".//*[@class='nav-primary']/li[4]")
    private WebElement healthyFoodMainMenu;
    @FindBy(xpath = ".//*[@class='nav-primary']/li[5]")
    private WebElement sportsMainMenu;
    @FindBy(xpath = ".//*[@class='nav-primary']/li[6]/a")
    private WebElement womenOnlyMainMenu;
    @FindBy(xpath = ".//*[@class='nav-primary']/li[6]/a/span")
    private WebElement womenOnlyMainMenuText;
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

    @FindBy(css = "ul.cd-secondary-dropdown.full-height.is-hidden.is-active")
    private List<WebElement> optionList;
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
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[1]")
    private WebElement menOptionInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[2]")
    private WebElement clothingInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[3]")
    private WebElement topsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[4]")
    private WebElement pantsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[5]")
    private WebElement shortsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[6]")
    private WebElement jacketsAndCoatsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[7]")
    private WebElement safetyMasksInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[8]")
    private WebElement footwearInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[9]")
    private WebElement sneakersInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[10]")
    private WebElement trainingShoesInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[11]")
    private WebElement runningShoesInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[12]")
    private WebElement hikingShoesInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[13]")
    private WebElement accessoriesInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[14]")
    private WebElement glovesInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[15]")
    private WebElement beltsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[16]")
    private WebElement capsAndHatsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[17]")
    private WebElement capInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[18]")
    private WebElement shakersInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[19]")
    private WebElement waterBottlesInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[20]")
    private WebElement bugHereInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[21]")
    private WebElement socksInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[22]")
    private WebElement towelsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[23]")
    private WebElement sunglassesInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[24]")
    private WebElement mixerInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[25]")
    private WebElement bagsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[26]")
    private WebElement backPacksInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[27]")
    private WebElement shouldersBagsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[28]")
    private WebElement wearableTechInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[29]")
    private WebElement watchesInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[30]")
    private WebElement gamingAccessoriesInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[31]")
    private WebElement equipmentInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[32]")
    private WebElement gripsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[33]")
    private WebElement ballsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[34]")
    private WebElement rollersInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[35]")
    private WebElement weightsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[36]")
    private WebElement womenInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[37]")
    private WebElement womenClothingInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[38]")
    private WebElement womenTopsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[39]")
    private WebElement womenShortsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[40]")
    private WebElement womenSafetyMasksInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[41]")
    private WebElement womenAccessoriesInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[42]")
    private WebElement womenGlovesInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[43]")
    private WebElement glovesBugCategoryInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[44]")
    private WebElement womenBeltsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[45]")
    private WebElement womenCapsAndHatsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[46]")
    private WebElement womenCapsInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[47]")
    private WebElement womenShakersInSportsMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[48]")
    private WebElement womenWaterBottlesInSportsMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[49]")
    private WebElement womenSocksInSportsMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[50]")
    private WebElement womenTowelsInSportsMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[51]")
    private WebElement womenSunglassesInSportsMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[52]")
    private WebElement womenMixerInSportsMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[53]")
    private WebElement womenBagsInSportsMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[54]")
    private WebElement womenBackPacksInSportsMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS']/a)[55]")
    private WebElement womenSholdersBagsInSportsMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[1]")
    private WebElement supplementsOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[2]")
    private WebElement optimumNutritionOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[3]")
    private WebElement muscletechOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[4]")
    private WebElement cellucorOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[5]")
    private WebElement dymatizeOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[6]")
    private WebElement xtendOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[7]")
    private WebElement animalNutritionOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[8]")
    private WebElement musclePharmOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[9]")
    private WebElement universalNutritionOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[10]")
    private WebElement bsnOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[11]")
    private WebElement ehplabsOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[12]")
    private WebElement jymSupplementScienceOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[13]")
    private WebElement bpiSportsOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[14]")
    private WebElement russianBearOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[15]")
    private WebElement isopureOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[16]")
    private WebElement oneUpNutritionOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[17]")
    private WebElement musclemedsOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[18]")
    private WebElement mhpOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[19]")
    private WebElement evlNutritionOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[20]")
    private WebElement nlaForHerOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[21]")
    private WebElement muscleNutritionOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[22]")
    private WebElement gatNutritionOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[23]")
    private WebElement labradaOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[24]")
    private WebElement orgainOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[25]")
    private WebElement nutrexResearchOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[26]")
    private WebElement scitecNutritionOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[27]")
    private WebElement brolabOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[28]")
    private WebElement sotruOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[29]")
    private WebElement divineHealthOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[30]")
    private WebElement ghostOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[31]")
    private WebElement womensBestOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[32]")
    private WebElement efxSportsOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[33]")
    private WebElement basixOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[34]")
    private WebElement ak47OptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[35]")
    private WebElement nfSportsOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[36]")
    private WebElement fullyDosedOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[37]")
    private WebElement fivePercentNutritionOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[38]")
    private WebElement olimpSportNutritionOptionInByBrandMenu;
    @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[39]")
    private WebElement jnxSportsOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[40]")
    private WebElement fitAndLeanOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[41]")
    private WebElement gymqueenOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[42]")
    private WebElement thePackOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[43]")
    private WebElement betancourtNutritionOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[44]")
    private WebElement yallaProteinOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[45]")
    private WebElement proteinWorldOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[46]")
    private WebElement obviOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[47]")
    private WebElement naughtyBoyOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[48]")
    private WebElement steelFitOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[49]")
    private WebElement usnOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[50]")
    private WebElement xGamerOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[51]")
    private WebElement innosuppsOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[52]")
    private WebElement outbreakNutritionOptionInByBrandMenu;
  @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[53]")
    private WebElement insaneLabzOptionInByBrandMenu;
 @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[54]")
    private WebElement allMaxOptionInByBrandMenu;
 @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[55]")
    private WebElement glaxonOptionInByBrandMenu;
 @FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[56]")
    private WebElement redcon1OptionInByBrandMenu;
@FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[57]")
    private WebElement pandaSupplementsOptionInByBrandMenu;
@FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[58]")
    private WebElement nutrendOptionInByBrandMenu;
@FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[59]")
    private WebElement ostrovitOptionInByBrandMenu;
@FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[60]")
    private WebElement betteryOptionInByBrandMenu;
@FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[61]")
    private WebElement healthyFoodSnacksAndMealReplacementOptionInByBrandMenu;

@FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[62]")
    private WebElement wowHydrateOptionInByBrandMenu;
@FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[63]")
    private WebElement questNutritionOptionInByBrandMenu;
@FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[64]")
    private WebElement grenadeOptionInByBrandMenu;
@FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[65]")
    private WebElement reignEnergyOptionInByBrandMenu;
@FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[66]")
    private WebElement monsterEnergyOptionInByBrandMenu;
@FindBy(xpath = "(.//span[@data-vertical='By Brand']/a)[67]")
    private WebElement thirdEnergyOptionInByBrandMenu;
//Sport Supplements Main Menu
@FindBy(xpath = "(*//i[@class='fas fa-angle-down'])[1]")
    private WebElement downArrowKeyInSportSupplementsMenu;

@FindBy(xpath = "(*//i[@class='fas fa-angle-down'])[2]")
    private WebElement downArrowKeyInVitaminsAndHealthMenu;
@FindBy(xpath = "(*//i[@class='fas fa-angle-down'])[3]")
    private WebElement downArrowKeyInHealthyFoodMenu;

@FindBy(xpath = "(*//i[@class='fas fa-angle-down'])[4]")
    private WebElement downArrowKeyInSportsMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[1]")
    private WebElement proteinOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[9]")
    private WebElement creatineOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[12]")
    private WebElement aminoAcidsOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[22]")
    private WebElement muscleBoostersOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[25]")
  private WebElement weightManagementOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[32]")
    private WebElement recoveryOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[36]")
    private WebElement carbohydratesOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[38]")
    private WebElement energyAndEnduranceOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[41]")
    private WebElement gamingAndFocusOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[2]")
    private WebElement wheyProteinOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[3]")
    private WebElement wheyProteinIsolateOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[4]")
    private WebElement proteinBlendsOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[5]")
    private WebElement nonDairyProteinOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[6]")
    private WebElement caseinProteinOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[7]")
    private WebElement dietProteinOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[8]")
    private WebElement massGainersOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[10]")
    private WebElement creatineMonohydrateOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[11]")
    private WebElement creatineBlendsOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[13]")
    private WebElement bCAAOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[14]")
    private WebElement eAAOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[15]")
    private WebElement arginineOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[16]")
    private WebElement betaAlanineOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[17]")
    private WebElement hMBOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[18]")
    private WebElement aminoAcidPowdersOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[19]")
    private WebElement aminoAcidPillsOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[20]")
    private WebElement citrullineOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[21]")
    private WebElement aminoAcidLiquidsOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[23]")
    private WebElement testosteroneBoostersOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[24]")
    private WebElement ghBoostersOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[26]")
    private WebElement stimulantWeightLossOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[27]")
    private WebElement nonStimulantWeightLossOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[28]")
    private WebElement mealReplacementsOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[29]")
    private WebElement metabolismSupportOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[30]")
    private WebElement toningCreamsOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[31]")
    private WebElement mctOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[33]")
    private WebElement glutamineOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[34]")
    private WebElement recoveryBlendOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[35]")
    private WebElement electrolytesAndHydrationOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[37]")
    private WebElement carbohydratePowdersOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[39]")
    private WebElement stimulantEnergyOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[40]")
    private WebElement nonStimulantEnergyOptionInSportSupplementsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Sport Supplements']/a)[42]")
    private WebElement gamingEssentialsOptionInSportSupplementsMainMenu;
    //Vitamins & Health Main Menu
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[1]")
    private WebElement featuredOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[2]")
    private WebElement aliveVitaminsOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[3]")
    private WebElement sexualHealthOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[4]")
    private WebElement essentialVitaminsOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[5]")
    private WebElement folicAcidOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[6]")
    private WebElement vitaminAOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[7]")
    private WebElement vitaminBOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[8]")
    private WebElement vitaminCOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[9]")
    private WebElement vitaminDOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[10]")
    private WebElement vitaminEOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[11]")
    private WebElement vitaminKOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[12]")
    private WebElement multiVitaminsOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[13]")
    private WebElement vitaminsForKidsOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[14]")
    private WebElement vitaminsForMenOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[15]")
    private WebElement vitaminsForWomenOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[16]")
    private WebElement boneAndJointOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[17]")
    private WebElement boneHealthOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[18]")
    private WebElement jointHealthOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[19]")
    private WebElement beautyOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[20]")
    private WebElement collagenOptionInVitaminsAndHealthMainMenu;

    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[21]")
    private WebElement hairSkinAndNailsOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[22]")
    private WebElement fishOilOmegasOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[23]")
    private WebElement fishOilOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[24]")
    private WebElement omega369OptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[25]")
    private WebElement healthLifestyleOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[26]")
    private WebElement antioxidantsOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[27]")
    private WebElement bloodSugarSupportOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[28]")
    private WebElement brainSupportOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[29]")
    private WebElement heartHealthOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[43]")
    private WebElement digestionOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[30]")
    private WebElement detoxAndCleanseOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[31]")
    private WebElement energyFormulasOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[32]")
    private WebElement eyeHealthOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[46]")
    private WebElement sportVitaminsOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[47]")
    private WebElement aminoAcidOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[33]")
    private WebElement herbsOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[34]")
    private WebElement hormonesBalanceOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[48]")
    private WebElement mineralsOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[49]")
    private WebElement calciumOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[50]")
    private WebElement ironOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[51]")
    private WebElement magnesiumOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[52]")
    private WebElement multimineralFormulasOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[53]")
    private WebElement zincOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[54]")
    private WebElement potassiumOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[35]")
    private WebElement immuneSupportOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[36]")
    private WebElement mensHealthOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[37]")
    private WebElement stressReliefOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[38]")
    private WebElement sleepSupportOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[39]")
    private WebElement superFoodsOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[40]")
    private WebElement urinaryTractSupportOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[41]")
    private WebElement weightManagementOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[55]")
    private WebElement healthyDrinksOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[56]")
    private WebElement drinkableVitaminsOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[42]")
    private WebElement womensHealthOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[57]")
    private WebElement petsOptionInVitaminsAndHealthMianMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[58]")
    private WebElement supplementsMoreOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[44]")
    private WebElement digestiveSupportOptionInVitaminsAndHealthMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Vitamins & Health'][@data-nav_type='top']/a)[45]")
    private WebElement probioticsOptionInVitaminsAndHealthMainMenu;
    //Health Food Main Menu
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[1]")
    private WebElement groceryOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[2]")
    private WebElement bakingAndCookingOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[3]")
    private WebElement cannedOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[4]")
    private WebElement coffeeOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[5]")
    private WebElement condimentsOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[6]")
    private WebElement milkAndCreamOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[7]")
    private WebElement nutsAndOatsOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[8]")
    private WebElement oilsOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[9]")
    private WebElement pastaOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[10]")
    private WebElement riceAndGrainsOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[11]")
    private WebElement seasoningsAndSpicesOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[12]")
    private WebElement sugarSweetenersOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[13]")
    private WebElement syrupsOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[14]")
    private WebElement teaAndHerbsOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[15]")
    private WebElement superfoodsOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[16]")
    private WebElement readyMixesOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[17]")
    private WebElement breakfastAndCerealOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[18]")
    private WebElement readyToDrinkOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[19]")
    private WebElement aminoAndBcaasOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[20]")
    private WebElement energyDrinksOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[21]")
    private WebElement proteinShakesOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[22]")
    private WebElement electrolytesAndHydrationOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[23]")
    private WebElement healthySnacksOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[24]")
    private WebElement proteinBarsOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[25]")
    private WebElement cookiesOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[26]")
    private WebElement chipsOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[27]")
    private WebElement browniesAndPancakesOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[28]")
    private WebElement snackBarsOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[29]")
    private WebElement spreadsOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[30]")
    private WebElement otherHealthySnacksOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[31]")
    private WebElement readyToEatOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[32]")
    private WebElement healthyMealsOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[33]")
    private WebElement featuredOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[34]")
    private WebElement healthyMealReplacementOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[35]")
    private WebElement proteinCoffeeOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[36]")
    private WebElement candiesOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[37]")
    private WebElement flavoringAgentsOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[38]")
    private WebElement ketoSnacksOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[39]")
    private WebElement manukaHoneyOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='Healthy Food'][@data-nav_type='top']/a)[40]")
    private WebElement meatSnacksOptionInHealthyFoodMainMenu;
    @FindBy(xpath = "(//ul[@class='groupmenu-drop'])[3]")
    private List<WebElement> healthyFoodMainMenuList;
    @FindBy(xpath = "(//ul[@class='groupmenu-drop'])[4]")
    private List<WebElement> sportsMainMenuList;
    @FindBy(xpath = "(//ul[@class='groupmenu-drop'])[5]")
    private List<WebElement> womenOnlyMainMenuList;

    //Sports Main Menu
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[1]")
    private WebElement menOptionInSportsMainMenu;
    @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[2]")
    private WebElement sportOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[3]")
    private WebElement footballOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[4]")
    private WebElement basketballOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[5]")
    private WebElement baseballOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[6]")
    private WebElement runningOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[7]")
    private WebElement swimmingOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[8]")
    private WebElement yogaOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[9]")
    private WebElement fitnessAndTrainingOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[10]")
    private WebElement mmaOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[11]")
    private WebElement jiuJitsuOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[12]")
    private WebElement boardGamesOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[13]")
    private WebElement sportsTechOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[14]")
    private WebElement wearableTechOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[15]")
    private WebElement camerasOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[16]")
    private WebElement phoneAccessoriesOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[17]")
    private WebElement personalCareOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[18]")
    private WebElement showeringOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[19]")
    private WebElement shavingOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[20]")
    private WebElement skinCareOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[21]")
    private WebElement bodyCareOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[22]")
    private WebElement oralCareOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[23]")
    private WebElement therapyOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[24]")
    private WebElement masksOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[25]")
    private WebElement fitnessAndTrainingCategoryOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[26]")
    private WebElement fitnessEquipmentOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[27]")
    private WebElement skippingRopesOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[28]")
    private WebElement weightBeltsOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[29]")
    private WebElement scootersOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[30]")
    private WebElement trainingAccessoriesOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[31]")
    private WebElement shakersAndBottlesOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[32]")
    private WebElement bagsOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[33]")
    private WebElement glovesOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[34]")
    private WebElement bracesAndSleevesOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[35]")
    private WebElement mouthguardOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[36]")
    private WebElement apparelOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[37]")
    private WebElement sportswearOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[38]")
    private WebElement pantsOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[39]")
    private WebElement shortsOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[40]")
    private WebElement hoodiesOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[41]")
    private WebElement tShirtsOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[42]")
    private WebElement TanksOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[43]")
    private WebElement footwearOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[44]")
    private WebElement sneakersOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[45]")
    private WebElement trainingShoesOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[46]")
    private WebElement runnigShoesOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[47]")
    private WebElement womenOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[48]")
    private WebElement womenSportsTechOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[49]")
    private WebElement womenWearableTechOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[50]")
    private WebElement womenCamerasOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[51]")
    private WebElement womenPhoneAccessoriesOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[52]")
    private WebElement womenPersonalCareOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[53]")
    private WebElement womenShoweringOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[54]")
    private WebElement womenSkinCareOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[55]")
    private WebElement womenBodyCareOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[56]")
    private WebElement womenOralCareOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[57]")
    private WebElement womenTherapyOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[58]")
    private WebElement womenMasksOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[59]")
    private WebElement womenFitnessAndTrainingOptionInSportsMainMenu;
  @FindBy(xpath = "(.//span[@data-vertical='SPORTS'][@data-nav_type='top']/a)[60]")
    private WebElement womenTrainingAccessoriesOptionInSportsMainMenu;

    //Getter Methods
    public List<WebElement> getMegaMenuList(){return megaMenuList;}
    public List<WebElement> getSubMenuList(){return subMenuList;}
    public List<WebElement> getOptionList(){return optionList;}
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
    public WebElement getMenOptionInSportsMenu(){return menOptionInSportsMenu;}
    public WebElement getClothingInSportsMenu(){return clothingInSportsMenu;}
    public WebElement getTopsInSportsMenu(){return topsInSportsMenu;}
    public WebElement getPantsInSportsMenu(){return pantsInSportsMenu;}
    public WebElement getShortsInSportsMenu(){return shortsInSportsMenu;}
    public WebElement getJacketsAndCoatsInSportsMenu(){return jacketsAndCoatsInSportsMenu;}
    public WebElement getSafetyMasksInSportsMenu(){return safetyMasksInSportsMenu;}
    public WebElement getFootwearInSportsMenu() {return footwearInSportsMenu;}
    public WebElement getSneakersInSportsMenu() {return sneakersInSportsMenu;}
    public WebElement getTrainingShoesInSportsMenu() {return trainingShoesInSportsMenu;}
    public WebElement getRunningShoesInSportsMenu() {return runningShoesInSportsMenu;}
    public WebElement getHikingShoesInSportsMenu() {return hikingShoesInSportsMenu;}
    public WebElement getAccessoriesInSportsMenu() {return accessoriesInSportsMenu;}
    public WebElement getGlovesInSportsMenu() {return glovesInSportsMenu;}
    public WebElement getBeltsInSportsMenu() {return beltsInSportsMenu;}
    public WebElement getCapsAndHatsInSportsMenu() {return capsAndHatsInSportsMenu;}
    public WebElement getCapInSportsMenu() {return capInSportsMenu;}
    public WebElement getShakersInSportsMenu() {return shakersInSportsMenu;}
    public WebElement getWaterBottlesInSportsMenu() {return waterBottlesInSportsMenu;}
    public WebElement getBugHereInSportsMenu() {return bugHereInSportsMenu;}
    public WebElement getSocksInSportsMenu() {return socksInSportsMenu;}
    public WebElement getTowelsInSportsMenu() {return towelsInSportsMenu;}
    public WebElement getSunglassesInSportsMenu() {return sunglassesInSportsMenu;}
    public WebElement getMixerInSportsMenu() {return mixerInSportsMenu;}
    public WebElement getBagsInSportsMenu() {return bagsInSportsMenu;}
    public WebElement getBackPacksInSportsMenu() {return backPacksInSportsMenu;}
    public WebElement getShoulderBagsInSportsMenu() {return shouldersBagsInSportsMenu;}
    public WebElement getWearableTechInSportsMenu() {return wearableTechInSportsMenu;}
    public WebElement getWatchesInSportsMenu() {return watchesInSportsMenu;}
    public WebElement getGamingAccessoriesInSportsMenu() {return gamingAccessoriesInSportsMenu;}
    public WebElement geEquipmentInSportsMenu() {return equipmentInSportsMenu;}
    public WebElement getGripsInSportsMenu() {return gripsInSportsMenu;}
    public WebElement getBallsInSportsMenu() {return ballsInSportsMenu;}
    public WebElement getRollersInSportsMenu() {return rollersInSportsMenu;}
    public WebElement getWeightsInSportsMenu() {return weightsInSportsMenu;}
    public WebElement getWomenInSportsMenu() {return womenInSportsMenu;}
    public WebElement getWomenClothingInSportsMenu() {return womenClothingInSportsMenu;}
    public WebElement getWomenTopsInSportsMenu() {return womenTopsInSportsMenu;}
    public WebElement getWomenShortsInSportsMenu() {return womenShortsInSportsMenu;}
    public WebElement getWomenSafetyMasksInSportsMenu() {return womenSafetyMasksInSportsMenu;}
    public WebElement getWomenAccessoriesInSportsMenu() {return womenAccessoriesInSportsMenu;}
    public WebElement getWomenGlovesInSportsMenu() {return womenGlovesInSportsMenu;}
    public WebElement getBugGlovesInSportsMenu() {return glovesBugCategoryInSportsMenu;}
    public WebElement getWomenCapsAndHatsInSportsMenu() {return womenCapsAndHatsInSportsMenu;}
    public WebElement getWomenCapsInSportsMenu() {return womenCapsInSportsMenu;}
    public WebElement getWomenShakersInSportsMenu() {return womenShakersInSportsMenu;}
    public WebElement getWomenWaterBottlesInSportsMenu() {return womenWaterBottlesInSportsMenu;}
    public WebElement getWomenSocksInSportsMenu() {return womenSocksInSportsMenu;}
    public WebElement getWomenTowelsInSportsMenu() {return womenTowelsInSportsMenu;}
    public WebElement getWomenSunglassesInSportsMenu() {return womenSunglassesInSportsMenu;}
    public WebElement getWomenMixerInSportsMenu() {return womenMixerInSportsMenu;}
    public WebElement getWomenBagsInSportsMenu() {return womenBagsInSportsMenu;}
    public WebElement getWomenBackPacksInSportsMenu() {return womenBackPacksInSportsMenu;}
    public WebElement getWomenSholdersBagsInSportsMenu() {return womenSholdersBagsInSportsMenu;}
    public WebElement getWomenBeltsInSportsMenu() {return womenBeltsInSportsMenu;}
    public WebElement getMegaMenuListSection() {return megaMenuListSection;}
    public WebElement getOptimumNutritionOptionInByBrandMenu() {return optimumNutritionOptionInByBrandMenu;}
    public WebElement getMuscletechOptionInByBrandMenu() {return muscletechOptionInByBrandMenu;}
    public WebElement getCellucorOptionInByBrandMenu() {return cellucorOptionInByBrandMenu;}
    public WebElement getSupplementsOptionInByBrandMenu() {return supplementsOptionInByBrandMenu;}
    public WebElement getDymatizeOptionInByBrandMenu() {return dymatizeOptionInByBrandMenu;}
    public WebElement getXtendOptionInByBrandMenu() {return xtendOptionInByBrandMenu;}
    public WebElement getAnimalNutritionOptionInByBrandMenu() {return animalNutritionOptionInByBrandMenu;}
    public WebElement getMusclePharmOptionInByBrandMenu() {return musclePharmOptionInByBrandMenu;}
    public WebElement getUniversalNutritionOptionInByBrandMenu() {return universalNutritionOptionInByBrandMenu;}
    public WebElement getBsnOptionInByBrandMenu() {return bsnOptionInByBrandMenu;}
    public WebElement getEhplabsOptionInByBrandMenu() {return ehplabsOptionInByBrandMenu;}
    public WebElement getJymSupplementScienceOptionInByBrandMenu() {return jymSupplementScienceOptionInByBrandMenu;}
    public WebElement getBpiSportsOptionInByBrandMenu() {return bpiSportsOptionInByBrandMenu;}
    public WebElement getRussianBearOptionInByBrandMenu() {return russianBearOptionInByBrandMenu;}
    public WebElement getIsopureOptionInByBrandMenu() {return isopureOptionInByBrandMenu;}
    public WebElement getOneUpNutritionOptionInByBrandMenu() {return oneUpNutritionOptionInByBrandMenu;}
    public WebElement getMusclemedsOptionInByBrandMenu() {return musclemedsOptionInByBrandMenu;}
    public WebElement gethMhpOptionInByBrandMenu() {return mhpOptionInByBrandMenu;}
    public WebElement getEvlNutritionOptionInByBrandMenu() {return evlNutritionOptionInByBrandMenu;}
    public WebElement getNlaForHerOptionInByBrandMenu() {return nlaForHerOptionInByBrandMenu;}
    public WebElement getMuscleNutritionOptionInByBrandMenu() {return muscleNutritionOptionInByBrandMenu;}
    public WebElement getGatNutritionOptionInByBrandMenu() {return gatNutritionOptionInByBrandMenu;}
    public WebElement getLabradaOptionInByBrandMenu() {return labradaOptionInByBrandMenu;}
    public WebElement getOrgainOptionInByBrandMenu() {return orgainOptionInByBrandMenu;}
    public WebElement getNutrexResearchOptionInByBrandMenu() {return nutrexResearchOptionInByBrandMenu;}
    public WebElement getScitecNutritionOptionInByBrandMenu() {return scitecNutritionOptionInByBrandMenu;}
    public WebElement getProlabOptionInByBrandMenu() {return brolabOptionInByBrandMenu;}
    public WebElement getSotruOptionInByBrandMenu() {return sotruOptionInByBrandMenu;}
    public WebElement getDivineHealthOptionInByBrandMenu() {return divineHealthOptionInByBrandMenu;}
    public WebElement getGhostOptionInByBrandMenu() {return ghostOptionInByBrandMenu;}
    public WebElement getWomensBestOptionInByBrandMenu() {return womensBestOptionInByBrandMenu;}
    public WebElement getEfxSportsOptionInByBrandMenu() {return efxSportsOptionInByBrandMenu;}
    public WebElement getBasixOptionInByBrandMenu() {return basixOptionInByBrandMenu;}
    public WebElement getAk47OptionInByBrandMenu() {return ak47OptionInByBrandMenu;}
    public WebElement getNfSportsOptionInByBrandMenu() {return nfSportsOptionInByBrandMenu;}
    public WebElement getFullyDosedOptionInByBrandMenu() {return fullyDosedOptionInByBrandMenu;}
    public WebElement getFivePercentNutritionOptionInByBrandMenu() {return fivePercentNutritionOptionInByBrandMenu;}
    public WebElement getOlimpSportNutritionOptionInByBrandMenu() {return olimpSportNutritionOptionInByBrandMenu;}
    public WebElement getJnxSportsOptionInByBrandMenu() {return jnxSportsOptionInByBrandMenu;}
    public WebElement getFitAndLeanOptionInByBrandMenu() {return fitAndLeanOptionInByBrandMenu;}
    public WebElement getGymqueenOptionInByBrandMenu() {return gymqueenOptionInByBrandMenu;}
    public WebElement getThePackOptionInByBrandMenu() {return thePackOptionInByBrandMenu;}
    public WebElement getBetancourtNutritionOptionInByBrandMenu() {return betancourtNutritionOptionInByBrandMenu;}
    public WebElement getYallaProteinOptionInByBrandMenu() {return yallaProteinOptionInByBrandMenu;}
    public WebElement getProteinWorldOptionInByBrandMenu() {return proteinWorldOptionInByBrandMenu;}
    public WebElement getObviOptionInByBrandMenu() {return obviOptionInByBrandMenu;}
    public WebElement getNaughtyBoyOptionInByBrandMenu() {return naughtyBoyOptionInByBrandMenu;}
    public WebElement getSteelFitOptionInByBrandMenu() {return steelFitOptionInByBrandMenu;}
    public WebElement getUsnOptionInByBrandMenu() {return usnOptionInByBrandMenu;}
    public WebElement getXGamerOptionInByBrandMenu() {return xGamerOptionInByBrandMenu;}
    public WebElement getInnosuppsOptionInByBrandMenu() {return innosuppsOptionInByBrandMenu;}
    public WebElement getOutbreakNutritionOptionInByBrandMenu() {return outbreakNutritionOptionInByBrandMenu;}
    public WebElement getInsaneLabzOptionInByBrandMenu() {return insaneLabzOptionInByBrandMenu;}
    public WebElement getAllMaxOptionInByBrandMenu() {return allMaxOptionInByBrandMenu;}
    public WebElement getGlaxonOptionInByBrandMenu() {return glaxonOptionInByBrandMenu;}
    public WebElement getRedcon1OptionInByBrandMenu() {return redcon1OptionInByBrandMenu;}
    public WebElement getPandaSupplementsOptionInByBrandMenu() {return pandaSupplementsOptionInByBrandMenu;}
    public WebElement getNutrendOptionInByBrandMenu() {return nutrendOptionInByBrandMenu;}
    public WebElement getOstrovitOptionInByBrandMenu() {return ostrovitOptionInByBrandMenu;}
    public WebElement getBetteryOptionInByBrandMenu() {return betteryOptionInByBrandMenu;}
    public WebElement getHealthyFoodSnacksAndMealReplacementOptionInByBrandMenu() {return healthyFoodSnacksAndMealReplacementOptionInByBrandMenu;}
    public WebElement getWowHydrateOptionInByBrandMenu() {return wowHydrateOptionInByBrandMenu;}
    public WebElement getQuestNutritionOptionInByBrandMenu() {return questNutritionOptionInByBrandMenu;}
    public WebElement getGrenadeOptionInByBrandMenu() {return grenadeOptionInByBrandMenu;}
    public WebElement getReignEnergyOptionInByBrandMenu() {return reignEnergyOptionInByBrandMenu;}
    public WebElement getMonsterEnergyOptionInByBrandMenu() {return monsterEnergyOptionInByBrandMenu;}
    public WebElement getThirdEnergyOptionInByBrandMenu() {return thirdEnergyOptionInByBrandMenu;}
    public WebElement getDownArrowKeyInSportSupplementsMenu() {return downArrowKeyInSportSupplementsMenu;}
    public WebElement getDownArrowKeyInVitaminsAndHealthMenu() {return downArrowKeyInVitaminsAndHealthMenu;}
    public WebElement getDownArrowKeyInHealthyFoodMenu() {return downArrowKeyInHealthyFoodMenu;}
    public WebElement getDownArrowKeyInSportsMenu() {return downArrowKeyInSportsMenu;}
    public WebElement getSportSupplementsMainMenu() {return sportSupplementsMainMenu;}
    public WebElement getProteinOptionInSportSupplementsMainMenu() {return proteinOptionInSportSupplementsMainMenu;}
    public WebElement getCreatineOptionInSportSupplementsMainMenu() {return creatineOptionInSportSupplementsMainMenu;}
    public WebElement getAminoAcidsOptionInSportSupplementsMainMenu() {return aminoAcidsOptionInSportSupplementsMainMenu;}
    public WebElement getMuscleBoostersOptionInSportSupplementsMainMenu() {return muscleBoostersOptionInSportSupplementsMainMenu;}
    public WebElement getRecoveryOptionInSportSupplementsMainMenu() {return recoveryOptionInSportSupplementsMainMenu;}
    public WebElement getCarbohydratesOptionInSportSupplementsMainMenu() {return carbohydratesOptionInSportSupplementsMainMenu;}
    public WebElement getEnergyAndEnduranceOptionInSportSupplementsMainMenu() {return energyAndEnduranceOptionInSportSupplementsMainMenu;}
    public WebElement getGamingAndFocusOptionInSportSupplementsMainMenu() {return gamingAndFocusOptionInSportSupplementsMainMenu;}
    public WebElement getWheyProteinOptionInSportSupplementsMainMenu() {return wheyProteinOptionInSportSupplementsMainMenu;}
    public WebElement getWheyProteinIsolateOptionInSportSupplementsMainMenu() {return wheyProteinIsolateOptionInSportSupplementsMainMenu;}

    public WebElement getProteinBlendsOptionInSportSupplementsMainMenu() {return proteinBlendsOptionInSportSupplementsMainMenu;}

    public WebElement getNonDairyProteinOptionInSportSupplementsMainMenu() {return nonDairyProteinOptionInSportSupplementsMainMenu;}
    public WebElement getCaseinProteinOptionInSportSupplementsMainMenu() {return caseinProteinOptionInSportSupplementsMainMenu;}
    public WebElement getDietProteinOptionInSportSupplementsMainMenu() {return dietProteinOptionInSportSupplementsMainMenu;}
    public WebElement getMassGainersOptionInSportSupplementsMainMenu() {return massGainersOptionInSportSupplementsMainMenu;}
    public WebElement getWeightManagementOptionInSportSupplementsMainMenu() {return weightManagementOptionInSportSupplementsMainMenu;}
    public List<WebElement> getSportsSupplementMainMenuList() {return sportsSupplementsMainMenuList;}
    public WebElement getCreatineMonohydrateOptionInSportSupplementsMainMenu() {return creatineMonohydrateOptionInSportSupplementsMainMenu;}
    public WebElement getCreatineBlendsOptionInSportSupplementsMainMenu() {return creatineBlendsOptionInSportSupplementsMainMenu;}
    public WebElement getbCAAOptionInSportSupplementsMainMenu() {return bCAAOptionInSportSupplementsMainMenu;}
    public WebElement geteAAOptionInSportSupplementsMainMenu() {return eAAOptionInSportSupplementsMainMenu;}
    public WebElement getArginineOptionInSportSupplementsMainMenu() {return arginineOptionInSportSupplementsMainMenu;}
    public WebElement getBetaAlanineOptionInSportSupplementsMainMenu() {return betaAlanineOptionInSportSupplementsMainMenu;}
    public WebElement gethMBOptionInSportSupplementsMainMenu() {return hMBOptionInSportSupplementsMainMenu;}
    public WebElement getAminoAcidPowdersOptionInSportSupplementsMainMenu() {return aminoAcidPowdersOptionInSportSupplementsMainMenu;}
    public WebElement getAminoAcidPillsOptionInSportSupplementsMainMenu() {return aminoAcidPillsOptionInSportSupplementsMainMenu;}
    public WebElement getCitrullineOptionInSportSupplementsMainMenu() {return citrullineOptionInSportSupplementsMainMenu;}
    public WebElement getAminoAcidLiquidsOptionInSportSupplementsMainMenu() {return aminoAcidLiquidsOptionInSportSupplementsMainMenu;}
    public WebElement getTestosteroneBoostersOptionInSportSupplementsMainMenu() {return testosteroneBoostersOptionInSportSupplementsMainMenu;}
    public WebElement getGhBoostersOptionInSportSupplementsMainMenu() {return ghBoostersOptionInSportSupplementsMainMenu;}
    public WebElement getStimulantWeightLossOptionInSportSupplementsMainMenu() {return stimulantWeightLossOptionInSportSupplementsMainMenu;}
    public WebElement getNonStimulantWeightLossOptionInSportSupplementsMainMenu() {return nonStimulantWeightLossOptionInSportSupplementsMainMenu;}
    public WebElement getMealReplacementsOptionInSportSupplementsMainMenu() {return mealReplacementsOptionInSportSupplementsMainMenu;}
    public WebElement getMetabolismSupportOptionInSportSupplementsMainMenu() {return metabolismSupportOptionInSportSupplementsMainMenu;}
    public WebElement getToningCreamsOptionInSportSupplementsMainMenu() {return toningCreamsOptionInSportSupplementsMainMenu;}
    public WebElement getMctOptionInSportSupplementsMainMenu() {return mctOptionInSportSupplementsMainMenu;}
    public WebElement getGlutamineOptionInSportSupplementsMainMenu() {return glutamineOptionInSportSupplementsMainMenu;}
    public WebElement getRecoveryBlendOptionInSportSupplementsMainMenu() {return recoveryBlendOptionInSportSupplementsMainMenu;}
    public WebElement getElectrolytesAndHydrationOptionInSportSupplementsMainMenu() {return electrolytesAndHydrationOptionInSportSupplementsMainMenu;}
    public WebElement getCarbohydratePowdersOptionInSportSupplementsMainMenu() {return carbohydratePowdersOptionInSportSupplementsMainMenu;}
    public WebElement getStimulantEnergyOptionInSportSupplementsMainMenu() {return stimulantEnergyOptionInSportSupplementsMainMenu;}
    public WebElement getNonStimulantEnergyOptionInSportSupplementsMainMenu() {return nonStimulantEnergyOptionInSportSupplementsMainMenu;}
    public WebElement getGamingEssentialsOptionInSportSupplementsMainMenu() {return gamingEssentialsOptionInSportSupplementsMainMenu;}
    public WebElement getFeaturedOptionInVitaminsAndHealthMainMenu() {return featuredOptionInVitaminsAndHealthMainMenu;}
    public WebElement getAliveVitaminsOptionInVitaminsAndHealthMainMenu() {return aliveVitaminsOptionInVitaminsAndHealthMainMenu;}
    public WebElement getSexualHealthOptionInVitaminsAndHealthMainMenu() {return sexualHealthOptionInVitaminsAndHealthMainMenu;}
    public WebElement getEssentialVitaminsOptionInVitaminsAndHealthMainMenu() {return essentialVitaminsOptionInVitaminsAndHealthMainMenu;}
    public WebElement getFolicAcidOptionInVitaminsAndHealthMainMenu() {return folicAcidOptionInVitaminsAndHealthMainMenu;}
    public WebElement getVitaminAOptionInVitaminsAndHealthMainMenu() {return vitaminAOptionInVitaminsAndHealthMainMenu;}
    public WebElement getVitaminBOptionInVitaminsAndHealthMainMenu() {return vitaminBOptionInVitaminsAndHealthMainMenu;}
    public WebElement getVitaminCOptionInVitaminsAndHealthMainMenu() {return vitaminCOptionInVitaminsAndHealthMainMenu;}
    public WebElement getVitaminDOptionInVitaminsAndHealthMainMenu() {return vitaminDOptionInVitaminsAndHealthMainMenu;}
    public WebElement getVitaminEOptionInVitaminsAndHealthMainMenu() {return vitaminEOptionInVitaminsAndHealthMainMenu;}
    public WebElement getVitaminKOptionInVitaminsAndHealthMainMenu() {return vitaminKOptionInVitaminsAndHealthMainMenu;}
    public WebElement getMultiVitaminsOptionInVitaminsAndHealthMainMenu() {return multiVitaminsOptionInVitaminsAndHealthMainMenu;}
    public WebElement getVitaminsForKidsOptionInVitaminsAndHealthMainMenu() {return vitaminsForKidsOptionInVitaminsAndHealthMainMenu;}
    public WebElement getVitaminsForMenOptionInVitaminsAndHealthMainMenu() {return vitaminsForMenOptionInVitaminsAndHealthMainMenu;}
    public WebElement getVitaminsForWomenOptionInVitaminsAndHealthMainMenu() {return vitaminsForWomenOptionInVitaminsAndHealthMainMenu;}
    public WebElement getBoneAndJointOptionInVitaminsAndHealthMainMenu() {return boneAndJointOptionInVitaminsAndHealthMainMenu;}
    public WebElement getBoneHealthOptionInVitaminsAndHealthMainMenu() {return boneHealthOptionInVitaminsAndHealthMainMenu;}
    public WebElement getJointHealthOptionInVitaminsAndHealthMainMenu() {return jointHealthOptionInVitaminsAndHealthMainMenu;}
    public WebElement getBeautyOptionInVitaminsAndHealthMainMenu() {return beautyOptionInVitaminsAndHealthMainMenu;}
    public WebElement getCollagenOptionInVitaminsAndHealthMainMenu() {return collagenOptionInVitaminsAndHealthMainMenu;}
    public WebElement getHairSkinAndNailsOptionInVitaminsAndHealthMainMenu() {return hairSkinAndNailsOptionInVitaminsAndHealthMainMenu;}
    public WebElement getFishOilOmegasOptionInVitaminsAndHealthMainMenu() {return fishOilOmegasOptionInVitaminsAndHealthMainMenu;}
    public WebElement getFishOilOptionInVitaminsAndHealthMainMenu() {return fishOilOptionInVitaminsAndHealthMainMenu;}
    public WebElement getOmega369OptionInVitaminsAndHealthMainMenu() {return omega369OptionInVitaminsAndHealthMainMenu;}
    public WebElement getHealthLifestyleOptionInVitaminsAndHealthMainMenu() {return healthLifestyleOptionInVitaminsAndHealthMainMenu;}
    public WebElement getAntioxidantsOptionInVitaminsAndHealthMainMenu() {return antioxidantsOptionInVitaminsAndHealthMainMenu;}
    public WebElement getBloodSugarSupportOptionInVitaminsAndHealthMainMenu() {return bloodSugarSupportOptionInVitaminsAndHealthMainMenu;}
    public WebElement getBrainSupportOptionInVitaminsAndHealthMainMenu() {return brainSupportOptionInVitaminsAndHealthMainMenu;}
    public WebElement getHeartHealthOptionInVitaminsAndHealthMainMenu() {return heartHealthOptionInVitaminsAndHealthMainMenu;}
    public WebElement getDigestionOptionInVitaminsAndHealthMainMenu() {return digestionOptionInVitaminsAndHealthMainMenu;}
    public WebElement getDetoxAndCleanseOptionInVitaminsAndHealthMainMenu() {return detoxAndCleanseOptionInVitaminsAndHealthMainMenu;}
    public WebElement getEnergyFormulasOptionInVitaminsAndHealthMainMenu() {return energyFormulasOptionInVitaminsAndHealthMainMenu;}
    public WebElement getEyeHealthOptionInVitaminsAndHealthMainMenu() {return eyeHealthOptionInVitaminsAndHealthMainMenu;}
    public WebElement getSportVitaminsOptionInVitaminsAndHealthMainMenu() {return sportVitaminsOptionInVitaminsAndHealthMainMenu;}
    public WebElement getAminoAcidOptionInVitaminsAndHealthMainMenu() {return aminoAcidOptionInVitaminsAndHealthMainMenu;}
    public WebElement getHerbsOptionInVitaminsAndHealthMainMenu() {return herbsOptionInVitaminsAndHealthMainMenu;}
    public WebElement getHormonesBalanceOptionInVitaminsAndHealthMainMenu() {return hormonesBalanceOptionInVitaminsAndHealthMainMenu;}
    public WebElement getMineralsOptionInVitaminsAndHealthMainMenu() {return mineralsOptionInVitaminsAndHealthMainMenu;}
    public WebElement getCalciumOptionInVitaminsAndHealthMainMenu() {return calciumOptionInVitaminsAndHealthMainMenu;}
    public WebElement getIronOptionInVitaminsAndHealthMainMenu() {return ironOptionInVitaminsAndHealthMainMenu;}
    public WebElement getMagnesiumOptionInVitaminsAndHealthMainMenu() {return magnesiumOptionInVitaminsAndHealthMainMenu;}
    public WebElement getMultimineralFormulasOptionInVitaminsAndHealthMainMenu() {return multimineralFormulasOptionInVitaminsAndHealthMainMenu;}
    public WebElement getZincOptionInVitaminsAndHealthMainMenu() {return zincOptionInVitaminsAndHealthMainMenu;}
    public WebElement getPotassiumOptionInVitaminsAndHealthMainMenu() {return potassiumOptionInVitaminsAndHealthMainMenu;}
    public WebElement getImmuneSupportOptionInVitaminsAndHealthMainMenu() {return immuneSupportOptionInVitaminsAndHealthMainMenu;}
    public WebElement getMensHealthOptionInVitaminsAndHealthMainMenu() {return mensHealthOptionInVitaminsAndHealthMainMenu;}
    public WebElement getStressReliefOptionInVitaminsAndHealthMainMenu() {return stressReliefOptionInVitaminsAndHealthMainMenu;}
    public WebElement getSleepSupportOptionInVitaminsAndHealthMainMenu() {return sleepSupportOptionInVitaminsAndHealthMainMenu;}
    public WebElement getSuperFoodsOptionInVitaminsAndHealthMainMenu() {return superFoodsOptionInVitaminsAndHealthMainMenu;}
    public WebElement getUrinaryTractSupportOptionInVitaminsAndHealthMainMenu() {return urinaryTractSupportOptionInVitaminsAndHealthMainMenu;}
    public WebElement getWeightManagementOptionInVitaminsAndHealthMainMenu() {return weightManagementOptionInVitaminsAndHealthMainMenu;}
    public WebElement getHealthyDrinksOptionInVitaminsAndHealthMainMenu() {return healthyDrinksOptionInVitaminsAndHealthMainMenu;}
    public WebElement getDrinkableVitaminsOptionInVitaminsAndHealthMainMenu() {return drinkableVitaminsOptionInVitaminsAndHealthMainMenu;}
    public WebElement getWomensHealthOptionInVitaminsAndHealthMainMenu() {return womensHealthOptionInVitaminsAndHealthMainMenu;}
    public WebElement getPetsOptionInVitaminsAndHealthMainMenu() {return petsOptionInVitaminsAndHealthMianMenu;}
    public WebElement getSupplementsMoreOptionInVitaminsAndHealthMainMenu() {return supplementsMoreOptionInVitaminsAndHealthMainMenu;}
    public WebElement getDigestiveSupportOptionInVitaminsAndHealthMainMenu() {return digestiveSupportOptionInVitaminsAndHealthMainMenu;}
    public WebElement getProbioticsOptionInVitaminsAndHealthMainMenu() {return probioticsOptionInVitaminsAndHealthMainMenu;}
    public WebElement getVitaminsAndHealthMainMenu() {return vitaminsAndHealthMainMenu;}
    public List<WebElement> getVitaminsAndHealthMainMenuList() {return VitaminsAndHealthMainMenuList;}
    ////HealthyFood Page
    public WebElement getHealthyFoodMainMenu() {return healthyFoodMainMenu;}
    public WebElement getGroceryOptionInHealthyFoodMainMenu() {return groceryOptionInHealthyFoodMainMenu;}
    public WebElement getBakingAndCookingOptionInHealthyFoodMainMenu() {return bakingAndCookingOptionInHealthyFoodMainMenu;}
    public WebElement getCannedOptionInHealthyFoodMainMenu() {return cannedOptionInHealthyFoodMainMenu;}
    public WebElement getCoffeeOptionInHealthyFoodMainMenu() {return coffeeOptionInHealthyFoodMainMenu;}
    public WebElement getCondimentsOptionInHealthyFoodMainMenu() {return condimentsOptionInHealthyFoodMainMenu;}
    public WebElement getMilkAndCreamOptionInHealthyFoodMainMenu() {return milkAndCreamOptionInHealthyFoodMainMenu;}
    public WebElement getNutsAndOatsOptionInHealthyFoodMainMenu() {return nutsAndOatsOptionInHealthyFoodMainMenu;}
    public WebElement getOilsOptionInHealthyFoodMainMenu() {return oilsOptionInHealthyFoodMainMenu;}
    public WebElement getPastaOptionInHealthyFoodMainMenu() {return pastaOptionInHealthyFoodMainMenu;}
    public WebElement getRiceAndGrainsOptionInHealthyFoodMainMenu() {return riceAndGrainsOptionInHealthyFoodMainMenu;}
    public WebElement getSeasoningsAndSpicesOptionInHealthyFoodMainMenu() {return seasoningsAndSpicesOptionInHealthyFoodMainMenu;}
    public WebElement getSugarSweetenersOptionInHealthyFoodMainMenu() {return sugarSweetenersOptionInHealthyFoodMainMenu;}
    public WebElement getSyrupsOptionInHealthyFoodMainMenu() {return syrupsOptionInHealthyFoodMainMenu;}
    public WebElement getTeaAndHerbsOptionInHealthyFoodMainMenu() {return teaAndHerbsOptionInHealthyFoodMainMenu;}
    public WebElement getSuperfoodsOptionInHealthyFoodMainMenu() {return superfoodsOptionInHealthyFoodMainMenu;}
    public WebElement getReadyMixesOptionInHealthyFoodMainMenu() {return readyMixesOptionInHealthyFoodMainMenu;}
    public WebElement getBreakfastAndCerealOptionInHealthyFoodMainMenu() {return breakfastAndCerealOptionInHealthyFoodMainMenu;}
    public WebElement getReadyToDrinkOptionInHealthyFoodMainMenu() {return readyToDrinkOptionInHealthyFoodMainMenu;}
    public WebElement getAminoAndBcaasOptionInHealthyFoodMainMenu() {return aminoAndBcaasOptionInHealthyFoodMainMenu;}
    public WebElement getEnergyDrinksOptionInHealthyFoodMainMenu() {return energyDrinksOptionInHealthyFoodMainMenu;}
    public WebElement getProteinShakesOptionInHealthyFoodMainMenu() {return proteinShakesOptionInHealthyFoodMainMenu;}
    public WebElement getElectrolytesAndHydrationOptionInHealthyFoodMainMenu() {return electrolytesAndHydrationOptionInHealthyFoodMainMenu;}
    public WebElement getHealthySnacksOptionInHealthyFoodMainMenu() {return healthySnacksOptionInHealthyFoodMainMenu;}
    public WebElement getProteinBarsOptionInHealthyFoodMainMenu() {return proteinBarsOptionInHealthyFoodMainMenu;}
    public WebElement getCookiesOptionInHealthyFoodMainMenu() {return cookiesOptionInHealthyFoodMainMenu;}
    public WebElement getChipsOptionInHealthyFoodMainMenu() {return chipsOptionInHealthyFoodMainMenu;}
    public WebElement getBrowniesAndPancakesOptionInHealthyFoodMainMenu() {return browniesAndPancakesOptionInHealthyFoodMainMenu;}
    public WebElement getSnackBarsOptionInHealthyFoodMainMenu() {return snackBarsOptionInHealthyFoodMainMenu;}
    public WebElement getSpreadsOptionInHealthyFoodMainMenu() {return spreadsOptionInHealthyFoodMainMenu;}
    public WebElement getOtherHealthySnacksOptionInHealthyFoodMainMenu() {return otherHealthySnacksOptionInHealthyFoodMainMenu;}
    public WebElement getReadyToEatOptionInHealthyFoodMainMenu() {return readyToEatOptionInHealthyFoodMainMenu;}
    public WebElement getHealthyMealsOptionInHealthyFoodMainMenu() {return healthyMealsOptionInHealthyFoodMainMenu;}
    public WebElement getFeaturedOptionInHealthyFoodMainMenu() {return featuredOptionInHealthyFoodMainMenu;}
    public WebElement getHealthyMealReplacementOptionInHealthyFoodMainMenu() {return healthyMealReplacementOptionInHealthyFoodMainMenu;}
    public WebElement getProteinCoffeeOptionInHealthyFoodMainMenu() {return proteinCoffeeOptionInHealthyFoodMainMenu;}
    public WebElement getCandiesOptionInHealthyFoodMainMenu() {return candiesOptionInHealthyFoodMainMenu;}
    public WebElement getFlavoringAgentsOptionInHealthyFoodMainMenu() {return flavoringAgentsOptionInHealthyFoodMainMenu;}
    public WebElement getKetoSnacksOptionInHealthyFoodMainMenu() {return ketoSnacksOptionInHealthyFoodMainMenu;}
    public WebElement getManukaHoneyOptionInHealthyFoodMainMenu() {return manukaHoneyOptionInHealthyFoodMainMenu;}
    public WebElement getMeatSnacksOptionInHealthyFoodMainMenu() {return meatSnacksOptionInHealthyFoodMainMenu;}
    public List<WebElement> getHealthyFoodMainMenuList() {return healthyFoodMainMenuList;}
    //Sports Main Menu
    public WebElement getSportsMainMenu() {return sportsMainMenu;}
    public List<WebElement> getSportsMainMenuList() {return sportsMainMenuList;}
    public List<WebElement> getSportsSupplementsMainMenuList() {return sportsSupplementsMainMenuList;}
    public WebElement getCountryList() {return countryList;}
    public WebElement getAeCountry() {return aeCountry;}
    public WebElement geteAAOptionInSportSupplementsMenu() {return eAAOptionInSportSupplementsMenu;}
    public WebElement gethMBOptionInSportSupplementsMenu() {return hMBOptionInSportSupplementsMenu;}
    public WebElement getShouldersBagsInSportsMenu() {return shouldersBagsInSportsMenu;}
    public WebElement getEquipmentInSportsMenu() {return equipmentInSportsMenu;}
    public WebElement getGlovesBugCategoryInSportsMenu() {return glovesBugCategoryInSportsMenu;}
    public WebElement getMhpOptionInByBrandMenu() {return mhpOptionInByBrandMenu;}
    public WebElement getBrolabOptionInByBrandMenu() {return brolabOptionInByBrandMenu;}
    public WebElement getxGamerOptionInByBrandMenu() {return xGamerOptionInByBrandMenu;}
    public WebElement getPetsOptionInVitaminsAndHealthMianMenu() {return petsOptionInVitaminsAndHealthMianMenu;}
    public WebElement getMenOptionInSportsMainMenu() {return menOptionInSportsMainMenu;}
    public WebElement getSportOptionInSportsMainMenu() {return sportOptionInSportsMainMenu;}
    public WebElement getFootballOptionInSportsMainMenu() {return footballOptionInSportsMainMenu;}
    public WebElement getBasketballOptionInSportsMainMenu() {return basketballOptionInSportsMainMenu;}
    public WebElement getBaseballOptionInSportsMainMenu() {return baseballOptionInSportsMainMenu;}
    public WebElement getRunningOptionInSportsMainMenu() {return runningOptionInSportsMainMenu;}
    public WebElement getSwimmingOptionInSportsMainMenu() {return swimmingOptionInSportsMainMenu;}
    public WebElement getYogaOptionInSportsMainMenu() {return yogaOptionInSportsMainMenu;}
    public WebElement getFitnessAndTrainingOptionInSportsMainMenu() {return fitnessAndTrainingOptionInSportsMainMenu;}
    public WebElement getFitnessEquipmentOptionInSportsMainMenu() {return fitnessEquipmentOptionInSportsMainMenu;}
    public WebElement getSkippingRopesOptionInSportsMainMenu() {return skippingRopesOptionInSportsMainMenu;}
    public WebElement getWeightBeltsOptionInSportsMainMenu() {return weightBeltsOptionInSportsMainMenu;}
    public WebElement getScootersOptionInSportsMainMenu() {return scootersOptionInSportsMainMenu;}
    public WebElement getTrainingAccessoriesOptionInSportsMainMenu() {return trainingAccessoriesOptionInSportsMainMenu;}
    public WebElement getShakersAndBottlesOptionInSportsMainMenu() {return shakersAndBottlesOptionInSportsMainMenu;}
    public WebElement getBagsOptionInSportsMainMenu() {return bagsOptionInSportsMainMenu;}
    public WebElement getGlovesOptionInSportsMainMenu() {return glovesOptionInSportsMainMenu;}
    public WebElement getBracesAndSleevesOptionInSportsMainMenu() {return bracesAndSleevesOptionInSportsMainMenu;}
    public WebElement getMouthguardOptionInSportsMainMenu() {return mouthguardOptionInSportsMainMenu;}
    public WebElement getApparelOptionInSportsMainMenu() {return apparelOptionInSportsMainMenu;}
    public WebElement getSportswearOptionInSportsMainMenu() {return sportswearOptionInSportsMainMenu;}
    public WebElement getPantsOptionInSportsMainMenu() {return pantsOptionInSportsMainMenu;}
    public WebElement getShortsOptionInSportsMainMenu() {return shortsOptionInSportsMainMenu;}
    public WebElement getHoodiesOptionInSportsMainMenu() {return hoodiesOptionInSportsMainMenu;}
    public WebElement gettShirtsOptionInSportsMainMenu() {return tShirtsOptionInSportsMainMenu;}
    public WebElement getTanksOptionInSportsMainMenu() {return TanksOptionInSportsMainMenu;}
    public WebElement getFootwearOptionInSportsMainMenu() {return footwearOptionInSportsMainMenu;}
    public WebElement getSneakersOptionInSportsMainMenu() {return sneakersOptionInSportsMainMenu;}
    public WebElement getTrainingShoesOptionInSportsMainMenu() {return trainingShoesOptionInSportsMainMenu;}
    public WebElement getRunnigShoesOptionInSportsMainMenu() {return runnigShoesOptionInSportsMainMenu;}
    public WebElement getWomenOptionInSportsMainMenu() {return womenOptionInSportsMainMenu;}
    public WebElement getWomenSportsTechOptionInSportsMainMenu() {return womenSportsTechOptionInSportsMainMenu;}
    public WebElement getWomenWearableTechOptionInSportsMainMenu() {return womenWearableTechOptionInSportsMainMenu;}
    public WebElement getWomenCamerasOptionInSportsMainMenu() {return womenCamerasOptionInSportsMainMenu;}
    public WebElement getWomenPhoneAccessoriesOptionInSportsMainMenu() {return womenPhoneAccessoriesOptionInSportsMainMenu;}
    public WebElement getWomenPersonalCareOptionInSportsMainMenu() {return womenPersonalCareOptionInSportsMainMenu;}
    public WebElement getWomenShoweringOptionInSportsMainMenu() {return womenShoweringOptionInSportsMainMenu;}
    public WebElement getWomenSkinCareOptionInSportsMainMenu() {return womenSkinCareOptionInSportsMainMenu;}
    public WebElement getWomenBodyCareOptionInSportsMainMenu() {return womenBodyCareOptionInSportsMainMenu;}
    public WebElement getWomenOralCareOptionInSportsMainMenu() {return womenOralCareOptionInSportsMainMenu;}
    public WebElement getWomenTherapyOptionInSportsMainMenu() {return womenTherapyOptionInSportsMainMenu;}
    public WebElement getWomenMasksOptionInSportsMainMenu() {return womenMasksOptionInSportsMainMenu;}
    public WebElement getWomenFitnessAndTrainingOptionInSportsMainMenu() {return womenFitnessAndTrainingOptionInSportsMainMenu;}
    public WebElement getWomenTrainingAccessoriesOptionInSportsMainMenu() {return womenTrainingAccessoriesOptionInSportsMainMenu;}
    public WebElement getMmaOptionInSportsMainMenu() {return mmaOptionInSportsMainMenu;}
    public WebElement getJiuJitsuOptionInSportsMainMenu() {return jiuJitsuOptionInSportsMainMenu;}
    public WebElement getBoardGamesOptionInSportsMainMenu() {return boardGamesOptionInSportsMainMenu;}
    public WebElement getSportsTechOptionInSportsMainMenu() {return sportsTechOptionInSportsMainMenu;}
    public WebElement getWearableTechOptionInSportsMainMenu() {return wearableTechOptionInSportsMainMenu;}
    public WebElement getCamerasOptionInSportsMainMenu() {return camerasOptionInSportsMainMenu;}
    public WebElement getPhoneAccessoriesOptionInSportsMainMenu() {return phoneAccessoriesOptionInSportsMainMenu;}
    public WebElement getPersonalCareOptionInSportsMainMenu() {return personalCareOptionInSportsMainMenu;}
    public WebElement getShoweringOptionInSportsMainMenu() {return showeringOptionInSportsMainMenu;}
    public WebElement getShavingOptionInSportsMainMenu() {return shavingOptionInSportsMainMenu;}
    public WebElement getSkinCareOptionInSportsMainMenu() {return skinCareOptionInSportsMainMenu;}
    public WebElement getBodyCareOptionInSportsMainMenu() {return bodyCareOptionInSportsMainMenu;}
    public WebElement getOralCareOptionInSportsMainMenu() {return oralCareOptionInSportsMainMenu;}
    public WebElement getTherapyOptionInSportsMainMenu() {return therapyOptionInSportsMainMenu;}
    public WebElement getMasksOptionInSportsMainMenu() {return masksOptionInSportsMainMenu;}
    public WebElement getFitnessAndTrainingCategoryOptionInSportsMainMenu() {return fitnessAndTrainingCategoryOptionInSportsMainMenu;}
    public WebElement getWomenOnlyMainMenu() {return womenOnlyMainMenu;}
    public WebElement getWomenOnlyMainMenuText() {return womenOnlyMainMenuText;}
    public List<WebElement> getWomenOnlyMainMenuList() {return womenOnlyMainMenuList;}
    public WebElement getSportsSupplementsSubMenuSection() {return sportsSupplementsSubMenuSection;}
    public WebElement getVitaminsAndHealthSubMenuSection() {return vitaminsAndHealthSubMenuSection;}
    public WebElement getHealthyFoodSubMenuSection() {return healthyFoodSubMenuSection;}
    public WebElement getSportsSubMenuSection() {return sportsSubMenuSection;}
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
