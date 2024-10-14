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
        //Project url
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        loginPageObject.appointmentButton(driver).click();
        loginPageObject.UserNameBtn(driver).sendKeys("John Doe");
        loginPageObject.PasswordBtn(driver).sendKeys("ThisIsNotAPassword");
        loginPageObject.loginBtn(driver).click();

    }
}
