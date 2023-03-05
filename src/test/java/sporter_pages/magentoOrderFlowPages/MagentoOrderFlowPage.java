/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.magentoOrderFlowPages;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Getter
public class MagentoOrderFlowPage  extends BasePage {

    public MagentoOrderFlowPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    DataHelperAndWait dataHelperAndWait;
    @FindBy(xpath="//a[contains(@href,'admin/sales/order/view/order_id')]")
    private WebElement viewOrderMagento;
    @FindBy(xpath="(//button[contains(@data-action,'grid-filter-expand')])[1]")
    private WebElement orderFiltersBtnMagento;
    @FindBy(xpath="(//button[contains(@data-action,'grid-filter-apply')])[1]")
    private WebElement orderApplyFilterBtnMagento;
    @FindBy(xpath="//input[@name='quote_id']")
    private WebElement quoteIdSearchField;
    @FindBy(id="order_ship")
    private WebElement approveOrderBtn;
    @FindBy(id="order-view-cancel-button")
    private WebElement cancelOrderBtn;
    @FindBy(id="(//button[contains(@title,'Submit Shipment')])[1]")
    private WebElement submitShipmentBtn;
    @FindBy(xpath="(//div[contains(@data-ui-id,'messages-message-success')])[1]")
    private WebElement magentoSussMsg;
    @FindBy(id="order_status")
    private WebElement orderStatusMagento;
    @FindBy(id="menu-magento-sales-sales")
    private WebElement magentoSalesTab;
    @FindBy(xpath="(//li[contains(@data-ui-id,'menu-magento-sales-sales')])[3]")
    private WebElement magentoOrderTab;

}
