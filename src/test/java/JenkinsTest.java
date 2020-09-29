import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.Test;

public class JenkinsTest {

    @Step("Проверяем равен ли один двум")
    public void initialTest(){
        Assert.assertTrue(1 == 2);
    }

    @Test
    public void test(){
        initialTest();
    }
}
