package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DoubleClick {
    public static void main(String[] args) {
        WebDriver webDriver=new FirefoxDriver();
        webDriver.get("http://demo.guru99.com/test/simple_context_menu.html");
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        Actions actions=new Actions(webDriver);
        //double click
       // actions.doubleClick(webDriver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).build().perform();
        //right click
        actions.contextClick(webDriver.findElement(By.xpath("//span[text()='right click me']"))).
            click(webDriver.findElement(By.className("context-menu-icon-copy"))).build().perform();
    }
}
