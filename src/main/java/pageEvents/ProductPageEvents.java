package main.java.pageEvents;
import main.java.pageObjects.ProductPageElements;
import main.java.utils.ElementFetch;
import org.testng.Assert;
import test.java.BaseTest;

public class ProductPageEvents {
    public String savePrice(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Save the price of the product from product page");
        String price = elementFetch.getWebElement("XPATH", ProductPageElements.productPrice).getText();
        return price;
    }

    public void addToCart(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Click on add to cart button");
        elementFetch.getWebElement("XPATH", ProductPageElements.addToCartButton).click();
    }
}
