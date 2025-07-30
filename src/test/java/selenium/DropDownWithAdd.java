package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class DropDownWithAdd {
/*
WebDriver → Interface used to control the browser in Selenium.

ChromeDriver → Class that launches and controls the Chrome browser.

ChromeOptions → Allows setting Chrome-specific configurations (e.g., allow/block location, disable notifications).

HashMap & Map → Used to store key-value pairs for browser preferences.
 */
    public static void main(String[] args)
     {

        // Set Chrome preferences
        Map<String, Object> prefs = new HashMap<String, Object>();
        Map<String, Object> profile = new HashMap<String, Object>();
        Map<String, Object> contentSettings = new HashMap<String, Object>();

        // 1 = Allow, 2 = Block
        contentSettings.put("geolocation", 1);
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.spicejet.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[text()='Passengers']")).click();//click on dropdown
        /*
        int i=1;
        while(i<5)
        {
            driver.findElement(By.xpath("//*[@data-testId='Adult-testID-plus-one-cta']")).click();
        }
        */

        for(int i=1;i<5;i++)
        {
            driver.findElement(By.xpath("//*[@data-testId='Adult-testID-plus-one-cta']")).click();
        }

        String  actualText=driver.findElement(By.xpath("(//*[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")).getText();
        Assert.assertEquals(actualText,"5 Adults");
        System.out.println(actualText);
        driver.quit();
    }
}
