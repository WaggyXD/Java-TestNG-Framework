package main.java.pageObjects;

import main.java.utils.ElementFetch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePagePageFactory_Pending {
    public WebDriver rdriver;

    public void WindowsPage(WebDriver driver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
    @CacheLookup
    WebElement searchTextBox;

    @FindBy(xpath="//*[@id=\"nav-search-submit-text\"]")
    @CacheLookup
    WebElement searchButton;

    @FindBy(xpath="//*[@data-image-index=\"0\"]")
    @CacheLookup
    WebElement searchResultElement1;

    @FindBy(xpath="//*[@class=\"a-offscreen\"][1]")
    @CacheLookup
    WebElement priceFirstProduct;

    public void searchProduct(String product){
        searchTextBox.sendKeys(product);
        searchButton.click();
        Assert.assertFalse(searchResultElement1.isDisplayed(),"Product not found");

    }
}
