package main.java.pageObjects;

public interface CartPageElements {
    String deleteButton = "//*[@Value=\"Delete\"]";
    String emptyCartLabel = "//*[@class=\"a-row sc-your-amazon-cart-is-empty\"]";
    String productCartPrice = "//*[@id=\"sc-subtotal-amount-activecart\"]/span";
}
