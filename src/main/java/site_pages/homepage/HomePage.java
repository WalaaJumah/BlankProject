/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class contains all elements related to the Home Page
 */

package site_pages.homepage;

import core.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class HomePage extends BasePage {
    String youtubeEurekaLink = "https://www.youtube.com/watch?v=Z53h-uAVlTM";
    By shortVideoLink = By.id("youtubeLink");
    // Search component appears in the HomePage
    By searchField = By.id("search");
    By searchBtn = By.id("searchBtn");
    By searchSection = By.id("form-1");
    By buyTab = By.xpath("//div[@class='mult-radio-btns main-mult-radio-btns cap-text']/div[1]");
    By rentTab = By.xpath("//div[@class='mult-radio-btns main-mult-radio-btns cap-text']/div[2]");
    By buyApartmentOption = By.xpath("(//div[@class='custom-checkbox round-checkbox']/label)[1]");
    By buyApartmentInputOption = By.id("group-2-1");
    By buyVillaHouseOption = By.xpath("(//div[@class='custom-checkbox round-checkbox']/label)[2]");
    By buyVillaHouseInputOption = By.id("group-2-2");
    By buyFarmOption = By.xpath("(//div[@class='custom-checkbox round-checkbox']/label)[3]");
    By buyFarmInputOption = By.id("group-2-3");
    By buyLandOption = By.xpath("(//div[@class='custom-checkbox round-checkbox']/label)[4]");
    By buyLandInputOption = By.id("group-2-4");
    By recentSearchLink = By.id("LastSearchID");
    By BackgroundImg = By.xpath("//section[contains(@class,'login main-search')]");
    By titleInHomePage = By.xpath("//h1[@class='white-text']");
    By scrollDownBtn = By.id("ScrollDown");
    By scrollDownText = By.xpath("//a[@id='ScrollDown']/span");
    By scrollDownArrowIcon = By.xpath("//i[contains(@class,'arrow-down')]");
    By FeaturedPlacesFirstHeader = By.xpath("//section[@id='places']//h2");
    By FeaturedPlacesSecondHeader = By.xpath("//section[@id='places']//p");
    By RecentlyAddedFirstHeader = By.xpath("//section[@id='RealEstate']//h2");
    By RecentlyAddedSecondHeader = By.xpath("//section[@id='RealEstate']//p");
    By nextButtonInRecentlyAddedSection = By.xpath("//section[@id='RealEstate']//button[contains(@class,'next')]");
    By previousButtonInRecentlyAddedSection = By.xpath("//section[@id='RealEstate']//button[contains(@class,'prev')]");
    By nextButtonInFeaturedSection = By.xpath("//section[@id='places']//button[contains(@class,'next')]");
    By previousButtonInFeaturedSection = By.xpath("//section[@id='places']//button[contains(@class,'pre')]");
    By featuredTagText = By.xpath("//span[@class='feature']");
    By featuredLabelsList = By.xpath("//section[@id='places']//span[@class='feature']");
    By adsListInFeaturedPlacesSection = By.xpath("//section[@id='places']//a[contains(@class,'main-product')]");
    By adsListInRecentlyAddedSection = By.xpath("//section[@id='RealEstate']//a[contains(@class,'main-product')]");
    By favouriteIconInAdsInFeaturedPlacesSection = By.xpath("//section[@id='places']//i[contains(@class,'fa-heart')]");
    By favouriteIconInAdsInRecentlyAddedSection = By.xpath("//section[@id='RealEstate']//i[contains(@class,'fa-heart')]");
    By favouriteToolTipInFeaturedPlacesSection = By.xpath("(//section[@id='places']//label[contains(@id,'addFav')])[1]");
    By favouriteToolTipInRecentlyAddedSection = By.xpath("(//section[@id='RealEstate']//label[contains(@id,'addFav')])[1]");
    By placeNameInAdsInFeaturedPlacesSection = By.xpath("//section[@id='places']//h3[contains(@class,'product-name')]");
    By placeNameInAdsInRecentlyAddedSection = By.xpath("//section[@id='RealEstate']//h3[contains(@class,'product-name')]");
    By verifiedIconInFeaturedPlacesSection = By.xpath("//section[@id='places']//span[contains(@class,'verified')]");
    By verifiedIconInRecentlyAddedSection = By.xpath("//section[@id='RealEstate']//span[contains(@class,'verified')]");
    By threeDTourIconInFeaturedPlacesSection = By.xpath("//section[@id='places']//a[contains(@class,'3d_tour')]");
    By threeDTourIconInRecentlyAddedSection = By.xpath("//section[@id='RealEstate']//a[contains(@class,'3d_tour')]");
    By placeLocationInAdsInFeaturedPlacesSection = By.xpath("//section[@id='places']//h4[contains(@class,'product-place')]");
    By placeLocationInAdsInRecentlyAddedSection = By.xpath("//section[@id='RealEstate']//h4[contains(@class,'product-place')]");
    By placePriceInAdsInFeaturedPlacesSection = By.xpath("//section[@id='places']//div[contains(@class,'product-price')]");
    By placePriceInAdsInRecentlyAddedSection = By.xpath("//section[@id='RealEstate']//div[contains(@class,'product-price')]");
    By imgsInAdsInFeaturedPlacesSection = By.xpath("//section[@id='places']//div[contains(@class,'product-img')]/img");
    By imgsInAdsInRecentlyAddedSection = By.xpath("//section[@id='RealEstate']//div[contains(@class,'product-img')]");
    By positionInsideFeaturedPlacesSection = By.xpath("(//div[@class='owl-stage'])[1]");
    By positionInsideRecentlyAddedSection = By.xpath("(//div[@class='owl-stage'])[2]");
    By featuredPlacesSection = By.id("owl-demo");
    By recentlyAddedSection = By.id("owl-demo2");
    By customersStoriesSection = By.xpath("//section[contains(@class,'customer-stories')]");
    By customersStoriesHeader = By.xpath("//section[contains(@class,'customer-stories')]//h2");
    By customersStoriesDescription = By.xpath("//section[contains(@class,'customer-stories')]//p");
    By learnMoreBtn = By.id("LearnMore");
    By learnMoreArrowIcon = By.xpath("//a[@id='LearnMore']/i");
    By customersStoriesOpinionTextList = By.xpath("//div[contains(@class,'opinion-description')]");
    By customersStoriesUsersImagesList = By.xpath("//div[contains(@class,'opinion-bottom')]//img[contains(@class,'converted')]");
    By customersStoriesUsersNamesList = By.xpath("//div[contains(@class,'opinion-bottom')]//h3");
    By nextBtnInCustomersStoriesPage = By.xpath("//button[contains(@class,'next')]");
    By prevBtnInCustomersStoriesPage = By.xpath("//button[contains(@class,'prev')]");
    By customersStoriesLayoutPage = By.xpath("//div[@class='col-12']");
    By titleInsideCustomersStoriesPage = By.xpath("//div[@class='col-12']//h2");
    By customerNameInsideCustomersStoriesPage = By.xpath("//h4[contains(@class,'dark-text')]");
    By customerImageInsideCustomersStoriesPage = By.xpath("//img[contains(@class,'converted')]");
    By customerStoryInsideCustomersStoriesPage = By.xpath("//div[contains(@class,'customer-opinions')]");
    By sectionPositionsInsideCustomersStoriesPage = By.xpath("//div[@class='owl-stage-outer']/div");
    By pagesControlInsideCustomersStoriesPage = By.xpath("//div[@class='owl-dots']");
    By pagesBtnslInsideCustomersStoriesPage = By.xpath("//div[@class='owl-dots']/button");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

}