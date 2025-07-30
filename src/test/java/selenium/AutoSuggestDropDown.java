package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropDown {
    WebDriver driver=new ChromeDriver();
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("in");
        Thread.sleep(4000);
        //How to select hidden text--e.g Benin search value in Dev tool (xpath)
       // List<WebElement> listOfOptions=driver.findElements(By.xpath("\\li[class='ui-menu-item']/a"));
        List < WebElement > listOfOptions=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement lis:listOfOptions)
        {
            if(lis.getText().equalsIgnoreCase("Benin"))
            {
                lis.click();
                break;
            }
        }
        //driver.quit();

    }

}
