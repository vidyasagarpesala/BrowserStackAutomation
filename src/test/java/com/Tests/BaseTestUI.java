package com.Tests;

import DriverBuilder.AndroidDriverBuilder;
import DriverBuilder.IOSDriverBuilder;
import enums.PlatformName;
import enums.PlatformType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestUI {

    private static final ThreadLocal<AppiumDriver> drivers = new ThreadLocal<>();

    @BeforeTest
    public void beforeTest(){
        if (System.getenv("PLATFORM_TYPE").equalsIgnoreCase(PlatformName.ANDROID.name())) {
            AppiumDriver appiumDriver = new AndroidDriverBuilder().createAndroidDriverInstance();
            setDriver(appiumDriver);
        }else if(System.getenv("PLATFORM_TYPE").equalsIgnoreCase(PlatformName.IOS.name())) {
            AppiumDriver appiumDriver = new IOSDriverBuilder().createIosDriverInstance();
            setDriver(appiumDriver);
        }
    }

    public AppiumDriver getDriver(){
        return drivers.get();
    }

    public void setDriver(AppiumDriver driver){
        drivers.set(driver);
    }

    @AfterTest
    public void afterTest(){
        getDriver().quit();
    }

}
