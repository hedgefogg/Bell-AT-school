package ru.yandex;

import PO.MainPage;
import PO.SortEectroPage;
import PO.SortMobilePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class MainTest extends WebDriverSettings {

    private void son(int s) {
        try {
            Thread.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkTitle() {
        System.out.println("checkTitle");
        String title = driver.getTitle();
        System.out.println(title);
        Assertions.assertTrue(title.contains("Яндекс.Маркет"));
    }

    @Test
    public void checkModel() {
        MainPage mainPage = new MainPage(driver);
        SortEectroPage sortEectroPage = new SortEectroPage(driver);
        SortMobilePage sortMobilePage = new SortMobilePage(driver);
        mainPage.clickElectro();
        sortEectroPage.clickLinkMobilePhone();
        sortMobilePage.clickCheckBox("Xiaomi");
        son(5000);
        boolean check = false;
        for (WebElement e : sortMobilePage.getListOfWebElement())
            if (e.getText().equals("XIAOMI"))
                check = true;
        Assertions.assertTrue(check);
    }

}