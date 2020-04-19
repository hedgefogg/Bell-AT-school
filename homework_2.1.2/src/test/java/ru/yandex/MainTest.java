package ru.yandex;

import PO.MainPage;
import PO.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class MainTest extends WebDriverSettings{

    @Test
    public void checkTitle(){
        System.out.println("Test1: checkTitle");
        MainPage mainPage = new MainPage(chromeDriver);
        String title = chromeDriver.getTitle();
        System.out.println(title);
        Assertions.assertTrue(title.contains("Яндекс"));
    }
    @Test
    public void checkLinkWiki(){
        MainPage mainPage = new MainPage(chromeDriver);
        SearchPage searchPage = new SearchPage(chromeDriver);
        mainPage.findObject("Гладиолус");
        Boolean chek = false;
        for (WebElement we : searchPage.getListOfWebElement())
            if(we.getAttribute("href").equals("https://ru.wikipedia.org/wiki/%D0%A8%D0%BF%D0%B0%D0%B6%D0%BD%D0%B8%D0%BA"))
                chek=true;
        Assertions.assertTrue(chek);
    }



}
