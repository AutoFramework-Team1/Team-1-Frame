package Home;

import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by ammark on 4/26/14.
 */
public class DealLists extends AmazonBase{
    @Test
    public void goToAmazon() {
        super.goToAmazon();
        driver.findElement(By.id("Today's Deals")).click();
    }
}
