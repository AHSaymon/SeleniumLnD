package ObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {


    private static WebElement element=null;
    //WebDriver driver=null;

    // hamburgerMenu button
    public static WebElement Menubtn(WebDriver driver)
    {
        element=driver.findElement(By.id("menu-toggle"));
        return element;
    }
    public static WebElement loginMenuBtn(WebDriver driver)
    {
        element=driver.findElement(By.linkText("Login"));
        return element;
    }

    public static WebElement appointmentButton(WebDriver driver)
    {
        element=driver.findElement(By.id("btn-make-appointment"));
        return element;
    }

    public static WebElement UserNameBtn(WebDriver driver)
    {
        element=driver.findElement(By.id("txt-username"));
        return element;
    }

    public static WebElement PasswordBtn(WebDriver driver)
    {
        element=driver.findElement(By.id("txt-password"));
        return element;
    }
    public static WebElement loginBtn(WebDriver driver)
    {
        element=driver.findElement(By.id("btn-login"));
        return element;
    }
}
