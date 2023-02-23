package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class Activity7 {
    //instantiate the driver
        WebDriver driver = new FirefoxDriver();
        @BeforeMethod
        public void beforeMethod() {
            //navigate to the browser
            driver.get("https://alchemy.hguy.co/lms");
        }
        @Test
        public void test() {
            //navigate to courses
            WebElement courses = driver.findElement(By.linkText("All Courses"));
            courses.click();

            //counts the total courses
            List<WebElement> courseList = driver.findElements(By.xpath("//div[@class ='ld-course-list-items row']/div"));
            System.out.println(courseList.size());
            Assert.assertEquals(courseList.size(),3);
        }
        @AfterMethod
        public void afterMethod(){
            //close the browser
            driver.close();
        }
}
