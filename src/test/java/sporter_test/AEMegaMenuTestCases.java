package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AEMegaMenuPage;

import static org.testng.Assert.assertFalse;

public class AEMegaMenuTestCases extends BaseTest {
    Actions action;
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);

    String sportSupplementsUrl = "https://www.sporter.com/en-ae/sport-supplements";
    String healthVitaminsUrl = "https://www.sporter.com/en-ae/health-vitamins/";
    String sportsUrl = "https://www.sporter.com/en-ae/sports/";
    String healthyFoodsUrl = "https://www.sporter.com/en-ae/healthy-food/";
    String womenOnlyUrl = "https://www.sporter.com/en-ae/female/";
    String salesAndOffersUrl = "https://www.sporter.com/en-ae/salesoffers/";
    String byGoalUrl = "https://www.sporter.com/en-ae/goal/";
    String sportStacksUrl = "https://www.sporter.com/en-ae/sporter-stacks/";
    String byBrandUrl = "https://www.sporter.com/en-ae/brands";
    String proteinOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/protein/";
    String creatineOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/creatine/";
    String aminoAcidsOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/amino-acids/";
    String muscleBoostersOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/muscles-boosters/";
    String weightManagementOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/weight-management/";
    String recoveryOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/recovery/";
    String carbohydratesOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/carbohydrates/";
    String energyAndEnduranceOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/energy-endurance/";
    String gamingAndFocusOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements//gaming-focus";
    String wheyProteinOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/protein/whey-protein/";
    String WheyProteinIsolateOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/protein/whey-protein-isolate/";
    String proteinBlendsOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/protein/protein-blends/";
    String nonDairyProteinOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/protein/non-dairy-protein/";
    String caseinProteinOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/protein/casein-protein/";
    String dietProteinOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/protein/diet-protein/";
    String massGainersOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/protein/mass-gainer/";
    String creatineMonohydrateOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/creatine/creatine-monohydrate/";
    String creatineBlendsOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/creatine/creatine-blends/";
    String bCAAOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/amino-acids/bcaa/";
    String eAAOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/amino-acids//eaa";
    String arginineOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/amino-acids/arginine/";
    String betaAlanineOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/amino-acids/beta-alanine/";
    String hMBOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/amino-acids/hmb/";
    String aminoAcidPowdersOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/amino-acids/powders/";
    String aminoAcidPillsOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/amino-acids/capsules/";
    String citrullineOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/amino-acids/citrulline/";
    String aminoAcidLiquidsOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/amino-acids/liquids/";
    String testosteroneBoostersOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/muscles-boosters/testosterone-booster/";
    String ghBoostersOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/muscles-boosters/gh-booster/";
    String stimulantWeightLossOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/weight-management/stimulant-weight-loss/";
    String nonStimulantWeightLossOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/weight-management/non-stimulant-weight-loss/";
    String mealReplacementsOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/weight-management/meal-replacement/";
    String metabolismSupportOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/weight-management/metabolism-support/";
    String toningCreamsOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/weight-management/toning-cream/";
    String mctOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/weight-management/mct/";
    String glutamineOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/recovery/glutamine/";
    String recoveryBlendOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/recovery/recovery-blend/";
    String electrolytesAndHydrationOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/recovery//electrolytes";
    String carbohydratePowdersOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/carbohydrates/carbohydrates-powders/";
    String stimulantEnergyOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/energy-endurance/stimulant-energy/";
    String nonStimulantEnergyOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements/energy-endurance/non-stimulant-energy/";
    String gamingEssentialsOptionInSportSupplementsMenuUrl = "https://www.sporter.com/en-ae/sport-supplements//gaming-focus/gaming-supplements";
    String featuredOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/featured/";
    String aliveVitaminsOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/featured//alive-vitamins";
    String sexualHealthOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/featured//sexual-health-new";
    String essentialVitaminsOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/essential-vitamins/";
    String folicAcidOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/essential-vitamins/folic-acid/";
    String vitaminAOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/essential-vitamins/vitamin-a/";
    String vitaminBOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/essential-vitamins/vitamin-b/";
    String vitaminCOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/essential-vitamins/vitamin-c/";
    String vitaminDOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/essential-vitamins/vitamin-d/";
    String vitaminEOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/essential-vitamins/vitamin-e/";
    String vitaminKOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/essential-vitamins/vitamin-k/";
    String multiVitaminsOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/multivitamins/";
    String vitaminsForKidsOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/multivitamins/multivitamins-for-kids/";
    String vitaminsForMenOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/multivitamins/multivitamins-for-men/";
    String vitaminsForWomenOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/multivitamins/multivitamins-for-women/";
    String boneJointOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/bone-joint/";
    String boneHealthOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/bone-joint/bone-health/";
    String jointHealthOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/bone-joint/joint-health/";
    String beautyOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/beauty/";
    String collagenOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/beauty/collagen/";
    String hairSkinAndNailsOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/beauty/hair-skin-nails/";
    String fishOilAndOmegasOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/fish-oil-omegas/";
    String fishOilOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/fish-oil-omegas/fish-oil/";
    String omegaMixOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/fish-oil-omegas/omega-mix/";
    String healthyLifestyleOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/";
    String antioxidantOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/antioxidant/";
    String bloodSugarSupportOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/blood-sugar-support/";
    String brainSupportOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/brain-support/";
    String heartHealthOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/heart-health/";
    String detoxCleanseOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/detox-cleanse/";
    String energyFormulasOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/energy-formulas/";
    String eyeHealthOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/eye-health/";
    String herbsOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/herbs/";
    String hormonesBalanceOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/hormones-balance/";
    String immuneSupportOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/immune-support/";
    String mensHealthOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/men-s-health/";
    String stressReliefOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/stress-relief/";
    String sleepSupportOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/sleep-support/";
    String superFoodsOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/superfoods/";
    String urinaryTractSupportOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/urinary-tract-support/";
    String weightManagementOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/weight-management/";
    String womensHealthOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-lifestyle/women-s-health/";
    String digestionOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/digestion/";
    String digestionSupportOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/digestion/digestive-support/";
    String probioticsOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/digestion/probiotics/";
    String sportVitaminsOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/sport-vitamins/";
    String aminoAcidOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/sport-vitamins/amino-acids/";
    String mineralsOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/minerals/";
    String calciumOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/minerals/calcium/";
    String ironOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/minerals/iron/";
    String magnesiumOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/minerals/magnesium/";
    String multimineralFormulasOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/minerals/multimineral-formulas/";
    String zincOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/minerals/zinc/";
    String potassiumOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/minerals/potassium/";
    String healthyDrinksOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-drinks/";
    String drinkableVitaminsOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins/healthy-drinks/drinkable-vitamins/";
    String petsOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins//animal-health";
    String supplementsMoreOptionInVitaminsAndHealthUrl = "https://www.sporter.com/en-ae/vitamins//animal-health/supplements-more";
    String groceryOptionInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/";
    String bakingAndCookingOptionInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/baking/";
    String cannedOptionInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/canned/";
    String coffeeOptionInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/coffee/";
    String condimentsOptionInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/condiments/";
    String milkAndCreamOptionInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/milk/";
    String nutsAndOatsOptionInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/oats/";
    String oilsOptionInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/oils/";
    String pastaOptionInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/pasta/";
    String riceAndGrainsOptionInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/rice-grains/";
    String seasoningsAndSpicessOptionInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/seasonings-spices/";
    String sugarAndSweetenersOptionInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/sweeteners/";
    String syrupsOptionInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/syrups/";
    String teaAndHerbsInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/tea/";
    String superFoodsInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/super-foods/";
    String readyMixInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/ready-mix/";
    String breakfastAndCerealInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/grocery/cereal/";
    String readyToDrinkInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/ready-to-drink/";
    String aminoBcaasInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/ready-to-drink/amino-bcaas/";
    String energyDrinksInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/ready-to-drink/energy-drinks/";
    String proteinShakesInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/ready-to-drink/protein-shakes/";
    String electrolytesAndHydrationInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/ready-to-drink/electrolytes-hydration/";
    String healthySnacksInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/snacks-drinks/";
    String proteinBarsInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/snacks-drinks/protein-bars/";
    String cookiesInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/snacks-drinks/cookies/";
    String chipsInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/snacks-drinks/chips/";
    String browniesAndPancakesInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/snacks-drinks/brownies/";
    String snackBarsInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/snacks-drinks/snack-bars/";
    String spreadsInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/snacks-drinks/spreads/";
    String otherHealthySnacksInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/snacks-drinks/other-healthy-snacks/";
    String readyToEatInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/ready-to-eat/";
    String healthyMealsInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food/ready-to-eat/healthy-meals/";
    String featuredInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food//featured";
    String healthyMealReplacementInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food//featured/healthy-meal-replacement";
    String proteinCoffeeInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food//featured/protein-coffee";
    String candiesInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food//featured/candies";
    String flavoringAgentsInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food//featured/flavoring-agents";
    String ketoDietInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food//featured/keto-diet";
    String ketoSnacksInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food//featured/keto-diet";
    String manukaHoneyInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food//featured/manuka-honey";
    String meatSnacksInHealthyFoodUrl = "https://www.sporter.com/en-ae/healthy-food//featured/meat-snacks";
    String menInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/";
    String clothingInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/clothing/";
    String topsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/clothing/tops/";
    String pantsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/clothing/pants/";
    String shortsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/clothing/shorts/";
    String jacketsAndCoatsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/clothing/jackets-and-coats/";
    String safetyMasksInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/safety-masks/";
    String footwearInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/footwear/";
    String sneakersInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/footwear/sneakers/";
    String trainingShoesInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/footwear/training-shoes/";
    String runningShoesInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/footwear/running-shoes/";
    String hikingShoesInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/footwear/hiking-shoes/";
    String accessoriesInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/";
    String glovesInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/gloves/";
    String beltsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/belts/";
    String capsAndHatsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/caps-hats/";
    String capInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/caps-hats/cap/";
    String shakersInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/shakers/";
    String waterBottlesInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/shakers/water-bottles/";
    String socksInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/socks/";
    String towelsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/towels/";
    String sunglassesInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/sunglasses/";
    String mixerInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/mixer/";
    String bagsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/bags/";
    String backPacksInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/bags/backpacks/";
    String shoulderBagsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/bags/shoulder-bags/";
    String wearableTechInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/wearable-tech/";
    String watchesInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories/wearable-tech/watches/";
    String gamingAccessoriesInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/accessories//gaming-accessories";
    String equipmentInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/equipment/";
    String gripsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/equipment/grips/";
    String ballsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/equipment/balls/";
    String rollersInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/equipment/rollers/";
    String weightsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/men/equipment/weights/";
    String womenInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/";
    String womenClothingInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/clothing/";
    String womenTopsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/clothing/tops/";
    String womenShortsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/clothing/shorts/";
    String womenSafetyMasksInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/safety-masks/";
    String womenAccessoriesInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/accessories/";
    String womenGlovesInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/accessories/gloves/";
    String womenCapsAndHatsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/accessories/caps-hats/";
    String womenCapsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/accessories/caps-hats/cap/";
    String womenShakersInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/accessories/shakers/";
    String womenWaterBottlesInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/accessories/shakers/water-bottles/";
    String womenSocksInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/accessories/socks/";
    String womenTowelsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/accessories/towels/";
    String womenSunglassesInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/accessories/sunglasses/";
    String womenMixerInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/accessories/mixer/";
    String womenBagsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/accessories/bags/";
    String womenBackPacksInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/accessories/bags/backpacks/";
    String womenSholdersBagsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/accessories/bags/shoulder-bags/";
    String womenBeltsInSportsMenuUrl = "https://www.sporter.com/en-ae/sportswear-accessories/women/accessories/belts/";
    String supplementsInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/";
    String optimumNutritionInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/optimum-nutrition/";
    String muscletechInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/muscle-tech/";
    String cellucorInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/cellucor/";
    String dymatizeInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/dymatize/";
    String xtendInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/xtend/";
    String animalNutritionInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/universal-animal-nutrition/";
    String musclePharmInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/muscle-pharm/";
    String universalNutritionInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/universal-nutrition/";
    String bsnInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/bsn/";
    String ehplabsInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/ehplabs/";
    String jymSupplementScienceInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/jym-supplement-science/";
    String bpiSportsInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/bpi/";
    String russianBearInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/russian-bear/";
    String isopureInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/natures-best/";
    String oneUpNutritionInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/1-up-nutrition/";
    String musclemedInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/muscle-med/";
    String mhpInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/mhp/";
    String evlNutritionInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/evl-nutrition/";
    String nlaForHerInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/nla-for-her/";
    String muscleNutritionInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/muscle-nutrition/";
    String gatNutritionInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/gat-nutrition/";
    String labradaInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/labrada/";
    String orgainInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/orgain/";
    String nutrexResearchInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/nutrex-research/";
    String scitecNutritionInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/scitec-nutrition/";
    String prolabInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/prolab/";
    String sotruInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/sotru/";
    String divineHealthInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/divine-health/";
    String ghostInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/ghost/";
    String womensBestInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/women-s-best/";
    String efxSportsInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/efx-sports/";
    String basixInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/basix/";
    String ak47InByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/ak-47/";
    String nfSportsInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/nf-sports/";
    String fullyDosedInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/fully-dosed/";
    String fivePercentNutritionInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/5-nutrition/";
    String olimpSportNutritionInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/olimp/";
    String jnxSportsInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/jnx-sports/";
    String fitAndLeanInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/fit-lean/";
    String gymqueenInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/gymqueen/";
    String thePackInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/the-pack/";
    String betancourtNutritionInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/betancourt-nutrition/";
    String yallaProteinInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/yalla-protein/";
    String proteinWorldInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/protein-world/";
    String obviInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/obvi/";
    String naughtyBoyInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/naughty-boy/";
    String steelFitInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/steel-fit/";
    String usnInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/usn/";
    String xGamerInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/x-gamer/";
    String innosuppsInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/innosupps/";
    String outbreakNutritionInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements/outbreak-nutrition/";
    String insaneLabzInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements//insane-labz";
    String allMaxInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements//all-max";
    String glaxonInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements//glaxon";
    String redcon1InByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements//redcon1";
    String pandaSupplementsInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements//panda-supplements";
    String nutrendInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements//nutrend";
    String ostrovitInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements//ostrovit";
    String betteryInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/supplements//bettery";
    String healthyFoodSnacksAndMealReplacementInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/snacks-more/";
    String wowHydrateInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/snacks-more/wow-hydrate/";
    String questNutritionInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/snacks-more/quest-nutrition/";
    String grenadeInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/snacks-more/grenade/";
    String reignEnergyInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/snacks-more/reign/";
    String monsterEnergyInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/snacks-more/monster-energy/";
    String thirdEnergyInByBrandMenuUrl = "https://www.sporter.com/en-ae/brands/snacks-more/3d-energy/";
    String menInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/";
    String sportInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/sport/";
    String footballInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/sport/football/";
    String basketballInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/sport/basketball/";
    String baseballInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/sport/baseball/";
    String runningInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/sport/running/";
    String swimmingInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/sport/swimming/";
    String yogaInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/sport/yoga/";
    String fitnessAndTrainingInSportsMainMenuUrl = "sporter.com/en-ae/sports/men/sport/fitness-and-training/";
    String mmaInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/sport/mma/";
    String jiuJitsuInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/sport/jiu-jitsu/";
    String boardGamesInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/sport/board-games/";
    String sportsTechInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/sports-tech/";
    String wearableTechInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/sports-tech/wearable-tech/";
    String camerasInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/sports-tech/cameras/";
    String phoneAccessoriesInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/sports-tech/phone-accessories/";
    String personalCareInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/personal-care/";
    String showeringInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/personal-care/showering/";
    String shavingInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/personal-care/shaving/";
    String skinCareInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/personal-care/skin-care/";
    String bodyCareInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/personal-care/body-care/";
    String oralCareInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/personal-care/oral-care/";
    String therapyInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/personal-care/therapy/";
    String masksInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/personal-care/masks/";
    String fitnessAndTrainingCategoryInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/fitness-and-training/";
    String fitnessEquipmentInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/fitness-and-training/fitness-equipment/";
    String skippingRopesInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/fitness-and-training/fitness-equipment/skipping-ropes/";
    String weightBeltsInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/fitness-and-training/fitness-equipment/weight-belts/";
    String scootersInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/fitness-and-training/fitness-equipment/scooters/";
    String trainingAccessoriesInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/fitness-and-training/training-accessories/";
    String shakersBottlesInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/fitness-and-training/training-accessories/shakers-bottles/";
    String bagsInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/fitness-and-training/training-accessories/bags/";
    String glovesInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/fitness-and-training/training-accessories/gloves/";
    String bracesSleevesInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/fitness-and-training/training-accessories/braces-sleeves/";
    String mouthguardInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/fitness-and-training/training-accessories/mouthguard/";
    String apparelInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/apparel/";
    String sportsWearInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/apparel/sportswear/";
    String pantsInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/apparel/sportswear/pants/";
    String shortsInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/apparel/sportswear/shorts/";
    String hoodiesInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/apparel/sportswear/hoodies/";
    String tShirtsInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/apparel/sportswear/t-shirts/";
    String tanksInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/apparel/sportswear/tanks/";
    String footwearInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/apparel/footwear/";
    String sneakersInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/apparel/footwear/sneakers/";
    String trainingShoesInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/apparel/footwear/training-shoes/";
    String runningShoesInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/men/apparel/footwear/running-shoes/";
    String womenInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/women/";
    String womenSportsTechInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/women/sports-tech/";
    String womenWearableTechInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/women/sports-tech/wearable-tech/";
    String womenCamerasInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/women/sports-tech/cameras/";
    String womenPhoneAccessoriesInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/women/sports-tech/phone-accessories/";
    String womenPersonalCareInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/women/personal-care/";
    String womenShoweringInSportsMainMenuUrl = "https://www.sporter.com/en-ae/sports/women/personal-care/showering/";
    String womenSkinCareInSportsMainMenuUrll = "https://www.sporter.com/en-ae/sports/women/personal-care/skin-care/";
    String womenBodyCareInSportsMainMenuUrll = "https://www.sporter.com/en-ae/sports/women/personal-care/body-care/";
    String womenOralCareInSportsMainMenuUrll = "https://www.sporter.com/en-ae/sports/women/personal-care/oral-care/";
    String womenTherapyInSportsMainMenuUrll = "https://www.sporter.com/en-ae/sports/women/personal-care/therapy/";
    String womenMasksInSportsMainMenuUrll = "https://www.sporter.com/en-ae/sports/women/personal-care/masks/";
    String womenFitnessAndTrainingInSportsMainMenuUrll = "https://www.sporter.com/en-ae/sports/women/fitness-and-training/";
    String womenTrainingAccessoriesInSportsMainMenuUrll = "https://www.sporter.com/en-ae/sports/women/fitness-and-training/training-accessories/";

    @Test(description = "Make sure the MegaMenu Section display correctly with all main columns", priority = 1)
    public void verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
        Assert.assertEquals(aeMegamenuPage.getMegaMenuList().get(0).getText(), "Shop By\n" +
                "Sport Supplements\n" +
                "Vitamins & Health\n" +
                "Healthy Food\n" +
                "SPORTS\n" +
                "Women's Only", "The MegaMenu is not correct");
    }

    @Test(description = "Make sure the Shop By menu display the correct options ", priority = 2)
    public void verifyShopByMenuDisplayTheCorrectOptions() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        Assert.assertEquals(aeMegamenuPage.getShopeByMenu().getText(), "Shop By");
        Assert.assertEquals(aeMegamenuPage.getSportsSupplementsOption().getAttribute("textContent"), " Sports Supplements\n\n");
        Assert.assertEquals(aeMegamenuPage.getVitaminsAndHealthOption().getAttribute("textContent"), " Vitamins & Health\n\n");
        Assert.assertEquals(aeMegamenuPage.getHealthFoodOption().getAttribute("textContent"), " Healthy Food\n\n");
        Assert.assertEquals(aeMegamenuPage.getSportsOption().getAttribute("textContent"), " SPORTS\n\n");
        Assert.assertEquals(aeMegamenuPage.getWomensOnlyOption().getAttribute("textContent"), " Women's Only\n\n");
        Assert.assertEquals(aeMegamenuPage.getByBrandOption().getAttribute("textContent"), " By Brand\n\n");
        Assert.assertEquals(aeMegamenuPage.getByGoalOption().getAttribute("textContent"), " By Goal\n\n");
        Assert.assertEquals(aeMegamenuPage.getSalesAndOffersOption().getAttribute("textContent"), " Sales & Offers\n\n");
        Assert.assertEquals(aeMegamenuPage.getSporterStacksOption().getAttribute("textContent"), " Sporter Stacks\n\n");
    }

    @Test(description = "Make sure the Hamburger Menu Icon display correctly in the ShopBy menu ", priority = 3)
    public void verifyTheHamburgerMenuIconAppearsCorrectlyInShopByMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        Assert.assertTrue(aeMegamenuPage.getHamburgerMenuIcon().isDisplayed());
    }

    @Test(description = "Make sure the arrow Icon display correctly next to the options appearing in the ShopBy menu ", priority = 4)
    public void verifyTheArrowIconAppearsCorrectlyNextToTheOptionInTheInShopByMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSupplementsArrowIcon().isDisplayed());
        Assert.assertTrue(aeMegamenuPage.getHealthFoodArrowIcon().isDisplayed());
        Assert.assertTrue(aeMegamenuPage.getVitaminsAndHealthArrowIcon().isDisplayed());
        Assert.assertTrue(aeMegamenuPage.getByBrandArrowIcon().isDisplayed());
        Assert.assertTrue(aeMegamenuPage.getSportsArrowIcon().isDisplayed());
    }

    @Test(description = "Make sure the background color of the ShopBy menu is Gray", priority = 5)
    public void verifyTheBackgroundColorOfTheShopByMenuInGrayColor() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertEquals(aeMegamenuPage.getShopByList().getCssValue("background-color"), "rgba(236, 236, 236, 1)", "The ShopBy Menu does not appears in the gray color");
    }

    @Test(description = "Make sure the Category sub menu will appear once hovering on any option appearing in the ShopBy Menu", priority = 6)
    public void verifyTheCategorySubMenuAppearsWhenHoveringOnAnyOptionInsideShopByMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        DataHelperAndWait.isDisplayed(aeMegamenuPage.getSubMenuSection(), 10);
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Sports Supplements sub menu is missing");
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        DataHelperAndWait.isDisplayed(aeMegamenuPage.getSubMenuSection(), 10);
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Vitamins And Health sub menu is missing");
        action.moveToElement(aeMegamenuPage.getHealthFoodOption()).perform();
        DataHelperAndWait.isDisplayed(aeMegamenuPage.getSubMenuSection(), 10);
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Health Food sub menu is missing");
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        DataHelperAndWait.isDisplayed(aeMegamenuPage.getSubMenuSection(), 10);
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Sports sub menu is missing");
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        DataHelperAndWait.isDisplayed(aeMegamenuPage.getSubMenuSection(), 10);
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The By Brand sub menu is missing");
    }

    @Test(description = "Make sure clicking on the Sports Supplements menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 7)
    public void verifyClickingOnSportsSupplementsOptionInShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        aeMegamenuPage.getSportsSupplementsOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportSupplementsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamins And Health menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 8)
    public void verifyClickingOnVitaminsAndHealthOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        aeMegamenuPage.getVitaminsAndHealthOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(healthVitaminsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Healthy Food menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 9)
    public void verifyClickingOnHealthyFoodOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthFoodOption()).perform();
        aeMegamenuPage.getHealthFoodOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(healthyFoodsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sports menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 10)
    public void verifyClickingOnSportsOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        aeMegamenuPage.getSportsOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Woman's only menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 11)
    public void verifyClickingOnWomanOnlyOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomensOnlyOption()).perform();
        aeMegamenuPage.getWomensOnlyOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(womenOnlyUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    //There's a bug here, clicking on the By Brand Menu wil redirect the user to the homePage
    @Test(description = "Make sure clicking on the By Brand menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 12)
    public void verifyClickingOnByBrandOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(byBrandUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the By Goal menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 13)
    public void verifyClickingOnByGoalOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByGoalOption()).perform();
        aeMegamenuPage.getByGoalOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(byGoalUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sales And Offers menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 14)
    public void verifyClickingOnSalesAndOffersOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSalesAndOffersOption()).perform();
        aeMegamenuPage.getSalesAndOffersOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(salesAndOffersUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sport Stacks menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 15)
    public void verifyClickingOnSportsStacksOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSporterStacksOption()).perform();
        aeMegamenuPage.getSporterStacksOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportStacksUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure the MegaMenu section appears correctly when navigation to any option appearing in the ShopBy Menu", priority = 16)
    public void verifyMegaMenuSectionAppearsCorrectlyWhenClickingOnAnyOptionInTheShopByMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        this.verifyClickingOnSportsSupplementsOptionInShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnVitaminsAndHealthOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnHealthyFoodOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnSportsOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnWomanOnlyOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnByBrandOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnByGoalOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnSalesAndOffersOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnSportsStacksOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
    }

    @Test(description = "Make sure the Sports Supplements menu Inside ShopBy Menu display the correct categories and sub-categories", priority = 17)
    public void verifySportsSupplementsMenuInsideShopByMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getSubMenuList().get(0).getText(), "PROTEIN\n" + "Whey Protein\n" + "Whey Protein Isolate\n" +
                "Protein Blends\n" + "Non-dairy Protein\n" + "Casein Protein\n" + "Diet Protein\n" + "Mass Gainers\n" + "CREATINE\n" +
                "Creatine Monohydrate\n" + "Creatine Blends\n" + "AMINO ACIDS\n" + "BCAA\n" + "EAA\n" + "Arginine\n" + "Beta Alanine\n" +
                "HMB\n" + "Amino Acid Powders\n" + "Amino Acid Pills\n" + "Citrulline\n" + "Amino Acid Liquids\n" + "MUSCLE BOOSTERS\n" +
                "Testosterone Boosters\n" + "Gh Boosters\n" + "WEIGHT MANAGEMENT\n" + "Stimulant Weight Loss\n" + "Non-stimulant Weight Loss\n" +
                "Meal Replacements\n" + "Metabolism Support\n" + "Toning Creams\n" + "MCT\n" + "RECOVERY\n" + "Glutamine\n" + "Recovery Blends\n" +
                "Electrolytes & Hydration\n" + "CARBOHYDRATES\n" + "Carbohydrate Powders\n" + "ENERGY & ENDURANCE\n" + "Stimulant Energy\n" +
                "Non-stimulant Energy\n" + "GAMING & FOCUS\n" + "Gaming Essentials");
    }

    @Test(description = "Make sure the main categories in the Sports Supplements menu Inside ShopBy Menu appearing in Bold Font", priority = 18)
    public void verifyTheMainCategoriesInTheSportsSupplementsMenuInsideShopByMenuAppearingInBoldFont() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        Assert.assertTrue(aeMegamenuPage.getProteinOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getCreatineOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getRecoveryOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
    }

    @Test(description = "Make sure the main categories in the Sports Supplements menu Inside ShopBy Menu menu appearing in uppercase", priority = 19)
    public void verifyTheMainCategoriesInTheSportsSupplementsMenuInsideShopByMenuAppearingInUppercase() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        Assert.assertEquals(aeMegamenuPage.getProteinOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getCreatineOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getRecoveryOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
    }

    @Test(description = "Make sure clicking on the Protein option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 20)
    public void verifyClickingOnProteinOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        aeMegamenuPage.getProteinOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Creatine option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 21)
    public void verifyClickingOnCreatineOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getCreatineOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), creatineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Amino Acids appearing in the Sports Supplements inside menu ShopBy Menu will redirect the User to the correct URL", priority = 22)
    public void verifyClickingOnAminoAcidsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Muscle Boosters option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 23)
    public void verifyClickingOnMuscleBoostersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), muscleBoostersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Weight Management option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 24)
    public void verifyClickingOnWeightManagementOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getWeightManagementOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), weightManagementOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Recovery option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 25)
    public void verifyClickingOnRecoveryOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRecoveryOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getRecoveryOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), recoveryOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Carbohydrates option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 26)
    public void verifyClickingOnCarbohydratesOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), carbohydratesOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Energy And Endurance Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 27)
    public void verifyClickingOnEnergyAndEnduranceOptionOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), energyAndEnduranceOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Gaming And Focus Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 28)
    public void verifyClickingOnGamingAndFocusOptionOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), gamingAndFocusOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Whey Protein Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 29)
    public void verifyClickingOnWheyProteinOptionOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWheyProteinOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getWheyProteinOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), wheyProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Whey Protein Isolate Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 30)
    public void verifyClickingOnWheyProteinIsolateOptionOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), WheyProteinIsolateOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the protein Blends Option  appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 31)
    public void verifyClickingOnProteinBlendsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinBlendsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Non Dairy Protein Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 32)
    public void verifyClickingOnNonDairyProteinOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nonDairyProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the casein Protein Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 33)
    public void verifyClickingOnCaseinProteinOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), caseinProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the diet Protein Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 34)
    public void verifyClickingOnDietProteinOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDietProteinOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getDietProteinOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), dietProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Mass Gainers Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 35)
    public void verifyClickingOnMassGainersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMassGainersOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getMassGainersOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), massGainersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Creatine Monohydrate Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 36)
    public void verifyClickingOnCreatineMonohydrateOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), creatineMonohydrateOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Creatine Blends Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 37)
    public void verifyClickingOnCreatineBlendsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), creatineBlendsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the BCAA Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 38)
    public void verifyClickingOnBCAAOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getbCAAOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getbCAAOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bCAAOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the EAA Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 39)
    public void verifyClickingOnEAAOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEAAOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getEAAOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), eAAOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Arginine Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 40)
    public void verifyClickingOnArginineOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getArginineOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getArginineOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), arginineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Beta Alanine Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 41)
    public void verifyClickingOnBetaAlanineOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), betaAlanineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the HMB Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 42)
    public void verifyClickingOnHMbOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHMBOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getHMBOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), hMBOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Amino Acid Powders Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 43)
    public void verifyClickingOnAminoAcidPowdersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidPowdersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Amino Acid Pills Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 44)
    public void verifyClickingOnAminoAcidPillsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidPillsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Citrulline Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 45)
    public void verifyClickingOnCitrullineOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCitrullineOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getCitrullineOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), citrullineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Amino Acid Liquids Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 46)
    public void verifyClickingOnAminoAcidLiquidsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidLiquidsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Testosterone Boosters Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 47)
    public void verifyClickingOnTestosteroneBoostersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), testosteroneBoostersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Gh Boosters Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 48)
    public void verifyClickingOnGhBoostersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGhBoostersOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getGhBoostersOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ghBoostersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Stimulant Weight Loss Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 49)
    public void verifyClickingOnStimulantWeightLossOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), stimulantWeightLossOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Non Stimulant Weight Loss Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 50)
    public void verifyClickingOnNonStimulantWeightLossOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nonStimulantWeightLossOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Meal Replacements Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 51)
    public void verifyClickingOnMealReplacementsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mealReplacementsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Metabolism Support Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 52)
    public void verifyClickingOnMetabolismSupportOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), metabolismSupportOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Toning Creams Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 53)
    public void verifyClickingOnToningCreamsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getToningCreamsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getToningCreamsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), toningCreamsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the MCT Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 54)
    public void verifyClickingOnMctOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMctOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getMctOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mctOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Glutamine Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 55)
    public void verifyClickingOnGlutamineOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGlutamineOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getGlutamineOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), glutamineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Recovery Blend Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 56)
    public void verifyClickingOnRecoveryBlendOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), recoveryBlendOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Electrolytes And Hydration Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 57)
    public void verifyClickingOnElectrolytesAndHydrationOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), electrolytesAndHydrationOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Carbohydrate Powders Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 58)
    public void verifyClickingOnCarbohydratePowdersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), carbohydratePowdersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Stimulant Energy Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 59)
    public void verifyClickingOnStimulantEnergyOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), stimulantEnergyOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Non Stimulant Energy Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 60)
    public void verifyClickingOnNonStimulantEnergyOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nonStimulantEnergyOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Gaming Essentials Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 61)
    public void verifyClickingOnGamingEssentialsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGamingEssentialsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getGamingEssentialsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), gamingEssentialsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure the Vitamins & Health menu Inside ShopBy Menu display the correct categories and sub-categories", priority = 62)
    public void verifyVitaminsAndHealthMenuInsideShopByMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getOptionList().get(0).getText(), "FEATURED\n" + "Alive! Vitamins\n" + "Sexual Health\n" + "ESSENTIAL VITAMINS\n" +
                "Folic Acid\n" + "Vitamin A\n" + "Vitamin B\n" + "Vitamin C\n" + "Vitamin D\n" + "Vitamin E\n" + "Vitamin K\n" + "MULTIVITAMINS\n" + "Vitamins For Kids\n" +
                "Multivitamins For Men\n" + "Multivitamins For Women\n" + "BONE & JOINT\n" + "Bone Health\n" + "Joint Health\n" + "BEAUTY\n" + "Collagen\n" + "Hair, Skin & Nails\n" +
                "FISH OIL & OMEGAS\n" + "Fish Oil\n" + "Omega 3 6 9\n" + "HEALTHY LIFESTYLE\n" + "Antioxidants\n" + "Blood Sugar Support\n" + "Brain Support\n" + "Heart Health\n" +
                "Detox & Cleanse\n" + "Energy Formulas\n" + "Eye Health\n" + "Herbs\n" + "Hormones Balance\n" + "Immune Support\n" + "Mens Health\n" + "Stress Relief\n" +
                "Sleep Support\n" + "Superfoods\n" + "Urinary Tract Support\n" + "Weight Management\n" + "Womens Health\n" + "DIGESTION\n" + "Digestive Support\n" + "Probiotics\n" +
                "SPORT VITAMINS\n" + "Amino Acids\n" + "MINERALS\n" + "Calcium\n" + "Iron\n" + "Magnesium\n" + "Multimineral Formulas\n" + "Zinc\n" + "Potassium\n" + "HEALTHY DRINKS\n" +
                "Drinkable Vitamins\n" + "PETS\n" + "Supplements & More");
    }

    @Test(description = "Make sure the main categories in the Vitamins & Health menu Inside ShopBy Menu appearing in Bold Font", priority = 63)
    public void verifyTheMainCategoriesInTheVitaminsAndHealthMenuInsideShopByMenuAppearingInBoldFont() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        Assert.assertTrue(aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getPetsOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
    }

    @Test(description = "Make sure the main categories in the Vitamins & Health menu Inside ShopBy Menu menu appearing in uppercase", priority = 64)
    public void verifyTheMainCategoriesInTheVitaminsAndHealthMenuInsideShopByMenuAppearingInUppercase() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        Assert.assertEquals(aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getPetsOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
    }

    @Test(description = "Make sure clicking on the Featured Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 65)
    public void verifyClickingOnFeaturedOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), featuredOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Alive Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 66)
    public void verifyClickingOnAliveVitaminsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aliveVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sexual Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 67)
    public void verifyClickingOnSexualHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getSexualHealthOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getSexualHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sexualHealthOptionInVitaminsAndHealthUrl);
        System.out.println(webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Essential Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnEssentialVitaminsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), essentialVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Folic Acid Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 69)
    public void verifyClickingOnFolicAcidOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), folicAcidOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin A Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 70)
    public void verifyClickingOnVitaminAOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminAOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin B Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 71)
    public void verifyClickingOnVitaminBOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminBOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin C Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 72)
    public void verifyClickingOnVitaminCOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminCOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin D Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 73)
    public void verifyClickingOnVitaminDOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminDOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin E Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 74)
    public void verifyClickingOnVitaminEOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminEOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin K Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 75)
    public void verifyClickingOnVitaminKOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminKOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Multi Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 76)
    public void verifyClickingOnMultiVitaminsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), multiVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamins For Kids Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 77)
    public void verifyClickingOnVitaminsForKidsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForKidsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamins For Men Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 78)
    public void verifyClickingOnVitaminsForMenOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForMenOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamins For Women Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 79)
    public void verifyClickingOnVitaminsForWomenOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForWomenOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Bone And Joint Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 80)
    public void verifyClickingOnBoneAndJointOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), boneJointOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Bone Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 81)
    public void verifyClickingOnBoneHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), boneHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Joint Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 82)
    public void verifyClickingOnJointHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), jointHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Beauty Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 83)
    public void verifyClickingOnBeautyOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), beautyOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Collagen Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 84)
    public void verifyClickingOnCollagenOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), collagenOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Hair, Skin AndNails Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 85)
    public void verifyClickingOnHairSkinAndNailsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), hairSkinAndNailsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Fish Oil Omegas Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 86)
    public void verifyClickingOnFishOilOmegasOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), fishOilAndOmegasOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Fish Oil Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 87)
    public void verifyClickingOnFishOilOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), fishOilOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Omega369 Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 88)
    public void verifyClickingOnOmega369OptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), omegaMixOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Health Lifestyle Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 89)
    public void verifyClickingOnHealthLifestyleOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyLifestyleOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Antioxidants Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 90)
    public void verifyClickingOnAntioxidantsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), antioxidantOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Blood Sugar Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 91)
    public void verifyClickingOnBloodSugarSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bloodSugarSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Brain Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 92)
    public void verifyClickingOnBrainSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), brainSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Detox And Cleanse Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 93)
    public void verifyClickingOnDetoxAndCleanseOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), detoxCleanseOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Energy Formulas Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 94)
    public void verifyClickingOnEnergyFormulasOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), energyFormulasOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Eye Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 95)
    public void verifyClickingOnEyeHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), eyeHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Herbs Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 96)
    public void verifyClickingOnHerbsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), herbsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Hormones Balance Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 97)
    public void verifyClickingOnHormonesBalanceOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), hormonesBalanceOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Immune Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 98)
    public void verifyClickingOnImmuneSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), immuneSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Mens Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 99)
    public void verifyClickingOnMensHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mensHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Stress Relief Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 100)
    public void verifyClickingOnStressReliefOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), stressReliefOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sleep Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 101)
    public void verifyClickingOnSleepSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sleepSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Super Foods Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 102)
    public void verifyClickingOnSuperFoodsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), superFoodsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Urinary Tract Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 103)
    public void verifyClickingOnUrinaryTractSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), urinaryTractSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Weight Management Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 104)
    public void verifyClickingOnWeightManagementOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), weightManagementOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Womens Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 105)
    public void verifyClickingOnWomensHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womensHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Digestion Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 106)
    public void verifyClickingOnDigestionOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), digestionOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Digestion Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 107)
    public void verifyClickingOnDigestionSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), digestionSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Probiotics Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 108)
    public void verifyClickingOnProbioticsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), probioticsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sport Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 109)
    public void verifyClickingOnSportVitaminsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sportVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Amino Acid Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 110)
    public void verifyClickingOnAminoAcidOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Minerals Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 111)
    public void verifyClickingOnMineralsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mineralsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Calcium Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 112)
    public void verifyClickingOnCalciumOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), calciumOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Iron Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 113)
    public void verifyClickingOnIronOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getIronOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getIronOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ironOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Magnesium Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 114)
    public void verifyClickingOnMagnesiumOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), magnesiumOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Multi mineral Formulas Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 115)
    public void verifyClickingOnMultimineralFormulasOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), multimineralFormulasOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Zinc Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 116)
    public void verifyClickingOnZincOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getZincOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getZincOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), zincOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Potassium Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 117)
    public void verifyClickingOnPotassiumOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), potassiumOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Healthy Drinks Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 118)
    public void verifyClickingOnHealthyDrinksOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyDrinksOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Drinkable Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 119)
    public void verifyClickingOnDrinkableVitaminsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), drinkableVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Pets Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 120)
    public void verifyClickingOnPetsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getPetsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getPetsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), petsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Supplements More Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 121)
    public void verifyClickingOnSupplementsMoreOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), supplementsMoreOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure the Healthy Food menu Inside ShopBy Menu display the correct categories and sub-categories", priority = 122)
    public void verifyHealthyFoodMenuInsideShopByMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getOptionList().get(0).getText(), "GROCERY\n" + "Baking & Cooking\n" + "Canned\n" + "Coffee\n" + "Condiments\n" +
                "Milk & Cream\n" + "Nuts & Oats\n" + "Oils\n" + "Pasta\n" + "Rice & Grains\n" + "Seasonings & Spices\n" + "Sugar & Sweeteners\n" + "Syrups\n" + "Tea & Herbs\n" +
                "Superfoods\n" + "Ready Mixes\n" + "Breakfast & Cereal\n" + "READY TO DRINK\n" + "Amino & Bcaas\n" + "Energy Drinks\n" + "Protein Shakes\n" + "Electrolytes & Hydration\n" + "HEALTHY SNACKS\n" + "Protein Bars\n" +
                "Cookies\n" + "Chips\n" + "Brownies & Pancakes\n" + "Snack Bars\n" + "Spreads\n" + "Other Healthy Snacks\n" + "READY TO EAT\n" + "Healthy Meals\n" + "FEATURED\n" +
                "Healthy Meal Replacement\n" + "Protein Coffee\n" + "Candies\n" + "Flavoring Agents\n" + "Keto Snacks\n" + "Manuka Honey\n" + "Meat Snacks");
    }

    @Test(description = "Make sure clicking on the Grocery Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 123)
    public void verifyClickingOnGroceryOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getGroceryOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getGroceryOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), groceryOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Baking And Cooking Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 124)
    public void verifyClickingOnBakingAndCookingOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bakingAndCookingOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Canned Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 125)
    public void verifyClickingOnCannedOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getCannedOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getCannedOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), cannedOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Coffee Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 126)
    public void verifyClickingOnCoffeeOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getCoffeeOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getCoffeeOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), coffeeOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Condiments Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 127)
    public void verifyClickingOnCondimentsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getCondimentsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getCondimentsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), condimentsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Milk And Cream Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 128)
    public void verifyClickingOnMilkAndCreamOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), milkAndCreamOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Nuts And Oats Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 129)
    public void verifyClickingOnNutsAndOatsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nutsAndOatsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Oils Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 130)
    public void verifyClickingOnOilsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getOilsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getOilsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), oilsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Pasta Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 131)
    public void verifyClickingOnPastaOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getPastaOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getPastaOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), pastaOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Rice And Grains Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 132)
    public void verifyClickingOnRiceAndGrainsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), riceAndGrainsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Seasonings And Spices Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 133)
    public void verifyClickingOnSeasoningsAndSpicesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), seasoningsAndSpicessOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sugar And Sweeteners Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 134)
    public void verifyClickingOnSugarSweetenersOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sugarAndSweetenersOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Syrups Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 135)
    public void verifyClickingOnSyrupsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSyrupsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getSyrupsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), syrupsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Tea And Herbs Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 136)
    public void verifyClickingOnTeaAndHerbsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), teaAndHerbsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Superfoods Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 137)
    public void verifyClickingOnSuperfoodsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), superFoodsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Ready Mixes Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 138)
    public void verifyClickingOnReadyMixesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getReadyMixesOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getReadyMixesOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), readyMixInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Breakfast And Cereal Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 139)
    public void verifyClickingOnBreakfastAndCerealOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), breakfastAndCerealInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Ready To Drink Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 140)
    public void verifyClickingOnReadyToDrinkOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), readyToDrinkInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Amino And Bcaas Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 141)
    public void verifyClickingOnAminoAndBcaasOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoBcaasInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Energy Drinks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 142)
    public void verifyClickingOnEnergyDrinksOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), energyDrinksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Protein Shakes Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 143)
    public void verifyClickingOnProteinShakesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getProteinShakesOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getProteinShakesOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinShakesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Electrolytes And Hydration Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 144)
    public void verifyClickingOnElectrolytesAndHydrationOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), electrolytesAndHydrationInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Healthy Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 145)
    public void verifyClickingOnHealthySnacksOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthySnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Protein Bars Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 146)
    public void verifyClickingOnProteinBarsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getProteinBarsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getProteinBarsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinBarsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Cookies Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 147)
    public void verifyClickingOnCookiesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getCookiesOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getCookiesOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), cookiesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Chips Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 148)
    public void verifyClickingOnChipsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getChipsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getChipsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), chipsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Brownies And Pancakes Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 149)
    public void verifyClickingOnBrowniesAndPancakesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), browniesAndPancakesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Snack Bars Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 150)
    public void verifyClickingOnSnackBarsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSnackBarsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getSnackBarsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), snackBarsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Spreads Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 151)
    public void verifyClickingOnSpreadsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSpreadsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getSpreadsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), spreadsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Other Healthy Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 152)
    public void verifyClickingOnOtherHealthySnacksOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), otherHealthySnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Ready To Eat Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 153)
    public void verifyClickingOnReadyToEatOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getReadyToEatOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getReadyToEatOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), readyToEatInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Healthy Meals Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 154)
    public void verifyClickingOnHealthyMealsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyMealsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Featured Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 155)
    public void verifyClickingOnFeaturedOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getFeaturedOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getFeaturedOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), featuredInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Healthy Meal Replacement Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 156)
    public void verifyClickingOnHealthyMealReplacementOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyMealReplacementInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Protein Coffee Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 157)
    public void verifyClickingOnProteinCoffeeOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinCoffeeInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Candies Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 158)
    public void verifyClickingOnCandiesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getCandiesOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getCandiesOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), candiesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Flavoring Agents Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 159)
    public void verifyClickingOnFlavoringAgentsOptionOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), flavoringAgentsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Keto Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 160)
    public void verifyClickingOnKetoSnacksOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ketoSnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Manuka Honey Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 161)
    public void verifyClickingOnManukaHoneyOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), manukaHoneyInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Meat Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 162)
    public void verifyClickingOnMeatSnacksOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), meatSnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure the Sports menu Inside ShopBy Menu display the correct categories and sub-categories", priority = 163)
    public void verifySportsMenuInsideShopByMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getOptionList().get(0).getText(), "MEN\n" + "CLOTHING\n" + "Tops\n" + "Pants\n" + "Shorts\n" + "Jackets And Coats\n" +
                "Safety Masks\n" + "FOOTWEAR\n" + "Sneakers\n" + "Training Shoes\n" + "Running Shoes\n" + "Hiking Shoes\n" + "ACCESSORIES\n" + "Gloves\n" + "Belts\n" +
                "CAPS & HATS\n" + "Cap\n" + "SHAKERS\n" + "Water Bottles\n" + "Water Bottles\n" + "Socks\n" + "Towels\n" + "Sunglasses\n" + "Mixer\n" + "BAGS\n" + "Backpacks\n" +
                "Shoulder Bags\n" + "WEARABLE TECH\n" + "Watches\n" + "Gaming Accessories\n" + "EQUIPMENT\n" + "Grips\n" + "Balls\n" + "Rollers\n" + "Weights\n" + "WOMEN\n" +
                "CLOTHING\n" + "Tops\n" + "Shorts\n" + "Safety Masks\n" + "ACCESSORIES\n" + "GLOVES\n" + "Gloves\n" + "Belts\n" + "CAPS & HATS\n" + "Cap\n" + "SHAKERS\n" +
                "Water Bottles\n" + "Socks\n" + "Towels\n" + "Sunglasses\n" + "Mixer\n" + "BAGS\n" + "Backpacks\n" + "Shoulder Bags");
    }

    @Test(description = "Make sure the main categories in the Sports  menu Inside ShopBy Menu appearing in Bold Font", priority = 164)
    public void verifyTheMainCategoriesInTheSportsMenuInsideShopByMenuAppearingInBoldFont() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        Assert.assertTrue(aeMegamenuPage.getMenOptionInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getClothingInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getFootwearInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getAccessoriesInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getCapsAndHatsInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getShakersInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getBagsInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWearableTechInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.geEquipmentInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWomenInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWomenClothingInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWomenAccessoriesInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWomenGlovesInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWomenCapsAndHatsInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWomenShakersInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWomenBagsInSportsMenu().getCssValue("font-weight").contains("700"));

    }

    @Test(description = "Make sure the main categories in the Sports  menu Inside ShopBy Menu menu appearing in uppercase", priority = 165)
    public void verifyTheMainCategoriesInTheSportsMenuInsideShopByMenuAppearingInUppercase() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        Assert.assertEquals(aeMegamenuPage.getMenOptionInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getClothingInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getFootwearInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getAccessoriesInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getCapsAndHatsInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getShakersInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getBagsInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWearableTechInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.geEquipmentInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWomenInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWomenClothingInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWomenAccessoriesInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWomenGlovesInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWomenCapsAndHatsInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWomenShakersInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWomenBagsInSportsMenu().getCssValue("text-transform"), "uppercase");
    }

    @Test(description = "Make sure clicking on the Men Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 166)
    public void verifyClickingOnMenOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getMenOptionInSportsMenu()).perform();
        aeMegamenuPage.getMenOptionInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), menInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Clothing Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 167)
    public void verifyClickingOnClothingOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getClothingInSportsMenu()).perform();
        aeMegamenuPage.getClothingInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), clothingInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Tops Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 168)
    public void verifyClickingOnTopsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getTopsInSportsMenu()).perform();
        aeMegamenuPage.getTopsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), topsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Pants Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 169)
    public void verifyClickingOnPantsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getPantsInSportsMenu()).perform();
        aeMegamenuPage.getPantsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), pantsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Shorts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 170)
    public void verifyClickingOnShortsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getShortsInSportsMenu()).perform();
        aeMegamenuPage.getShortsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), shortsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Jackets And Coats Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 171)
    public void verifyClickingOnJacketsAndCoatsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getJacketsAndCoatsInSportsMenu()).perform();
        aeMegamenuPage.getJacketsAndCoatsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), jacketsAndCoatsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Safety Masks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 172)
    public void verifyClickingOnSafetyMasksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getSafetyMasksInSportsMenu()).perform();
        aeMegamenuPage.getSafetyMasksInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), safetyMasksInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Footwear Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 173)
    public void verifyClickingOnFootwearOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getFootwearInSportsMenu()).perform();
        aeMegamenuPage.getFootwearInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), footwearInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sneakers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 174)
    public void verifyClickingOnSneakersOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getSneakersInSportsMenu()).perform();
        aeMegamenuPage.getSneakersInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sneakersInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Training Shoes Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 175)
    public void verifyClickingOnTrainingShoesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getTrainingShoesInSportsMenu()).perform();
        aeMegamenuPage.getTrainingShoesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), trainingShoesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Running Shoes Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 176)
    public void verifyClickingOnRunningShoesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getRunningShoesInSportsMenu()).perform();
        aeMegamenuPage.getRunningShoesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), runningShoesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Hiking Shoes Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 177)
    public void verifyClickingOnHikingShoesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getHikingShoesInSportsMenu()).perform();
        aeMegamenuPage.getHikingShoesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), hikingShoesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Accessories Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 178)
    public void verifyClickingOnAccessoriesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getAccessoriesInSportsMenu()).perform();
        aeMegamenuPage.getAccessoriesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), accessoriesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Gloves Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 179)
    public void verifyClickingOnGlovesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getGlovesInSportsMenu()).perform();
        aeMegamenuPage.getGlovesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), glovesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Belts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 180)
    public void verifyClickingOnBeltsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBeltsInSportsMenu()).perform();
        aeMegamenuPage.getBeltsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), beltsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Caps And Hats Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 181)
    public void verifyClickingOnCapsAndHatsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getCapsAndHatsInSportsMenu()).perform();
        aeMegamenuPage.getCapsAndHatsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), capsAndHatsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Caps Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 182)
    public void verifyClickingOnCapsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getCapInSportsMenu()).perform();
        aeMegamenuPage.getCapInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), capInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Shakers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 183)
    public void verifyClickingOnShakersOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getShakersInSportsMenu()).perform();
        aeMegamenuPage.getShakersInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), shakersInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Water Bottles Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 184)
    public void verifyClickingOnWaterBottlesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWaterBottlesInSportsMenu()).perform();
        aeMegamenuPage.getWaterBottlesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), waterBottlesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    //Theres A Bug Here Due To Water Bottles Option Appearing Duplicated ut I added this test case to save the qoption position
    @Test(description = "Theres A Bug Here Due To Water Bottles Option Appearing Duplicated", priority = 185)
    public void theresABugHereDueToWaterBottlesOptionAppearingDuplicated() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBugHereInSportsMenu()).perform();
        aeMegamenuPage.getBugHereInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), "Theres A Bug Here Due To Water Bottles Option Appearing Duplicated");
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        System.out.println("Theres A Bug Here Due To Water Bottles Option Appearing Duplicated");
    }

    @Test(description = "Make sure clicking on the Socks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 186)
    public void verifyClickingOnSocksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getSocksInSportsMenu()).perform();
        aeMegamenuPage.getSocksInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), socksInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Towels Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 187)
    public void verifyClickingOnTowelsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getTowelsInSportsMenu()).perform();
        aeMegamenuPage.getTowelsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), towelsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sunglasses Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 188)
    public void verifyClickingOnSunglassesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getSunglassesInSportsMenu()).perform();
        aeMegamenuPage.getSunglassesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sunglassesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Mixer Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 189)
    public void verifyClickingOnMixterOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getMixerInSportsMenu()).perform();
        aeMegamenuPage.getMixerInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mixerInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 190)
    public void verifyClickingOnBagsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBagsInSportsMenu()).perform();
        aeMegamenuPage.getBagsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bagsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Back Packs Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 191)
    public void verifyClickingOnBackPacksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBackPacksInSportsMenu()).perform();
        aeMegamenuPage.getBackPacksInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), backPacksInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Shoulder Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 192)
    public void verifyClickingOnShoulderBagsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getShoulderBagsInSportsMenu()).perform();
        aeMegamenuPage.getShoulderBagsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), shoulderBagsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Wearable Tech Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 193)
    public void verifyClickingOnWearableTechOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWearableTechInSportsMenu()).perform();
        aeMegamenuPage.getWearableTechInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), wearableTechInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Watches Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 194)
    public void verifyClickingOnWatchesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWatchesInSportsMenu()).perform();
        aeMegamenuPage.getWatchesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), watchesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Gaming Accessories Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 195)
    public void verifyClickingOnGamingAccessoriesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getGamingAccessoriesInSportsMenu()).perform();
        aeMegamenuPage.getGamingAccessoriesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), gamingAccessoriesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Equipment Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 196)
    public void verifyClickingOnEquipmentOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.geEquipmentInSportsMenu()).perform();
        aeMegamenuPage.geEquipmentInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), equipmentInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Grips Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 197)
    public void verifyClickingOnGripstOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getGripsInSportsMenu()).perform();
        aeMegamenuPage.getGripsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), gripsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Balls Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 198)
    public void verifyClickingOnBallstOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBallsInSportsMenu()).perform();
        aeMegamenuPage.getBallsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ballsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Rollers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 199)
    public void verifyClickingOnRollerstOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getRollersInSportsMenu()).perform();
        aeMegamenuPage.getRollersInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), rollersInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Weights Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 200)
    public void verifyClickingOnWeightsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWeightsInSportsMenu()).perform();
        aeMegamenuPage.getWeightsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), weightsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 201)
    public void verifyClickingOnWomenOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenInSportsMenu()).perform();
        aeMegamenuPage.getWomenInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Clothing Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 202)
    public void verifyClickingOnWomenClothingOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenClothingInSportsMenu()).perform();
        aeMegamenuPage.getWomenClothingInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenClothingInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Tops Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 203)
    public void verifyClickingOnWomenTopsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenTopsInSportsMenu()).perform();
        aeMegamenuPage.getWomenTopsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenTopsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Shorts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 204)
    public void verifyClickingOnWomenShortsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenShortsInSportsMenu()).perform();
        aeMegamenuPage.getWomenShortsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenShortsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Safety Masks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 205)
    public void verifyClickingOnWomenSafetyMasksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSafetyMasksInSportsMenu()).perform();
        aeMegamenuPage.getWomenSafetyMasksInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenSafetyMasksInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Accessories Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 206)
    public void verifyClickingOnWomenAccessoriesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenAccessoriesInSportsMenu()).perform();
        aeMegamenuPage.getWomenAccessoriesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenAccessoriesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Theres A Bug Here Due To Gloves Option Appearing Duplicated", priority = 207)
    public void theresABugHereDueToGlovesOptionAppearingDuplicated() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBugGlovesInSportsMenu()).perform();
        aeMegamenuPage.getBugGlovesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), "Theres A Bug Here Due To Gloves Option Appearing Duplicated");
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        System.out.println("Theres A Bug Here Due To Gloves Option Appearing Duplicated");
    }

    @Test(description = "Make sure clicking on the Women Gloves Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 208)
    public void verifyClickingOnWomenGlovesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenGlovesInSportsMenu()).perform();
        aeMegamenuPage.getWomenGlovesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenGlovesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Belts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 209)
    public void verifyClickingOnWomenBeltsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenBeltsInSportsMenu()).perform();
        aeMegamenuPage.getWomenBeltsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenBeltsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Caps And Hats Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 210)
    public void verifyClickingOnWomenCapsAndHatsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenCapsAndHatsInSportsMenu()).perform();
        aeMegamenuPage.getWomenCapsAndHatsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenCapsAndHatsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Caps Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 211)
    public void verifyClickingOnWomenCapsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenCapsInSportsMenu()).perform();
        aeMegamenuPage.getWomenCapsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenCapsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Shakers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 212)
    public void verifyClickingOnWomenShakersOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenShakersInSportsMenu()).perform();
        aeMegamenuPage.getWomenShakersInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenShakersInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Water Bottles Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 213)
    public void verifyClickingOnWomenWaterBottlesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenWaterBottlesInSportsMenu()).perform();
        aeMegamenuPage.getWomenWaterBottlesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenWaterBottlesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Socks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 214)
    public void verifyClickingOnWomenSocksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSocksInSportsMenu()).perform();
        aeMegamenuPage.getWomenSocksInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenSocksInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Towels Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 215)
    public void verifyClickingOnWomenTowelsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenTowelsInSportsMenu()).perform();
        aeMegamenuPage.getWomenTowelsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenTowelsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Sunglasses Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 216)
    public void verifyClickingOnWomenSunglassesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSunglassesInSportsMenu()).perform();
        aeMegamenuPage.getWomenSunglassesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenSunglassesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Mixer Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 217)
    public void verifyClickingOnWomenMixerOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenMixerInSportsMenu()).perform();
        aeMegamenuPage.getWomenMixerInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenMixerInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");

    }

    @Test(description = "Make sure clicking on the Women Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 218)
    public void verifyClickingOnWomenBagsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenBagsInSportsMenu()).perform();
        aeMegamenuPage.getWomenBagsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenBagsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Back Packs Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 219)
    public void verifyClickingOnWomenBackPacksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenBackPacksInSportsMenu()).perform();
        aeMegamenuPage.getWomenBackPacksInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenBackPacksInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Women Sholders Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 220)
    public void verifyClickingOnWomenSholdersBagsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSholdersBagsInSportsMenu()).perform();
        aeMegamenuPage.getWomenSholdersBagsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenSholdersBagsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    ///// By Brand
    @Test(description = "Make sure clicking on the Supplements Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 221)
    public void verifyClickingOnSupplementsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getSupplementsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getSupplementsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), supplementsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Optimum Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 222)
    public void verifyClickingOnOptimumNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOptimumNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getOptimumNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), optimumNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Muscletech Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 223)
    public void verifyClickingOnMuscletechOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getMuscletechOptionInByBrandMenu()).perform();
        aeMegamenuPage.getMuscletechOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), muscletechInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Cellucor Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 224)
    public void verifyClickingOnCellucorOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getCellucorOptionInByBrandMenu()).perform();
        aeMegamenuPage.getCellucorOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), cellucorInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Dymatize Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 225)
    public void verifyClickingOnDymatizeOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getDymatizeOptionInByBrandMenu()).perform();
        aeMegamenuPage.getDymatizeOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), dymatizeInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Xtend Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 226)
    public void verifyClickingOnXtendOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getXtendOptionInByBrandMenu()).perform();
        aeMegamenuPage.getXtendOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), xtendInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Animal Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 227)
    public void verifyClickingOnAnimalNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getAnimalNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getAnimalNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), animalNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Muscle Pharm Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 228)
    public void verifyClickingOnMusclePharmOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getMusclePharmOptionInByBrandMenu()).perform();
        aeMegamenuPage.getMusclePharmOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), musclePharmInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Universal Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 229)
    public void verifyClickingOnUniversalNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getUniversalNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getUniversalNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), universalNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the BSN Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 230)
    public void verifyClickingOnBSNOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getBsnOptionInByBrandMenu()).perform();
        aeMegamenuPage.getBsnOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bsnInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the EHPLABS Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 231)
    public void verifyClickingOnEhplabsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getEhplabsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getEhplabsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ehplabsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Jym Supplement Science Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 232)
    public void verifyClickingOnJymSupplementScienceOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getJymSupplementScienceOptionInByBrandMenu()).perform();
        aeMegamenuPage.getJymSupplementScienceOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), jymSupplementScienceInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Bpi Sports Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 233)
    public void verifyClickingOnBpiSportsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getBpiSportsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getBpiSportsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bpiSportsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Russian Bear Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 234)
    public void verifyClickingOnRussianBearOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getRussianBearOptionInByBrandMenu()).perform();
        aeMegamenuPage.getRussianBearOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), russianBearInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Isopure Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 235)
    public void verifyClickingOnIsopureOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getIsopureOptionInByBrandMenu()).perform();
        aeMegamenuPage.getIsopureOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), isopureInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the 1 Up Nutrition  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 236)
    public void verifyClickingOnOneUpNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOneUpNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getOneUpNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), oneUpNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Musclemeds  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 237)
    public void verifyClickingOnMusclemedsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getMusclemedsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getMusclemedsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), musclemedInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the MHP  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 238)
    public void verifyClickingOnMhpOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.gethMhpOptionInByBrandMenu()).perform();
        aeMegamenuPage.gethMhpOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mhpInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Evl Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 239)
    public void verifyClickingOnEvlNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getEvlNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getEvlNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), evlNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Nla For Her Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 240)
    public void verifyClickingOnNlaForHerOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getNlaForHerOptionInByBrandMenu()).perform();
        aeMegamenuPage.getNlaForHerOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nlaForHerInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Muscle Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 241)
    public void verifyClickingOnMuscleNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getMuscleNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getMuscleNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), muscleNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Gat Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 242)
    public void verifyClickingOnGatNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getGatNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getGatNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), gatNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Labrada Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 243)
    public void verifyClickingOnLabradaOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getLabradaOptionInByBrandMenu()).perform();
        aeMegamenuPage.getLabradaOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), labradaInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Orgain Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 244)
    public void verifyClickingOnOrgainOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOrgainOptionInByBrandMenu()).perform();
        aeMegamenuPage.getOrgainOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), orgainInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Nutrex Research Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 245)
    public void verifyClickingOnNutrexResearchOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getNutrexResearchOptionInByBrandMenu()).perform();
        aeMegamenuPage.getNutrexResearchOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nutrexResearchInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Scitec Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 246)
    public void verifyClickingOnScitecNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getScitecNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getScitecNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), scitecNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Prolab Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 247)
    public void verifyClickingOnProlabOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getProlabOptionInByBrandMenu()).perform();
        aeMegamenuPage.getProlabOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), prolabInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the SOTRU Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 248)
    public void verifyClickingOnSotruOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getSotruOptionInByBrandMenu()).perform();
        aeMegamenuPage.getSotruOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sotruInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Divine Health Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 249)
    public void verifyClickingOnDivineHealthOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getDivineHealthOptionInByBrandMenu()).perform();
        aeMegamenuPage.getDivineHealthOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), divineHealthInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Ghost Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 250)
    public void verifyClickingOnGhostOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getGhostOptionInByBrandMenu()).perform();
        aeMegamenuPage.getGhostOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ghostInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Womens Best Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 251)
    public void verifyClickingOnWomensBestOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomensBestOptionInByBrandMenu()).perform();
        aeMegamenuPage.getWomensBestOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womensBestInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Efx Sports Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 252)
    public void verifyClickingOnEfxSportsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getEfxSportsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getEfxSportsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), efxSportsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Basix Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 253)
    public void verifyClickingOnBasixOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getBasixOptionInByBrandMenu()).perform();
        aeMegamenuPage.getBasixOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), basixInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the AK-47 Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 254)
    public void verifyClickingOnAK47OptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getAk47OptionInByBrandMenu()).perform();
        aeMegamenuPage.getAk47OptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ak47InByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Nf Sports Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 255)
    public void verifyClickingOnNfSportsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getNfSportsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getNfSportsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nfSportsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Fully Dosed Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 256)
    public void verifyClickingOnFullyDosedOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getFullyDosedOptionInByBrandMenu()).perform();
        aeMegamenuPage.getFullyDosedOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), fullyDosedInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the 5% Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 257)
    public void verifyClickingOnFivePercentNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getFivePercentNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getFivePercentNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), fivePercentNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Olimp Sport Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 258)
    public void verifyClickingOnOlimpSportNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOlimpSportNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getOlimpSportNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), olimpSportNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Jnx Sports Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 259)
    public void verifyClickingOnJnxSportsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getJnxSportsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getJnxSportsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), jnxSportsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Fit & Lean Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 260)
    public void verifyClickingOnFitAndLeanOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getFitAndLeanOptionInByBrandMenu()).perform();
        aeMegamenuPage.getFitAndLeanOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), fitAndLeanInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Gymqueen Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 261)
    public void verifyClickingOnGymqueenOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getGymqueenOptionInByBrandMenu()).perform();
        aeMegamenuPage.getGymqueenOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), gymqueenInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the The Pack Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 262)
    public void verifyClickingOnThePackOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getThePackOptionInByBrandMenu()).perform();
        aeMegamenuPage.getThePackOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), thePackInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Betancourt Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 263)
    public void verifyClickingOnBetancourtNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getBetancourtNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getBetancourtNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), betancourtNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Yalla Protein Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 264)
    public void verifyClickingOnYallaProteinOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getYallaProteinOptionInByBrandMenu()).perform();
        aeMegamenuPage.getYallaProteinOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), yallaProteinInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Protein World Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 265)
    public void verifyClickingOnProteinWorldOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getProteinWorldOptionInByBrandMenu()).perform();
        aeMegamenuPage.getProteinWorldOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinWorldInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Obvi Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 266)
    public void verifyClickingOnObviOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getObviOptionInByBrandMenu()).perform();
        aeMegamenuPage.getObviOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), obviInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Naughty Boy Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 267)
    public void verifyClickingOnNaughtyBoyOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getNaughtyBoyOptionInByBrandMenu()).perform();
        aeMegamenuPage.getNaughtyBoyOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), naughtyBoyInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Steel Fit Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 268)
    public void verifyClickingOnSteelFitOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getSteelFitOptionInByBrandMenu()).perform();
        aeMegamenuPage.getSteelFitOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), steelFitInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the USN Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 269)
    public void verifyClickingOnUsnOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getUsnOptionInByBrandMenu()).perform();
        aeMegamenuPage.getUsnOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), usnInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the X-Gamer Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 270)
    public void verifyClickingOnXGamerOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getXGamerOptionInByBrandMenu()).perform();
        aeMegamenuPage.getXGamerOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), xGamerInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Innosupps Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 271)
    public void verifyClickingOnInnosuppsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getInnosuppsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getInnosuppsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), innosuppsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Outbreak Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 272)
    public void verifyClickingOnOutbreakNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOutbreakNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getOutbreakNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), outbreakNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Insane Labz Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 273)
    public void verifyClickingOnInsaneLabzOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getInsaneLabzOptionInByBrandMenu()).perform();
        aeMegamenuPage.getInsaneLabzOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), insaneLabzInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the All Max Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 274)
    public void verifyClickingOnAllMaxOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getAllMaxOptionInByBrandMenu()).perform();
        aeMegamenuPage.getAllMaxOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), allMaxInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Glaxon Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 275)
    public void verifyClickingOnGlaxonOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getGlaxonOptionInByBrandMenu()).perform();
        aeMegamenuPage.getGlaxonOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), glaxonInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Redcon1 Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 276)
    public void verifyClickingOnRedconOneOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getRedcon1OptionInByBrandMenu()).perform();
        aeMegamenuPage.getRedcon1OptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), redcon1InByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Panda Supplements Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 277)
    public void verifyClickingOnPandaSupplementsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getPandaSupplementsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getPandaSupplementsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), pandaSupplementsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Nutrend Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 278)
    public void verifyClickingOnNutrendOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getNutrendOptionInByBrandMenu()).perform();
        aeMegamenuPage.getNutrendOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nutrendInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Ostrovit Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 279)
    public void verifyClickingOnOstrovitOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOstrovitOptionInByBrandMenu()).perform();
        aeMegamenuPage.getOstrovitOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ostrovitInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Bettery Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 280)
    public void verifyClickingOnBetteryOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getBetteryOptionInByBrandMenu()).perform();
        aeMegamenuPage.getBetteryOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), betteryInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Healthy Food, Snacks & Meal Replacement Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 281)
    public void verifyClickingOnHealthyFoodSnacksAndMealReplacementOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodSnacksAndMealReplacementOptionInByBrandMenu()).perform();
        aeMegamenuPage.getHealthyFoodSnacksAndMealReplacementOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyFoodSnacksAndMealReplacementInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Wow Hydrate Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 282)
    public void verifyClickingOnWowHydrateOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getWowHydrateOptionInByBrandMenu()).perform();
        aeMegamenuPage.getWowHydrateOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), wowHydrateInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Quest Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 283)
    public void verifyClickingOnQuestNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getQuestNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getQuestNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), questNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Grenade Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 284)
    public void verifyClickingOnGrenadeOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getGrenadeOptionInByBrandMenu()).perform();
        aeMegamenuPage.getGrenadeOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), grenadeInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Reign Energy Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 285)
    public void verifyClickingOnReignEnergyOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getReignEnergyOptionInByBrandMenu()).perform();
        aeMegamenuPage.getReignEnergyOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), reignEnergyInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Monster Energy Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 286)
    public void verifyClickingOnMonsterEnergyOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getMonsterEnergyOptionInByBrandMenu()).perform();
        aeMegamenuPage.getMonsterEnergyOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), monsterEnergyInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the 3d Energy  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 287)
    public void verifyClickingOnThirdEnergyOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getThirdEnergyOptionInByBrandMenu()).perform();
        aeMegamenuPage.getThirdEnergyOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), thirdEnergyInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    ///////SportSupplementsMainMenuTCs///////////////////
    @Test(description = "Make sure the Down-arrow Icon display correctly next to the Sport Supplements main menu", priority = 288)
    public void verifyTheDownArrowIconAppearsCorrectlyNextToTheSportSupplementsMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getDownArrowKeyInSportSupplementsMenu().isDisplayed());
    }

    @Test(description = "Make sure the system will display the sub Menu once hovering on the Sport Supplements main menu", priority = 289)
    public void verifyTheSubMenuWillAppearsCorrectlyOnceHoveringOnSportSupplementsMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }

    @Test(description = "Make sure the Sports Supplements main menu display the correct categories and sub-categories", priority = 290)
    public void verifySportsSupplementsMainMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getSportsSupplementMainMenuList().get(0).getText(), "PROTEIN\n" + "Whey Protein\n" + "Whey Protein Isolate\n" +
                "Protein Blends\n" + "Non-dairy Protein\n" + "Casein Protein\n" + "Diet Protein\n" + "Mass Gainers\n" + "CREATINE\n" +
                "Creatine Monohydrate\n" + "Creatine Blends\n" + "AMINO ACIDS\n" + "BCAA\n" + "EAA\n" + "Arginine\n" + "Beta Alanine\n" +
                "HMB\n" + "Amino Acid Powders\n" + "Amino Acid Pills\n" + "Citrulline\n" + "Amino Acid Liquids\n" + "MUSCLE BOOSTERS\n" +
                "Testosterone Boosters\n" + "Gh Boosters\n" + "WEIGHT MANAGEMENT\n" + "Stimulant Weight Loss\n" + "Non-stimulant Weight Loss\n" +
                "Meal Replacements\n" + "Metabolism Support\n" + "Toning Creams\n" + "MCT\n" + "RECOVERY\n" + "Glutamine\n" + "Recovery Blends\n" +
                "Electrolytes & Hydration\n" + "CARBOHYDRATES\n" + "Carbohydrate Powders\n" + "ENERGY & ENDURANCE\n" + "Stimulant Energy\n" +
                "Non-stimulant Energy\n" + "GAMING & FOCUS\n" + "Gaming Essentials");
    }

    @Test(description = "Make sure clicking on the Sports Supplements main menu will redirect the User to the correct URL", priority = 291)
    public void verifyClickingOnSportsSupplementsManiMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportSupplementsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure the main categories in the Sports Supplements main menu appearing in Bold Font", priority = 293)
    public void verifyTheMainCategoriesInTheSportsSupplementsMainMenuAppearingInBoldFont() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getProteinOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getCreatineOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertEquals(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertTrue(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getRecoveryOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
    }

    @Test(description = "Make sure the main categories in the Sports Supplements main menu appearing in uppercase", priority = 294)
    public void verifyTheMainCategoriesInTheSportsSupplementsMainMenuAppearingInUppercase() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertEquals(aeMegamenuPage.getProteinOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getCreatineOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getRecoveryOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
    }

    @Test(description = "Make sure clicking on the Protein option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 295)
    public void verifyClickingOnProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Whey Protein Option appearing in the Sports Supplements main menu  will redirect the User to the correct URL", priority = 296)
    public void verifyClickingOnWheyProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWheyProteinOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getWheyProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), wheyProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Whey Protein Isolate Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 297)
    public void verifyClickingOnWheyProteinIsolateOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), WheyProteinIsolateOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the protein Blends Option  appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 298)
    public void verifyClickingOnProteinBlendsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinBlendsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Non Dairy Protein Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 299)
    public void verifyClickingOnNonDairyProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nonDairyProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the casein Protein Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 300)
    public void verifyClickingOnCaseinProteinOptionInSportsSupplementsMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), caseinProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the diet Protein Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 301)
    public void verifyClickingOnDietProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDietProteinOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getDietProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), dietProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Mass Gainers Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 302)
    public void verifyClickingOnMassGainersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMassGainersOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getMassGainersOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), massGainersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Creatine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 303)
    public void verifyClickingOnCreatineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getCreatineOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), creatineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Creatine Monohydrate Option appearing in the Sports Supplements Main menu will redirect the User to the correct URL", priority = 304)
    public void verifyClickingOnCreatineMonohydrateOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), creatineMonohydrateOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Creatine Blends Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 305)
    public void verifyClickingOnCreatineBlendsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), creatineBlendsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Amino Acids Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 306)
    public void verifyClickingOnAminoAcidsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the BCAA Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 307)
    public void verifyClickingOnBCAAOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getbCAAOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getbCAAOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bCAAOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the EAA Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 308)
    public void verifyClickingOnEAAOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.geteAAOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.geteAAOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), eAAOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Arginine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 309)
    public void verifyClickingOnArginineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getArginineOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getArginineOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), arginineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Beta Alanine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 310)
    public void verifyClickingOnBetaAlanineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), betaAlanineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the HMB Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 311)
    public void verifyClickingOnHMbOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.gethMBOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.gethMBOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), hMBOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Amino Acid Powders Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 312)
    public void verifyClickingOnAminoAcidPowdersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidPowdersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Amino Acid Pills Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 313)
    public void verifyClickingOnAminoAcidPillsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidPillsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Citrulline Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 314)
    public void verifyClickingOnCitrullineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCitrullineOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getCitrullineOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), citrullineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Amino Acid Liquids Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 315)
    public void verifyClickingOnAminoAcidLiquidsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidLiquidsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Musclev Boosters Liquids Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 316)
    public void verifyClickingOnMuscleBoostersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), muscleBoostersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Testosterone Boosters Option appearing in the Sports Supplements main menu  will redirect the User to the correct URL", priority = 317)
    public void verifyClickingOnTestosteroneBoostersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), testosteroneBoostersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Gh Boosters Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 318)
    public void verifyClickingOnGhBoostersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGhBoostersOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getGhBoostersOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ghBoostersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Weight Management Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 319)
    public void verifyClickingOnWeightManagementOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getWeightManagementOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), weightManagementOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Stimulant Weight Loss Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 320)
    public void verifyClickingOnStimulantWeightLossOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), stimulantWeightLossOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Non Stimulant Weight Loss Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 321)
    public void verifyClickingOnNonStimulantWeightLossOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nonStimulantWeightLossOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Meal Replacements Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 322)
    public void verifyClickingOnMealReplacementsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mealReplacementsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Metabolism Support Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 323)
    public void verifyClickingOnMetabolismSupportOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), metabolismSupportOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Toning Creams Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 324)
    public void verifyClickingOnToningCreamsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getToningCreamsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getToningCreamsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), toningCreamsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the MCT Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 325)
    public void verifyClickingOnMctOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMctOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getMctOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mctOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Recovery Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 326)
    public void verifyClickingOnRecoveryOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRecoveryOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getRecoveryOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), recoveryOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Glutamine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 327)
    public void verifyClickingOnGlutamineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGlutamineOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getGlutamineOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), glutamineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Recovery Blend Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 328)
    public void verifyClickingOnRecoveryBlendOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), recoveryBlendOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Electrolytes And Hydration Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 329)
    public void verifyClickingOnElectrolytesAndHydrationOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), electrolytesAndHydrationOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Carbohydrates Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 330)
    public void verifyClickingOnCarbohydratesOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), carbohydratesOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Carbohydrate Powders Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 331)
    public void verifyClickingOnCarbohydratePowdersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), carbohydratePowdersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Energy And Endurance Powders Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 332)
    public void verifyClickingOnEnergyAndEnduranceOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), energyAndEnduranceOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Stimulant Energy Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 333)
    public void verifyClickingOnStimulantEnergyOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), stimulantEnergyOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Non Stimulant Energy Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 334)
    public void verifyClickingOnNonStimulantEnergyOptionInSportsSupplementsbMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nonStimulantEnergyOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Gaming And Focus Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 335)
    public void verifyClickingOnGamingAndFocusOptionInSportsSupplementsbMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), gamingAndFocusOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Gaming Essentials Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 336)
    public void verifyClickingOnGamingEssentialsOptionInSportsSupplementsbMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGamingEssentialsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getGamingEssentialsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), gamingEssentialsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    /////Vitamins & Health TCS////
    @Test(description = "Make sure the Down-arrow Icon display correctly next to the Vitamins & Health main menu", priority = 337)
    public void verifyTheDownArrowIconAppearsCorrectlyNextToTheVitaminsAndHealthMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getDownArrowKeyInVitaminsAndHealthMenu().isDisplayed());
    }

    @Test(description = "Make sure the system will display the sub Menu once hovering on the Vitamins & Health main menu", priority = 338)
    public void verifyTheSubMenuWillAppearsCorrectlyOnceHoveringOnVitaminsAndHealthMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }

    @Test(description = "Make sure the Vitamins & Health main menu display the correct categories and sub-categories", priority = 339)
    public void verifyVitaminsAndHealthMainMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getVitaminsAndHealthMainMenuList().get(0).getText(), "FEATURED\n" + "Alive! Vitamins\n" + "Sexual Health\n" + "ESSENTIAL VITAMINS\n" +
                "Folic Acid\n" + "Vitamin A\n" + "Vitamin B\n" + "Vitamin C\n" + "Vitamin D\n" + "Vitamin E\n" + "Vitamin K\n" + "MULTIVITAMINS\n" + "Vitamins For Kids\n" +
                "Multivitamins For Men\n" + "Multivitamins For Women\n" + "BONE & JOINT\n" + "Bone Health\n" + "Joint Health\n" + "BEAUTY\n" + "Collagen\n" + "Hair, Skin & Nails\n" +
                "FISH OIL & OMEGAS\n" + "Fish Oil\n" + "Omega 3 6 9\n" + "HEALTHY LIFESTYLE\n" + "Antioxidants\n" + "Blood Sugar Support\n" + "Brain Support\n" + "Heart Health\n" +
                "Detox & Cleanse\n" + "Energy Formulas\n" + "Eye Health\n" + "Herbs\n" + "Hormones Balance\n" + "Immune Support\n" + "Mens Health\n" + "Stress Relief\n" +
                "Sleep Support\n" + "Superfoods\n" + "Urinary Tract Support\n" + "Weight Management\n" + "Womens Health\n" + "DIGESTION\n" + "Digestive Support\n" + "Probiotics\n" +
                "SPORT VITAMINS\n" + "Amino Acids\n" + "MINERALS\n" + "Calcium\n" + "Iron\n" + "Magnesium\n" + "Multimineral Formulas\n" + "Zinc\n" + "Potassium\n" + "HEALTHY DRINKS\n" +
                "Drinkable Vitamins\n" + "PETS\n" + "Supplements & More");
    }

    @Test(description = "Make sure clicking on the Vitamins & Health main menu will redirect the User to the correct URL", priority = 340)
    public void verifyClickingOnVitaminsAndHealthManiMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(healthVitaminsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the FEATURED Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 341)
    public void verifyClickingOnFeaturedOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), featuredOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Alive Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 342)
    public void verifyClickingOnAliveVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aliveVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sexual Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 343)
    public void verifyClickingOnSexualHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSexualHealthOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getSexualHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sexualHealthOptionInVitaminsAndHealthUrl);
        System.out.println(webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Essential Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 344)
    public void verifyClickingOnEssentialVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), essentialVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Folic Acid Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 354)
    public void verifyClickingOnFolicAcidOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), folicAcidOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin A Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 355)
    public void verifyClickingOnVitaminAOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminAOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin B Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 356)
    public void verifyClickingOnVitaminBOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminBOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin C Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 357)
    public void verifyClickingOnVitaminCOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminCOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin D Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 358)
    public void verifyClickingOnVitaminDOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminDOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin E Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 359)
    public void verifyClickingOnVitaminEOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminEOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin K Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 360)
    public void verifyClickingOnVitaminKOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminKOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Multi Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 361)
    public void verifyClickingOnMultiVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), multiVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamins For Kids Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 362)
    public void verifyClickingOnVitaminsForKidsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForKidsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamins For Men Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 363)
    public void verifyClickingOnVitaminsForMenOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForMenOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamins For Women Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 364)
    public void verifyClickingOnVitaminsForWomenOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForWomenOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Bone And Joint Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 365)
    public void verifyClickingOnBoneAndJointOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), boneJointOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Bone Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 366)
    public void verifyClickingOnBoneHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), boneHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Joint Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 367)
    public void verifyClickingOnJointHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), jointHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Beauty Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 368)
    public void verifyClickingOnBeautyOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), beautyOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Collagen Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 369)
    public void verifyClickingOnCollagenOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), collagenOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Hair, Skin AndNails Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 370)
    public void verifyClickingOnHairSkinAndNailsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), hairSkinAndNailsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Fish Oil Omegas Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 371)
    public void verifyClickingOnFishOilOmegasOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), fishOilAndOmegasOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Fish Oil Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 372)
    public void verifyClickingOnFishOilOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), fishOilOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Omega369 Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 373)
    public void verifyClickingOnOmega369OptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), omegaMixOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Health Lifestyle Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 374)
    public void verifyClickingOnHealthLifestyleOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyLifestyleOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Antioxidants Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 375)
    public void verifyClickingOnAntioxidantsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), antioxidantOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Blood Sugar Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 376)
    public void verifyClickingOnBloodSugarSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bloodSugarSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Brain Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 377)
    public void verifyClickingOnBrainSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), brainSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Detox And Cleanse Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 378)
    public void verifyClickingOnDetoxAndCleanseOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), detoxCleanseOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Energy Formulas Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 379)
    public void verifyClickingOnEnergyFormulasOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), energyFormulasOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Eye Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 380)
    public void verifyClickingOnEyeHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), eyeHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Herbs Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 381)
    public void verifyClickingOnHerbsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), herbsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Hormones Balance Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 382)
    public void verifyClickingOnHormonesBalanceOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), hormonesBalanceOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Immune Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 382)
    public void verifyClickingOnImmuneSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), immuneSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Mens Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 383)
    public void verifyClickingOnMensHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mensHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Stress Relief Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 384)
    public void verifyClickingOnStressReliefOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), stressReliefOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sleep Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 385)
    public void verifyClickingOnSleepSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sleepSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Super Foods Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 386)
    public void verifyClickingOnSuperFoodsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), superFoodsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Urinary Tract Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 387)
    public void verifyClickingOnUrinaryTractSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), urinaryTractSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Weight Management Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 388)
    public void verifyClickingOnWeightManagementOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), weightManagementOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Womens Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 389)
    public void verifyClickingOnWomensHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womensHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Digestion Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 390)
    public void verifyClickingOnDigestionOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), digestionOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Digestion Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 391)
    public void verifyClickingOnDigestionSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), digestionSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Probiotics Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 392)
    public void verifyClickingOnProbioticsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), probioticsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sport Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 393)
    public void verifyClickingOnSportVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sportVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Amino Acid Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 394)
    public void verifyClickingOnAminoAcidOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Minerals Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 395)
    public void verifyClickingOnMineralsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mineralsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Calcium Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 396)
    public void verifyClickingOnCalciumOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), calciumOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Iron Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 397)
    public void verifyClickingOnIronOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getIronOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getIronOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ironOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Magnesium Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 398)
    public void verifyClickingOnMagnesiumOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), magnesiumOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Multi mineral Formulas Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 399)
    public void verifyClickingOnMultimineralFormulasOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), multimineralFormulasOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Zinc Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 400)
    public void verifyClickingOnZincOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getZincOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getZincOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), zincOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Potassium Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 401)
    public void verifyClickingOnPotassiumOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), potassiumOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Healthy Drinks Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 402)
    public void verifyClickingOnHealthyDrinksOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyDrinksOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Drinkable Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 403)
    public void verifyClickingOnDrinkableVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), drinkableVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Pets Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 404)
    public void verifyClickingOnPetsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPetsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getPetsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), petsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Supplements More Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 405)
    public void verifyClickingOnSupplementsMoreOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), supplementsMoreOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    ////HealthyFood Test Cases
    @Test(description = "Make sure the Down-arrow Icon display correctly next to the Healthy Food main menu", priority = 406)
    public void verifyTheDownArrowIconAppearsCorrectlyNextToTheHealthyFoodMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getDownArrowKeyInHealthyFoodMenu().isDisplayed());
    }

    @Test(description = "Make sure the system will display the sub Menu once hovering on the Healthy Food main menu", priority = 407)
    public void verifyTheSubMenuWillAppearsCorrectlyOnceHoveringOnHealthyFoodMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }

    @Test(description = "Make sure the Healthy Food main menu display the correct categories and sub-categories", priority = 408)
    public void verifyHealthFoodMainMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getHealthyFoodMainMenuList().get(0).getText(), "GROCERY\n" + "Baking & Cooking\n" + "Canned\n" + "Coffee\n" + "Condiments\n" +
                "Milk & Cream\n" + "Nuts & Oats\n" + "Oils\n" + "Pasta\n" + "Rice & Grains\n" + "Seasonings & Spices\n" + "Sugar & Sweeteners\n" + "Syrups\n" + "Tea & Herbs\n" +
                "Superfoods\n" + "Ready Mixes\n" + "Breakfast & Cereal\n" + "READY TO DRINK\n" + "Amino & Bcaas\n" + "Energy Drinks\n" + "Protein Shakes\n" + "Electrolytes & Hydration\n" +
                "HEALTHY SNACKS\n" + "Protein Bars\n" + "Cookies\n" + "Chips\n" + "Brownies & Pancakes\n" + "Snack Bars\n" + "Spreads\n" + "Other Healthy Snacks\n" + "READY TO EAT\n" +
                "Healthy Meals\n" + "FEATURED\n" + "Healthy Meal Replacement\n" + "Protein Coffee\n" + "Candies\n" + "Flavoring Agents\n" + "Keto Snacks\n" + "Manuka Honey\n" +
                "Meat Snacks");
    }

    @Test(description = "Make sure clicking on the Healthy Food main menu will redirect the User to the correct URL", priority = 409)
    public void verifyClickingOnHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(healthyFoodsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Grocery Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 410)
    public void verifyClickingOnGroceryOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGroceryOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getGroceryOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), groceryOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Baking And Cooking Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 411)
    public void verifyClickingOnBakingAndCookingOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bakingAndCookingOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Canned Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 412)
    public void verifyClickingOnCannedOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCannedOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getCannedOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), cannedOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Coffee Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 413)
    public void verifyClickingOnCoffeeOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCoffeeOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getCoffeeOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), coffeeOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Condiments Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 414)
    public void verifyClickingOnCondimentsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCondimentsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getCondimentsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), condimentsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Milk And Cream Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 415)
    public void verifyClickingOnMilkAndCreamOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), milkAndCreamOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Nuts And Oats Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 416)
    public void verifyClickingOnNutsAndOatsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nutsAndOatsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Oils Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 417)
    public void verifyClickingOnOilsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getOilsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getOilsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), oilsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Pasta Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 418)
    public void verifyClickingOnPastaOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPastaOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getPastaOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), pastaOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Rice And Grains Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 419)
    public void verifyClickingOnRiceAndGrainsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), riceAndGrainsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Seasonings And Spices Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 420)
    public void verifyClickingOnSeasoningsAndSpicesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), seasoningsAndSpicessOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sugar And Sweeteners Option appearing in the Healthy Food main menu inside ShopBy Menu will redirect the User to the correct URL", priority = 421)
    public void verifyClickingOnSugarSweetenersOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sugarAndSweetenersOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Syrups Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 422)
    public void verifyClickingOnSyrupsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSyrupsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getSyrupsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), syrupsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Tea And Herbs Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 423)
    public void verifyClickingOnTeaAndHerbsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), teaAndHerbsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Superfoods Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 424)
    public void verifyClickingOnSuperfoodsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), superFoodsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Ready Mixes Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 425)
    public void verifyClickingOnReadyMixesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getReadyMixesOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getReadyMixesOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), readyMixInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Breakfast And Cereal Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 426)
    public void verifyClickingOnBreakfastAndCerealOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), breakfastAndCerealInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Ready To Drink Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 427)
    public void verifyClickingOnReadyToDrinkOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), readyToDrinkInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Amino And Bcaas Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 428)
    public void verifyClickingOnAminoAndBcaasOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoBcaasInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Energy Drinks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 429)
    public void verifyClickingOnEnergyDrinksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), energyDrinksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Protein Shakes Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 430)
    public void verifyClickingOnProteinShakesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinShakesOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getProteinShakesOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinShakesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Electrolytes And Hydration Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 431)
    public void verifyClickingOnElectrolytesAndHydrationOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), electrolytesAndHydrationInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Healthy Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 432)
    public void verifyClickingOnHealthySnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthySnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Protein Bars Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 433)
    public void verifyClickingOnProteinBarsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinBarsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getProteinBarsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinBarsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Cookies Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 434)
    public void verifyClickingOnCookiesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCookiesOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getCookiesOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), cookiesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Chips Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 435)
    public void verifyClickingOnChipsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getChipsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getChipsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), chipsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Brownies And Pancakes Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 436)
    public void verifyClickingOnBrowniesAndPancakesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), browniesAndPancakesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Snack Bars Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 437)
    public void verifyClickingOnSnackBarsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSnackBarsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getSnackBarsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), snackBarsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Spreads Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 438)
    public void verifyClickingOnSpreadsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSpreadsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getSpreadsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), spreadsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Other Healthy Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 439)
    public void verifyClickingOnOtherHealthySnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), otherHealthySnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Ready To Eat Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 440)
    public void verifyClickingOnReadyToEatOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getReadyToEatOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getReadyToEatOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), readyToEatInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Healthy Meals Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 441)
    public void verifyClickingOnHealthyMealsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyMealsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Featured Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 442)
    public void verifyClickingOnFeaturedOptionInHealthyFoodMianMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFeaturedOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getFeaturedOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), featuredInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Healthy Meal Replacement Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 443)
    public void verifyClickingOnHealthyMealReplacementOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyMealReplacementInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Protein Coffee Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 444)
    public void verifyClickingOnProteinCoffeeOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinCoffeeInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Candies Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 445)
    public void verifyClickingOnCandiesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCandiesOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getCandiesOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), candiesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Flavoring Agents Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 446)
    public void verifyClickingOnFlavoringAgentsOptionOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), flavoringAgentsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Keto Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 447)
    public void verifyClickingOnKetoSnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ketoSnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Manuka Honey Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 448)
    public void verifyClickingOnManukaHoneyOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), manukaHoneyInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Meat Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 449)
    public void verifyClickingOnMeatSnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), meatSnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    ////Sports Test Cases
    @Test(description = "Make sure the Down-arrow Icon display correctly next to the Sports main menu", priority = 450)
    public void verifyTheDownArrowIconAppearsCorrectlyNextToTheSportsMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getDownArrowKeyInSportsMenu().isDisplayed());
    }

    @Test(description = "Make sure the system will display the sub Menu once hovering on the Sports main menu", priority = 451)
    public void verifyTheSubMenuWillAppearsCorrectlyOnceHoveringOnSportsMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }

    @Test(description = "Make sure the Sports main menu display the correct categories and sub-categories", priority = 452)
    public void verifySportsMainMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getSportsMainMenuList().get(0).getText(), "MEN\n" + "SPORT\n" + "Football\n" + "Basketball\n" + "Baseball\n" + "Running\n" +
                "Swimming\n" + "Yoga\n" + "Fitness And Training\n" + "MMA\n" + "Jiu Jitsu\n" + "Board Games\n" + "SPORTS TECH\n" + "Wearable Tech\n" + "Cameras\n" + "Phone Accessories\n" +
                "PERSONAL CARE\n" + "Showering\n" + "Shaving\n" + "Skin Care\n" + "Body Care\n" + "Oral Care\n" + "Therapy\n" + "Masks\n" + "FITNESS AND TRAINING\n" + "FITNESS EQUIPMENT\n" +
                "Skipping Ropes\n" + "Weight Belts\n" + "Scooters\n" + "TRAINING ACCESSORIES\n" + "Shakers & Bottles\n" + "Bags\n" + "Gloves\n" + "Braces & Sleeves\n" + "Mouthguard\n" +
                "APPAREL\n" + "SPORTSWEAR\n" + "Pants\n" + "Shorts\n" + "Hoodies\n" + "T-shirts\n" + "Tanks\n" + "FOOTWEAR\n" + "Sneakers\n" + "Training Shoes\n" + "Running Shoes\n" +
                "WOMEN\n" + "SPORTS TECH\n" + "Wearable Tech\n" + "Cameras\n" + "Phone Accessories\n" + "PERSONAL CARE\n" + "Showering\n" + "Skin Care\n" + "Body Care\n" +
                "Oral Care\n" + "Therapy\n" + "Masks\n" + "FITNESS AND TRAINING\n" + "TRAINING ACCESSORIES");
    }

    @Test(description = "Make sure clicking on the Sports main menu will redirect the User to the correct URL", priority = 453)
    public void verifyClickingOnSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        aeMegamenuPage.getSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Men Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 454)
    public void verifyClickingOnMenOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMenOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getMenOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), menInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sport Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 455)
    public void verifyClickingOnSportOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getSportOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sportInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Football Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 456)
    public void verifyClickingOnFootballOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFootballOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getFootballOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), footballInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Basketball Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 457)
    public void verifyClickingOnBasketballOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBasketballOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getBasketballOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), basketballInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Baseball Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 458)
    public void verifyClickingOnBaseballOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBaseballOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getBaseballOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), baseballInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Running Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 459)
    public void verifyClickingOnRunningOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRunningOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getRunningOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), runningInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Swimming Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 460)
    public void verifyClickingOnSwimmingOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSwimmingOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getSwimmingOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), swimmingInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Yoga Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 461)
    public void verifyClickingOnYogaOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getYogaOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getYogaOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), yogaInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Fitness And Training Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 462)
    public void verifyClickingOnFitnessAndTrainingOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFitnessAndTrainingOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getFitnessAndTrainingOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), fitnessAndTrainingInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the MMA Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 463)
    public void verifyClickingOnMmaOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMmaOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getMmaOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mmaInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Jiu Jitsu Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 464)
    public void verifyClickingOnJiuJitsuOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getJiuJitsuOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getJiuJitsuOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), jiuJitsuInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Board Games Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 465)
    public void verifyClickingOnBoardGamesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBoardGamesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getBoardGamesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), boardGamesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the SPORTS TECH Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 466)
    public void verifyClickingOnSportsTechOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsTechOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getSportsTechOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sportsTechInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Wearable Tech Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 467)
    public void verifyClickingOnWearableTechOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWearableTechOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWearableTechOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), wearableTechInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Cameras Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 468)
    public void verifyClickingOnCamerasOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCamerasOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getCamerasOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), camerasInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Phone Accessories Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 469)
    public void verifyClickingOnPhoneAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPhoneAccessoriesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getPhoneAccessoriesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), phoneAccessoriesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the PERSONAL CARE Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 470)
    public void verifyClickingOnPersonalCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPersonalCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getPersonalCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), personalCareInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Showering Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 471)
    public void verifyClickingOnShoweringOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getShoweringOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getShoweringOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), showeringInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Shaving Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 472)
    public void verifyClickingOnShavingOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getShavingOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getShavingOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), shavingInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Skin Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 473)
    public void verifyClickingOnSkinCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSkinCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getSkinCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), skinCareInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Body Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 474)
    public void verifyClickingOnBodyCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBodyCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getBodyCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bodyCareInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Oral Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 475)
    public void verifyClickingOnOralCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getOralCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getOralCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), oralCareInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Therapy Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 476)
    public void verifyClickingOnTherapyOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTherapyOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getTherapyOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), therapyInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Masks Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 477)
    public void verifyClickingOnMasksOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMasksOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getMasksOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), masksInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the FITNESS AND TRAINING Category Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 480)
    public void verifyClickingOnFitnessAndTrainingCategoryOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFitnessAndTrainingCategoryOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getFitnessAndTrainingCategoryOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), fitnessAndTrainingCategoryInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the FITNESS EQUIPMENT Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 481)
    public void verifyClickingOnFitnessEquipmentOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFitnessEquipmentOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getFitnessEquipmentOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), fitnessEquipmentInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Skipping Ropes Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 482)
    public void verifyClickingOnSkippingRopesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSkippingRopesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getSkippingRopesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), skippingRopesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Weight Belts Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 483)
    public void verifyClickingOnWeightBeltsOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWeightBeltsOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWeightBeltsOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), weightBeltsInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Scooters Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 484)
    public void verifyClickingOnScootersOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getScootersOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getScootersOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), scootersInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the TRAINING ACCESSORIES Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 485)
    public void verifyClickingOnTrainingAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTrainingAccessoriesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getTrainingAccessoriesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), trainingAccessoriesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Shakers & Bottles Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 486)
    public void verifyClickingOnShakersAndBottlesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getShakersAndBottlesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getShakersAndBottlesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), shakersBottlesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Bags Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 487)
    public void verifyClickingOnBagsOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBagsOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getBagsOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bagsInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Gloves Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 488)
    public void verifyClickingOnGlovesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGlovesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getGlovesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), glovesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Braces & Sleeves Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 489)
    public void verifyClickingOnBracesAndSleevesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBracesAndSleevesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getBracesAndSleevesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bracesSleevesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Mouthguard Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 490)
    public void verifyClickingOnMouthguardOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMouthguardOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getMouthguardOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mouthguardInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the APPAREL Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 491)
    public void verifyClickingOnApperalOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getApparelOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getApparelOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), apparelInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the SPORTSWEAR Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 492)
    public void verifyClickingOnSportswearOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportswearOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getSportswearOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sportsWearInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Pants Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 493)
    public void verifyClickingOnPantsOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPantsOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getPantsOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), pantsInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Shorts Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 494)
    public void verifyClickingOnShortsOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getShortsOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getShortsOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), shortsInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Hoodies Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 495)
    public void verifyClickingOnHoodiesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHoodiesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getHoodiesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), hoodiesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the T-Shirts Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 496)
    public void verifyClickingOnTShirtsOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.gettShirtsOptionInSportsMainMenu()).perform();
        aeMegamenuPage.gettShirtsOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), tShirtsInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Tanks Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 497)
    public void verifyClickingOnTanksOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTanksOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getTanksOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), tanksInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the FOOTWEAR Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 498)
    public void verifyClickingOnFootwearOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFootwearOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getFootwearOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), footwearInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sneakers Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 499)
    public void verifyClickingOnSneakersOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSneakersOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getSneakersOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sneakersInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Training Shoes Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 500)
    public void verifyClickingOnTrainingShoesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTrainingShoesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getTrainingShoesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), trainingShoesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Running Shoes Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 501)
    public void verifyClickingOnRunningShoesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRunnigShoesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getRunnigShoesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), runningShoesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the WOMEN Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 502)
    public void verifyClickingOnWomenOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the WOMEN SPORTS TECH Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 503)
    public void verifyClickingOnWomenSportsTechOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSportsTechOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenSportsTechOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenSportsTechInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the WOMEN Wearable Tech Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 504)
    public void verifyClickingOnWomenWearableTechOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenWearableTechOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenWearableTechOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenWearableTechInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the WOMEN Cameras Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 505)
    public void verifyClickingOnWomenCamerasOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenCamerasOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenCamerasOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenCamerasInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the WOMEN Phone Accessories Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 506)
    public void verifyClickingOnWomenPhoneAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenPhoneAccessoriesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenPhoneAccessoriesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenPhoneAccessoriesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the WOMEN PERSONAL CARE Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 507)
    public void verifyClickingOnWomenPersonalCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenPersonalCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenPersonalCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenPersonalCareInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the WOMEN Showering Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 508)
    public void verifyClickingOnWomenShoweringOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenShoweringOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenShoweringOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenShoweringInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the WOMEN Skin Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 509)
    public void verifyClickingOnWomenSkinCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSkinCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenSkinCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenSkinCareInSportsMainMenuUrll);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the WOMEN Body Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 510)
    public void verifyClickingOnWomenBodyCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenBodyCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenBodyCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenBodyCareInSportsMainMenuUrll);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the WOMEN Oral Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 511)
    public void verifyClickingOnWomenOralCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenOralCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenOralCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenOralCareInSportsMainMenuUrll);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the WOMEN Therapy Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 512)
    public void verifyClickingOnWomenTherapyOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenTherapyOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenTherapyOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenTherapyInSportsMainMenuUrll);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the WOMEN Masks Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 513)
    public void verifyClickingOnWomenMasksOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenMasksOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenMasksOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenMasksInSportsMainMenuUrll);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the WOMEN FITNESS AND TRAINING Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 514)
    public void verifyClickingOnWomenFitnessAndTrainingOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenFitnessAndTrainingOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenFitnessAndTrainingOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenFitnessAndTrainingInSportsMainMenuUrll);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the WOMEN TRAINING ACCESSORIES Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 515)
    public void verifyClickingOnWomenTrainingAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenTrainingAccessoriesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenTrainingAccessoriesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenTrainingAccessoriesInSportsMainMenuUrll);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    //Women's Only Test Cases
    @Test(description = "Make sure clicking on the Women's Only main menu will redirect the User to the correct URL", priority = 516)
    public void verifyClickingOnWomensOnlyMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getWomenOnlyMainMenu()).perform();
        aeMegamenuPage.getWomenOnlyMainMenu().click();
        DataHelperAndWait.implicitWait(3);
        Assert.assertEquals(webDriver.getCurrentUrl(), womenOnlyUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    //The following test cases to handle (#8456 - Main menu not working when you try to open it from OOS product page)
    @Test(description = "Make sure the ShopBy menu is displayed when hovering on it from OOS Product page ", priority = 517)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromOosProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(outOfStockProduct);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }

    @Test(description = "Make sure the Sport Supplements menu is displayed when hovering on it from OOS Product page ", priority = 518)
    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromOosProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(outOfStockProduct);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSupplementsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }

    @Test(description = "Make sure the Vitamins & Health menu is displayed when hovering on it from OOS Product page ", priority = 519)
    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromOosProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(outOfStockProduct);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getVitaminsAndHealthSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }

    @Test(description = "Make sure the Healthy Food menu is displayed when hovering on it from OOS Product page ", priority = 520)
    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromOosProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(outOfStockProduct);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getHealthyFoodSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }

    @Test(description = "Make sure the Sports menu is displayed when hovering on it from OOS Product page ", priority = 521)
    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromOosProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(outOfStockProduct);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }

    //The following Test Cases handle displaying the Mega Menu from Product Page
    @Test(description = "Make sure the ShopBy menu is displayed when hovering on it from OOS Product page ", priority = 522)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(product);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
    }

    @Test(description = "Make sure the Sport Supplements menu is displayed when hovering on it from OOS Product page ", priority = 523)
    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(product);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSupplementsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
    }

    @Test(description = "Make sure the Vitamins & Health menu is displayed when hovering on it from OOS Product page ", priority = 524)
    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(product);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getVitaminsAndHealthSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }

    @Test(description = "Make sure the Healthy Food menu is displayed when hovering on it from Product page ", priority = 525)
    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(product);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getHealthyFoodSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }

    @Test(description = "Make sure the Sports menu is displayed when hovering on it from Product page ", priority = 526)
    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(product);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }
}