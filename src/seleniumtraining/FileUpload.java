package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://html.com/input-type-file/");
        driver.findElement(By.id("fileupload")).sendKeys("/Users/sadasivaku/Documents/GitHub/Selenium/salesforce.png");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.close();
    }
}
