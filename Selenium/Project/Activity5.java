package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity5 {
        //instantiate the driver
        WebDriver driver = new FirefoxDriver();
       @BeforeMethod
       public void beforeMethod() {
           //navigate to the browser
           driver.get("https://alchemy.hguy.co/lms");
       }
       @Test
       public void test() {
           //finding the MyAccount element
           WebElement account = driver.findElement(By.linkText("My Account"));
           account.click();
           //compares with actual title
           Assert.assertEquals(driver.getTitle(), "My Account – Alchemy LMS");
       }

    @AfterMethod
    public void afterMethod() {
           //close the browser
        driver.close();
    }

}

