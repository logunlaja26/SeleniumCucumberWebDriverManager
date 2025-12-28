package stepDefinition;

import io.cucumber.java.en.Given;

import static Pages.HomePage.click_hamburger_menu;
import static Pages.HomePage.click_online_products_link;
import static Pages.HomePage.click_signIn_link;

public class HomePage {

    @Given("^User navigates to the Login page$")
    public void user_navigates_to_the_Login_page() throws InterruptedException {
        click_hamburger_menu();
        click_signIn_link();
    }

    @Given("User navigates to the Online products page")
    public void user_navigates_to_the_online_products_page() throws InterruptedException {
        click_hamburger_menu();
        click_online_products_link();

    }

}
