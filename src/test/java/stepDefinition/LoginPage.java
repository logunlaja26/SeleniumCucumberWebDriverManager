package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Pages.LoginPage.click_NewRegister_btn;
import static Pages.LoginPage.click_login_btn;
import static Pages.LoginPage.sendkeys_password;
import static Pages.LoginPage.sendkeys_username;

public class LoginPage {

    @When("User successfully enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }

    @When("^User clicks on new Registration button$")
    public void user_clicks_on_new_registration_button() throws InterruptedException {
        click_NewRegister_btn();
    }

}
