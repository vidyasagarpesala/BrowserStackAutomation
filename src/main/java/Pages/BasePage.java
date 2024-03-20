package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    AppiumDriver driver;
    public BasePage(AppiumDriver Driver)
    {
        driver = Driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
}
