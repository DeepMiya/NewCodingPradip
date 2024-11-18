package com.newProject.ta.steps;

import com.newProject.ta.pageObjecs.ComopencartLoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver;
    public ComopencartLoginPage lp;
    private boolean expected;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.driver.edge", "C:\\\\Drivers\\\\edgedriver_win64 (1)\\\\msedgedriver.exe");
        driver=new EdgeDriver();
        //EdgeOptions options = new EdgeOptions();
        // options.addArguments("--headless");  // Remove or comment out this line to run in non-headless mode
        //driver = new EdgeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @After
    public void tearDown()
    { if (driver !=null) {
        driver.quit();
    }

    }
    @Given("I am on the login page of opencart")
    public void i_am_on_the_login_page_of_opencart() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

    }

    @Given("User entered the valid username {string} and password {string}")
    public void user_entered_the_valid_username_and_password(String username, String Password)

    {
        lp=new ComopencartLoginPage(driver);
        lp.setUserEmail(username);
        lp.setPassword(Password);

    }

    @When("user click on login button")
    public void user_click_on_login_button() throws InterruptedException {
        lp.clickOnLogin();
        Thread.sleep(5000);
    }

    @Then("user should be login successfuly")
    public void user_should_be_login_successfuly() {

        Assert.assertEquals("My Account", driver.getTitle());

    }

    @Given("^User entered invalid (.*) and (.*)")
    public void user_entered_username_and_password(String username, String password) {
        lp=new ComopencartLoginPage(driver);
        lp.setUserEmail(username);
        lp.setPassword(password);

    }

    @Then("^user should see the error message indicating (.*)")
    public void user_should_see_the_error_message_indicating(String errorMessage) {
        String actualErrorMessage=driver.findElement(By.cssSelector("alert alert-danger alert-dismissible")).getText();
        Assert.assertTrue( actualErrorMessage.contains(errorMessage));
    }



    @When("user click on the {string} link")
    public void user_click_on_the_link(String st) {
        lp.clickOnForgottenPassword();

    }

    @Then("user should be redirected to password reset page")
    public void user_should_be_redirected_to_password_reset_page() {
        Assert.assertTrue(lp.getForgotPasswordUrl().contains("account/forgotton"));
    }
}
