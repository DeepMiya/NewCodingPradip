package com.newProject.ta.pageObjecs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComopencartLoginPage {

    public WebDriver driver;
    //By Locators
    private By userEmailLocat=By.name("email");
    private By usrPassloacat=By.id("input-password");
    private By loginLocator=By.xpath("//input[@type=\"submit\"]");
    private By frgtPassLink=By.linkText("Forgotten Password");

    //constructor
    public ComopencartLoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    //page actions

    public void setUserEmail(String email)
    {
        WebElement emailInput=driver.findElement(userEmailLocat);
        emailInput.sendKeys(email);
    }

    public void setPassword(String pass)
    {
        WebElement passInput=driver.findElement(usrPassloacat);
        passInput.sendKeys(pass);
    }
    public void clickOnLogin()
    {
        WebElement clicklg=driver.findElement(loginLocator);
        clicklg.click();
    }
    public void clickOnForgottenPassword()
    {
        WebElement fo=driver.findElement(frgtPassLink);
        fo.click();
    }

    public boolean checkForgotPasswordLink()
    {
        return driver.findElement(frgtPassLink).isDisplayed();
    }

    //	public void login(String email, String pass)
//	{
//		setUserEmail(email);
//		setPassword(pass);
//		clickOnLogin();
//	}
    public String getForgotPasswordUrl()
    {
        String forgotPasswordPageUrl=driver.getCurrentUrl();
        return forgotPasswordPageUrl;
    }

}
