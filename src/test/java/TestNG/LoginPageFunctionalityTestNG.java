package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import ObjectClass.loginPageObject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginPageFunctionalityTestNG {

    static WebDriver driver=null;

    @BeforeTest
    public void setUP()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

    }

    @Test
    public void TestCaseExecution()
    {

        driver.get("http://bs44mdl.cursivetechnology.com/login/index.php");
        loginPageObject.username(driver).sendKeys("hamid");
        loginPageObject.password(driver).sendKeys("Admin@bs23");
        loginPageObject.loginBtn(driver).click();

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();

    }
}
