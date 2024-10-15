package TestNG;

import ObjectClass.HomePageObject;
import ObjectClass.loginPageObject;
import ObjectClass.MakeAppoinmentObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MakeAppoinmentFunctionalityTestNG {
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

        //login Page
        loginPageObject.appointmentButton(driver).click();
        loginPageObject.UserNameBtn(driver).sendKeys("John Doe");
        loginPageObject.PasswordBtn(driver).sendKeys("ThisIsNotAPassword");
        loginPageObject.loginBtn(driver).click();

        //BookingPage
        Select facility=new Select(driver.findElement(By.id("combo_facility")));
        facility.selectByVisibleText("Tokyo CURA Healthcare Center");
        MakeAppoinmentObject.hospitalReadmissionCheckbox(driver).click();
        MakeAppoinmentObject.programTypeRadioBox(driver).click();
        MakeAppoinmentObject.visitDateButton(driver).sendKeys("15/10/2024");
        MakeAppoinmentObject.commentTextBox(driver).sendKeys("Sinus Issue");
        MakeAppoinmentObject.bookBtn(driver).click();

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();

    }
}
