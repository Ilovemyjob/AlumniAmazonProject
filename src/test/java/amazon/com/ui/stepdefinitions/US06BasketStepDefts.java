package amazon.com.ui.stepdefinitions;

import amazon.com.ui.pages.AmazonWebElements;
import amazon.com.ui.utilities.ConfigReader;
import amazon.com.ui.utilities.Driver;
import amazon.com.ui.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class US06BasketStepDefts {

    AmazonWebElements basketPage=new AmazonWebElements();

    Random random = new Random();
    Random rnd = new Random();
    List<String> priceList = new ArrayList<>();
    List<String> lastPriceList = new ArrayList<>();

    @Then("Selects the product and clicks the add to cart button.")
    public void selects_the_product_and_clicks_the_add_to_cart_button() {

        int random = rnd.nextInt(basketPage.resultsList.size());

        for (int i = 0; i < basketPage.resultsList.size(); i++) {
            basketPage.resultsList.get(random).click();
            break;
        }
        basketPage.addToCartButton.click();
    }

    @Then("Verifies that the total in the cart is equal to the sum of the prices of the items.")
    public void verifies_that_the_total_in_the_cart_is_equal_to_the_sum_of_the_prices_of_the_items() {

        basketPage.cartIcon.click();
        int count = Integer.parseInt(basketPage.cartItemCount.getText());

        for (int i = 0; i < count; i++) {
            priceList.add(basketPage.itemCountPriceList.get(i).getText());
        }

        for (int i = 0; i < count; i++) {
            String str1 = priceList.get(i).replace("$", "");
            lastPriceList.add(str1);
            System.out.println("+");
        }

        double toplam = 0;
        for (int i = 0; i < count; i++) {
            Double sayi1 = Double.parseDouble(lastPriceList.get(i));
            toplam += sayi1;
        }

        String str2 = basketPage.subTotalText.getText().replace("$", "");
        DecimalFormat df = new DecimalFormat("###.##");
        Double dblToplam = Double.valueOf(df.format(toplam));
        Double dblStr2 = Double.valueOf(str2);

        assertEquals(dblToplam, dblStr2);
    }
    }




