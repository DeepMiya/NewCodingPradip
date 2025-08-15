package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsTabs {
    public static void main(String[]args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        //driver.switchTo().newWindow(WindowType.WINDOW);//new window
        driver.switchTo().newWindow(WindowType.TAB);//new tab

        Set<String> win= driver.getWindowHandles();
        Iterator<String> it=win.iterator();
        String parent =it.next();
        String child=it.next();
        driver.switchTo().window(child);
        driver.get("https://rahulshettyacademy.com");
        String courseName=driver.findElement(By.xpath("//*[text()='Spring Boot Fundamentals with Unit Testing (MockMVC/Mockito)']")).getText();
        driver.switchTo().window(parent);
        WebElement nameBox=driver.findElement(By.xpath("//*[@name='name']"));
        nameBox.sendKeys(courseName);





        //Get Height and Width of search box
        System.out.println(nameBox.getRect().getDimension().getHeight());
        System.out.println(nameBox.getRect().getDimension().getWidth());


    }
}
