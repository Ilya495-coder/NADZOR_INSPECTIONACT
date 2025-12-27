package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SwearchTaskPagwObject {

    WebDriver driver;

    public SwearchTaskPagwObject(WebDriver driver) {
        this.driver = driver;
    }

    By buttonGosuslugi = By.xpath("//*[@id='sidebar_menu']/div[1]/cdp-menu-item/a/div/div[1]");
    By buttonTask = By.xpath("//*[@id='sidebar_menu']/div[1]/cdp-menu-item/div/div/cdp-menu-item[1]");

    public void clickTask(){
     new   WebDriverWait(driver , Duration.ofSeconds(3))
               .until(ExpectedConditions.elementToBeClickable(buttonGosuslugi)).click();
        new   WebDriverWait(driver , Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(buttonTask)).click();
        //driver.findElement(buttonTask).click();
    }

}
