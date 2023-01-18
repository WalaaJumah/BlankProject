/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription HeaderTestCases
 */

package sporter_test.headerTestCases;

import core.BaseTest;
import core.DataHelperAndWait;
import org.testng.annotations.Test;
import sporter_pages.headerPages.HeaderPage;

public class HeaderTestCases extends BaseTest {
    @Test
    public void test(){

        HeaderPage headerPage=new HeaderPage(webDriver);
        System.out.println(headerPage.getTextSlider().size());
        for (int i=0;i<headerPage.getTextSlider().size();i++){
            System.out.println(headerPage.getTextSlider().get(i).getText());
        }
    }
}
