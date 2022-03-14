package amazon.com.ui.stepdefinitions;

import amazon.com.ui.pages.AmazonWebElements;
import amazon.com.ui.utilities.*;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US05Filter_StepDefts {
    AmazonWebElements pages = new AmazonWebElements();



    @Then("Choose any filter option")
    public void chooseAnyFilterOption() {

       /* JSUtil.scrollInToViewJS(pages.filterBrandAppleOption);
        Actions action = new Actions(Driver.getDriver());
        action.doubleClick(pages.filterBrandAppleOption).perform();*/
        JSUtil.scrollInToViewJS(pages.sortByFeatured);
        pages.sortByFeatured.click();
        ReusableMethods.wait(1);
        pages.lowToHighhOption.click();
       ReusableMethods.wait(2);
        JSUtil.scrollDownByJS();

        List<WebElement> priceLists = Driver.getDriver().findElements(By.xpath("//a//span[@class='a-price']"));

        List<Double> pricelistDouble = new ArrayList<>();
        for (WebElement w : priceLists) {
            pricelistDouble.add(Double.parseDouble(w.getText().replaceAll("\\D", "")));

        }

        System.out.println(pricelistDouble);

        System.out.println("###########################################");

        List<Double>ascendingList=new ArrayList<>();
        for (Double w:pricelistDouble ){
            ascendingList.add(w);

        }
        Collections.sort(ascendingList);
        System.out.println(ascendingList);
        Driver.wait(1);
        Assert.assertEquals(ascendingList,pricelistDouble);


    }

}
