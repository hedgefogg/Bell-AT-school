package PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage {
    private WebDriver chromeDriver;
    private List<WebElement> listOfWebElement;

    public SearchPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
}
