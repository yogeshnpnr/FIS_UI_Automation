package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    private By searchBox = By.id("gh-ac");
    private By searchButton = By.id("gh-btn");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchForItem(String item) {
        driver.findElement(searchBox).sendKeys(item);
        driver.findElement(searchButton).click();
    }
}
