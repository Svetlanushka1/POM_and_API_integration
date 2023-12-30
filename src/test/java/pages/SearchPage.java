package pages;

import config.AppiumConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage extends BasePage{

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='More options']")
    MobileElement btnOpenMenu;
    @FindBy(xpath = "//*[@text='Login']")
    MobileElement btnLogin;

    @FindBy(xpath = "//*[@class='android.widget.TextView']")
    MobileElement someTextTitle;
    /*
    @FindBy(how = How.ID,using = "com.telran.ilcarro:id/findTitle")
    MobileElement findTitle;*/

    @FindBy(xpath = "//*[@text='My Cars']")
    MobileElement btnopenMyCars;


    public void openMenu() {//openMoreOptions
        clickBase(btnOpenMenu, 30);
    }

    public void openMyCarsPage() {
        clickBase(btnopenMyCars, 10);
    }



    public void clickLogin() {
        clickBase(btnLogin, 10);
    }

    public void openLoginPage() {
        openMenu();
        clickLogin();
    }
    public boolean shouldHaveTextTitle() {
        return isTextContain(someTextTitle, "Find your car now!",20);
    }


}


