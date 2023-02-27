import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");

        String title = driver.getTitle();
        System.out.println(title);

        driver.findElement(By.xpath("//@input[@id='firstname']")).sendKeys("Amulya");
        driver.findElement(By.xpath("//@input[@id='lastname']")).sendKeys("Yarasani");
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("abc@example.com");
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("123456789");
        driver.findElement(By.xpath("//textarea")).sendKeys("This is selenium message");
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
    }
}
