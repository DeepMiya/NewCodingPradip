package automationConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicWebElements {

    public static void main(String [] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.rediff.com/");

        //1.Contains
        driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
        //2.starts-with
        driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("John");

        //3.ends-with (common end part of string) e.g //input[ends-with(@name,'e123')]
        driver.quit();





    }

}
