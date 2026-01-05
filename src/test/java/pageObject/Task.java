package pageObject;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class Task {

    SelenideElement getTask = $(xpath("(.//span[contains(@class, 'mobile-task-title')])[1]"));

    //  выбираем самую первую задачу
    public void getElementTask() {
        getTask.shouldBe(enabled, Duration.ofSeconds(40)).click();
    }
}