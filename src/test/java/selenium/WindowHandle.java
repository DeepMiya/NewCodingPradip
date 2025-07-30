package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args)
    {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
        Set<String> windows=driver.getWindowHandles();//[parent, child]
        Iterator<String> it=windows.iterator();
        String parentId=it.next();//parent
        String childId=it.next();
        driver.switchTo().window(childId);



    }
}
