package main.java.pageObjects;

public interface HomePageElements {
    String searchTextBox = "//*[@id=\"twotabsearchtextbox\"]";
    String searchButton = "//*[@id=\"nav-search-submit-text\"]";
    String searchResultElement1 = "(//*[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-2\"])[1]";
    String priceFirstProduct = "//*[@class=\"a-offscreen\"][1]";
    String cartButton = "//*[@id=\"nav-cart\"]";
}
