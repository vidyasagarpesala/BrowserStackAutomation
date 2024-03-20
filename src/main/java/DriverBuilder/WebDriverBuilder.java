package DriverBuilder;

import enums.PlatformName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverBuilder {

    WebDriver driver;

    public WebDriver createDriver(String browser) {

        if (browser.equalsIgnoreCase(PlatformName.CHROME.name())) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase(PlatformName.MWEB.name())) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase(PlatformName.FIREFOX.name())) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase(PlatformName.SAFARI.name())) {
            driver = new SafariDriver();
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
