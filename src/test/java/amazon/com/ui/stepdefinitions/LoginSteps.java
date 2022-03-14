package amazon.com.ui.stepdefinitions;

import amazon.com.ui.pages.AmazonWebElements;
import amazon.com.ui.utilities.ConfigReader;
import amazon.com.ui.utilities.Driver;
import amazon.com.ui.utilities.Log;
import io.cucumber.java.en.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


import static org.junit.Assert.*;

public class LoginSteps {

    AmazonWebElements homePage = new AmazonWebElements();
    Logger log = (Logger) LogManager.getLogger(LoginSteps.class);

    @When("User goes to url.")
    public void userGoesToUrl() {

        Log.startTestCase("Login test");
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        log.info("went to url");
    }

    @Then("Clicks the sign in button on the Account & Lists article")
    public void clicksTheSignInButtonOnTheAccountListsArticle() {

        homePage.accountLists.click();
        log.info("account & list clicked");
    }

    @Then("Enters the valid data into the e-mail box and click the continue button.")
    public void entersTheValidDataIntoTheEMailBoxAndClickTheContinueButton() {

        homePage.emailBox.sendKeys(ConfigReader.getProperty("validMail"));
        homePage.continueButton.click();
        log.info("logged in with valid mail");
    }

    @Then("Enters the valid data in the password box and click the sign in button.")
    public void entersTheValidDataInThePasswordBoxAndClickTheSignInButton() {

        homePage.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        homePage.signInButton.click();
        log.info("logged in with valid password");

    }

    @And("The user logs in successfully.")
    public void theUserLogsInSuccessfully() {

        assertTrue(homePage.accountLists.getText().contains(ConfigReader.getProperty("validPassword")));
        log.info("successfully logged in");
    }

    @Then("Enters the invalid data into the e-mail box and clicks the continue button.")
    public void entersTheInvalidDataIntoTheEMailBoxAndClicksTheContinueButton() {

        homePage.emailBox.sendKeys(ConfigReader.getProperty("invalidMail"));
        homePage.continueButton.click();
        log.info("Unable to login with invalid mail");
    }

    @Then("Sees There was a problem")
    public void seesThereWasAProblem() {

        assertTrue(homePage.thereWasAProblem.isDisplayed());
        log.info("alert seen");
    }

    @Then("Enters the invalid data in the password box and clicks the sign in button.")
    public void entersTheInvalidDataInThePasswordBoxAndClicksTheSignInButton() {

        homePage.passwordBox.sendKeys(ConfigReader.getProperty("invalidPassword"));
        homePage.signInButton.click();
        log.info("Unable to login with invalid password");
    }

    @And("User cannot login successfully.")
    public void userCannotLoginSuccessfully() {

        assertTrue(homePage.yourPasswordIsIncorrect.isDisplayed());
        log.info("alert seen");
    }

    @Then("Closes the page")
    public void closesThePage() {

        Driver.closeDriver();
        log.info("page closed");
        Log.endTestCase("Login test");
    }


}
