package ebayHome;

import easyEbay.Page;
import org.testng.annotations.Test;


/**
 * Created by ismailosmanjan on 4/12/14.
 */
public class Search extends Page {

    @Test
    public void test() throws InterruptedException {
       // navigateToUrl("http://www.ebay.com");
        typeById("gh-ac", "Cars");
        // clickByCss("#gt-cat");
        //System.out.print(driver.findElements(By.xpath("html/body/div[2]/div[1]/div/div[2]/table/tbody/tr/td[3]/form/table/tbody/tr/td[2]/div/select")).size());
        clickById("gh-btn");
        clickByXPath("html/body/div[5]/div[1]/div/div[1]/div[2]/table/tbody/tr/td[3]/form/table/tbody/tr/td[3]/input");


    }
}
