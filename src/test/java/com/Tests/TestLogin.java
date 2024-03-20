package com.Tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import Pages.LoginPage;
import io.appium.java_client.android.AndroidDriver;

public class TestLogin extends BaseTestUI {

    private AppiumDriver driver;
    private LoginPage loginPage;


    @BeforeClass
    public void beforeClass(){
        driver = getDriver();
        loginPage = new LoginPage(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @Test
    public void TestLoginScenario(){
        System.out.println("Logged in");
}

}
