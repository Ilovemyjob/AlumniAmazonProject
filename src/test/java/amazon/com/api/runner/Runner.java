package amazon.com.api.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:Reports/htmlReport.html",
                "json:Reports/jsonReport.json"},
        features="src/test/resources/apiFeature",
        glue="amazon/com/api/stepdefinitions",
        //dryRun=false,
        tags="@amazon.com.api",
        publish=true
)
public class Runner {

}
