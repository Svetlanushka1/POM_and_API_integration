package pages;

import config.AppiumConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(AppiumConfig.getDriver()), this);
    }
    protected void wait(WebElement element, int time){
        new WebDriverWait(AppiumConfig.getDriver(),time)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public String getTextBase(MobileElement element, int time){
        wait(element,time);
        return element.getText().toUpperCase().trim();
    }
    public boolean isTextContain(MobileElement element, String expectedRes, int time){
        expectedRes = expectedRes.toUpperCase().trim();
        String actualRes = getTextBase(element,time);
        if(actualRes.contains(expectedRes)){
            return true;
        }else{
            System.out.println("expected result: " + expectedRes + "Actual Result: "+actualRes);
            return false;
        }
    }

}
