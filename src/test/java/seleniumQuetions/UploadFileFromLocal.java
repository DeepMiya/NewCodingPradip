package seleniumQuetions;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.Duration;

public class UploadFileFromLocal {

    public static void main(String [] args) throws InterruptedException, AWTException {

        //1st using Robot Class (Handling OS File Dialog)

        // Suppress Selenium CDP warnings
        Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);

        System.setProperty("webdriver.edge.driver","C:\\Driver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.foundit.in/web/en/home");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("(//a[@title='Click to upload your resume'])[1]")).click();

        //Using JavacsriptExecutor do click action if .click() not working
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//input[@id='file-upload' and @name='file'])[1]")));
        Thread.sleep(5000);

        //Step 1-copy file path into clipboard(cntl+c)
        StringSelection filePathSelection=new StringSelection("C:\\Users\\RAM\\OneDrive\\Pradip\\CV\\Pradip P CV.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePathSelection,null);
        // step 2-Contrl v
        Robot rb=new Robot();
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);
        //Step 3-Enter press
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);


        //2nd way.using sendKeys() when webelement HTML contains <input type="file">
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\RAM\\OneDrive\\Pradip\\CV\\Pradip P CV.pdf");
        System.out.println("waiting for 10 sec......");
        Thread.sleep(10000);




        //3rd Way, Using JavascriptExecutor (hidden of <input type="file">) on Hidden ele

                driver.get("https://the-internet.herokuapp.com/upload");

                // Locate the file input element (by default it's visible, we will hide & then unhide)
                WebElement fileInput = driver.findElement(By.id("file-upload"));

                // Hide the input using JS(style.display='none'==Hide Element)
                JavascriptExecutor js1 = (JavascriptExecutor) driver;
                js1.executeScript("arguments[0].style.display='none';", fileInput);
                Thread.sleep(2000);

                // Now unhide the input(style.display='block'==Unhide element)
                js1.executeScript("arguments[0].style.display='block';", fileInput);
                Thread.sleep(2000);

                // Send file path directly
                fileInput.sendKeys("C:\\Users\\RAM\\OneDrive\\Pradip\\CV\\Pradip P CV.pdf");



    }
}
