import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args){
        WebDriver driver =  new FirefoxDriver();
        driver.get("https://www.training-support.net");

        String title = driver.getTitle();
        System.out.println(title);

        WebElement idText= driver.findElement(By.id("about-link"));
        System.out.println("Text in element:"+ idText.getText());

        WebElement classText = driver.findElement(By.className("green"));
        System.out.println("Text is:" + classText.getText());

        WebElement linkValue = driver.findElement(By.linkText("About Us"));
        System.out.println("Text is:" + linkValue.getText());

        WebElement cssValue = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text is: "+ cssValue.getText());

        driver.close();
    }
}