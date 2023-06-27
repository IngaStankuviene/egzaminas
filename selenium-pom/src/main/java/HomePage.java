import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractObjectPage {

    @FindBy(css = ".fa-user")
    private WebElement clickMyAccount;

    @FindBy(xpath = "//a[contains(@href, 'register')]")
    private WebElement clickRegister;

    @FindBy(xpath = "//a[contains(@href, 'login')]")
    private WebElement clickLogin;


    public HomePage (WebDriver driver) {
        super(driver);
    }

    public void clickMyAccountIcon() {
        clickMyAccount.click();
    }
    public void clickLoginButton() {
        clickLogin.click();
    }

    public void clickRegisterButton() { clickRegister.click();
    }
}
