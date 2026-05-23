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

        LoginPage login = new LoginPage(DriverFactory.getDriver());
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();
//LoginTest loginTest= new LoginTest();
//loginTest.validLoginTest(); ---> This is not a good practice to call a test as a reusable method instead create a reusable method in helper class or page class class
//
//Commenting below line just to check CI failure check
//        ProductsPage products = new ProductsPage(DriverFactory.getDriver());
//        products.acceptJsAlert();
//        products.addProductToCart();
//        products.goToCart();
//        CartPage cart = new CartPage(DriverFactory.getDriver());
//        cart.proceedToCheckout();
//        CheckoutPage checkout = new CheckoutPage(DriverFactory.getDriver());
//        checkout.enterCustomerDetails();
//        checkout.finishOrder();
//        Assert.assertTrue(checkout.isOrderSuccessful(),
//                "Order placement failed");
    }
}
