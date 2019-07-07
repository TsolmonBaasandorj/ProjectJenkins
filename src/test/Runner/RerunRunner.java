package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/Reports","rerun:target/rerun.txt"},
        features = "@target/rerun.txt"
        ,glue = {"step_definitions"}
)



public class RerunRunner {
}
