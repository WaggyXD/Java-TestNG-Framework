package test.java;

import main.java.pageEvents.CartPageEvents;
import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.ProductPageEvents;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends BaseTest{
    @Test
    public void testCase1() {
        HomePageEvents homePageEvents = new HomePageEvents();
        ProductPageEvents productPageEvents = new ProductPageEvents();
        CartPageEvents cartPageEvents = new CartPageEvents();

        homePageEvents.searchProduct("Samsung Galaxy Note 20");
        homePageEvents.clickOnSearchButton();
        String homePagePrice = homePageEvents.savePrice();
        BaseTest.logger.info(homePagePrice);
        homePageEvents.validateExistProduct();
        homePageEvents.selectFirstProduct();
        String productPagePrice = productPageEvents.savePrice();
        Assert.assertTrue(homePagePrice.equals(productPagePrice),"Los precios son diferentes");
        productPageEvents.addToCart();
        homePageEvents.goToCart();
        String cartPrice = cartPageEvents.savePrice();
        Assert.assertTrue(productPagePrice.equals(cartPrice),"Los precios del carrito son diferentes");
        cartPageEvents.deleteItem();
    }
}
