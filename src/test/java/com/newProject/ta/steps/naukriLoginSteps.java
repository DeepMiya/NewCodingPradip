package com.newProject.ta.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.newProject.ta.pageObjecs.naukriLogin;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class naukriLoginSteps {

    WebDriver driver;
    public naukriLogin lp;

    @Before
//    public void setUp() {
//        System.setProperty("webdriver.driver.edge", "C:\\\\Drivers\\\\edgedriver_win64 (1)\\\\msedgedriver.exe");
//        driver=new EdgeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//    }

//    @After
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    @Given("user should be on home page of naukri")
    public void user_should_be_on_home_page_of_naukri() {
        driver.get("https://www.naukri.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


    @When("click on my profile pics")
    public void clickOnMyProfilePics() {
        lp.setClickOnMyPics();
    }

    @And("click on view and update profile")
    public void clickOnViewAndUpdateProfile() {
        lp.setviewAndUpdate();
    }

    @Then("Profile Mynaukri page should open")
    public void profileMynaukriPageShouldOpen() {
        String actualTitle = driver.getTitle();
        if (actualTitle == "Profile | Mynaukri") {
            System.out.println("Login successful");
        }
    }

    @Given("^enter valid (.*) and (.*)")
    public void enterValidUsernameAndPassword(String userName, String password) {
        lp=new naukriLogin(driver);
//        driver.get("https://www.naukri.com/");
        System.out.println("Entering username: " + userName);
        System.out.println("Entering password: " + password);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        lp.setUserName(userName);
        lp.setPassword(password);
    }

    @When("click on login button")
    public void clickOnLoginButton() {
        lp.clickOnLogin();
    }

    @Then("User should successfuly login with search bar present on dashboard")
    public void userShouldSuccessfulyLoginWithSearchBarPresentOnDashboard() {
        String actualTitle=driver.getTitle();
        String expectedTitle="Pawar Pradip Shivaji";
        Assert.assertEquals(expectedTitle,actualTitle);

    }
}
