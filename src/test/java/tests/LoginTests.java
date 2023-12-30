package tests;


import data.ConfigProperties;
import dto.UserDTO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{


    @Test
    public void LoginPositiveTest() {
      searchPage.openLoginPage();
       loginPage.login(user);
      // Assert.assertTrue();
    }

}
