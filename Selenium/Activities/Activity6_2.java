import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
        public static void main(String[] args) {
            WebDriver driver = new FirefoxDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

            driver.get("https://training-support.net/selenium/ajax");
            System.out.println(driver.getTitle());

            WebElement content = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/button"));
            content.click();

            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));

            String text = driver.findElement(By.id("ajax-content")).getText();
            System.out.println(text);

            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));

            String laterText = driver.findElement(By.id("ajax-content")).getText();
            System.out.println(laterText);

            driver.close();
        }
    }

