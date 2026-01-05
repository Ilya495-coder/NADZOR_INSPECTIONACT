import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PozitineBranchActTest extends BaseTest {

    @Test
    public void testAct() {

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
        $("h1").shouldHave(text("Сформировать акт КНМ"));

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
