                                                                                                                   package activities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    //instantiate the driver
    WebDriver driver = new FirefoxDriver();
    @BeforeMethod
    public void beforeMethod() {
        //navigate to the browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
     public void test() {
        //get the title
        String title = driver.getTitle();
        System.out.println(title);   //print the title
        Assert.assertEquals("Alchemy LMS – An LMS Application",title);   //compares the title with actual one
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();    //closes the browser
    }
}


