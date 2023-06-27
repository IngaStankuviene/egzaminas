import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RegisterTest extends BaseTest{

    @Test
    void test(){
        RegisterPage registerPage = new RegisterPage(driver);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(50);
        HomePage homePage = new HomePage(driver);
        String word ="word" + randomInt;
        String message = "Your Account Has Been Created!";

        homePage.clickMyAccountIcon();
        homePage.clickRegisterButton();
        registerPage.setInputFirstName(word);
        registerPage.setInputLastName(word);
        registerPage.setInputEmail("username" + randomInt + "@gmail.com" );
        registerPage.setInputTelephone(word);
        registerPage.setInputPassword(word);
        registerPage.setInputConfirm(word);
        registerPage.clickToAgree();
        registerPage.clickContinueButton();

        Assertions.assertEquals(message, registerPage.getaccountCreated());
    }
}
