package easyEbay;

import base.Base;

/**
 * Created by ismailosmanjan on 4/12/14.
 */
public class Page extends Base {

    public void goToMyFeed() {
        clickByCss(".topnav tbody tr td:nth-child(1)");   }

    public void goToMyFeedPage() {
        clickByCss(".topnav tbody tr td:nth-child(1) a"); }

    public void goToMyCollections() {
        clickByCss(".topnav tbody tr td:nth-child(2)");   }

    public void goToMyCollectionsPage() {
        clickByCss(".topnav tbody tr td:nth-child(2) a"); }

    public void goToMotors() {
        clickByCss(".topnav tbody tr td:nth-child(4)");   }

    public void goToMotorsPage() {
        clickByCss(".topnav tbody tr td:nth-child(4) a");   }

    public void goToFashion() {
        clickByCss(".topnav tbody tr td:nth-child(5)");     }

    public void goToFashionPage() {
        clickByCss(".topnav tbody tr td:nth-child(5) a");     }

    public void goToElectronics() {
        clickByCss(".topnav tbody tr td:nth-child(6)");
        //clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[6]/a");

    }
    public void goToCollectiblesAndArt() {
        clickByCss(".topnav tbody tr td:nth-child(7)");
       // clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[7]/a");

    }
    public void goToHomeAndGarden() {
        clickByCss(".topnav tbody tr td:nth-child(8)");
       // clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[8]/a");

    }
    public void goToSportingGoods() {
        clickByCss(".topnav tbody tr td:nth-child(9)");
       // clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[9]/a");

    }
    public void goToToysAndHobbies() {
        clickByCss(".topnav tbody tr td:nth-child(10)");
       // clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[10]/a");

    }
    public void goToDealsAndGifts() {
        clickByCss(".topnav tbody tr td:nth-child(11)");
       // clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[11]/a");

    }
}
