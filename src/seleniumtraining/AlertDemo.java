package seleniumtraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class AlertDemo {
    public static void main(String[] args) {
        WebDriver webDriver = new HtmlUnitDriver();
        webDriver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
        webDriver.findElement(By.xpath("//*[@name='cusid']")).sendKeys("535345");
        webDriver.findElement(By.xpath("//*[@name='submit']")).click();

        Alert alert = webDriver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        webDriver.findElement(By.xpath("//*[@name='submit']")).click();
        alert.accept();

        Alert alert1=webDriver.switchTo().alert();
        System.out.println(alert1.getText());
        alert.accept();


    }
}
