package stepDefinition;

import cucumberOptions.TestRunner;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;


@RunWith(Cucumber.class)



public class stepDefinition extends AbstractTestNGCucumberTests {


    @Given("^I am on SauceLabs login page$")
    public void i_am_on_saucelabs_login_page() throws Throwable {
            System.out.println("I am ON LOGIN PAGE");



    }

    @Given("^I am on SauceLabs HomePage$")
    public void i_am_on_saucelabs_homepage() throws Throwable {
        System.out.println("I am at login page");
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void i_enter_username_something(String strArg1) throws Throwable {
        System.out.println("This is where i will enter my username");
    }

    @When("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
        System.out.println("This is where i will click on login button");
    }

    @When("^I click on SauceLabs BackPack$")
    public void i_click_on_saucelabs_backpack() throws Throwable {
        System.out.println("This is when i am at home page after login and i am selecting backpack from home page");
    }

    @Then("^I am taken to SauceLabs Home Page$")
    public void i_am_taken_to_saucelabs_home_page() throws Throwable {
        System.out.println("This is where i have logged in correctly");
    }

    @Then("^I am taken to Sauce Labs Backpack page$")
    public void i_am_taken_to_sauce_labs_backpack_page() throws Throwable {
        System.out.println("I am now at backpage page");
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void i_enter_password_something(String strArg1) throws Throwable {
        System.out.println("This is where i will enter my password");
    }

    @And("^BackPage is available on HomePage$")
    public void backpage_is_available_on_homepage() throws Throwable {
        System.out.println("back pack is available for selection on homepage");
    }

}
