package TestNG;

import ObjectClass.loginPageObject;
import ObjectClass.logoutObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logoutFunctionalityTestNG {
    static WebDriver driver=null;

    @BeforeTest
    public void setUP()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

    }

    @Test
    public void TestCaseExecution() throws InterruptedException {

        //Project url
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.manage().window().maximize();
        //login Page
        loginPageObject.appointmentButton(driver).click();
        loginPageObject.UserNameBtn(driver).sendKeys("John Doe");
        loginPageObject.PasswordBtn(driver).sendKeys("ThisIsNotAPassword");
        loginPageObject.loginBtn(driver).click();

        Thread.sleep(5000);

        //logout Action
        logoutObject.menuToggleButton(driver).click();
        Thread.sleep(3000);
        logoutObject.logoutButton(driver).click();

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();

    }
}
