package ebayHome;


import easyEbay.Page;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import javax.swing.*;

/**
 * Created by ismailosmanjan on 4/12/14.
 */
public class SignIn extends Page {

    @Test
    public void signInTest() {
       // navigateToUrl("http://www.ebay.com");
        windowMaximize();
        clickByCss("#gh-ug>a");

        String error = ".sd-err";

        String userid = JOptionPane.showInputDialog("Please, enter your username");
        typeById("userid",userid);
        String password = JOptionPane.showInputDialog("Please, enter your password");
        typeById("pass",password);
        clickById("sgnBt");

        //Css heading    .pgHeading-l     .sd-err

       for(int i=0; i<99;i++) {
           if (driver.findElements(By.cssSelector(".sd-err")).equals(true)) {
               String user = JOptionPane.showInputDialog("Please, enter your username");
               typeById("userid", user);
               String pass = JOptionPane.showInputDialog("Please, enter your password");
               typeById("pass", pass);
               clickById("sgnBt");}
           else  {
               String image = JOptionPane.showInputDialog("Please, enter the numbers  that you see in the image");
               typeById("tokenText", image);
               clickById("but_formsubmit");
           }
       }

       //  If(getTextById(error)=="Your email/user ID or password is incorrect.") {
       //     String userid = JOptionPane.showInputDialog("Please, enter your username");
       //     typeById("userid",userid);
        //    String password = JOptionPane.showInputDialog("Please, enter your password");
        //    typeById("pass",password);
         //   clickById("sgnBt");


     //   }

      //  }


    }

}
