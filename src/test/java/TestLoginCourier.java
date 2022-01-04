import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestLoginCourier extends TestBase{

    LoginAppCourier Loginapp;


    @Test

     public void LoginPass(){
        Loginapp = new LoginAppCourier(driver);
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        Loginapp.getCountryPhone().click();
        Loginapp.getEgyptPhone().click();
        Loginapp.getPhoneNO().sendKeys("01222495422");



    }



}
