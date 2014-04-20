package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by ismailosmanjan on 4/12/14.
 */
public class Base {

    public WebDriver driver = null;


    @Parameters({"url"})


    @BeforeClass
    public void setUp(String url) throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        navigateToUrl(url);

    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.close();
    }

    // Utility Methods

    public void navigateToUrl(String url){
        driver.navigate().to(url);
    }

    public void windowMaximize(){
        driver.manage().window().maximize();
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public void clickById(String locator) {
        driver.findElement(By.id(locator)).click();
    }

    public void clickByCss(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }


    // more utility methods
    public void clickByXPath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }

    public void clickByTag(String locator){
        driver.findElement(By.tagName(locator)).click();
    }








    public void typeById(String locator, String str){
        driver.findElement(By.id(locator)).sendKeys(str);
    }

    public void getTextById(String locator) {
        driver.findElement(By.id(locator)).getText();
    }


    public List<String> getListOfString(String locator1){
        List<WebElement> elementList = getWebElementsByCss(locator1);
        List<String> list = new ArrayList<String>() ;
        for(WebElement element:elementList){
            list.add(element.getText());
        }
        return list;
    }


    public List<WebElement> getWebElementsByCss(String locator1){
        List<WebElement> elementList = driver.findElements(By.cssSelector(locator1));

        return elementList;
    }


    public void sleep(int seconds) throws InterruptedException{
        Thread.sleep(seconds * 1000);
    }



}
