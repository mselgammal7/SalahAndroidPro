import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class LoginAppCourier extends PageBase{


    public LoginAppCourier(AndroidDriver driver) {
        super(driver);

    }
    @FindBy(id = "tvCountryCodeNumber")
    AndroidElement countryPhone;

    @FindBy(id = "circleImageView22")
    AndroidElement egyptPhone;

    @FindBy(id = "etCurrentNumber")
    AndroidElement phoneNO;


    public AndroidElement getCountryPhone() {
        return countryPhone;
    }

    public AndroidElement getEgyptPhone() {
        return egyptPhone;
    }

    public AndroidElement getPhoneNO() {
        return phoneNO;
    }
}
