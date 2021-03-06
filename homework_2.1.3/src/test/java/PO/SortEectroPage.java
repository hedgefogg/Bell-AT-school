package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SortEectroPage {
    private WebDriver driver;

    public SortEectroPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = ("//a[contains(@href,'catalog--mobilnye-telefony')]"))
    WebElement linkMobilePhone;

    public SortMobilePage clickLinkMobilePhone() {
        linkMobilePhone.click();
        return new SortMobilePage(driver);
    }
}
