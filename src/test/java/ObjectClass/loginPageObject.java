package ObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {

    private static WebElement element=null;

    //Username
    public static WebElement username(WebDriver driver)
    {
        element= driver.findElement(By.id("username"));
        return element;
    }

    //Username
    public static WebElement password(WebDriver driver)
    {
        element= driver.findElement(By.id("password"));
        return element;
    }

    //Username
    public static WebElement loginBtn(WebDriver driver)
    {
        element= driver.findElement(By.id("loginbtn"));
        return element;
    }
}
