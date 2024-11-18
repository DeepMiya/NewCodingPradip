package com.newProject.ta.pageObjecs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class naukriLogin {

    private WebDriver driver;
    //decl
    By clickOnMyPics=By.xpath("//*[@class='nI-gNb-drawer__icon']");
    By viewAndUpdate= By.xpath("//a[text()='View & Update Profile']");
    By username =By.id("usernameField");
    By password=By.id("passwordField");
    By login=By.xpath("//*[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform']");
    By afterLoginTitle=By.xpath("//*[text()='Pawar Pradip Shivaji']");
    //constr
    public naukriLogin(WebDriver driver)
    {
        this.driver=driver;

    }
    //init

    public void setUserName(String userId)
    {
        driver.findElement(username).sendKeys(userId);
    }
    public void setPassword(String pass)
    {
        driver.findElement(password).sendKeys(pass);
    }
    public void clickOnLogin()
    {
        driver.findElement(login).click();

    }
    public void setClickOnMyPics()
    {
        WebElement c =driver.findElement(clickOnMyPics);
        c.click();
    }
    public void setviewAndUpdate()
    {
        driver.findElement(viewAndUpdate).click();
    }

}
