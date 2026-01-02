package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task {
    private WebDriver webDriver;

    public Task(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    By getTask = By.xpath("(.//span[contains(@class, 'mobile-task-title')])[1]");
    //  выбираем самую первую задачу
    public void getElementTask() {
        new WebDriverWait(webDriver, Duration.ofSeconds(40))
                .until(ExpectedConditions.elementToBeClickable(getTask)).click();
    }
}