package pages;

import dto.UserDTO;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//*[@text='Email']")
    MobileElement inputEmail;

    @FindBy(xpath = "//*[@text='Password']")
    MobileElement inputPassword;

    @FindBy(xpath = "//*[@class='android.widget.Button']")
    MobileElement btnYalla;

    public void login(UserDTO user) {
        System.out.println(user.getUsername());
        typeTestBase(inputEmail, 30, user.getUsername());
        typeTestBase(inputPassword, 5, user.getPassword());
        clickBase(btnYalla, 5);
    }
}
