package Home;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by ammark on 5/4/14.
 */
public class SignIn extends Base {

    @Test
    public void SignUpForPrime(){
        driver.findElement(By.id("nav-signin-title")).click();
        driver.findElement(By.id("ap_signin_create_radio")).click();
        driver.findElement(By.id("ap_email")).sendKeys(Keys.TAB,"pnttestcheck@gmail.com");
        driver.findElement(By.id("signInSubmit-input")).click();
       driver.findElement(By.id("ap_customer_name")).sendKeys(Keys.TAB,"People" + " Tech");
        driver.findElement(By.id("ap_email_check_input")).sendKeys(Keys.TAB,"pnttestcheck@gmail.com");
        driver.findElement(By.id("ap_password_input")).sendKeys(Keys.TAB,"Selenium2014");
        driver.findElement(By.id("ap_password_check")).sendKeys(Keys.TAB,"Selenium2014");
        driver.findElement(By.id("continue-input")).click();
            }

}
