import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://op.akademijait.vtmc.lt");
   //     driver.get("https://op.akademijait.vtmc.lt/index.php?route=account/login");
    }

    @AfterEach
    public void closeBrowser() {
        driver.close();
    }
}