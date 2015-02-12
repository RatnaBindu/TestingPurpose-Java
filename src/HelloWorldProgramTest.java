import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HelloWorldProgramTest {

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("After Method");
    }

    @Test
    public  void  FirstTestMethod() throws Exception
    {
        System.out.println("First Method For Test");
    }

    @Test
    public  void  SecondTestMethod()
    {
        System.out.println("Second Method For Test");
    }
}