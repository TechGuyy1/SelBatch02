package tests;

import base.BaseTest;
import com.sun.tools.jconsole.JConsoleContext;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TriLoginPage;
import utils.DriverFactory;

public class TryLoginTest extends BaseTest {
    @Test
    public void validateLoginTest(){
        TriLoginPage triLoginPage=new TriLoginPage(DriverFactory.getDriver());
        DriverFactory.getDriver().get("https://demowebshop.tricentis.com/login");
        triLoginPage.enterUserid();
        triLoginPage.enterPwd();
        triLoginPage.clickLoginButton();
        Assert.assertEquals(triLoginPage.getUserEmail(),"test501502@gmail.com");
    }
}
