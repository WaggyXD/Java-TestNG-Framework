package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import test.java.BaseTest;

import java.time.Duration;

public class HomePageEvents{
    public void searchProduct(String product){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Enter search product in the search text box");
        elementFetch.getWebElement("XPATH", HomePageElements.searchTextBox).sendKeys(product);
    }

    public void clickOnSearchButton(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("User click on search button");
        elementFetch.getWebElement("XPATH", HomePageElements.searchButton).click();
    }

    public void validateExistProduct(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Validate if the product element is displayed");
        Assert.assertTrue(elementFetch.getListWebElements("XPATH",HomePageElements.searchResultElement1).size()>0,"Product not found");
    }

    public String savePrice(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Save price from first page");
        String price = elementFetch.getWebElement("XPATH",HomePageElements.priceFirstProduct).getText();
        String[] splitPrice = price.split(";");
        return splitPrice[1];
    }

    public void selectFirstProduct(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Select the first product displayed in the list");
        elementFetch.getWebElement("xpath",HomePageElements.searchResultElement1).click();
    }

    public void goToCart(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("User click on go to cart button");
        elementFetch.getWebElement("XPATH", HomePageElements.cartButton).click();
    }


}
