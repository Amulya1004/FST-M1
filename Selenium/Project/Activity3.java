package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
        //instantiate the driver
        WebDriver driver = new FirefoxDriver();
        @BeforeMethod
        public void beforeMethod() {
            //navigate to the browser
            driver.get("https://alchemy.hguy.co/lms");
        }
        @Test
        public void test() {
            WebElement title = driver.findElement(By.xpath("//section[2]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/h3"));
            String infoTitle = title.getText();
            System.out.println(infoTitle);
            Assert.assertEquals("Actionable Training", infoTitle);
        }
        @AfterMethod
        public void afterMethod(){
            //close the browser
            driver.close();
        }

    }

