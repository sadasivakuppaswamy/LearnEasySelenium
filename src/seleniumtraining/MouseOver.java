package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseOver {
    public static void main(String[] args) {
        WebDriver webDriver=new FirefoxDriver();
        webDriver.get("https://www.spicejet.com/");
        webDriver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

        Actions actions=new Actions(webDriver);
        actions.moveToElement(webDriver.findElement(By.xpath("//a[text()='Login / Signup']"))).perform();
             //   actions.moveToElement(webDriver.findElement(By.xpath("//a[text()='Corporate Accounts']"))).perform();
        actions.click(webDriver.findElement(By.xpath("//a[text()='Corporate Accounts']"))).build().perform();
    }

}
