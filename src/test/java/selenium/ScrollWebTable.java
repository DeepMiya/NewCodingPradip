package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //window scroll
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(5000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");//scroll position of that element
        // down by 5000 pixels from the top
        //'.tableFixHead'--table WebElement by cssSelector


    }
}
