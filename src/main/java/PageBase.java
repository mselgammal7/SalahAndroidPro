import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    public PageBase(AndroidDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
