package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainTest extends WebDriverSettings{

    @Test
    public void checkLinkWiki(){
        chromeDriver.get("https://yandex.ru/");
        WebElement inputField = chromeDriver.findElement(By.xpath("//input[@id='text']"));
        inputField.clear();
        inputField.sendKeys("Гладиолус");
        WebElement searchButton = chromeDriver.findElement(By.xpath("//button[@data-bem='{\"button\":{}}']"));
        searchButton.click();
        WebElement wikiLink = chromeDriver.findElement(By.xpath("//a[@href=\"http://ru.wikipedia.org/wiki/Шпажник\"]"));
        Assertions.assertEquals("Википедия", wikiLink.getText());
    }

}
