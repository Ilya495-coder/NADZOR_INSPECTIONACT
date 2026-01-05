package pageObject;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;


public class AutorizationPageObject {

    SelenideElement buttonSignInLoginAndPassword = $(".login-page__login");
    SelenideElement fieldLogin = $("#username");
    SelenideElement fieldPassword = $("#password");
    SelenideElement signIn = $("[name='login']");

    public void clickButtonSignIb() {
        buttonSignInLoginAndPassword.shouldBe(enabled, Duration.ofSeconds(20)).click();
    }

    public void setFieldLoginPassword(String login, String password) {
        fieldLogin.sendKeys(login);
        fieldPassword.sendKeys(password);
        signIn.click();
    }

}
