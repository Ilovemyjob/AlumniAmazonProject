package amazon.com.ui.stepdefinitions;

import amazon.com.ui.pages.AmazonWebElements;
import amazon.com.ui.utilities.ConfigReader;
import amazon.com.ui.utilities.Driver;
import amazon.com.ui.utilities.Log;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US03_allMenu {

   AmazonWebElements us03=new AmazonWebElements();


    @Then("user clicks ALL menu")
    public void user_clicks_all_menu() {
        Log.startTestCase("all menu testi");
        us03.allButton.click();
        Log.info("All butonuna tıklandı");


    }
    @Then("user selects {string}")
    public void user_selects(String categori) {
        for (int i=0; i< us03.categoriMenu.size(); i++){
            if (us03.categoriMenu.get(i).getText().equals(categori)){
                us03.categoriMenu.get(i).click();
            }
        }
        Log.info("menu seçildi");


    }
    @Then("user verifies that there are {int} subcategories")
    public void user_verifies_that_there_are_subcategories(int numOfCategories) {

        Assert.assertEquals(us03.subCategoriMenu.size()-1,numOfCategories);
        Log.info ("alt katogorilerin kaç tane olduğu doğrulandı");


    }

    @Then("user verifies the title of all subcategories")
    public void userVerifiesTheTitleOfAllSubcategories() {


        List<String> expectedSubMenu= Arrays.asList(
                "Accessories & Supplies",
                "Camera & Photo",
                "Car & Vehicle Electronics",
                "Cell Phones & Accessories",
                "Computers & Accessories",
                "GPS & Navigation",
                "Headphones",
                "Home Audio",
                "Office Electronics",
                "Portable Audio & Video",
                "Security & Surveillance",
                "Service Plans",
                "Television & Video",
                "Video Game Consoles & Accessories",
                "Video Projectors",
                "Wearable Technology",
                "eBook Readers & Accessories");

        List<String>actualSubMenu=new ArrayList<>();
        for (int i=0; i< us03.subCategoriMenu.size(); i++){
            actualSubMenu.add(us03.subCategoriMenu.get(i).getText());
        }

        Assert.assertTrue(actualSubMenu.containsAll(expectedSubMenu));
        Log.info("beklenen tüm alt kategorilerin olduğu doğrulandı");
        Log.endTestCase("all menu testi");


    }
}
