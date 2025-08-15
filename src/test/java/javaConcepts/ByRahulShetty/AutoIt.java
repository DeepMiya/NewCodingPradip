package javaConcepts.ByRahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class AutoIt {
    /*
    What is AutoIT
Install AutoIT
AutoIT Scripting
Integrating AutoIT with Selenium

//Shift focus to the file upload windows
//set text/path into file name edit box
//click open to upload file
go to c path program file 86

Au3info- record window component objects
Build Script -scite.exe
Save it- .au3 extenstion
Convert file into .exe by compiling .au3 file
Call .exe file with Runtime class in java into your selenium tests
ControlFocus("Open","","Edit1")
ControlSetText("Open","","Edit1","C:\Users\rahul\Documents\check\visit.pdf")
ControlClick("Open","","Button1")
     */
    public static void main(String[]args) throws IOException, InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Driver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.adobe.com/acrobat/online/pdf-to-word.html");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Select a file']")).click();
         //to call autoIT script in java
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\RAM\\OneDrive\\Documents\\FileUploadAuto.exe");

     /*
     public class fileUpload {



public static void main(String[] args) throws InterruptedException, IOException {

// TODO Auto-generated method stub

String downloadPath=System.getProperty("user.dir");

System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");

HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

chromePrefs.put("profile.default_content_settings.popups", 0);

chromePrefs.put("download.default_directory", downloadPath);

ChromeOptions options=new ChromeOptions();

options.setExperimentalOption("prefs", chromePrefs);


WebDriver driver=new ChromeDriver(options);

driver.get("https://altoconvertpdftojpg.com/");

driver.findElement(By.cssSelector("[class*='btn--choose']")).click();

Thread.sleep(3000);

Runtime.getRuntime().exec("C:\\Users\\rahul\\Documents\\check\\fileupload.exe");

WebDriverWait wait=new WebDriverWait(driver,10);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));


driver.findElement(By.cssSelector("button[class*='medium']")).click();

wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));

driver.findElement(By.linkText("Download Now")).click();

Thread.sleep(5000);

File f=new File(downloadPath+"/converted.zip");

if(f.exists())

{

Assert.assertTrue(f.exists());

if(f.delete())

System.out.println("file deleted");

}
}
}


      */

    }



}
