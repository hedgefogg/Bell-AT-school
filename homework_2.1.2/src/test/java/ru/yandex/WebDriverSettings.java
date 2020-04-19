package ru.yandex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebDriverSettings {

    WebDriver chromeDriver;

    @BeforeEach
    public void setUpYandexTest(){
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver",System.getenv("CHROME_DRIVER"));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1200");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);


    }

    @AfterEach
    public void tearDown(){
        chromeDriver.quit();
    }

}
