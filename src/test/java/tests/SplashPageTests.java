package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SplashPageTests extends BaseTest{
    @Test
    public void versionTestPositive() {
        Assert.assertTrue(splashPage.validateTextVersionCorrect());
    }
}
