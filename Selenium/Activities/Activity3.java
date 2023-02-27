import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");

        String title = driver.getTitle();
        System.out.println(title);

            driver.findElement(By.name("firstname")).sendKeys("Amulya");
            driver.findElement(By.name("lastname")).sendKeys("Yarasani");
            driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
            driver.findElement(By.name("contact")).sendKeys("12345678");
            driver.findElement(By.cssSelector(".ui.green.button")).click();

            driver.close();

        }
    }
