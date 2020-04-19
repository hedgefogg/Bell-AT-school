package PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver chromeDriver;
    private WebElement inputField;
    private WebElement searchButton;
    String URL = "https://yandex.ru/";



    public MainPage(WebDriver chromeDriver){
        this.chromeDriver=chromeDriver;
        chromeDriver.get(URL);
        inputField =chromeDriver.findElement(By.xpath("//input[@id='text']"));
        searchButton = chromeDriver.findElement(By.xpath("//button[@data-bem='{\"button\":{}}']"));
    }

    public SearchPage findObject(String object){
        inputField.clear();
        inputField.sendKeys(object);
        searchButton.click();
        return new SearchPage(chromeDriver);
    }


}
