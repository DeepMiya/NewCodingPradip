package selenium;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Miscelenous {
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.manage().deleteCookieNamed("xyz");
        driver.get("http://google.com");
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//get screen shot store as File\\
       // FileUtils.copyFile(src,new File("C:/ram/"));//can not direclty store into c drive

    }
}
