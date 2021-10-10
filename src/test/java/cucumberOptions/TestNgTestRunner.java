package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;


@CucumberOptions(
        features = "src/test/java/features",
        glue="stepDefinition"
)

public class TestNgTestRunner extends AbstractTestNGCucumberTests {


}
