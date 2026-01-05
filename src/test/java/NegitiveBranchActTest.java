import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class NegitiveBranchActTest extends BaseTest{

    @Test
    public void Test() {
        //ваторизация
        autorizationPageObject.clickButtonSignIb();
        autorizationPageObject.setFieldLoginPassword("ilya", "Ghbdtn123");
        //госуслуги - задачи
        swearchTaskPagwObject.clickTask();
        //открываем самую первую задачу в витрине
        task.getElementTask();
        //действия на форме Проведения кнм
        кinrifinspectionactconductKNMPageObject.clickInputMKnmWotrkNo();
        кinrifinspectionactconductKNMPageObject.cickButtonConCompleed();
        //открываем самую первую задачу в витрине
        task.getElementTask();
        $("h1").shouldHave(text("Сформировать акт КНМ"));
        rinrifinspectionactformKnmActPageObject.printTask();
    }

}
