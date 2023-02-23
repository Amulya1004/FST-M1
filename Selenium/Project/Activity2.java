package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {

    WebDriver driver = new FirefoxDriver();  //instantiate the driver
    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://alchemy.hguy.co/lms");  //navigate to the browser
        }
        @Test
        public void test() {

        //gets the heading of the webpage
        String heading = driver.findElement(By.xpath("//div/div/div/div/div[1]/h1")).getText();
        System.out.println(heading);
        Assert.assertEquals("Learn from Industry Experts", heading);
         }
        @AfterMethod
        public void afterMethod() {
        //close the browser
        driver.close();

        }
}

