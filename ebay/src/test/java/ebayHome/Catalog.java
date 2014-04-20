package ebayHome;

import easyEbay.Page;
import org.testng.annotations.Test;


/**
 * Created by ismailosmanjan on 4/12/14.
 */
public class Catalog extends Page {

    @Test
    public void test() {
       // navigateToUrl("http://www.ebay.com");
//        windowMaximize();
        goToMyFeed();
        navigateBack();
        goToMyCollections();
        navigateBack();
        goToMotors();
        navigateBack();
        goToFashion();
        navigateBack();
        goToElectronics();
        navigateBack();
        goToCollectiblesAndArt();
        navigateBack();
        goToHomeAndGarden();
        navigateBack();
        goToSportingGoods();
        navigateBack();
        goToToysAndHobbies();
        navigateBack();
        goToDealsAndGifts();

    }



}
