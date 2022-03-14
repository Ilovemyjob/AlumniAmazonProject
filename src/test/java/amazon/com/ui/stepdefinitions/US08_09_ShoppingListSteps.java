package amazon.com.ui.stepdefinitions;

import amazon.com.ui.pages.AmazonWebElements;
import amazon.com.ui.utilities.ConfigReader;
import amazon.com.ui.utilities.ReusableMethods;
import io.cucumber.java.en.Then;


import static org.junit.Assert.assertTrue;

public class US08_09_ShoppingListSteps {

    AmazonWebElements homePage = new AmazonWebElements();

    @Then("Clicks on create a list on Hello, TEAM15 text.")
    public void clicks_on_create_a_list_on_hello_team15_text() {

        ReusableMethods.hover(homePage.accountLists);
        homePage.createAList.click();

    }

    @Then("Clicks the Create a list button.")
    public void clicks_the_create_a_list_button() {

        ReusableMethods.waitFor(5);
        homePage.createAListButton.click();

    }

    @Then("Verifies the resulting list by seeing the title of Shopping List")
    public void verifies_the_resulting_list_by_seeing_the_title_of_shopping_list() {

        assertTrue(homePage.shoppingListHeader.isDisplayed());

    }

    @Then("Clicks more on the right of the Shopping List page, and then click manage list.")
    public void clicks_more_on_the_right_of_the_shopping_list_page_and_then_click_manage_list() {

        ReusableMethods.waitFor(10);
        homePage.more.click();
        homePage.manageList.click();

    }

    @Then("Clicks on Delete list and confirm and perform the delete operation.")
    public void clicks_on_delete_list_and_confirm_and_perform_the_delete_operation() {
ReusableMethods.waitFor(1);
        homePage.deleteList.click();
        ReusableMethods.waitFor(10);
        assertTrue(homePage.confirmDelete.isDisplayed());
        homePage.yesButton.click();

    }

    @Then("Records the desired data in the boxes under the Shopping List title.")
    public void recordsTheDesiredDataInTheBoxesUnderTheShoppingListTitle() {

        ReusableMethods.waitFor(10);
        homePage.addIdeaToList.click();
        ReusableMethods.waitFor(1);
        homePage.saveAnIdea.sendKeys(ConfigReader.getProperty("itemToSave"));
        homePage.addToList.click();

    }

    @Then("Clicks on the Delete item deletes the desired data.")
    public void clicksOnTheDeleteItemDeletesTheDesiredData() {
ReusableMethods.waitFor(1);
        homePage.deleteButton.click();
        ReusableMethods.waitFor(10);
        assertTrue(homePage.deletedAlert.isDisplayed());
    }
}
