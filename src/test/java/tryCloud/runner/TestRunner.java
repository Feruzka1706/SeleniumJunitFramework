package tryCloud.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions( features ="src/test/resources/features",
                 glue = "src/test/java/tryCloud/stepDefs",
                 plugin = {"html:target/cucumber.html",
                         "rerun:target/rerun.txt",
                         "json:target/cucumber.json",
                         "me.jvt.cucumber.report.PrettyReports:target"
                 }
       // ,dryRun = false
        //,tags = "@feature2"
)
public class TestRunner extends AbstractTestNGCucumberTests {


}
