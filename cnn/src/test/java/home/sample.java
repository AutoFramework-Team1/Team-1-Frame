package home;


import base.Base;
import org.testng.annotations.Test;

/**
 * Created by ismailosmanjan on 4/12/14.
 */
public class sample extends Base {

    @Test

   public void Sample() {
    navigateToUrl("http://www.cnn.com");
    windowMaximize();
    }


}
