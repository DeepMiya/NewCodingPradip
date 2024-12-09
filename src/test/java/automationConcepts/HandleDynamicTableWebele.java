package automationConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleDynamicTableWebele {

    public static void main (String[] args)
//    {
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://practice.expandtesting.com/dynamic-table");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table table-striped']//tbody/tr"));
//        System.out.println(rows.size());
//        for(int i=1;i<=rows.size();i++)
//        {
//            WebElement name=driver.findElement(By.xpath("//table[@class='table table-striped']//tbody/tr["+i+"]//td[1]"));
//            System.out.println(name.getText());
//            if (name.getText().equals("Chrome"))
//            {
//                WebElement du=driver.findElement(By.xpath("//table[@class='table table-striped']//tbody/tr["+i+"]//td[1]//following-sibling::*[contains(text(),'%')]"));
//                System.out.println(du.getText());
//                break;
//            }
//        }
//    }
            //if both columns and rows are dynamic with table having same data types
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.expandtesting.com/dynamic-table");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> columns=driver.findElements(By.xpath("//table[@class='table table-striped']//tr/th"));
        System.out.println(columns.size());
        for(int i=1;i<=columns.size();i++)
        {
            String cname=driver.findElement(By.xpath("//table[@class='table table-striped']//tr/th["+i+"]")).getText();
            if(cname.equals("Memory"))//we can use paremetrize also
            {
                List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table table-striped']//tbody/tr"));
                for(int j=1; j<=rows.size();j++)
                {
                    String rname=driver.findElement(By.xpath("//table[@class='table table-striped']//tbody/tr["+j+"]/td[1]")).getText();
                    if(rname.equals("Chrome"))
                    {
                        System.out.println("WE are inside Chrome");
                        String value=driver.findElement(By.xpath("//table[@class='table table-striped']//tbody/tr["+j+"]//td["+i+"]")).getText();
                    System.out.println(value);
                        break;
                    }

                }
            }

        }

    }
}

//table[@class='table table-striped']//tr/th
