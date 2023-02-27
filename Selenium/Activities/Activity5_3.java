import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());

        WebElement textInput = driver.findElement(By.xpath("//input[@type='text']"));
        boolean status = textInput.isEnabled();
        System.out.println(status);
        driver.findElement(By.id("toggleInput")).click();

        System.out.println(textInput.isEnabled());

        driver.close();

    }
}
