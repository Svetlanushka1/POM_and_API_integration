package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SplashPage extends BasePage{
    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/versionText']")
    MobileElement textVersion;
    public boolean validateTextVersionCorrect() {
        return isTextContain(textVersion, "Version 1.0.0", 10);

    }


}
