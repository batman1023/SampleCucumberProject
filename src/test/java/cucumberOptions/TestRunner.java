package cucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;


@CucumberOptions(
        features = "src/test/java/features",
        glue="stepDefinition",
        stepNotifications = true,
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:target/reportHTML"}
)
@RunWith(Cucumber.class)
public class TestRunner {



    }

