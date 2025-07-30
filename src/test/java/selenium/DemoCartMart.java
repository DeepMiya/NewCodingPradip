package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DemoCartMart {
    public static void main (String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
        driver.manage().window().maximize();
        String[] items={"Corn","Onion","Potato","Mango"};//need to add this into cart
        //convert array into array list for easy search
        DemoCartMart dm=new DemoCartMart();
        dm.addProduct(driver,items);

        driver.findElement(By.xpath("//*[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
        String txt=driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
        System.out.println(txt);


        driver.quit();



    }
    public void addProduct(WebDriver driver,String[] items)
    {
        //convert array into array list for easy search
        List<String> neededItemList=Arrays.asList(items);
        //list down total products
        List<WebElement> listOfItems=driver.findElements(By.cssSelector("[class='product'] h4"));
        System.out.println(listOfItems.size());

        for(int i=0;i<listOfItems.size();i++)
        {
            String[] plist =listOfItems.get(i).getText().split("-");
            String itmName=plist[0].trim();
            //  check whether name you extracted is present in arrayList or not-
            if(neededItemList.contains(itmName))
            {
                //add into cart...get(i)--specific
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
            }


        }
    }
}
