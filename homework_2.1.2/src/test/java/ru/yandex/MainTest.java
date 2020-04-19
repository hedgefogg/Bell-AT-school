package ru.yandex;

import PO.MainPage;
import PO.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainTest extends WebDriverSettings {

    @Test
    public void checkTitle() {
        String title = chromeDriver.getTitle();
        System.out.println(title);
        Assertions.assertTrue(title.contains("Яндекс"));
    }

    @Test
    public void checkLinkWiki() {
        MainPage mainPage = new MainPage(chromeDriver);
        SearchPage searchPage = new SearchPage(chromeDriver);
        mainPage.findObject("Гладиолус");
        WebElement wikiLink = chromeDriver.findElement(By.xpath("//a[@href=\"http://ru.wikipedia.org/wiki/Шпажник\"]"));
        Assertions.assertEquals("Википедия", wikiLink.getText());
    }
}
