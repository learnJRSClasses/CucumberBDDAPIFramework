package runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefs"},
        plugin = {"pretty", "html:target/cucumber-Report.html", "json:target/cucumber-json"}
)
public class TestRunner
{
}
