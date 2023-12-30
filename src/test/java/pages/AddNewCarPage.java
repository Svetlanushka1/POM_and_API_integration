package pages;

import config.AppiumConfig;
import dto.AddCarDTO;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.FindBy;

public class AddNewCarPage extends BasePage{
    /*
    @FindBy(xpath = "//*[@text='Serial number']")
    MobileElement inputSerNumber;

    @FindBy(xpath = "//*[@text='Manufacture']")
    MobileElement inputManufacture;

    @FindBy(xpath = "//*[@text='Model']")
    MobileElement inputModel;

    @FindBy(xpath = "//*[@text='City']")
    MobileElement inputCity;

    @FindBy(xpath = "//*[@text='Price per day']")
    MobileElement inputPrice;

    @FindBy(xpath = "//*[@text='Car Class']")
    MobileElement inputCarClass;

    @FindBy(xpath = "//*[@text='Fuel type']")
    MobileElement inputFuelType;

    @FindBy(xpath = "//*[@text='Diesel']")
    MobileElement fuelPetrol;

//    String fuelType = "";
//    @FindBy(xpath = String.format("//*[@text='%s']", fuelType))
//    MobileElement fuel;
//
//    select fuel type
//    public MobileElement getFuelTypeBtn(String fuel) {
//        @FindBy(xpath = fuel)
//        MobileElement fuelType;
//        MobileElement fuelType1 = fuelType;
//        return fuelType1;
//    }

    @FindBy(xpath = "//*[@text='Year']")
    MobileElement inputYear;

    @FindBy(xpath = "//*[@text='Seats count']")
    MobileElement inputSeatsCount;

    @FindBy(xpath = "//*[@text='Add car!']")
    MobileElement btnAddCar;

    public void addNewCar(AddCarDTO data) {
        typeTestBase(inputSerNumber, 30, data.getSerialNumber());
        typeTestBase(inputManufacture, 10, data.getManufacture());
        typeTestBase(inputModel, 10, data.getModel());
        typeTestBase(inputCity, 10, data.getCity());
        typeTestBase(inputPrice, 10, String.valueOf(data.getPricePerDay()));
        typeTestBase(inputCarClass, 10, data.getCarClass());

        MobileElement element1 = (MobileElement) AppiumConfig.getDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textContains(\"type\"))"));

        clickBase(inputFuelType, 10);
        clickBase(fuelPetrol, 30);
        typeTestBase(inputYear, 10, String.valueOf(data.getYear()));
        typeTestBase(inputSeatsCount, 10, String.valueOf(data.getSeats()));

//        AppiumConfig.getDriver().findElementByAndroidUIAutomator("new UiScrollable(new    UiSelector()" +
//                ".scrollable(true).instance(0))" +
//                ".scrollIntoView(new UiSelector().textContains(\"car\")" +
//                ".instance(0))").click(); //scroll down to the element and click

        MobileElement element = (MobileElement) AppiumConfig.getDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textContains(\"car\"))"));


//        // Get the coordinates (x, y) of the element
//        int x = btnAddCar.getLocation().getX();
//        int y = btnAddCar.getLocation().getY();
//
//        TouchAction touchAction = new TouchAction(AppiumConfig.getDriver());
//        touchAction.press(PointOption.point(x, y))
//                .waitAction()
//                .moveTo(PointOption.point(x +30, y + 30)) // Adjust the scroll distance as needed
//                .release()
//                .perform();

        // add scroll
        clickBase(btnAddCar, 10);
    }*/

}

/*
MultiTouchAction multiTouch = new MultiTouchAction(driver);
TouchAction action0 = new TouchAction(driver).tap(el);
TouchAction action1 = new TouchAction(driver).tap(el);
TouchAction action2 = new TouchAction(driver).tap(el);
multiTouch.add(action0).add(action1).add(action2).perform();
 */
/*
        // Scroll to the element with text "Your Element Text"
        scrollElementIntoView(driver, "Your Element Text");

        // Your test steps go here...

        // Close the driver
        driver.quit();
    }

    public static void scrollElementIntoView(AppiumDriver<MobileElement> driver, String elementText) {
        MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textContains(\"" + elementText + "\"))"));

        // Optional: You can perform additional actions with the found element if needed
        // For example, you can click on the element after scrolling to it
        element.click();
    }
 */
