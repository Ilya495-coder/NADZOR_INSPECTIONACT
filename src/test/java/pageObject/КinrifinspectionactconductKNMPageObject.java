package pageObject;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

//ФЗ Проведение КНМ
public class КinrifinspectionactconductKNMPageObject {


    //Контрольно (надзорные) действия завершены - Да
    SelenideElement inputKnmCompletedYes = $(xpath(".//label[contains(text(),'Контрольно (надзорные) действия завершены')]/following-sibling::div[1]/div[1]"));
    //Контрольно (надзорные) действия завершены - Нет
    SelenideElement inputKnmCompletedNo = $(xpath(".//label[contains(text(),'Контрольно (надзорные) действия завершены')]/following-sibling::div[1]/div[2]"));
    //Контрольные (надзорные) мероприятия состоялись - Да
    SelenideElement inputMKnmWotrkYes = $(xpath("//input[@name='notCheckYes']"));
    //Контрольные (надзорные) мероприятия состоялись - Нет
    SelenideElement inputMKnmWotrkNo = $(xpath("//input[@name='notCheckNo']"));
    //Кнопка внести сведения
    SelenideElement buttonConCompleed = $(xpath("//button[contains(text(),'Внести сведения')]"));

    public void clickInputKnmCompletedYes() {
        inputKnmCompletedYes.shouldBe(interactable, Duration.ofSeconds(20)).scrollTo().click();
    }

    public void clickInputKnmCompletedNo() {
        inputKnmCompletedNo.shouldBe(enabled, Duration.ofSeconds(20)).click();
    }

    public void clickOInputMKnmWotrkYes() {
        inputMKnmWotrkYes.shouldBe(enabled, Duration.ofSeconds(20)).click();
    }

    public void clickInputMKnmWotrkNo() {
        inputMKnmWotrkNo.shouldBe(enabled, Duration.ofSeconds(20)).click();
    }

    public void cickButtonConCompleed() {
        buttonConCompleed.shouldBe(enabled, Duration.ofSeconds(20)).click();
    }
}
