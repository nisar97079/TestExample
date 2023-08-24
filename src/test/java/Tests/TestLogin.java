package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestLogin {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testValidLogin() {
        loginPage.enterUsername("your_username");
        loginPage.enterPassword("your_password");
        loginPage.clickLoginButton();
        
        // Add assertions or verification steps
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}