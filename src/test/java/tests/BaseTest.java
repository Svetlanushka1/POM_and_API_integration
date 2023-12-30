package tests;

import api.CarsApi;
import api.UserApi;
import data.ConfigProperties;
import dto.UserDTO;
import pages.*;

public class BaseTest {
   SplashPage splashPage = new SplashPage();
   SearchPage searchPage = new SearchPage();
   LoginPage loginPage = new LoginPage();
   MyCarsPage myCarsPage = new MyCarsPage();
   AddNewCarPage addNewCarPage = new AddNewCarPage();
   CarsApi carsApi = new CarsApi();
   UserApi userNamePasswordApi = new UserApi();
   String token = "";
 /*  UserDTO user = UserDTO.builder()
           .username("aaaaa@mail.com")
           .password("123456Aa$")
           .build();
*/
 UserDTO user = UserDTO.builder()
         .username(ConfigProperties.getProperty("username"))
         .password(ConfigProperties.getProperty("password"))
         .build();

   String[] carsSerNumbers = new String[20];
   int index = 0;
}
