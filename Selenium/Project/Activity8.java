package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
    //instantiate the driver
        WebDriver driver = new FirefoxDriver();
        @BeforeMethod
        public void beforeMethod() {
            //navigate to the browser
            driver.get("https://alchemy.hguy.co/lms");
        }
        @Test
        public void test1() {
            //navigate to contact
            WebElement contact = driver.findElement(By.linkText("Contact"));
            contact.click();

            //sending the name
            WebElement fullname = driver.findElement(By.id("wpforms-8-field_0"));
            fullname.sendKeys("Amulya");

            //typing in email
            WebElement email = driver.findElement(By.id("wpforms-8-field_1"));
            email.sendKeys("abc@gmail.com");

            //typing in subject
            WebElement subject = driver.findElement(By.id("wpforms-8-field_3"));
            subject.sendKeys("jksgdf");

            //sending in message
            WebElement message = driver.findElement(By.id("wpforms-8-field_2"));
            message.sendKeys("qjwgefiuewgf");

           //submit
            WebElement button = driver.findElement(By.id("wpforms-submit-8"));
            button.click();

            //confirmation message
            WebElement confirmMessage = driver.findElement(By.xpath("//article/div/section[4]/div[2]/div[2]/div[2]/div[2]/p"));
            System.out.println(confirmMessage.getText());
        }

        @AfterMethod
        public void afterMethod(){
            //close the browser
            driver.close();
        }
}
