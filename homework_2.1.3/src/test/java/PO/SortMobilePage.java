package PO;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static java.lang.String.format;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class SortMobilePage {
    String URL = "https://market.yandex.ru/catalog--mobilnye-telefony-v-penze/54726/list?hid=91491";
    private WebDriver driver;
    String model;
    private int count;

    public SortMobilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    private String checkBox = "//*[text()='%s']/ancestor::*[@class='LhMupC0dLR']";

    @FindBy(how = How.XPATH, using = ("//*[@class='n-snippet-cell2__brand-name']"))
    List<WebElement> listOfWebElement;

    @FindBy(how = How.XPATH, using = ("//span[text()='Вперед']/ancestor::a"))
    WebElement pageGo;


    public void clickCheckBox(String model) {
        new WebDriverWait(driver, 5).until(visibilityOfElementLocated(By.xpath(format(checkBox, model)))).click();
        count = 1;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (count <= 10) {
            if (pageGo.isDisplayed()) {
                try {
                    pageGo.click();
                    count++;
                } catch (WebDriverException e) {
                    break;
                }
            } else {
                try {
                    System.out.println();
                    break;
                } catch (NoSuchElementException f) {
                    break;
                }
            }
        }
    }

    public List<WebElement> getListOfWebElement() {
        return listOfWebElement;
    }
}
