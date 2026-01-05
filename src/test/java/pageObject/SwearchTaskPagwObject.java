package pageObject;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;


public class SwearchTaskPagwObject {

    SelenideElement buttonGosuslugi = $(xpath("//div[@id='sidebar_menu']/div[1]/cdp-menu-item/a/div/div[1]"));
    SelenideElement buttonTask = $(xpath("//div[@id='sidebar_menu']/div[1]/cdp-menu-item/div/div/cdp-menu-item[1]"));

    public void clickTask() {
        buttonGosuslugi.shouldBe(enabled, Duration.ofSeconds(40)).click();
        buttonTask.shouldBe(enabled, Duration.ofSeconds(40)).click();

    }

}
