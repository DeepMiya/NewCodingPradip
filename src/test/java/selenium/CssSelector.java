package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver","");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");


        driver.findElement(By.id("inputUsername")).sendKeys("John"); //By Id
        driver.findElement(By.name("inputPassword")).sendKeys("Pass@123");
        Thread.sleep(5000);
        driver.findElement(By.name("inputPassword")).clear();
        //cssSelector using attribute
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("pradip123");






    }
}
