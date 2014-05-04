package Home;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by ammark on 5/3/14.
 */
public class Deals extends Base {

    @Test
    public void dealsOfTheDay(){

        driver.findElement(By.linkText("Today's Deals")).click();
        System.out.println(driver.getTitle());
}
    @Test
    public void topLinks(){
        List<WebElement> navCrossShopLinks;
        navCrossShopLinks = getWebElementsByCss("#nav-cross-shop-links");
        navCrossShopLinks.add(driver.findElement(By.linkText("Today's Deals")));
        navCrossShopLinks.add(driver.findElement(By.linkText("Gift Cards")));
        navCrossShopLinks.add(driver.findElement(By.id("nav-your-amazon")));
        System.out.print(navCrossShopLinks);

    }
    @Test

    public void giftCards(){
        driver.findElement(By.linkText("Gift Cards")).click();
        System.out.println(driver.findElement(By.id("gcfirst")));
        System.out.println(driver.findElement(By.id("gcsecond")));
        System.out.println(driver.findElement(By.id("gcthird")));
        System.out.println(driver.findElement(By.id("gcfourth")));

    }
    @Test
    public void bestSellers(){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.TAB,"Best Sellers");
        driver.findElement(By.className("nav-submit-input")).click();
    }


    }


