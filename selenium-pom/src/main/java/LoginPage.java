import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractObjectPage {

    @FindBy(css = ".fa-user")
    private WebElement clickMyAccount;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement loginButton;

    @FindBy(css = "#input-email")
    private WebElement inputEmail;

    @FindBy(css = "#input-password")
    private WebElement inputPassword;

    @FindBy(css = ".alert-danger")
    private WebElement alertMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void setInputEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void setInputPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public String getWarningMessageText(){
        return alertMessage.getText();
    }
}
