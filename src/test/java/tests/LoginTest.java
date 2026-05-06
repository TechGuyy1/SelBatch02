package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        //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


        Assert.assertTrue(loginPage.isLoginSuccessful(),
                "Login failed - Products page not displayed");
    }
}
