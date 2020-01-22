package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin={"html:target/cucumberHMTL-report","pretty","json:target/cucumber.json"},
            features = {"src/test/resources/uiFeatures"},  // "src/test/Resources/dbFeatures"
            glue = "stepDefs",
            dryRun =false,
            tags = {}
    )
    public class uiRunner {
    }


