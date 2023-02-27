import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String[] args){
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());

        WebElement checkBoxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        boolean status= checkBoxInput.isSelected();
        System.out.println(status);

        WebElement checkBox= driver.findElement(By.id("toggleCheckbox"));
        checkBoxInput.click();

        System.out.println(checkBoxInput.isSelected());
    }
}
