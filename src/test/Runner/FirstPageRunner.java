package Runner;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/Reports","rerun:target/rerun.txt","json:target/FirstPageRunner.json"},
        features = "/Users/Tsolmon/IdeaProjects/HakuProject/src/main/resources/FirstPage.feature:96"
        ,glue = {"step_definitions"}
        //,tags= {"@test"}
)



public class FirstPageRunner {
}
