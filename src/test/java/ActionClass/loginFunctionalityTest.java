package ActionClass;
import ObjectClass.loginPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginFunctionalityTest {

    private static WebDriver driver=null;
    public static void main(String[] args) {
    loginPage();
    }

    public static void loginPage()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://bs44mdl.cursivetechnology.com/login/index.php");
        loginPageObject.username(driver).sendKeys("hamid");
        loginPageObject.password(driver).sendKeys("Admin@bs23");
        loginPageObject.loginBtn(driver).click();

    }
}
