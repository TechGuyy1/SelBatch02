package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class TriLoginPage {
    private WebDriver driver;

    public TriLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By userId = By.id("Email");
    By password = By.id("Password");
    By loginButton = By.xpath("//*[@class='button-1 login-button']");
    By userEmail = By.xpath("(//*[@class='account'])[1]");

    public TriLoginPage() {

    }

    public void enterUserid() {
        driver.findElement(userId).sendKeys("test501502@gmail.com");
    }

    public void enterPwd() {
        driver.findElement(password).sendKeys("Test@123#");
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getUserEmail() {
       return driver.findElement(userEmail).getText();
    }
}
