package ru.yandex;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebDriverSettings {
    WebDriver driver = new ChromeDriver();

    @BeforeEach
    public void setUpYandexTest() {
        System.setProperty("webdriver.chrome.driver","src\\test\\java\\resources\\chromedriver.exe");
        driver= new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://yandex.ru/");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
