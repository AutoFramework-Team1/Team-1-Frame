package ebayCatalog;

import easyEbay.Page;
import org.testng.annotations.Test;

/**
 * Created by ismailosmanjan on 4/20/14.
 */
public class MyFeed extends Page {

    @Test
    public void myFeedPage() {
        goToMyFeed();
        clickByCss(".topnav tbody tr td:nth-child(4) a");
    }
}
