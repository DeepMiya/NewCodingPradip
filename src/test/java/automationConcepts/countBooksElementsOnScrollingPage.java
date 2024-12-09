package automationConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class countBooksElementsOnScrollingPage {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://booksbykilo.in/new-books");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Print only visible books on current page
//        List<WebElement> listOfBooks=driver.findElements(By.xpath("//div[@class='book_display']//h3"));
//       System.out.println(listOfBooks.size());

       //Using Scrolling page to bottom and check also not counting all books
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//        List<WebElement> listOfBooks=driver.findElements(By.xpath("//div[@class='book_display']//h3"));
//        System.out.println(listOfBooks.size());

        //Correct logic

        int previoscount=0;
        int currentcount=0;
        while(true)
        {
            List<WebElement> listOfBooks=driver.findElements(By.xpath("//div[@class='book_display']//h3"));
            currentcount=listOfBooks.size();
            if(currentcount==previoscount)
            {
                break;
            }
            previoscount=currentcount;
            JavascriptExecutor js=(JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            Thread.sleep(5000);

        }
        System.out.println(currentcount);
        driver.quit();





    }
}
