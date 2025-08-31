package seleniumQuetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;

import java.util.List;

public class BrokenLinks {

    public static void main(String[] args) throws IOException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        //// Collect all <a> tags
        List<WebElement> lists= driver.findElements(By.tagName("a"));
        System.out.println("Total Links:"+lists.size());

        // Check each link
        for(WebElement e:lists)
        {
            String url=e.getAttribute("href");
            if (url == null || url.isEmpty())
            {
                continue; //// skip empty links
            }
            // Call our broken link method
            brokenLink(url);//static methode no need to create ibj
        }
        // Collect all <img> tags
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("\nTotal Images Found: " + images.size());

        for (WebElement img : images) {
            String imgUrl = img.getAttribute("src");
            if (imgUrl == null || imgUrl.isEmpty()) {
                continue;
            }
            brokenLink(imgUrl);
        }

         driver.quit();
    }
    public static void brokenLink(String linkUrl) throws IOException {//common code
        URL url=new URL(linkUrl);//converts that String into a URL object so Java knows it’s an internet address.
        HttpURLConnection httpURLConnection =(HttpURLConnection) url.openConnection();//opens a connection to the given URL
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.connect();//Actually makes the network call to the server.
        //After this, you can check the HTTP response code

        int responseCode = httpURLConnection.getResponseCode();
        if(responseCode>=400)
        {
            System.out.println(linkUrl+" ❌ Broken | Code: " +responseCode);
        }
        else
        {
            System.out.println(linkUrl+" ✅ Valid | Code: "+responseCode);
        }

    }
}
