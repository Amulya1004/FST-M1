package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
    //instantiate the browser
        WebDriver driver = new FirefoxDriver();
        @BeforeMethod
        public void beforeMethod() {
            //navigate to the browser
            driver.get("https://alchemy.hguy.co/lms");
        }
        @Test
        public void test() {
            //logging in to account----
            WebElement account = driver.findElement(By.id("menu-item-1507"));
            account.click();

            String myAccount = driver.getTitle();
            Assert.assertEquals(myAccount, "My Account – Alchemy LMS");

            WebElement login = driver.findElement(By.linkText("Login"));
            login.click();

            WebElement username = driver.findElement(By.id("user_login"));
            username.sendKeys("root");

            WebElement password = driver.findElement(By.id("user_pass"));
            password.sendKeys("pa$$w0rd");

            WebElement loginButton = driver.findElement(By.id("wp-submit"));
            loginButton.click();
            //------logging to account

            //navigating to course
            WebElement courses = driver.findElement(By.linkText("All Courses"));
            courses.click();

            driver.findElement(By.linkText("See more...")).click();

            //lesson title
            driver.findElement(By.className("ld-item-title")).click();
            String title = driver.getTitle();
            System.out.println(title);
        }
        @AfterMethod
        public void afterMethod() {
            //close the browser
            driver.close();
        }
    }

