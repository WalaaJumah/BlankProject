package sporter_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AeSearchPage {
    public AeSearchPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    //declare all locators related to the Search Page
    @FindBy(xpath ="//li[@class='ais-Pagination-item ais-Pagination-item--nextPage']/a")
    private WebElement nextPageIcon;
    @FindBy(xpath ="//li[@class='ais-Pagination-item ais-Pagination-item--previousPage']/a")
    private WebElement previousPageIcon;
    @FindBy(xpath ="//ul[@class='toggle-tabs']/li[1]/label")
    private WebElement allTab;
    @FindBy(xpath ="//ul[@class='toggle-tabs']/li[2]/label")
    private WebElement productsTab;
    @FindBy(xpath ="//ul[@class='toggle-tabs']/li[3]/label")
    private WebElement articlesTab;
    @FindBy(xpath ="//ul[@class='toggle-tabs']/li[4]/label")
    private WebElement brandsTab;
    @FindBy(xpath ="//button[@class='ais-ClearRefinements-button action primary']")
    private WebElement resetAllFiltersBtn;
    @FindBy(xpath = "//select[@class='ais-SortBy-select']")
    private WebElement sortByMenu;
    @FindBy(xpath="(//span[@class='hitscount'])[1]")
    private WebElement numberOfSearchResultInProductsTab;
   @FindBy(xpath="(//span[@class='hitscount'])[3]")
    private WebElement numberOfSearchResultInBrandsTab;
    @FindBy(xpath="//h3[@class='page-title search-query']")
    private WebElement searchResultForLabel;
    @FindBy(xpath="//dt[@class='title']")
    private WebElement didYouMeanLabel;
   @FindBy(xpath="//dl[@class='block']")
    private WebElement didYouMeanBlock;
    @FindBy(xpath="(//dd[@class='item'])[1]")
    private WebElement didYouMeanFirstOption;
   @FindBy(xpath="(//dd[@class='item'])[2]")
    private WebElement didYouMeanSecondOption;
    @FindBy(xpath="//span[@class='ais-Stats-text']/strong")
    private WebElement resultLabel;
    @FindBy(xpath="//span[@data-ui-id='page-title-wrapper']")
    private WebElement searchResultForValue;
    @FindBy(xpath="(//div[@class='trending-title brand-title']//a)[1]")
    private WebElement viewAllBtnInProductsSection;
   @FindBy(xpath="(//div[@class='trending-title brand-title']//a)[2]")
    private WebElement viewAllBtnInBrandsSection;
   @FindBy(xpath="(//div[@class='trending-title brand-title']//a)[3]")
    private WebElement viewAllBtnInArticlesSection;
    @FindBy(xpath="(//div[@class='trending-title brand-title']/h2)[1]")
    private WebElement productsSectionInAllPage;
   @FindBy(xpath="(//div[@class='trending-title brand-title']/h2)[2]")
    private WebElement brandsSectionInAllPage;
   @FindBy(xpath="(//div[@class='trending-title brand-title']/h2)[3]")
    private WebElement articlesSectionInAllPage;
    @FindBy(xpath="//div[@id='algolia-left-container']")
    private WebElement filtrationColumn;


    //Getter Methods
    public WebElement getNextPageIcon() {
        return nextPageIcon;
    }
    public WebElement getPreviousPageIcon() {
        return previousPageIcon;
    }
    public WebElement getAllTab() {
        return allTab;
    }

    public WebElement getProductsTab() {
        return productsTab;
    }

    public WebElement getArticlesTab() {
        return articlesTab;
    }

    public WebElement getBrandsTab() {
        return brandsTab;
    }
    public WebElement getResetAllFiltersBtn() {
        return resetAllFiltersBtn;
    }
    public WebElement getSortByMenu() {
        return sortByMenu;
    }
    public WebElement getNumberOfSearchResultInProductsTab() {
        return numberOfSearchResultInProductsTab;
    }

    public WebElement getNumberOfSearchResultInBrandsTab() {
        return numberOfSearchResultInBrandsTab;
    }
    public WebElement getSearchResultForLabel() {
        return searchResultForLabel;
    }
    public WebElement getDidYouMeanLabel() {
        return didYouMeanLabel;
    }

    public WebElement getDidYouMeanBlock() {
        return didYouMeanBlock;
    }

    public WebElement getDidYouMeanFirstOption() {
        return didYouMeanFirstOption;
    }

    public WebElement getDidYouMeanSecondOption() {
        return didYouMeanSecondOption;
    }
    public WebElement getResultLabel() {
        return resultLabel;
    }

    public WebElement getSearchResultForValue() {
        return searchResultForValue;
    }
    public WebElement getViewAllBtnInProductsSection() {
        return viewAllBtnInProductsSection;
    }

    public WebElement getViewAllBtnInBrandsSection() {
        return viewAllBtnInBrandsSection;
    }

    public WebElement getViewAllBtnInArticlesSection() {
        return viewAllBtnInArticlesSection;
    }
    public WebElement getProductsSectionInAllPage() {
        return productsSectionInAllPage;
    }

    public WebElement getBrandsSectionInAllPage() {
        return brandsSectionInAllPage;
    }

    public WebElement getArticlesSectionInAllPage() {
        return articlesSectionInAllPage;
    }
    public WebElement getFiltrationColumn() {
        return filtrationColumn;
    }
    //Define the main actions we need to execute our TCs

}
