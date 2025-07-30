package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsDemo {


    public static void main(String[] arg)
    {

        //System.setProperty("webdriver.chrome.driver","local/path of  chorme");
        WebDriver driver=new ChromeDriver();//invoking browser
        //WebDriver driver=new EdgeDriver();
        //driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
        driver.get("https://rahulshettyacademy.com/locatorspractice/");//wait until open the d
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
       // driver.navigate().to("");//
        driver.findElement(By.id("inputUsername")).sendKeys("John");
        driver.findElement(By.name("inputPassword")).sendKeys("John@123");
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        driver.findElement(By.className("signInBtn")).click();
        driver.findElement(By.linkText("")).click();
        driver.findElement(By.partialLinkText("")).click();


    }
}
