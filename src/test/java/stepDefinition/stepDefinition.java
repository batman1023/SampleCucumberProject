package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;


@RunWith(Cucumber.class)



public class stepDefinition {
    public static WebDriver driver;



    @Given("^I am on SauceLabs login page$")
    public void i_am_on_saucelabs_login_page() throws Throwable {
            System.out.println("I am ON LOGIN PAGE");
        String host = "localhost";
        DesiredCapabilities dc;

        if (System.getProperty("BROWSER") != null &&
                System.getProperty("BROWSER").equalsIgnoreCase("firefox")) {
            dc = DesiredCapabilities.firefox();
        } else {
            dc = DesiredCapabilities.chrome();
        }

        if (System.getProperty("HUB_HOST") != null) {
            host = System.getProperty("HUB_HOST");
        }

        String completeUrl = "http://" + host + ":4444/wd/hub";
        driver = new RemoteWebDriver(new URL(completeUrl), dc);



       /* System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Documents\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();*/
        driver.get("https://www.saucedemo.com/");

            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]")).getText();





    }

    @Given("^I am on SauceLabs HomePage$")
    public void i_am_on_saucelabs_homepage() throws Throwable {
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")).getText();
        System.out.println("I am at login page");
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void i_enter_username_something(String username) throws Throwable {
        System.out.println("This is where i will enter my username");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys(username);
    }

    @When("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]")).click();
    }

    @When("^I click on SauceLabs BackPack$")
    public void i_click_on_saucelabs_backpack() throws Throwable {
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]")).click();
        System.out.println("This is when i am at home page after login and i am selecting backpack from home page");
    }

    @Then("^I am taken to SauceLabs Home Page$")
    public void i_am_taken_to_saucelabs_home_page() throws Throwable {
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")).getText();
        System.out.println("I am now on Home Page");
    }

    @Then("^I am taken to Sauce Labs Backpack page$")
    public void i_am_taken_to_sauce_labs_backpack_page() throws Throwable {
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).getText();
        System.out.println("I am now at backpage page");
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void i_enter_password_something(String password) throws Throwable {
        System.out.println("This is where i will enter my password");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys(password);
    }

    @And("^BackPage is available on HomePage$")
    public void backpage_is_available_on_homepage() throws Throwable {
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]")).getText();
        System.out.println("back pack is available for selection on homepage");
    }



    @Given("Jacket is available on HomePage")
    public void jacket_is_available_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/a[1]/div[1]")).getText();
    }
    @When("I click on SauceLabs Jacket")
    public void i_click_on_sauce_labs_jacket() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/a[1]/div[1]")).click();

    }
    @Then("I am taken to Sauce Labs Jacket page")
    public void i_am_taken_to_sauce_labs_jacket_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).getText();

    }
    @Then("I close the browser")
    public void i_close_the_browser() {
    driver.quit();
    }
}
