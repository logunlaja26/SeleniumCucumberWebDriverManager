package Pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggedInPage extends BrowserDriver {

    public static String productcategory_formalshoes = "//*[text()='Formal Shoes']";

    public static String productcategory_sportsshoes = "//*[text()='Sports']";

    public static String productcategory_sneakers = "//*[text()='Sneakers']";

    public static void visibility_productcategory_formalshoes() throws InterruptedException {
        String actualProductCategory_fs = driver.findElement(By.xpath(productcategory_formalshoes)).getText();
        assertEquals("Formal Shoes",actualProductCategory_fs);
    }

    public static void visibility_productcategory_sportshoes() throws InterruptedException {
        String actualProductCategory_ss = driver.findElement(By.xpath(productcategory_sportsshoes)).getText();
        assertEquals("Sports",actualProductCategory_ss);
    }

    public static void visibility_productcategory_sneakershoes() {
        String actualProductCategory_s = driver.findElement(By.xpath(productcategory_sneakers)).getText();
        assertEquals("Sneakers",actualProductCategory_s);
    }

}
