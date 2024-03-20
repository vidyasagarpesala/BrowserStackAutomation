package Pages;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage extends BasePage{

    private AppiumDriver driver;

    public LoginPage(AppiumDriver appiumDriver)
    {
        super(appiumDriver);
        driver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

}
