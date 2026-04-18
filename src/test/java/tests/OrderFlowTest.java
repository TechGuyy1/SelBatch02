package tests;

import base.BaseTest;
import listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import utils.DriverFactory;

@Listeners(TestListener.class)
public class OrderFlowTest extends BaseTest {

    @Test
    public void placeOrderTest() {

//        LoginPage login = new LoginPage(DriverFactory.getDriver());
//        login.enterUsername("standard_user");
//        login.enterPassword("secret_sauce");
//        login.clickLogin();
LoginTest loginTest= new LoginTest();
loginTest.validLoginTest();

        ProductsPage products = new ProductsPage(DriverFactory.getDriver());
//        products.acceptJsAlert();
        products.addProductToCart();
        products.goToCart();

        CartPage cart = new CartPage(DriverFactory.getDriver());
        cart.proceedToCheckout();

        CheckoutPage checkout = new CheckoutPage(DriverFactory.getDriver());
        checkout.enterCustomerDetails();
        checkout.finishOrder();

        Assert.assertTrue(checkout.isOrderSuccessful(),
                "Order placement failed");
    }
}
