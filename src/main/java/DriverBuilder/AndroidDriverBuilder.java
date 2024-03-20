package DriverBuilder;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverBuilder {


    public  AndroidDriver createAndroidDriverInstance() {
        AndroidDriver driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName", "pixel_7");
        capabilities.setCapability("platformVersion", "12.0");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appActivity", "com.android.settings");
        capabilities.setCapability("appPackage", "com.android.settings.Settings");
        URL url;
        try {
            url = new URL("https://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver = new AndroidDriver(url, capabilities);
        return driver;
    }

}
