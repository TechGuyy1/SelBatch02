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
        DriverFactory.getDriver().get("https://www.saucedemo.com/");
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();



        Assert.assertTrue(loginPage.isLoginSuccessful(),
                "Login failed - Products page not displayed");
    }
}
