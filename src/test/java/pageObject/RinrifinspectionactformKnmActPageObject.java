package pageObject;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

//ФЗ Сформировать Акт
public class RinrifinspectionactformKnmActPageObject {

    //текстовое поле Результат проведения КНМ
    SelenideElement textArearesoult = $(xpath(".//textarea[@name = 'checkResult']"));
    //Блок "Рассмотренные документы" текстовое поле "Наименование"
    SelenideElement textAreaNameRevie = $(xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr/td[1]/textarea"));
    //Блок "Рассмотренные документы" текстовое поле "Номер"
    SelenideElement textAreaNumberRevie = $(xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr/td[2]/textarea"));
    //Блок "Рассмотренные документы" текстовое поле "Дата"
    SelenideElement textAreaDataRevie = $(xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr/td[3]/rinrif-date-selector/div/input"));
    //Блок "Рассмотренные документы" текстовое поле "Источник"
    SelenideElement textAreaSourceRevie = $(xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr/td[4]/textarea"));

    //кнопка плюс
    SelenideElement buttonPlus = $(xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr/td[5]/button[2]"));

    //Блок "Рассмотренные документы" текстовое поле "Наименование"
    SelenideElement textAreaNameRevieDouble = $(xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr[2]/td[1]/textarea"));
    //Блок "Рассмотренные документы" текстовое поле "Номер"
    SelenideElement textAreaNumberRevieDouble = $(xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr[2]/td[2]/textarea"));
    //Блок "Рассмотренные документы" текстовое поле "Дата"
    SelenideElement textAreaDataRevieDouble = $(xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr[2]/td[3]/rinrif-date-selector/div/input"));
    //Блок "Рассмотренные документы" текстовое поле "Источник"
    SelenideElement textAreaSourceRevieDouble = $(xpath(".//h3[contains(text(),'Рассмотренные документы')]/following-sibling::table/tbody/tr[2]/td[4]/textarea"));

    //Блок "Приложенные документы" текстовое поле "Наименование"
    SelenideElement textAreaNameAttached = $(xpath(".//h3[contains(text(),'Приложенные документы')]/following-sibling::table/tbody/tr/td[1]/textarea"));
    //Блок "Приложенные документы" текстовое поле "Реквизиты"
    SelenideElement textAreaRequisitesAttached = $(xpath(".//h3[contains(text(),'Приложенные документы')]/following-sibling::table/tbody/tr/td[2]/textarea"));
    //Блок "Приложенные документы" текстовое поле "Тип"
    SelenideElement textAreaTypeAttached = $(xpath(".//h3[contains(text(),'Приложенные документы')]/following-sibling::table/tbody/tr/td[3]/ng-select/div/div/div[3]/input"));
    /// div/div/div[2]

    //поле способ отправки
    SelenideElement fieldSend = $(xpath(".//label[contains(text(),'Способ отправки')]/following-sibling::div/ng-select/div/div/div[3]/input"));

    SelenideElement fieldEmail = $(xpath(".//label[contains(text(),'e-mail контролируемого лица')]/following-sibling::div/textarea"));
    SelenideElement buttonFile = $(xpath(".//button[contains(text(),'Сформировать Акт')]"));
    //кнопка подписать и направит
    SelenideElement buttonCompleted = $(xpath(".//button[contains(text(),'Подписать и направить')]"));

    //Дата
    SelenideElement fieldTime = $(xpath(".//input[@placeholder = '__.__.____']"));
    //Проведение проверки не представляется возможным по следующим причинам
    SelenideElement inputNotPossible = $(xpath("(//input[@aria-autocomplete= 'list'])[1]"));
    //Способ отправки
    SelenideElement inputSend = $(xpath("(//input[@aria-autocomplete= 'list'])[2]"));


    public void putchBlockRevie() {
        textArearesoult.shouldBe(enabled, Duration.ofSeconds(15)).setValue("Тестовый результат проведления кнм");
        textAreaNameRevie.shouldBe(enabled, Duration.ofSeconds(15)).setValue("Тестовый текст в поле Наименование блок Рассмотренные документы");
        textAreaNumberRevie.setValue("Тестовый номер");
        textAreaDataRevie.click();
        $(xpath(".//span[contains(text(),'15')]")).click();
        textAreaSourceRevie.setValue("Тетовый текс в поле Источник");
    }

    public void putchBlockRevieDouble() {
        buttonPlus.click();
        textAreaNameRevieDouble.shouldBe(enabled, Duration.ofSeconds(10)).setValue("Тестовое наименование дубль");
        textAreaNumberRevieDouble.setValue("Тестовый номер дубль");
        textAreaDataRevieDouble.click();
        $(xpath(".//span[contains(text(),'20')]")).click();
        textAreaSourceRevieDouble.setValue("Тестовый текст в поле источник дубль");

    }

    public void putchBlockAttached() {
        textAreaNameAttached.setValue("тестовый текс в поле Наименование блок Приложенные документы");
        textAreaRequisitesAttached.setValue("Тестовые реквизиты в блоке Приложенные документы");
        textAreaTypeAttached.setValue("по").pressEnter();
    }

    public void fieldTextSend() {
        fieldSend.setValue("по").pressEnter();
    }

    public void fieldTextEmail() {
        fieldEmail.setValue("IGoncharov@reinform.ru");
    }

    public void clickButtonFile() {
        buttonFile.shouldBe(enabled, Duration.ofSeconds(10)).click();
    }

    public void clickCompleted() {
        buttonCompleted.shouldBe(enabled, Duration.ofSeconds(30)).click();
    }
    public void printTask(){
        fieldTime.shouldBe(enabled , Duration.ofSeconds(5)).click();
        $(xpath(".//td[@class='ng-star-inserted']/span[contains(text(),'20')]")).click();
        inputNotPossible.setValue("иное").pressEnter();
        inputSend.setValue("заказным").pressEnter();
        $(".form-control.ng-untouched.ng-pristine.ng-valid").setValue("Тестовый адрес");
        buttonFile.click();
        buttonCompleted.shouldBe(enabled , Duration.ofSeconds(10)).click();
    }
}
