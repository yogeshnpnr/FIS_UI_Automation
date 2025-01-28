package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    private WebDriver driver;

    private By firstProductLink = By.cssSelector(".s-item a.s-item__link");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFirstProduct() {
        driver.findElement(firstProductLink).click();
    }
}
