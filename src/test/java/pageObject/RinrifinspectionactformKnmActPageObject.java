package pageObject;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//ФЗ Сформировать Акт
public class RinrifinspectionactformKnmActPageObject {

    WebDriver  driver;
    public RinrifinspectionactformKnmActPageObject(WebDriver driver) {
        this.driver = driver;
    }


    //текстовое поле Результат проведения КНМ
    By textArearesoult = By.xpath(".//textarea[@name = 'checkResult']");
    //Блок "Рассмотренные документы" текстовое поле "Наименование"
    By textAreaNameRevie = By.xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr/td[1]/textarea");
    //Блок "Рассмотренные документы" текстовое поле "Номер"
    By textAreaNumberRevie = By.xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr/td[2]/textarea");
    //Блок "Рассмотренные документы" текстовое поле "Дата"
    By textAreaDataRevie = By.xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr/td[3]/rinrif-date-selector/div/input");
    //Блок "Рассмотренные документы" текстовое поле "Источник"
    By textAreaSourceRevie = By.xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr/td[4]/textarea");

    //кнопка плюс
    By buttonPlus = By.xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr/td[5]/button[2]");

    //Блок "Рассмотренные документы" текстовое поле "Наименование"
    By textAreaNameRevieDouble = By.xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr[2]/td[1]/textarea");
    //Блок "Рассмотренные документы" текстовое поле "Номер"
    By textAreaNumberRevieDouble = By.xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr[2]/td[2]/textarea");
    //Блок "Рассмотренные документы" текстовое поле "Дата"
    By textAreaDataRevieDouble = By.xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr[2]/td[3]/rinrif-date-selector/div/input");
    //Блок "Рассмотренные документы" текстовое поле "Источник"
    By textAreaSourceRevieDouble = By.xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr[2]/td[4]/textarea");

    //Блок "Приложенные документы" текстовое поле "Наименование"
    By textAreaNameAttached = By.xpath(".//h3[contains(text(),'Приложенные документы')]/following-sibling::table/tbody/tr/td[1]/textarea");
    //Блок "Приложенные документы" текстовое поле "Реквизиты"
    By textAreaRequisitesAttached = By.xpath(".//h3[contains(text(),'Приложенные документы')]/following-sibling::table/tbody/tr/td[2]/textarea");
    //Блок "Приложенные документы" текстовое поле "Тип"
    By textAreaTypeAttached = By.xpath(".//h3[contains(text(),'Приложенные документы')]/following-sibling::table/tbody/tr/td[3]/ng-select/div/div/div[3]/input");///div/div/div[2]

    //поле способ отправки
    By fieldSend = By.xpath(".//label[contains(text(),'Способ отправки')]/following-sibling::div/ng-select/div/div/div[3]/input");

    By fieldEmail = By.xpath(".//label[contains(text(),'e-mail контролируемого лица')]/following-sibling::div/textarea");
    By buttonFile = By.xpath(".//button[contains(text(),'Сформировать Акт')]");
    //кнопка подписать и направит
    By buttonCompleted = By.xpath(".//button[contains(text(),'Подписать и направить')]");


    public void putchBlockRevie(){
        new WebDriverWait(driver , Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(textArearesoult)).sendKeys("Тестовый результат проведления кнм");
        driver.findElement(textAreaNameRevie).sendKeys("Тестовый текст в поле Наименование блок Рассмотренные документы");
        driver.findElement(textAreaNumberRevie).sendKeys("Тестовый номер");
        WebElement webElement = driver.findElement(textAreaDataRevie);
        webElement.click();
        driver.findElement(By.xpath(".//span[contains(text(),'15')]")).click();
        driver.findElement(textAreaSourceRevie).sendKeys("Тетовый текс в поле Источник");
    }
    public void putchBlockRevieDouble(){
        driver.findElement(buttonPlus).click();
        new WebDriverWait(driver , Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(textAreaNameRevieDouble)).sendKeys("Тестовое наименование дубль");
        driver.findElement(textAreaNumberRevieDouble).sendKeys("Тестовый номер дубль");
        WebElement webElement =  driver.findElement(textAreaDataRevieDouble);
        webElement.click();
        driver.findElement(By.xpath(".//span[contains(text(),'20')]")).click();
        driver.findElement(textAreaSourceRevieDouble).sendKeys("Тестовый текст в поле источник дубль");

    }
    public void putchBlockAttached(){
        driver.findElement(textAreaNameAttached).sendKeys("тестовый текс в поле Наименование блок Приложенные документы");
        driver.findElement(textAreaRequisitesAttached).sendKeys("Тестовые реквизиты в блоке Приложенные документы");
       WebElement webElement =  driver.findElement(textAreaTypeAttached);
        webElement.sendKeys("по");
        webElement.sendKeys(Keys.ENTER);
    }
    public void fieldTextSend(){
       WebElement webElement =  driver.findElement(fieldSend);
        webElement.sendKeys("по");
        webElement.sendKeys(Keys.ENTER);
    }
    public void fieldTextEmail(){
        driver.findElement(fieldEmail).sendKeys("IGoncharov@reinform.ru");
    }
    public void clickButtonFile(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(buttonFile)).click();
    }
    public void clickCompleted(){
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(buttonCompleted)).click();
    }
}
