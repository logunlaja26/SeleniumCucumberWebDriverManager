package Pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationPage extends BrowserDriver {

    public static String user_registration_xpath = "/html/body/center/h1";

    public static void visibility_user_registration() throws InterruptedException {
        String actual_user_registration = driver.findElement(By.xpath(user_registration_xpath)).getText();
        assertEquals("User Registration Page",actual_user_registration);
    }
}
