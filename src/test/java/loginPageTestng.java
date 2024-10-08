import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginPageTestng {
    @BeforeTest
    void setUp()
    {
        System.out.println("Set Up test");
    }
    @Test
   void TestFunc()
   {
       System.out.println("Test check");
   }
    @AfterTest
    void tearDown()
    {
        System.out.println("Close test");
    }
}
