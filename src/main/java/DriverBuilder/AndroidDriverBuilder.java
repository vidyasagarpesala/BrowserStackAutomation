package DriverBuilder;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverBuilder {

    String userName = "vidyasagar18";
    String accessKey = "H2g4NfqrLeTzQxHBXWpD";
    String app = "bs://09ec2da7e22a68d5f645bbb7d08c508094f1e8c5";

    public  AndroidDriver createAndroidDriverInstance() {
        AndroidDriver driver;
        DesiredCapabilities Capabilities = new DesiredCapabilities();
        Capabilities.setCapability("deviceName", "Samsung Galaxy S21");
        Capabilities.setCapability("os_version", "12.0");
        Capabilities.setCapability("project", "sample project");
        Capabilities.setCapability("build", "1.0");
        Capabilities.setCapability("name", "browserStackTest");
        Capabilities.setCapability("app", app);
        URL url;
        try {
            url = new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver = new AndroidDriver(url, Capabilities);
        return driver;
    }

}
