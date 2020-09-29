import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import util.LogUtil;

public class JenkinsTest {

    @Step("Проверяем 1 == 1")
    public void initialTest() {
        Assert.assertEquals(1, 1);
    }

    @Test
    @TestCaseId("1")
    public void test() {
        LogUtil.log("Начинается первый тест");
        initialTest();
        LogUtil.log("Закончился первый тест");
    }

    @Test
    @TestCaseId("2")
    public void secondTest(){
        LogUtil.log("Начинается второй тест");
        initialTest();
        LogUtil.log("Закончился второй тест");
    }
}
