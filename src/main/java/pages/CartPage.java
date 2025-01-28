package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    private By cartCount = By.cssSelector("#gh-cart-n span[class*='gh-cart-count']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartCount() {
        return driver.findElement(cartCount).getText().trim();
    }
}
