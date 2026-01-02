package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//ФЗ Проведение КНМ
public class КinrifinspectionactconductKNMPageObject {
    WebDriver driver;

    public КinrifinspectionactconductKNMPageObject(WebDriver driver) {
        this.driver = driver;
    }

    //Контрольно (надзорные) действия завершены - Да
    By inputKnmCompletedYes = By.xpath(".//label[contains(text(),'Контрольно (надзорные) действия завершены')]/following-sibling::div[1]/div[1]");
    //Контрольно (надзорные) действия завершены - Нет
    By inputKnmCompletedNo = By.xpath(".//label[contains(text(),'Контрольно (надзорные) действия завершены')]/following-sibling::div[1]/div[2]");
    //Контрольные (надзорные) мероприятия состоялись - Да
    By inputMKnmWotrkYes = By.xpath("//input[@name='notCheckYes']");
    //Контрольные (надзорные) мероприятия состоялись - Нет
    By inputMKnmWotrkNo = By.xpath("//input[@name='notCheckNo']");
    //Кнопка внести сведения
    By buttonConCompleed = By.xpath("//button[contains(text(),'Внести сведения')]");
    public void clickInputKnmCompletedYes(){
        WebElement webElement =  new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(inputKnmCompletedYes));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement);
        webElement.click();
    }
    public void clickInputKnmCompletedNo(){
       WebElement webElement =  new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(inputKnmCompletedNo));
       webElement.click();
    }
public void clickOInputMKnmWotrkYes(){
        new WebDriverWait(driver,Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(inputMKnmWotrkYes)).click();
}
public void clockInputMKnmWotrkNo(){
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(inputMKnmWotrkNo)).click();
}
public void cickButtonConCompleed(){
      WebElement webElement =   new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(buttonConCompleed));
      webElement.click();
}
}
