package tryCloud.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import tryCloud.pages.LoginPage;
import tryCloud.utility.BrowserUtils;
import tryCloud.utility.ConfigReader;
import tryCloud.utility.Driver;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();


    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigReader.read("tryCloudURL"));
        BrowserUtils.waitFor(3);
    }

    @When("user enter valid {string} and {string}")
    public void user_enter_valid_and(String userName, String password) {
        loginPage.userNameInput.sendKeys(userName, Keys.ENTER);
        BrowserUtils.waitFor(2);
        loginPage.passwordInput.sendKeys(password);
        BrowserUtils.waitFor(2);
    }

    @When("user click login button")
    public void user_click_login_button() {
        loginPage.loginButton.click();
        BrowserUtils.waitFor(3);
    }


    @Then("user should be at dashboard page")
    public void user_should_be_at_dashboard_page() {
        String expectedTitle="Dashboard - Trycloud";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"Actual webpage title is: "+actualTitle);
    }


    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String errorMessage) {
        //String actualErrorMessage=loginPage.errorMessage.getText();
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
        BrowserUtils.waitFor(2);
    }



}
