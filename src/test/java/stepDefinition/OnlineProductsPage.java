package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Pages.OnlineProductsPage.click_formalshoesdropdown;
import static Pages.OnlineProductsPage.getText_formalshoes_firstvalue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnlineProductsPage {

    @When("User clicks on Formal Shoes drop down")
    public void user_clicks_on_formal_shoes_drop_down() throws InterruptedException {
        click_formalshoesdropdown();

    }
    @Then("User should be able to view the Products")
    public void user_should_be_able_to_view_the_products() {
        getText_formalshoes_firstvalue();
        assertEquals("   Classic Cheltenham",getText_formalshoes_firstvalue());

    }

}
