package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BasePage{

    AppiumDriver driver;
    public LogoutPage(AppiumDriver appiumDriver)
    {
        super(appiumDriver);
        driver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

}
