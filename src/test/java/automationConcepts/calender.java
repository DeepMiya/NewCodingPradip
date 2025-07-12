package automationConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class calender {
    public static void main(String[] args)
    {

        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        //Switch to frame
        driver.switchTo().frame(0);
        //Methode 1- using sendKeys
        driver.findElement(By.id("datepicker")).sendKeys("07/31/2025");
        //Methode 2- Using date Picker
        String year="2026";
        String month="December";
        String date="14";

        driver.findElement(By.id("datepicker")).click();//open date picker

        //Select Month & Year
        while(true)
        {
            String DisplMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
            String DisplYear=driver.findElement(By.className("ui-datepicker-year")).getText();
             if (DisplYear.equals(year) && DisplMonth.equals(month))
             {
                 break; //no need of else
             }
             //click on next for future
            //click on previos for past
            driver.findElement(By.xpath("//*[text()='Next']")).click();//next
            //driver.findElement(By.xpath("//*[text()='Prev']")).click();//prev

        }
        //select date
        List<WebElement> dispDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td/a"));
        for(WebElement dt:dispDate)
        {
            if (dt.getText().equals(date))
            {
                dt.click();
                break;
            }
        }
    }
    ////////////////////Another way out of main methode create seprate methods for dates and call in main method////////////////////////////////////

    static void selectPastDate(WebDriver driver,String month,String year,String date)// Same for future date
    {


    //select month and Year
    while(true)
    {
        String DisplMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
        String DisplYear=driver.findElement(By.className("ui-datepicker-year")).getText();
        if (DisplYear.equals(year) && DisplMonth.equals(month))
        {
            break; //no need of else
        }
        //click on next for future
        //click on previos for past
        //driver.findElement(By.xpath("//*[text()='Next']")).click();//next
        driver.findElement(By.xpath("//*[text()='Prev']")).click();//prev

    }
        //select date
        List<WebElement> dispDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td/a"));
        for(WebElement dt:dispDate)
        {
            if (dt.getText().equals(date))
            {
                dt.click();
                break;
            }
        }

    }
}
