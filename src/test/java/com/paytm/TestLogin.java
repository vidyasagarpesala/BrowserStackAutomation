package com.paytm;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import Pages.LoginPage;
import io.appium.java_client.android.AndroidDriver;

public class TestLogin extends BaseTest{

    private AndroidDriver driver;
    private LoginPage loginPage;


    @BeforeClass
    public void beforeClass(){
        driver = getDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void TestLoginScenario(){

        System.out.println("Logged in");
}

}
