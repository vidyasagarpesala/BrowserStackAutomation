package Pages;



import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginPage extends BasePage{

    private AndroidDriver driver;

    public LoginPage(AndroidDriver Driver)
    {
        driver = Driver;
    }

}
