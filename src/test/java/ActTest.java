import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.*;

import java.time.Duration;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

public class ActTest {
    WebDriver driver;
    Api api;
    Task task;
    AutorizationPageObject autorizationPageObject;
    SwearchTaskPagwObject swearchTaskPagwObject;
    КinrifinspectionactconductKNMPageObject кinrifinspectionactconductKNMPageObject;
    RinrifinspectionactformKnmActPageObject rinrifinspectionactformKnmActPageObject;

    @BeforeEach
    public void test() {
        driver = new ChromeDriver();
        api = new Api();
        api.postAct();
        кinrifinspectionactconductKNMPageObject = new КinrifinspectionactconductKNMPageObject(driver);
        swearchTaskPagwObject = new SwearchTaskPagwObject(driver);
        autorizationPageObject = new AutorizationPageObject(driver);
        rinrifinspectionactformKnmActPageObject = new RinrifinspectionactformKnmActPageObject(driver);
        task = new Task(driver);
        driver.get("https://smart-dev.reinform-int.ru/main/#/app/");

    }

    @Test
    public void testAct(){

        //ваторизация
        autorizationPageObject.clickButtonSignIb();
        autorizationPageObject.setFieldLoginPassword("ilya", "Ghbdtn123");
        //госуслуги - задачи
        swearchTaskPagwObject.clickTask();
        //открываем самую первую задачу в витрине
        task.getElementTask();
        //действия на форме Проведения кнм
        кinrifinspectionactconductKNMPageObject.clickInputKnmCompletedYes();
        кinrifinspectionactconductKNMPageObject.cickButtonConCompleed();
        //открываем самую первую задачу в витрине
        task.getElementTask();
       boolean atual =  new WebDriverWait(driver , Duration.ofSeconds(3))
                .until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(".//h1[contains(text(),'Сформировать акт КНМ')]"), "Сформировать акт КНМ"));
        assertTrue(atual);

        //действия на ФЗ Сформировать акт
        rinrifinspectionactformKnmActPageObject.putchBlockRevie();
        rinrifinspectionactformKnmActPageObject.putchBlockRevieDouble();
        rinrifinspectionactformKnmActPageObject.putchBlockAttached();
        rinrifinspectionactformKnmActPageObject.fieldTextSend();
        rinrifinspectionactformKnmActPageObject.fieldTextEmail();
        rinrifinspectionactformKnmActPageObject.clickButtonFile();
        rinrifinspectionactformKnmActPageObject.clickCompleted();

        //открываем самую первую задачу в витрине
        task.getElementTask();
        //Действия на форме Подписать Акт
    }
}
