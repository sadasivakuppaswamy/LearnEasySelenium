package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        org.openqa.selenium.Alert alert =driver.switchTo().alert();
        alert.accept();
        org.openqa.selenium.Alert alert2 =driver.switchTo().alert();
        alert2.accept();


    }
}
