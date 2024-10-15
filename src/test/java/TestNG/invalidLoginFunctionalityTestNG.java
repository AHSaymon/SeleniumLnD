package TestNG;

import ObjectClass.loginPageObject;
import ObjectClass.logoutObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class invalidLoginFunctionalityTestNG {
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
        loginPageObject.appointmentButton(driver).click();
        loginPageObject.UserNameBtn(driver).sendKeys("John Doe");
        loginPageObject.PasswordBtn(driver).sendKeys("ThisIsInvalidAPassword");
        loginPageObject.loginBtn(driver).click();
        WebElement errorMessage = driver.findElement(By.xpath("//p[contains(text(), 'Login failed!')]"));
        Assert.assertTrue(errorMessage.isDisplayed());

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();

    }
}
