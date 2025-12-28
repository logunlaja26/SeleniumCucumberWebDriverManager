package stepDefinition;

import io.cucumber.java.en.Then;

import static Pages.LoggedInPage.visibility_productcategory_formalshoes;
import static Pages.LoggedInPage.visibility_productcategory_sneakershoes;
import static Pages.LoggedInPage.visibility_productcategory_sportshoes;

public class LoggedInPage {
    @Then("User should be able to view the product category page")
    public void user_should_be_able_to_view_the_product_category_page() throws InterruptedException {
        visibility_productcategory_formalshoes();
        visibility_productcategory_sportshoes();
        visibility_productcategory_sneakershoes();
    }
}
