package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"java\\workspaceIntellij\\myFramework\\test\\resourses\\features"},
        glue = {"stepdefinition"},
        tags = ("@Customer")

)

public class runner {


}
