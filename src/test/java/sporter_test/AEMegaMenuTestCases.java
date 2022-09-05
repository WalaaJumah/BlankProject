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
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Sports Supplements sub menu is missing");
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Vitamins And Health sub menu is missing");
        action.moveToElement(aeMegamenuPage.getHealthFoodOption()).perform();
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Health Food sub menu is missing");
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Sports sub menu is missing");
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        Assert.assertTrue(aeMegamenuPage.getByBrandSubMenuSection().isDisplayed(), "The By Brand sub menu is missing");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
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
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Folic Acid Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFolicAcidOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), folicAcidOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin A Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminAOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminAOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin B Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminBOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminBOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin C Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminCOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminCOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin D Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminDOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminDOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin E Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminEOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminEOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin K Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminKOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminKOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Multi Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMultiVitaminsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), multiVitaminsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamins For Kids Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminsForKidsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForKidsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamins For Men Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminsForMenOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForMenOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamins For Women Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminsForWomenOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForWomenOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Bone And Joint Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBoneAndJointOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), boneJointOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Bone Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBoneHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), boneHealthOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Joint Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnJointHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), jointHealthOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Beauty Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBeautyOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), beautyOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Collagen Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCollagenOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), collagenOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Hair, Skin AndNails Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHairSkinAndNailsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), hairSkinAndNailsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Fish Oil Omegas Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFishOilOmegasOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), fishOilAndOmegasOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Fish Oil Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFishOilOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), fishOilOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Omega369 Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnOmega369OptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), omegaMixOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Health Lifestyle Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHealthLifestyleOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyLifestyleOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Antioxidants Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnAntioxidantsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), antioxidantOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Blood Sugar Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBloodSugarSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bloodSugarSupportOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Brain Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBrainSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), brainSupportOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Detox And Cleanse Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnDetoxAndCleanseOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), detoxCleanseOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Energy Formulas Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnEnergyFormulasOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), energyFormulasOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Eye Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnEyeHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), eyeHealthOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Herbs Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHerbsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), herbsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Hormones Balance Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHormonesBalanceOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), hormonesBalanceOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Immune Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnImmuneSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), immuneSupportOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Mens Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMensHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mensHealthOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Stress Relief Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnStressReliefOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), stressReliefOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sleep Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSleepSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sleepSupportOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Super Foods Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSuperFoodsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), superFoodsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Urinary Tract Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnUrinaryTractSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), urinaryTractSupportOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Weight Management Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWeightManagementOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), weightManagementOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Womens Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomensHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womensHealthOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Digestion Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnDigestionOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), digestionOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Digestion Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnDigestionSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), digestionSupportOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Probiotics Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnProbioticsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), probioticsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Sport Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSportVitaminsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sportVitaminsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Amino Acid Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnAminoAcidOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Minerals Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMineralsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mineralsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Calcium Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCalciumOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), calciumOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Iron Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnIronOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getIronOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getIronOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ironOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Magnesium Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMagnesiumOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), magnesiumOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Multi mineral Formulas Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMultimineralFormulasOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), multimineralFormulasOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Zinc Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnZincOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getZincOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getZincOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), zincOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Potassium Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnPotassiumOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), potassiumOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Healthy Drinks Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHealthyDrinksOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyDrinksOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Drinkable Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnDrinkableVitaminsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), drinkableVitaminsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Pets Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnPetsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getPetsOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getPetsOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), petsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Supplements More Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSupplementsMoreOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMenu()).perform();
        aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), supplementsMoreOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure the Healthy Food menu Inside ShopBy Menu display the correct categories and sub-categories", priority = 62)
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

    @Test(description = "Make sure clicking on the Grocery Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnGroceryOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getGroceryOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getGroceryOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), groceryOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Baking And Cooking Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBakingAndCookingOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bakingAndCookingOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Canned Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCannedOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getCannedOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getCannedOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), cannedOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Coffee Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCoffeeOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getCoffeeOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getCoffeeOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), coffeeOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Condiments Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCondimentsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getCondimentsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getCondimentsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), condimentsOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Milk And Cream Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMilkAndCreamOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), milkAndCreamOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Nuts And Oats Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnNutsAndOatsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nutsAndOatsOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Oils Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnOilsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getOilsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getOilsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), oilsOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Pasta Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnPastaOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getPastaOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getPastaOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), pastaOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Rice And Grains Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnRiceAndGrainsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), riceAndGrainsOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Seasonings And Spices Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSeasoningsAndSpicesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), seasoningsAndSpicessOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Sugar And Sweeteners Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSugarSweetenersOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sugarAndSweetenersOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Syrups Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSyrupsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSyrupsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getSyrupsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), syrupsOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Tea And Herbs Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnTeaAndHerbsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), teaAndHerbsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Superfoods Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSuperfoodsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), superFoodsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Ready Mixes Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnReadyMixesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getReadyMixesOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getReadyMixesOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), readyMixInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Breakfast And Cereal Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBreakfastAndCerealOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), breakfastAndCerealInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Ready To Drink Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnReadyToDrinkOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), readyToDrinkInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Amino And Bcaas Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnAminoAndBcaasOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoBcaasInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Energy Drinks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnEnergyDrinksOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), energyDrinksInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Protein Shakes Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnProteinShakesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getProteinShakesOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getProteinShakesOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinShakesInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Electrolytes And Hydration Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnElectrolytesAndHydrationOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), electrolytesAndHydrationInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Healthy Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHealthySnacksOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthySnacksInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Protein Bars Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnProteinBarsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getProteinBarsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getProteinBarsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinBarsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Cookies Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCookiesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getCookiesOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getCookiesOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), cookiesInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Chips Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnChipsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getChipsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getChipsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), chipsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Brownies And Pancakes Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBrowniesAndPancakesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), browniesAndPancakesInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Snack Bars Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSnackBarsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSnackBarsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getSnackBarsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), snackBarsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Spreads Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSpreadsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSpreadsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getSpreadsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), spreadsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Other Healthy Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnOtherHealthySnacksOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), otherHealthySnacksInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Ready To Eat Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnReadyToEatOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getReadyToEatOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getReadyToEatOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), readyToEatInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Healthy Meals Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHealthyMealsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyMealsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Featured Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFeaturedOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getFeaturedOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getFeaturedOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), featuredInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Healthy Meal Replacement Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHealthyMealReplacementOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyMealReplacementInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Protein Coffee Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnProteinCoffeeOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinCoffeeInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Candies Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCandiesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getCandiesOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getCandiesOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), candiesInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Flavoring Agents Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFlavoringAgentsOptionOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), flavoringAgentsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Keto Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnKetoSnacksOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ketoSnacksInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Manuka Honey Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnManukaHoneyOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), manukaHoneyInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Meat Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMeatSnacksOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMenu()).perform();
        aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), meatSnacksInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure the Sports menu Inside ShopBy Menu display the correct categories and sub-categories", priority = 62)
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
    @Test(description = "Make sure the main categories in the Sports  menu Inside ShopBy Menu appearing in Bold Font", priority = 18)
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
    @Test(description = "Make sure the main categories in the Sports  menu Inside ShopBy Menu menu appearing in uppercase", priority = 19)
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
    @Test(description = "Make sure clicking on the Men Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMenOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getMenOptionInSportsMenu()).perform();
        aeMegamenuPage.getMenOptionInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), menInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Clothing Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnClothingOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getClothingInSportsMenu()).perform();
        aeMegamenuPage.getClothingInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), clothingInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Tops Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnTopsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getTopsInSportsMenu()).perform();
        aeMegamenuPage.getTopsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), topsInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Pants Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnPantsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getPantsInSportsMenu()).perform();
        aeMegamenuPage.getPantsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), pantsInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Shorts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnShortsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getShortsInSportsMenu()).perform();
        aeMegamenuPage.getShortsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), shortsInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Jackets And Coats Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnJacketsAndCoatsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getJacketsAndCoatsInSportsMenu()).perform();
        aeMegamenuPage.getJacketsAndCoatsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), jacketsAndCoatsInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Safety Masks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSafetyMasksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getSafetyMasksInSportsMenu()).perform();
        aeMegamenuPage.getSafetyMasksInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), safetyMasksInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Footwear Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFootwearOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getFootwearInSportsMenu()).perform();
        aeMegamenuPage.getFootwearInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), footwearInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Sneakers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSneakersOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getSneakersInSportsMenu()).perform();
        aeMegamenuPage.getSneakersInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sneakersInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Training Shoes Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnTrainingShoesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getTrainingShoesInSportsMenu()).perform();
        aeMegamenuPage.getTrainingShoesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), trainingShoesInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Running Shoes Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnRunningShoesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getRunningShoesInSportsMenu()).perform();
        aeMegamenuPage.getRunningShoesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), runningShoesInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Hiking Shoes Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHikingShoesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getHikingShoesInSportsMenu()).perform();
        aeMegamenuPage.getHikingShoesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), hikingShoesInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Accessories Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnAccessoriesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getAccessoriesInSportsMenu()).perform();
        aeMegamenuPage.getAccessoriesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), accessoriesInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Gloves Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnGlovesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getGlovesInSportsMenu()).perform();
        aeMegamenuPage.getGlovesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), glovesInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Belts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBeltsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBeltsInSportsMenu()).perform();
        aeMegamenuPage.getBeltsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), beltsInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Caps And Hats Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCapsAndHatsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getCapsAndHatsInSportsMenu()).perform();
        aeMegamenuPage.getCapsAndHatsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), capsAndHatsInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Caps Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCapsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getCapInSportsMenu()).perform();
        aeMegamenuPage.getCapInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), capInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Shakers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnShakersOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getShakersInSportsMenu()).perform();
        aeMegamenuPage.getShakersInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), shakersInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Water Bottles Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWaterBottlesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWaterBottlesInSportsMenu()).perform();
        aeMegamenuPage.getWaterBottlesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), waterBottlesInSportsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //Theres A Bug Here Due To Water Bottles Option Appearing Duplicated ut I added this test case to save the qoption position
    @Test(description = "Theres A Bug Here Due To Water Bottles Option Appearing Duplicated", priority = 68)
    public void theresABugHereDueToWaterBottlesOptionAppearingDuplicated() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBugHereInSportsMenu()).perform();
        aeMegamenuPage.getBugHereInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),"Theres A Bug Here Due To Water Bottles Option Appearing Duplicated" );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        System.out.println("Theres A Bug Here Due To Water Bottles Option Appearing Duplicated");
    }
    @Test(description = "Make sure clicking on the Socks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSocksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getSocksInSportsMenu()).perform();
        aeMegamenuPage.getSocksInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),socksInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Towels Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnTowelsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getTowelsInSportsMenu()).perform();
        aeMegamenuPage.getTowelsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),towelsInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Sunglasses Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSunglassesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getSunglassesInSportsMenu()).perform();
        aeMegamenuPage.getSunglassesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),sunglassesInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Mixer Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMixterOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getMixerInSportsMenu()).perform();
        aeMegamenuPage.getMixerInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),mixerInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBagsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBagsInSportsMenu()).perform();
        aeMegamenuPage.getBagsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),bagsInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Back Packs Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBackPacksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBackPacksInSportsMenu()).perform();
        aeMegamenuPage.getBackPacksInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),backPacksInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Shoulder Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnShoulderBagsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getShoulderBagsInSportsMenu()).perform();
        aeMegamenuPage.getShoulderBagsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),shoulderBagsInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Wearable Tech Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWearableTechOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWearableTechInSportsMenu()).perform();
        aeMegamenuPage.getWearableTechInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),wearableTechInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Watches Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWatchesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWatchesInSportsMenu()).perform();
        aeMegamenuPage.getWatchesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),watchesInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Gaming Accessories Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnGamingAccessoriesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getGamingAccessoriesInSportsMenu()).perform();
        aeMegamenuPage.getGamingAccessoriesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),gamingAccessoriesInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Equipment Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnEquipmentOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.geEquipmentInSportsMenu()).perform();
        aeMegamenuPage.geEquipmentInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),equipmentInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Grips Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnGripstOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getGripsInSportsMenu()).perform();
        aeMegamenuPage.getGripsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),gripsInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Balls Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBallstOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBallsInSportsMenu()).perform();
        aeMegamenuPage.getBallsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),ballsInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Rollers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnRollerstOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getRollersInSportsMenu()).perform();
        aeMegamenuPage.getRollersInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),rollersInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Weights Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWeightsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWeightsInSportsMenu()).perform();
        aeMegamenuPage.getWeightsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),weightsInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenInSportsMenu()).perform();
        aeMegamenuPage.getWomenInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Clothing Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenClothingOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenClothingInSportsMenu()).perform();
        aeMegamenuPage.getWomenClothingInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenClothingInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Tops Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenTopsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenTopsInSportsMenu()).perform();
        aeMegamenuPage.getWomenTopsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenTopsInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Shorts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenShortsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenShortsInSportsMenu()).perform();
        aeMegamenuPage.getWomenShortsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenShortsInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Safety Masks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenSafetyMasksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSafetyMasksInSportsMenu()).perform();
        aeMegamenuPage.getWomenSafetyMasksInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenSafetyMasksInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Accessories Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenAccessoriesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenAccessoriesInSportsMenu()).perform();
        aeMegamenuPage.getWomenAccessoriesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenAccessoriesInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Theres A Bug Here Due To Gloves Option Appearing Duplicated", priority = 68)
    public void theresABugHereDueToGlovesOptionAppearingDuplicated() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBugGlovesInSportsMenu()).perform();
        aeMegamenuPage.getBugGlovesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),"Theres A Bug Here Due To Gloves Option Appearing Duplicated" );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        System.out.println("Theres A Bug Here Due To Gloves Option Appearing Duplicated");
    }
    @Test(description = "Make sure clicking on the Women Gloves Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenGlovesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenGlovesInSportsMenu()).perform();
        aeMegamenuPage.getWomenGlovesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenGlovesInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Belts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenBeltsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenBeltsInSportsMenu()).perform();
        aeMegamenuPage.getWomenBeltsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenBeltsInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Caps And Hats Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenCapsAndHatsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenCapsAndHatsInSportsMenu()).perform();
        aeMegamenuPage.getWomenCapsAndHatsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenCapsAndHatsInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Caps Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenCapsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenCapsInSportsMenu()).perform();
        aeMegamenuPage.getWomenCapsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenCapsInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Shakers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenShakersOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenShakersInSportsMenu()).perform();
        aeMegamenuPage.getWomenShakersInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenShakersInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Water Bottles Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenWaterBottlesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenWaterBottlesInSportsMenu()).perform();
        aeMegamenuPage.getWomenWaterBottlesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenWaterBottlesInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Socks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenSocksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSocksInSportsMenu()).perform();
        aeMegamenuPage.getWomenSocksInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenSocksInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Towels Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenTowelsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenTowelsInSportsMenu()).perform();
        aeMegamenuPage.getWomenTowelsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenTowelsInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Sunglasses Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenSunglassesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSunglassesInSportsMenu()).perform();
        aeMegamenuPage.getWomenSunglassesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenSunglassesInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Mixer Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenMixerOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenMixerInSportsMenu()).perform();
        aeMegamenuPage.getWomenMixerInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenMixerInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenBagsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenBagsInSportsMenu()).perform();
        aeMegamenuPage.getWomenBagsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenBagsInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Back Packs Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenBackPacksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenBackPacksInSportsMenu()).perform();
        aeMegamenuPage.getWomenBackPacksInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenBackPacksInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women Sholders Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenSholdersBagsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSholdersBagsInSportsMenu()).perform();
        aeMegamenuPage.getWomenSholdersBagsInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenSholdersBagsInSportsMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    ///// By Brand
    @Test(description = "Make sure clicking on the Supplements Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSupplementsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getSupplementsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getSupplementsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),supplementsInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Optimum Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnOptimumNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOptimumNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getOptimumNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),optimumNutritionInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Muscletech Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMuscletechOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getMuscletechOptionInByBrandMenu()).perform();
        aeMegamenuPage.getMuscletechOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),muscletechInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Cellucor Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCellucorOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getCellucorOptionInByBrandMenu()).perform();
        aeMegamenuPage.getCellucorOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),cellucorInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Dymatize Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnDymatizeOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getDymatizeOptionInByBrandMenu()).perform();
        aeMegamenuPage.getDymatizeOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),dymatizeInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Xtend Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnXtendOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getXtendOptionInByBrandMenu()).perform();
        aeMegamenuPage.getXtendOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),xtendInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Animal Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnAnimalNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getAnimalNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getAnimalNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),animalNutritionInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Muscle Pharm Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMusclePharmOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getMusclePharmOptionInByBrandMenu()).perform();
        aeMegamenuPage.getMusclePharmOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),musclePharmInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Universal Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnUniversalNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getUniversalNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getUniversalNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),universalNutritionInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the BSN Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBSNOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getBsnOptionInByBrandMenu()).perform();
        aeMegamenuPage.getBsnOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),bsnInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the EHPLABS Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnEhplabsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getEhplabsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getEhplabsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),ehplabsInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Jym Supplement Science Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnJymSupplementScienceOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getJymSupplementScienceOptionInByBrandMenu()).perform();
        aeMegamenuPage.getJymSupplementScienceOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),jymSupplementScienceInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Bpi Sports Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBpiSportsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getBpiSportsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getBpiSportsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),bpiSportsInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Russian Bear Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnRussianBearOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getRussianBearOptionInByBrandMenu()).perform();
        aeMegamenuPage.getRussianBearOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),russianBearInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Isopure Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnIsopureOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getIsopureOptionInByBrandMenu()).perform();
        aeMegamenuPage.getIsopureOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),isopureInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the 1 Up Nutrition  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnOneUpNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOneUpNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getOneUpNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),oneUpNutritionInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Musclemeds  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMusclemedsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getMusclemedsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getMusclemedsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),musclemedInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the MHP  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMhpOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.gethMhpOptionInByBrandMenu()).perform();
        aeMegamenuPage.gethMhpOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),mhpInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Evl Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnEvlNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getEvlNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getEvlNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),evlNutritionInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Nla For Her Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnNlaForHerOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getNlaForHerOptionInByBrandMenu()).perform();
        aeMegamenuPage.getNlaForHerOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),nlaForHerInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Muscle Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMuscleNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getMuscleNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getMuscleNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),muscleNutritionInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Gat Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnGatNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getGatNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getGatNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),gatNutritionInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Labrada Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnLabradaOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getLabradaOptionInByBrandMenu()).perform();
        aeMegamenuPage.getLabradaOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),labradaInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Orgain Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnOrgainOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOrgainOptionInByBrandMenu()).perform();
        aeMegamenuPage.getOrgainOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),orgainInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Nutrex Research Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnNutrexResearchOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getNutrexResearchOptionInByBrandMenu()).perform();
        aeMegamenuPage.getNutrexResearchOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),nutrexResearchInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Scitec Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnScitecNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getScitecNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getScitecNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),scitecNutritionInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Prolab Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnProlabOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getProlabOptionInByBrandMenu()).perform();
        aeMegamenuPage.getProlabOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),prolabInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the SOTRU Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSotruOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getSotruOptionInByBrandMenu()).perform();
        aeMegamenuPage.getSotruOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),sotruInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Divine Health Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnDivineHealthOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getDivineHealthOptionInByBrandMenu()).perform();
        aeMegamenuPage.getDivineHealthOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),divineHealthInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Ghost Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnGhostOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getGhostOptionInByBrandMenu()).perform();
        aeMegamenuPage.getGhostOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),ghostInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Womens Best Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomensBestOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomensBestOptionInByBrandMenu()).perform();
        aeMegamenuPage.getWomensBestOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womensBestInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Efx Sports Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnEfxSportsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getEfxSportsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getEfxSportsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),efxSportsInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Basix Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBasixOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getBasixOptionInByBrandMenu()).perform();
        aeMegamenuPage.getBasixOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),basixInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the AK-47 Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnAK47OptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getAk47OptionInByBrandMenu()).perform();
        aeMegamenuPage.getAk47OptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),ak47InByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Nf Sports Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnNfSportsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getNfSportsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getNfSportsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),nfSportsInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Fully Dosed Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFullyDosedOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getFullyDosedOptionInByBrandMenu()).perform();
        aeMegamenuPage.getFullyDosedOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),fullyDosedInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the 5% Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFivePercentNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getFivePercentNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getFivePercentNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),fivePercentNutritionInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Olimp Sport Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnOlimpSportNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOlimpSportNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getOlimpSportNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),olimpSportNutritionInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Jnx Sports Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnJnxSportsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getJnxSportsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getJnxSportsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),jnxSportsInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Fit & Lean Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFitAndLeanOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getFitAndLeanOptionInByBrandMenu()).perform();
        aeMegamenuPage.getFitAndLeanOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),fitAndLeanInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Gymqueen Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnGymqueenOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getGymqueenOptionInByBrandMenu()).perform();
        aeMegamenuPage.getGymqueenOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),gymqueenInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the The Pack Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnThePackOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getThePackOptionInByBrandMenu()).perform();
        aeMegamenuPage.getThePackOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),thePackInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Betancourt Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBetancourtNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getBetancourtNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getBetancourtNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),betancourtNutritionInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Yalla Protein Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnYallaProteinOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getYallaProteinOptionInByBrandMenu()).perform();
        aeMegamenuPage.getYallaProteinOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),yallaProteinInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Protein World Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnProteinWorldOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getProteinWorldOptionInByBrandMenu()).perform();
        aeMegamenuPage.getProteinWorldOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),proteinWorldInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Obvi Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnObviOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getObviOptionInByBrandMenu()).perform();
        aeMegamenuPage.getObviOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),obviInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Naughty Boy Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnNaughtyBoyOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getNaughtyBoyOptionInByBrandMenu()).perform();
        aeMegamenuPage.getNaughtyBoyOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),naughtyBoyInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Steel Fit Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSteelFitOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getSteelFitOptionInByBrandMenu()).perform();
        aeMegamenuPage.getSteelFitOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),steelFitInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the USN Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnUsnOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getUsnOptionInByBrandMenu()).perform();
        aeMegamenuPage.getUsnOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),usnInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the X-Gamer Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnXGamerOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getXGamerOptionInByBrandMenu()).perform();
        aeMegamenuPage.getXGamerOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),xGamerInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Innosupps Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnInnosuppsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getInnosuppsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getInnosuppsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),innosuppsInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Outbreak Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnOutbreakNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOutbreakNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getOutbreakNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),outbreakNutritionInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Insane Labz Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnInsaneLabzOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getInsaneLabzOptionInByBrandMenu()).perform();
        aeMegamenuPage.getInsaneLabzOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),insaneLabzInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the All Max Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnAllMaxOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getAllMaxOptionInByBrandMenu()).perform();
        aeMegamenuPage.getAllMaxOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),allMaxInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Glaxon Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnGlaxonOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getGlaxonOptionInByBrandMenu()).perform();
        aeMegamenuPage.getGlaxonOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),glaxonInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Redcon1 Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnRedconOneOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getRedcon1OptionInByBrandMenu()).perform();
        aeMegamenuPage.getRedcon1OptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),redcon1InByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Panda Supplements Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnPandaSupplementsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getPandaSupplementsOptionInByBrandMenu()).perform();
        aeMegamenuPage.getPandaSupplementsOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),pandaSupplementsInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Nutrend Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnNutrendOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getNutrendOptionInByBrandMenu()).perform();
        aeMegamenuPage.getNutrendOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),nutrendInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Ostrovit Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnOstrovitOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOstrovitOptionInByBrandMenu()).perform();
        aeMegamenuPage.getOstrovitOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),ostrovitInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Bettery Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBetteryOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getBetteryOptionInByBrandMenu()).perform();
        aeMegamenuPage.getBetteryOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),betteryInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Healthy Food, Snacks & Meal Replacement Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHealthyFoodSnacksAndMealReplacementOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodSnacksAndMealReplacementOptionInByBrandMenu()).perform();
        aeMegamenuPage.getHealthyFoodSnacksAndMealReplacementOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),healthyFoodSnacksAndMealReplacementInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Wow Hydrate Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWowHydrateOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getWowHydrateOptionInByBrandMenu()).perform();
        aeMegamenuPage.getWowHydrateOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),wowHydrateInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Quest Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnQuestNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getQuestNutritionOptionInByBrandMenu()).perform();
        aeMegamenuPage.getQuestNutritionOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),questNutritionInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Grenade Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnGrenadeOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getGrenadeOptionInByBrandMenu()).perform();
        aeMegamenuPage.getGrenadeOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),grenadeInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Reign Energy Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnReignEnergyOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getReignEnergyOptionInByBrandMenu()).perform();
        aeMegamenuPage.getReignEnergyOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),reignEnergyInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Monster Energy Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMonsterEnergyOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getMonsterEnergyOptionInByBrandMenu()).perform();
        aeMegamenuPage.getMonsterEnergyOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),monsterEnergyInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the 3d Energy  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnThirdEnergyOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getThirdEnergyOptionInByBrandMenu()).perform();
        aeMegamenuPage.getThirdEnergyOptionInByBrandMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),thirdEnergyInByBrandMenuUrl );
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    ///////SportSupplementsMainMenuTCs///////////////////
    @Test(description = "Make sure the Down-arrow Icon display correctly next to the Sport Supplements main menu", priority = 4)
    public void verifyTheDownArrowIconAppearsCorrectlyNextToTheSportSupplementsMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getDownArrowKeyInSportSupplementsMenu().isDisplayed());
    }
    @Test(description = "Make sure the system will display the sub Menu once hovering on the Sport Supplements main menu", priority = 4)
    public void verifyTheSubMenuWillAppearsCorrectlyOnceHoveringOnSportSupplementsMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }
    @Test(description = "Make sure the Sports Supplements main menu display the correct categories and sub-categories", priority = 17)
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
    @Test(description = "Make sure clicking on the Sports Supplements main menu will redirect the User to the correct URL", priority = 7)
    public void verifyClickingOnSportsSupplementsManiMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportSupplementsUrl));
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure the main categories in the Sports Supplements main menu appearing in Bold Font", priority = 18)
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
    @Test(description = "Make sure the main categories in the Sports Supplements main menu appearing in uppercase", priority = 19)
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
    @Test(description = "Make sure clicking on the Protein option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 20)
    public void verifyClickingOnProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Whey Protein Option appearing in the Sports Supplements main menu  will redirect the User to the correct URL", priority = 29)
    public void verifyClickingOnWheyProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWheyProteinOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getWheyProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), wheyProteinOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Whey Protein Isolate Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 30)
    public void verifyClickingOnWheyProteinIsolateOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), WheyProteinIsolateOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the protein Blends Option  appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 31)
    public void verifyClickingOnProteinBlendsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinBlendsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Non Dairy Protein Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 32)
    public void verifyClickingOnNonDairyProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nonDairyProteinOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the casein Protein Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 33)
    public void verifyClickingOnCaseinProteinOptionInSportsSupplementsMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), caseinProteinOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the diet Protein Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 34)
    public void verifyClickingOnDietProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDietProteinOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getDietProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), dietProteinOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Mass Gainers Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 35)
    public void verifyClickingOnMassGainersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMassGainersOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getMassGainersOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), massGainersOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Creatine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 35)
    public void verifyClickingOnCreatineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getCreatineOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), creatineOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Creatine Monohydrate Option appearing in the Sports Supplements Main menu will redirect the User to the correct URL", priority = 36)
    public void verifyClickingOnCreatineMonohydrateOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), creatineMonohydrateOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Creatine Blends Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 37)
    public void verifyClickingOnCreatineBlendsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), creatineBlendsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Amino Acids Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 37)
    public void verifyClickingOnAminoAcidsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the BCAA Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 38)
    public void verifyClickingOnBCAAOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getbCAAOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getbCAAOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bCAAOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the EAA Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 39)
    public void verifyClickingOnEAAOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.geteAAOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.geteAAOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), eAAOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Arginine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 40)
    public void verifyClickingOnArginineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getArginineOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getArginineOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), arginineOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Beta Alanine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 41)
    public void verifyClickingOnBetaAlanineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), betaAlanineOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the HMB Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 42)
    public void verifyClickingOnHMbOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.gethMBOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.gethMBOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), hMBOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Amino Acid Powders Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 43)
    public void verifyClickingOnAminoAcidPowdersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidPowdersOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Amino Acid Pills Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 44)
    public void verifyClickingOnAminoAcidPillsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidPillsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Citrulline Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 45)
    public void verifyClickingOnCitrullineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCitrullineOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getCitrullineOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), citrullineOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Amino Acid Liquids Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 46)
    public void verifyClickingOnAminoAcidLiquidsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidLiquidsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Musclev Boosters Liquids Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 46)
    public void verifyClickingOnMuscleBoostersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), muscleBoostersOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Testosterone Boosters Option appearing in the Sports Supplements main menu  will redirect the User to the correct URL", priority = 47)
    public void verifyClickingOnTestosteroneBoostersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), testosteroneBoostersOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Gh Boosters Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 48)
    public void verifyClickingOnGhBoostersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGhBoostersOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getGhBoostersOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ghBoostersOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Weight Management Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 48)
    public void verifyClickingOnWeightManagementOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getWeightManagementOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), weightManagementOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Stimulant Weight Loss Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 49)
    public void verifyClickingOnStimulantWeightLossOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), stimulantWeightLossOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Non Stimulant Weight Loss Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 50)
    public void verifyClickingOnNonStimulantWeightLossOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nonStimulantWeightLossOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Meal Replacements Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 51)
    public void verifyClickingOnMealReplacementsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mealReplacementsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Metabolism Support Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 52)
    public void verifyClickingOnMetabolismSupportOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), metabolismSupportOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Toning Creams Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 53)
    public void verifyClickingOnToningCreamsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getToningCreamsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getToningCreamsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), toningCreamsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the MCT Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 54)
    public void verifyClickingOnMctOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMctOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getMctOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mctOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Recovery Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 54)
    public void verifyClickingOnRecoveryOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRecoveryOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getRecoveryOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),recoveryOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Glutamine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 55)
    public void verifyClickingOnGlutamineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGlutamineOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getGlutamineOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), glutamineOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Recovery Blend Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 56)
    public void verifyClickingOnRecoveryBlendOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), recoveryBlendOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Electrolytes And Hydration Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 57)
    public void verifyClickingOnElectrolytesAndHydrationOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), electrolytesAndHydrationOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Carbohydrates Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 57)
    public void verifyClickingOnCarbohydratesOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), carbohydratesOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Carbohydrate Powders Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 58)
    public void verifyClickingOnCarbohydratePowdersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), carbohydratePowdersOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Energy And Endurance Powders Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 58)
    public void verifyClickingOnEnergyAndEnduranceOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), energyAndEnduranceOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Stimulant Energy Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 59)
    public void verifyClickingOnStimulantEnergyOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), stimulantEnergyOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Non Stimulant Energy Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 60)
    public void verifyClickingOnNonStimulantEnergyOptionInSportsSupplementsbMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nonStimulantEnergyOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Gaming And Focus Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 60)
    public void verifyClickingOnGamingAndFocusOptionInSportsSupplementsbMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), gamingAndFocusOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Gaming Essentials Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 60)
    public void verifyClickingOnGamingEssentialsOptionInSportsSupplementsbMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGamingEssentialsOptionInSportSupplementsMainMenu()).perform();
        aeMegamenuPage.getGamingEssentialsOptionInSportSupplementsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), gamingEssentialsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    /////Vitamins & Health TCS////
    @Test(description = "Make sure the Down-arrow Icon display correctly next to the Vitamins & Health main menu", priority = 4)
    public void verifyTheDownArrowIconAppearsCorrectlyNextToTheVitaminsAndHealthMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getDownArrowKeyInVitaminsAndHealthMenu().isDisplayed());
    }
    @Test(description = "Make sure the system will display the sub Menu once hovering on the Vitamins & Health main menu", priority = 4)
    public void verifyTheSubMenuWillAppearsCorrectlyOnceHoveringOnVitaminsAndHealthMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }
    @Test(description = "Make sure the Vitamins & Health main menu display the correct categories and sub-categories", priority = 17)
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
    @Test(description = "Make sure clicking on the Vitamins & Health main menu will redirect the User to the correct URL", priority = 7)
    public void verifyClickingOnVitaminsAndHealthManiMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(healthVitaminsUrl));
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the FEATURED Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 60)
    public void verifyClickingOnFeaturedOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), featuredOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Alive Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 66)
    public void verifyClickingOnAliveVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aliveVitaminsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sexual Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 67)
    public void verifyClickingOnSexualHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSexualHealthOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getSexualHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sexualHealthOptionInVitaminsAndHealthUrl);
        System.out.println(webDriver.getCurrentUrl());
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Essential Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnEssentialVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), essentialVitaminsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Folic Acid Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFolicAcidOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), folicAcidOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin A Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminAOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminAOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin B Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminBOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminBOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin C Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminCOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminCOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin D Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminDOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminDOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin E Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminEOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminEOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamin K Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminKOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminKOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Multi Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMultiVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), multiVitaminsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamins For Kids Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminsForKidsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForKidsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamins For Men Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminsForMenOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForMenOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Vitamins For Women Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnVitaminsForWomenOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForWomenOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Bone And Joint Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBoneAndJointOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), boneJointOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Bone Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBoneHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), boneHealthOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Joint Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnJointHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), jointHealthOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Beauty Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBeautyOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), beautyOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Collagen Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCollagenOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), collagenOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Hair, Skin AndNails Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHairSkinAndNailsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), hairSkinAndNailsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Fish Oil Omegas Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFishOilOmegasOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), fishOilAndOmegasOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Fish Oil Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFishOilOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), fishOilOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Omega369 Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnOmega369OptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), omegaMixOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Health Lifestyle Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHealthLifestyleOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyLifestyleOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Antioxidants Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnAntioxidantsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), antioxidantOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Blood Sugar Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBloodSugarSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bloodSugarSupportOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Brain Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBrainSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), brainSupportOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Detox And Cleanse Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnDetoxAndCleanseOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), detoxCleanseOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Energy Formulas Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnEnergyFormulasOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), energyFormulasOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Eye Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnEyeHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), eyeHealthOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Herbs Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHerbsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), herbsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Hormones Balance Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHormonesBalanceOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), hormonesBalanceOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Immune Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnImmuneSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), immuneSupportOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Mens Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMensHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mensHealthOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Stress Relief Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnStressReliefOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), stressReliefOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Sleep Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSleepSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sleepSupportOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Super Foods Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSuperFoodsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), superFoodsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Urinary Tract Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnUrinaryTractSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), urinaryTractSupportOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure clicking on the Weight Management Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWeightManagementOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), weightManagementOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Womens Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomensHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womensHealthOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Digestion Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnDigestionOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), digestionOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Digestion Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnDigestionSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), digestionSupportOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Probiotics Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnProbioticsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), probioticsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Sport Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSportVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sportVitaminsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Amino Acid Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnAminoAcidOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Minerals Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMineralsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), mineralsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Calcium Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCalciumOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), calciumOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Iron Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnIronOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getIronOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getIronOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ironOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Magnesium Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMagnesiumOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), magnesiumOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Multi mineral Formulas Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMultimineralFormulasOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), multimineralFormulasOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Zinc Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnZincOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getZincOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getZincOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), zincOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Potassium Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnPotassiumOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), potassiumOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Healthy Drinks Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHealthyDrinksOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyDrinksOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Drinkable Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnDrinkableVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), drinkableVitaminsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Pets Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnPetsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPetsOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getPetsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), petsOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Supplements More Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSupplementsMoreOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMainMenu()).perform();
        aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), supplementsMoreOptionInVitaminsAndHealthUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    ////HealthyFood Test Cases
    @Test(description = "Make sure the Down-arrow Icon display correctly next to the Healthy Food main menu", priority = 4)
    public void verifyTheDownArrowIconAppearsCorrectlyNextToTheHealthyFoodMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getDownArrowKeyInHealthyFoodMenu().isDisplayed());
    }
    @Test(description = "Make sure the system will display the sub Menu once hovering on the Healthy Food main menu", priority = 4)
    public void verifyTheSubMenuWillAppearsCorrectlyOnceHoveringOnHealthyFoodMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }
    @Test(description = "Make sure the Healthy Food main menu display the correct categories and sub-categories", priority = 17)
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
    @Test(description = "Make sure clicking on the Healthy Food main menu will redirect the User to the correct URL", priority = 7)
    public void verifyClickingOnHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(healthyFoodsUrl));
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Grocery Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnGroceryOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGroceryOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getGroceryOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), groceryOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Baking And Cooking Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBakingAndCookingOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bakingAndCookingOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Canned Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCannedOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCannedOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getCannedOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), cannedOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Coffee Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCoffeeOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCoffeeOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getCoffeeOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), coffeeOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Condiments Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCondimentsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCondimentsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getCondimentsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), condimentsOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Milk And Cream Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMilkAndCreamOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), milkAndCreamOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Nuts And Oats Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnNutsAndOatsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nutsAndOatsOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Oils Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnOilsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getOilsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getOilsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), oilsOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Pasta Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnPastaOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPastaOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getPastaOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), pastaOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Rice And Grains Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnRiceAndGrainsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), riceAndGrainsOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Seasonings And Spices Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSeasoningsAndSpicesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), seasoningsAndSpicessOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Sugar And Sweeteners Option appearing in the Healthy Food main menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSugarSweetenersOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sugarAndSweetenersOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Syrups Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSyrupsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSyrupsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getSyrupsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), syrupsOptionInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Tea And Herbs Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnTeaAndHerbsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), teaAndHerbsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Superfoods Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSuperfoodsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), superFoodsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Ready Mixes Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnReadyMixesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getReadyMixesOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getReadyMixesOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), readyMixInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Breakfast And Cereal Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBreakfastAndCerealOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), breakfastAndCerealInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Ready To Drink Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnReadyToDrinkOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), readyToDrinkInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Amino And Bcaas Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnAminoAndBcaasOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), aminoBcaasInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Energy Drinks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnEnergyDrinksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), energyDrinksInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Protein Shakes Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnProteinShakesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinShakesOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getProteinShakesOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinShakesInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Electrolytes And Hydration Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnElectrolytesAndHydrationOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), electrolytesAndHydrationInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Healthy Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHealthySnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthySnacksInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Protein Bars Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnProteinBarsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinBarsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getProteinBarsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinBarsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Cookies Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCookiesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCookiesOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getCookiesOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), cookiesInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Chips Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnChipsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getChipsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getChipsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), chipsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Brownies And Pancakes Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBrowniesAndPancakesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), browniesAndPancakesInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Snack Bars Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSnackBarsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSnackBarsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getSnackBarsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), snackBarsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Spreads Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSpreadsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSpreadsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getSpreadsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), spreadsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Other Healthy Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnOtherHealthySnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), otherHealthySnacksInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Ready To Eat Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnReadyToEatOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getReadyToEatOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getReadyToEatOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), readyToEatInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Healthy Meals Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHealthyMealsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyMealsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Featured Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFeaturedOptionInHealthyFoodMianMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFeaturedOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getFeaturedOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), featuredInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Healthy Meal Replacement Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHealthyMealReplacementOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), healthyMealReplacementInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Protein Coffee Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnProteinCoffeeOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinCoffeeInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Candies Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCandiesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCandiesOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getCandiesOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), candiesInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Flavoring Agents Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFlavoringAgentsOptionOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), flavoringAgentsInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Keto Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnKetoSnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), ketoSnacksInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Manuka Honey Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnManukaHoneyOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), manukaHoneyInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Meat Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMeatSnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMainMenu()).perform();
        aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), meatSnacksInHealthyFoodUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    ////Sports Test Cases
    @Test(description = "Make sure the Down-arrow Icon display correctly next to the Sports main menu", priority = 4)
    public void verifyTheDownArrowIconAppearsCorrectlyNextToTheSportsMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getDownArrowKeyInSportsMenu().isDisplayed());
    }
    @Test(description = "Make sure the system will display the sub Menu once hovering on the Sports main menu", priority = 4)
    public void verifyTheSubMenuWillAppearsCorrectlyOnceHoveringOnSportsMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }
    @Test(description = "Make sure the Sports main menu display the correct categories and sub-categories", priority = 17)
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
    @Test(description = "Make sure clicking on the Sports main menu will redirect the User to the correct URL", priority = 7)
    public void verifyClickingOnSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        aeMegamenuPage.getSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportsUrl));
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Men Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMenOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMenOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getMenOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), menInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Sport Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSportOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getSportOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), sportInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Football Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFootballOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFootballOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getFootballOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), footballInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Basketball Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBasketballOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBasketballOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getBasketballOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),basketballInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Baseball Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBaseballOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBaseballOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getBaseballOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),baseballInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Running Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnRunningOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRunningOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getRunningOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),runningInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Swimming Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSwimmingOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSwimmingOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getSwimmingOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),swimmingInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Yoga Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnYogaOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getYogaOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getYogaOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),yogaInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Fitness And Training Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFitnessAndTrainingOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFitnessAndTrainingOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getFitnessAndTrainingOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),fitnessAndTrainingInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the MMA Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMmaOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMmaOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getMmaOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),mmaInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Jiu Jitsu Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnJiuJitsuOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getJiuJitsuOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getJiuJitsuOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),jiuJitsuInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Board Games Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBoardGamesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBoardGamesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getBoardGamesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),boardGamesInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the SPORTS TECH Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSportsTechOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsTechOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getSportsTechOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),sportsTechInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Wearable Tech Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWearableTechOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWearableTechOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWearableTechOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),wearableTechInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Cameras Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnCamerasOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCamerasOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getCamerasOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),camerasInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Phone Accessories Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnPhoneAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPhoneAccessoriesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getPhoneAccessoriesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),phoneAccessoriesInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the PERSONAL CARE Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnPersonalCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPersonalCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getPersonalCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),personalCareInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Showering Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnShoweringOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getShoweringOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getShoweringOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),showeringInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Shaving Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnShavingOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getShavingOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getShavingOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),shavingInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Skin Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSkinCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSkinCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getSkinCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),skinCareInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Body Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBodyCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBodyCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getBodyCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),bodyCareInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Oral Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnOralCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getOralCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getOralCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),oralCareInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Therapy Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnTherapyOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTherapyOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getTherapyOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),therapyInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Masks Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMasksOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMasksOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getMasksOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),masksInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the FITNESS AND TRAINING Category Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFitnessAndTrainingCategoryOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFitnessAndTrainingCategoryOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getFitnessAndTrainingCategoryOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),fitnessAndTrainingCategoryInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the FITNESS EQUIPMENT Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFitnessEquipmentOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFitnessEquipmentOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getFitnessEquipmentOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),fitnessEquipmentInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Skipping Ropes Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSkippingRopesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSkippingRopesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getSkippingRopesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),skippingRopesInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Weight Belts Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWeightBeltsOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWeightBeltsOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWeightBeltsOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),weightBeltsInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Scooters Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnScootersOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getScootersOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getScootersOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),scootersInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the TRAINING ACCESSORIES Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnTrainingAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTrainingAccessoriesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getTrainingAccessoriesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),trainingAccessoriesInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Shakers & Bottles Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnShakersAndBottlesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getShakersAndBottlesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getShakersAndBottlesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),shakersBottlesInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Bags Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBagsOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBagsOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getBagsOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),bagsInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Gloves Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnGlovesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGlovesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getGlovesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),glovesInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Braces & Sleeves Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnBracesAndSleevesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBracesAndSleevesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getBracesAndSleevesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),bracesSleevesInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Mouthguard Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnMouthguardOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMouthguardOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getMouthguardOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),mouthguardInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the APPAREL Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnApperalOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getApparelOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getApparelOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),apparelInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the SPORTSWEAR Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSportswearOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportswearOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getSportswearOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),sportsWearInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Pants Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnPantsOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPantsOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getPantsOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),pantsInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Shorts Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnShortsOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getShortsOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getShortsOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),shortsInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Hoodies Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnHoodiesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHoodiesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getHoodiesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),hoodiesInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the T-Shirts Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnTShirtsOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.gettShirtsOptionInSportsMainMenu()).perform();
        aeMegamenuPage.gettShirtsOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),tShirtsInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Tanks Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnTanksOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTanksOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getTanksOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),tanksInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the FOOTWEAR Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnFootwearOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFootwearOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getFootwearOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),footwearInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Sneakers Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnSneakersOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSneakersOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getSneakersOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),sneakersInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Training Shoes Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnTrainingShoesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTrainingShoesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getTrainingShoesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),trainingShoesInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Running Shoes Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnRunningShoesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRunnigShoesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getRunnigShoesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),runningShoesInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the WOMEN Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the WOMEN SPORTS TECH Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenSportsTechOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSportsTechOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenSportsTechOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenSportsTechInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the WOMEN Wearable Tech Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenWearableTechOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenWearableTechOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenWearableTechOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenWearableTechInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the WOMEN Cameras Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenCamerasOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenCamerasOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenCamerasOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenCamerasInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the WOMEN Phone Accessories Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenPhoneAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenPhoneAccessoriesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenPhoneAccessoriesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenPhoneAccessoriesInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the WOMEN PERSONAL CARE Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenPersonalCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenPersonalCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenPersonalCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenPersonalCareInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the WOMEN Showering Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenShoweringOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenShoweringOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenShoweringOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenShoweringInSportsMainMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the WOMEN Skin Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenSkinCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSkinCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenSkinCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenSkinCareInSportsMainMenuUrll);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the WOMEN Body Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenBodyCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenBodyCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenBodyCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenBodyCareInSportsMainMenuUrll);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the WOMEN Oral Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenOralCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenOralCareOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenOralCareOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenOralCareInSportsMainMenuUrll);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the WOMEN Therapy Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenTherapyOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenTherapyOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenTherapyOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenTherapyInSportsMainMenuUrll);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the WOMEN Masks Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenMasksOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenMasksOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenMasksOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),womenMasksInSportsMainMenuUrll);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the WOMEN FITNESS AND TRAINING Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenFitnessAndTrainingOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenFitnessAndTrainingOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenFitnessAndTrainingOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenFitnessAndTrainingInSportsMainMenuUrll);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the WOMEN TRAINING ACCESSORIES Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomenTrainingAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenTrainingAccessoriesOptionInSportsMainMenu()).perform();
        aeMegamenuPage.getWomenTrainingAccessoriesOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), womenTrainingAccessoriesInSportsMainMenuUrll);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure clicking on the Women's Only main menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnWomensOnlyMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getWomenOnlyMainMenu()).perform();
        aeMegamenuPage.getWomenOnlyMainMenu().click();
        DataHelperAndWait.implicitWait(3);
        Assert.assertEquals(webDriver.getCurrentUrl(), womenOnlyUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

}