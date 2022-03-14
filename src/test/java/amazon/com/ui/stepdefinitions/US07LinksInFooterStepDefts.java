package amazon.com.ui.stepdefinitions;

import amazon.com.ui.pages.AmazonWebElements;
import amazon.com.ui.utilities.Driver;
import amazon.com.ui.utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US07LinksInFooterStepDefts {


    AmazonWebElements bottomLinks=new AmazonWebElements();

    @Then("scroll down to the bottom of the home page")
    public void scroll_down_to_the_bottom_of_the_home_page() {

        Actions actions=new Actions(Driver.getDriver());
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.END).perform();

    }
    @Then("click the links in the second column and verifies page name")
    public void click_the_links_in_the_second_column_and_verifies_page_name() {

        String linkName="";
        int count=0;

        for (int i=0;i<bottomLinks.linkList.size();i++){
            linkName=bottomLinks.linkList.get(i).getText().replace("Amaazon","").
                    replace(bottomLinks.linksExtraInformation.get(i).getText(),"").toLowerCase().trim();
            String []arrLinkName=linkName.split(" ");
            System.out.println(arrLinkName[0]);
Driver.wait(1);
            bottomLinks.linkList.get(i).click();
            System.out.println(Driver.getDriver().getTitle().toLowerCase());
            System.out.println(Driver.getDriver().getCurrentUrl().toLowerCase());

            if(Driver.getDriver().getTitle().toLowerCase().contains(arrLinkName[0]) ){
                count++;

                Driver.getDriver().navigate().back();

                ReusableMethods.waitFor(1);
            }





        }

        System.out.println("count: "+ count);

        Assert.assertTrue(count==bottomLinks.linkList.size());

    }



}
