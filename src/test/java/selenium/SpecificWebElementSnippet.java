package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class SpecificWebElementSnippet {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com/");
        WebElement search=driver.findElement(By.xpath("//*[@name='query']"));
        search.sendKeys("Crickbuzz");
        File fle=search.getScreenshotAs(OutputType.FILE);//Only Search snippet
        FileUtils.copyFile(fle,new File("C:\\Users\\RAM\\Documents\\searchGoogle.png"));
        //Entire window Snippet
        File fullPage=( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fullPage,new File("C:\\Users\\RAM\\Documents\\wholePage.png"));
        driver.quit();



    }

}
