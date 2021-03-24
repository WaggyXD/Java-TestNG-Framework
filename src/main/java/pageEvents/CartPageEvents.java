package main.java.pageEvents;

import main.java.pageObjects.CartPageElements;
import main.java.pageObjects.HomePageElements;
import main.java.pageObjects.ProductPageElements;
import main.java.utils.ElementFetch;
import org.testng.Assert;
import test.java.BaseTest;

public class CartPageEvents {
    public String savePrice(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Save the price of the product from cart page");
        String price = elementFetch.getWebElement("XPATH", CartPageElements.productCartPrice).getText();
        return price;
    }

    public void deleteItem(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Click on Delete item button");
        elementFetch.getWebElement("XPATH", CartPageElements.deleteButton).click();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", CartPageElements.emptyCartLabel).size()>0,"Product was not deleted");
    }
}
