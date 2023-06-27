import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    @Test
    void test() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        String expectedWarning = "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";

        homePage.clickMyAccountIcon();
        homePage.clickLoginButton();
        loginPage.setInputEmail("inga@gmail.com");
        loginPage.setInputPassword("111iii+");
        loginPage.clickLoginButton();

        Assertions.assertEquals(expectedWarning, loginPage.getWarningMessageText());

  //      Assertions.assertTrue(driver.findElement(By.cssSelector(".alert-danger")).isDisplayed(),
  //             "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.");
    }
}
