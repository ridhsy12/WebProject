package com.example.steps;

import com.example.pages.FormPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.testng.Assert.assertTrue;

public class FormSteps {
    private WebDriver driver;
    private FormPage formPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/Users/riddhikakadiya/SeleniumJars/geckodriver");
        driver = new FirefoxDriver();
        formPage = new FormPage(driver);
    }

    @Given("I am on the form page")
    public void i_am_on_the_form_page() {
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/index.html");
    }

    @When("I enter {string} into the name field")
    public void i_enter_name_into_the_name_field(String name) {
        formPage.setName(name);
    }

    @When("I enter {string} into the email field")
    public void i_enter_email_into_the_email_field(String email) {
        formPage.setEmail(email);
    }

    @When("I enter {string} into the comments field")
    public void i_enter_comments_into_the_comments_field(String comments) {
        formPage.setComments(comments);
    }

    @When("I submit the form")
    public void i_submit_the_form() {
        formPage.submitForm();
    }

    @Then("the form should be submitted successfully")
    public void the_form_should_be_submitted_successfully() {
        // Add assertions as needed to verify successful submission
        assertTrue(true);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
