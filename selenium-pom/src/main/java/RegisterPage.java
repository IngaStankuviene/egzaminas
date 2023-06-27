import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends AbstractObjectPage{
    @FindBy(css = ".fa-user")
    private WebElement clickMyAccount;

    @FindBy(xpath = "//a[contains(@href, 'register')]")
    private WebElement clickRegister;

    @FindBy(css = "#input-firstname")
    private WebElement inputFirstName;

    @FindBy(css = "#input-lastname")
    private WebElement inputLastName;

    @FindBy(css = "#input-email")
    private WebElement inputEmail;

    @FindBy(css = "#input-telephone")
    private WebElement inputTelephone;

    @FindBy(css = "#input-password")
    private WebElement inputPassword;

    @FindBy(css = "#input-confirm")
    private WebElement inputConfirm;

   @FindBy (xpath ="//input[@name='agree']")
   private WebElement clickToAgree;

   @FindBy (css = ".btn-primary")
   private WebElement clickContinue;

   @FindBy (css = "#content h1")
   private WebElement accountCreated;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void clickMyAccountIcon() {

        clickMyAccount.click();
    }

    public void clickRegisterButton(){
        clickRegister.click();
    }

    public void setInputFirstName(String firstName) {
        inputFirstName.sendKeys(firstName);
    }

    public void setInputLastName(String lastName) {
        inputLastName.sendKeys(lastName);
    }

    public void setInputEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void setInputTelephone(String telephone) {
        inputTelephone.sendKeys(telephone);
    }

    public void setInputPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void setInputConfirm(String confirm) {
        inputConfirm.sendKeys(confirm);
    }

    public void clickToAgree() {
        clickToAgree.click();
    }

    public void clickContinueButton() {
        clickContinue.click();
    }

    public String getaccountCreated(){
        return accountCreated.getText();
    }


}
