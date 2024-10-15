package TestNG;

import ObjectClass.HomePageObject;
import ObjectClass.loginPageObject;
import ObjectClass.HomePageObject;
import ObjectClass.logoutObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageFunctionalityTestNG {
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
        Thread.sleep(3000);

        HomePageObject.hamburgerMenu(driver).click();
        Thread.sleep(3000);

        HomePageObject.loginBtn(driver).click();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        loginPageObject.appointmentButton(driver).click();
        driver.navigate().back();

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();

    }

}
