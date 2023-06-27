import org.junit.jupiter.api.Test;

public class FromHomeToLoginTest extends BaseTest {
    @Test
    void test(){
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccountIcon();
        homePage.clickLoginButton();
    }
}
