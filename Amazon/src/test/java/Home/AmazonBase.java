package Home;

import base.Base;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Scanner;

/**
 * Created by ammark on 4/22/14.
 */
public class AmazonBase extends Base{
    @Test
    public void goToAmazon(){
        navigateToUrl("http://www.amazon.com");
        windowMaximize();}


    @Test
    public void getTitle(){
        System.out.println(driver.getTitle().toUpperCase());
    }
    @Test
    public void dealsOfTheDay(){
        driver.findElement(By.linkText("Today's Deals")).click();

    }
    @Test
    public void goBacktoMain(){
        navigateToUrl("http://www.amazon.com");
    }

    @Test
    public void viewBestTv(){
        goBacktoMain();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.TAB,"Top Rated Smart Television");
        driver.findElement(By.className("nav-submit-input")).click();
            }
    @Test
    public void signUpPrime(){
        goBacktoMain();
        driver.findElement(By.className("Prime")).click();
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.className("ap_col1 ap_right ap_no_collapse")).click();
        driver.findElement(By.id("ap_customer_name")).sendKeys(Keys.TAB, "Barrack");
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.close();

    }


}
