package runners;


import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features" ,
        glue = "stepDefinitions",
        dryRun = false,
        monochrome = true,
        tags = "@regression",
        plugin = {"pretty",
                "html:target/cucumber-default-reports",
                "rerun:target/failedTest.txt",
                "json:target/cucumber.json"
        }
)

public class RegressionRunner {
}
