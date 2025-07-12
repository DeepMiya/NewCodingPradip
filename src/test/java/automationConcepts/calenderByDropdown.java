package automationConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class calenderByDropdown {

    public static void main(String [] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='txtDate']")).click();
        String year="2015";
        String month="Nov";
        String date="28";

        // Select year
        WebElement yearselect=driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
        Select slyr=new Select(yearselect);
        slyr.selectByValue(year);
        //Select Month
       WebElement monthSelect= driver.findElement(By.className("ui-datepicker-month"));
       Select slMon=new Select (monthSelect);
       slMon.selectByVisibleText(month);

       //Select Date
        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td/a"));
        for (WebElement d:dates)
        {
            if (d.getText().equals(date))
            {
                d.click();
                break;
            }
        }


    }
}
