package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
        //instantiate the driver
        WebDriver driver = new FirefoxDriver();
        @BeforeMethod
        public void beforeMethod() {
            //navigate to the browser
            driver.get("https://alchemy.hguy.co/lms");
        }
        @Test
        public void test() {
            //gets the title
            WebElement title = driver.findElement(By.cssSelector("#post-71 > div:nth-child(3) > h3:nth-child(1)"));
            String courseTitle = title.getText();
            System.out.println(courseTitle);

            //compares the actual title
            Assert.assertEquals("Email Marketing Strategies", courseTitle);
        }
        @AfterMethod
        public void afterMethod(){
            //close the browser
            driver.close();
        }
}
