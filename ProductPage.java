package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    private By quantityDropdown = By.id("qtyTextBox");
    private By addToCartButton = By.id("atcRedesignId_btn");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setQuantity(String quantity) {
        driver.findElement(quantityDropdown).clear();
        driver.findElement(quantityDropdown).sendKeys(quantity);
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }
}
