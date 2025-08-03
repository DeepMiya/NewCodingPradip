package selenium;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslCheck {
    public static void main(String[] args)
    {
        ChromeOptions option=new ChromeOptions();
        option.setAcceptInsecureCerts(true);
        WebDriver driver=new ChromeDriver(option);//use once without option
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());

        //Set proxy
        Proxy proxy = new Proxy();

        proxy.setHttpProxy("ipaddress:4444");

        option.setCapability("proxy", proxy);
    }
}
