package activities;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Activity1 {

    WebDriver driver;
    @BeforeMethod
    public void beforeClass(){
         driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
    }

    @Test
    public void test1(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Training Support", title);
    }

    @Test
    public void test2(){
        WebElement button = driver.findElement(By.id("about-link"));
        button.click();
        String title = driver.getTitle();
        Assert.assertEquals("About Training Support", title);
    }

    @AfterMethod
    public void afterClass(){
        driver.close();

    }

}
