package amazon.com.ui.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reportsUI.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"},
        features="src/test/resources/uiFeature",
        glue="ui/stepdefinitions",
        tags="@Parallel1"  ,

        dryRun= false

)
public class ParallelTestRunner1 {

}