package amazon.com.ui.stepdefinitions;

import amazon.com.ui.pages.AmazonWebElements;
import amazon.com.ui.utilities.ConfigReader;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class FilterTestSteps {
    AmazonWebElements homePage=new AmazonWebElements();
    @Then("Logs in with valid data")
    public void logs_in_with_valid_data() {

        homePage.accountLists.click();
        homePage.emailBox.sendKeys(ConfigReader.getProperty("validMail"));
        homePage.continueButton.click();
        homePage.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        homePage.signInButton.click();

    }
    @Then("Enters a {string} in the search box.")
    public void entersAInTheSearchBox(String productName) {

        homePage.searchBox.sendKeys(productName + Keys.ENTER);

    }

    @Then("In the top right of the results, sees the sorting by options.")
    public void inTheTopRightOfTheResultsSeesTheSortingByOptions() {

        assertTrue(homePage.sortBy.isDisplayed());

    }

    @Then("Sees the filters on the left side of the results.")
    public void seesTheFiltersOnTheLeftSideOfTheResults() {

        for (WebElement w : homePage.filtersHeader) {
            assertTrue(w.isDisplayed());
        }

    }

    @Then("Clicks on the desired option in the Sort section")
    public void clicksOnTheDesiredOptionInTheSortSection() {

        homePage.sortByIcon.click();

    }

    @Then("Sees results re-listed in desired order")
    public void sees_results_re_listed_in_desired_order() {

        for (WebElement w : homePage.sortbyDropdown) {
            assertTrue(w.isEnabled());
        }
    }

    @Then("Customizes the filters on the left side of the results.")
    public void customizes_the_filters_on_the_left_side_of_the_results() {

        for (WebElement w : homePage.filtersInner) {
            assertTrue(w.isEnabled());

        }

        for (int i = 0; i < homePage.filtersInner.size(); i++) {

            homePage.filtersInner.get(20).click();
        }
    }

    @Then("Sees that the results are re-listed according to the desired filtering.")
    public void sees_that_the_results_are_re_listed_according_to_the_desired_filtering() {

        for (WebElement w : homePage.resultsAfterFilter) {

            assertTrue(w.getText().contains("8GB"));

        }


    }
}
