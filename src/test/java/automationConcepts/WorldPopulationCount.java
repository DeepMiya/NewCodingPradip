package automationConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WorldPopulationCount {
    static WebDriver driver;//no need to crate object


    public static void main (String []args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.worldometers.info/world-population/");
         Thread.sleep(5000);

        String world_class_population="(//span[@class='rts-counter'])[1]";
        String today_population="//div[text()='  Today  ']//following-sibling::div/div/span";
        String this_year_population="//div[text()='  This Year  ']//following-sibling::div/div/span";
        String today_and_this_year_population="//div[text()='  This Year  ' or text()='  Today  ']//following-sibling::div/div/span";


        int count =1;
        while(count<=20) {

            System.out.println("Count is :"+count + "Sec");
            if (count==21)
            {
                break;
            }
            System.out.println("======================Wold Population count===================================");
           System.out.println(driver.findElement(By.xpath(world_class_population)).getText());


            System.out.println("================Todays & this year count ================================");
            print_population_data(driver,today_and_this_year_population);
            count++;
            Thread.sleep(1000);
        }

     driver.quit();

    }
    public static void print_population_data(WebDriver driver,String locator)
    {
        List<WebElement> populationList=driver.findElements(By.xpath(locator));
        for(WebElement pl:populationList)
        {
            System.out.println(pl.getText());
        }
    }


}
