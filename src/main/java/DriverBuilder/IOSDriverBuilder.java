package DriverBuilder;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSDriverBuilder {

    public IOSDriver createIosDriverInstance() {
        IOSDriver driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","iOS");
        capabilities.setCapability("deviceName", "iPhone 14");
        capabilities.setCapability("platformVersion", "15.0");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("bundleId", "io.appium.TestApp");
        URL url;
        try {
            url = new URL("https://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver = new IOSDriver(url, capabilities);
        return driver;
    }
}
