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
            driver.get("http://bs44mdl.cursivetechnology.com/login/index.php");
            //username
            WebElement username= driver.findElement(By.id("username"));
            WebElement password= driver.findElement(By.id("password"));
            WebElement signInBtn=driver.findElement(By.id("loginbtn"));
            username.sendKeys("hamid");

            //implicitlyWait example:
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



            driver.findElement(By.id("abcd")).click();
            password.sendKeys("Admin@bs23");
            signInBtn.click();

            //emplicitlywait
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("abcd")));
            driver.quit();
        }

}
