import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args){
        //instantiate the driver
        WebDriver driver= new FirefoxDriver();
        //Navigate to the browser
        driver.get("https://www.training-support.net");
        //close the driver
        driver.quit();
    }
}
