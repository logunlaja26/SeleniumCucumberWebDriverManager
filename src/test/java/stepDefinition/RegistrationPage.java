package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Pages.LoginPage.click_NewRegister_btn;
import static Pages.LoginPage.click_login_btn;
import static Pages.LoginPage.sendkeys_password;
import static Pages.LoginPage.sendkeys_username;
import static Pages.RegistrationPage.visibility_user_registration;

public class RegistrationPage {

    @Then("User should be able to view the Registration page")
    public void user_should_be_able_to_view_the_registration_page() throws InterruptedException {
        visibility_user_registration();
    }

    
}
