import base.Base;
// import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * Created by ammark on 4/12/14.
 */
public class AmazBase extends Base {

    @Test
    public void goToAmazon(){
        navigateToUrl("http://www.amazon.com");
        windowMaximize();}
    @Test
    public void logIntoAmazonAndViewDeals(){
        String username, password;
        Scanner stdin = new Scanner (System.in);
        System.out.println("Please enter your username");
        username= stdin.next();
        System.out.println("Please enter your password");
        password= stdin.nextLine();
        driver.findElement(By.id("nav-your-account")).click();
        driver.findElement(By.id("ap_email")).sendKeys(Keys.TAB,username);
        driver.findElement(By.id("ap_password")).sendKeys(Keys.TAB,password);
        driver.findElement(By.id("signInSubmit-input")).click();
        driver.findElement(By.linkText("Today's Deals")).click();
        driver.findElement(By.linkText("46% Off List Price on Samsung 75-Inch 1080p 240Hz 3D Smart LED TV")).click();
    }

    @Test
    public void addTVtoCart(){
        driver.findElement(By.id("nav-your-account")).click();
        driver.findElement(By.id("ap_email")).sendKeys(Keys.TAB,"accounting@maximumautooutlet.com");
        driver.findElement(By.id("ap_password")).sendKeys(Keys.TAB,"easy2see");
        driver.findElement(By.id("signInSubmit-input")).click();
        driver.findElement(By.linkText("Today's Deals")).click();
        driver.findElement(By.linkText("46% Off List Price on Samsung 75-Inch 1080p 240Hz 3D Smart LED TV")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void goBacktoMain(){
        navigateToUrl("http://www.amazon.com");
    }
    @Test
    public void getTitle(){
        getTitle();
    }
    @Test
    public void bestSellers(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys
                (Keys.TAB, "Best Sellers");
        driver.findElement(By.id("nav-submit-buttom")).click();

    }



    @AfterClass
    public void tearDown() throws Exception {
        driver.close();

}



    }


