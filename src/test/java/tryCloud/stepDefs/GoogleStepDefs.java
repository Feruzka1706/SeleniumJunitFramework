package tryCloud.stepDefs;

import io.cucumber.java.en.Given;
import tryCloud.utility.BrowserUtils;
import tryCloud.utility.Driver;

public class GoogleStepDefs {

    @Given("Launch Google Home Page")
    public void launch_google_home_page() {
        Driver.getDriver().get("https://www.google.com");

        BrowserUtils.waitFor(4);
    }

}
