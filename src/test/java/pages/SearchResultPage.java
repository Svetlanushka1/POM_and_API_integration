package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {
    @FindBy(id="com.telran.ilcarro:id/resultTitle")
    MobileElement resultTitle;
    // type city and dates
    @FindBy(id = "com.telran.ilcarro:id/editLocation")
    MobileElement editLocation;
    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/editFrom']")
    MobileElement editFrom;
    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/editTo']")
    MobileElement editTo;
    @FindBy(id="com.telran.ilcarro:id/searchBtn")
    MobileElement searchBtn;
//

    public boolean isResultScreenDisplayed(){
        wait(resultTitle,5);
        return resultTitle.getText().equals("Search result");
    }
    public SearchResultPage searchFreeCar() {
        isElementVisibility(editLocation, 15);
        //waitElement(editLocation,1600);
        editLocation.click();
        editLocation.clear();
        typeTestBase(editLocation, 20, "Netanya");
        editFrom.sendKeys("01/07/2023");
        editTo.sendKeys("10/07/2023");
        searchBtn.click();

        return new SearchResultPage();
    }


}

