package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity6 {
    //instantiate the driver
        WebDriver driver = new FirefoxDriver();
        @BeforeMethod
        public void beforeMethod() {
            //navigate to the browser
            driver.get("https://alchemy.hguy.co/lms");
        }
        @Test
        public void test1() {
            //finding MyAccount element
            WebElement account = driver.findElement(By.id("menu-item-1507"));
            account.click();
            //gets the title
            String myAccount = driver.getTitle();

            //compares the actual title
            Assert.assertEquals(myAccount, "My Account – Alchemy LMS");

            //finding the login button
            WebElement login = driver.findElement(By.linkText("Login"));
            login.click();

            //sending the username
            WebElement username = driver.findElement(By.id("user_login"));
            username.sendKeys("root");

            //sending the password
            WebElement password = driver.findElement(By.id("user_pass"));
            password.sendKeys("pa$$w0rd");

            //login
            WebElement loginButton = driver.findElement(By.id("wp-submit"));

            //checks if logged in
            Assert.assertTrue(loginButton.isDisplayed());
            loginButton.click();
        }
        @AfterMethod
        //close the browser
        public void afterMethod(){
        driver.close();
        }
}
