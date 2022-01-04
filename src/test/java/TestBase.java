import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    public static AndroidDriver driver ;


    @BeforeTest
    public void startDriver () throws MalformedURLException {
        DesiredCapabilities Cap = new DesiredCapabilities();
        Cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        Cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        Cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
        Cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Nokia 6.1");

        Cap.setCapability(MobileCapabilityType.APP , System.getProperty("user.dir")+"/src/main/Sources/Shgardia_Courier_v2.09.apk");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),Cap);

    }


}
