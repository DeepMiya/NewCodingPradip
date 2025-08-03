package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class linksAndLimitWebDriver {
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        driver.manage().window().maximize();
        int totalLinks=driver.findElements(By.tagName("a")).size();//total links on whole page
        System.out.println("Whole Page total links:"+totalLinks);
        WebElement foot=driver.findElement(By.xpath("//div[@id='gf-BIG']"));//Limiting WebDriver scope
        int footerWeblinks=foot.findElements(By.tagName("a")).size();
        System.out.println("Footer page total links:"+footerWeblinks);
        WebElement columnDriver=foot.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
        int columnLinks=columnDriver.findElements(By.tagName("a")).size();
        System.out.println("Coulumn links:"+columnLinks);
        //4- click on each link in the coloumn and check if the pages are opening-
       for(int i=1;i<columnLinks;i++)//no need to check or click on heading hence kept i=1
       {
          String clickOnLinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
           columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
           Thread.sleep(5000);
       }
        // opens all the tabs
        Set<String> abc=driver.getWindowHandles();//4
       // System.out.println(abc);
        Iterator<String> it=abc.iterator();
        while(it.hasNext())
        {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }
        driver.close();
    }
}
