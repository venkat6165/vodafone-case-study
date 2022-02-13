package options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty","json:target/cucumber/Cucumber.json"},
        glue={"stepdefs"},
        features={"src/test/features"}
)

public class CucumberTests {
}
