package tests;

import config.AppiumConfig;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchCarTests extends BaseTest {
    @BeforeSuite
    public void preCondition(){
        new SearchPage().openLoginPage();
        loginPage.login(user);
    }
    @Test
    public void searchCar(){
        searchPage.shouldHaveTextTitle();
        searchResultPage.searchFreeCar().isResultScreenDisplayed();
//TODO check this test

     // Assert.assertTrue(new SearchScreen(driver).searchingFreeCar().isResultScreenDisplayed());
  //  Assert.assertTrue(new SearchResultScreen(driver).searchFreeCar("Netanya","1/06/2023","5/06/2023").isResultScreenDisplayed());


   /* selectDataFrom();
    selectdataTo();
    submitYalla();*/

        // Assert.assertEquals(location,"Tel Aviv");*/
    }



}
