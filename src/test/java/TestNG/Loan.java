package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Loan {
    @Parameters({"URL"})
    @Test
    public void myLoan(String ulink)
    {
        System.out.println("My Loan");
        System.out.println(ulink);
    }
    @Test
    public void childLoan()
    {
        System.out.println("Child Loan");
    }
    @Test
    public void wifeCh()
    {
        System.out.println("My Wife loan");
    }
    @BeforeMethod
    public void rmi()
    {
        System.out.println("beforemethod i am running.................");
    }
    @AfterMethod
    public void gion()
    {
        System.out.println("After method runiing--------------");
    }
}
