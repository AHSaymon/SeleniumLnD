import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class urlVisit {
    public static void main(String[] args) {

        waitFunction();
    }
        public static void waitFunction()
        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://katalon-demo-cura.herokuapp.com/");
            //username
            WebElement username= driver.findElement(By.id("txt-username"));
            WebElement password= driver.findElement(By.id("txt-password"));
            WebElement signInBtn=driver.findElement(By.id("btn-login"));
            username.sendKeys("John Doe");
            password.sendKeys("ThisIsNotAPassword");
            signInBtn.click();

            //explicit wait
            //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("abcd")));
            driver.quit();
        }

}
