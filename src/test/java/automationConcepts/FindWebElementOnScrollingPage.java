package automationConcepts;

import io.cucumber.java.et.Ja;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class FindWebElementOnScrollingPage {

    public static void main(String [] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://booksbykilo.in/new-books");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Under the Sea
        //
        //using Action class--failed
//        Actions act= new Actions(driver);
//        WebElement book=driver.findElement(By.xpath("//*[text()='Under the Sea']"));
//        act.moveToElement(book);

        //using javascriptExec --failed
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        WebElement book=driver.findElement(By.xpath("//*[text()='Under the Sea']"));
//        js.executeScript("arguments[0].scrollIntoView();",book);

        //while logic
        JavascriptExecutor js=(JavascriptExecutor) driver;
        boolean found=false;
        while(!found)
        {
            List<WebElement> books=driver.findElements(By.xpath("//*[@class='book_display']//h3"));
            for(WebElement book:books)
            {
                if (book.getText().equals("Time for a Hug!"))
                {
                    System.out.println("Book found");
                    found=true;
                    break;

                }

            }
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");




        }
driver.quit();
    }
}
