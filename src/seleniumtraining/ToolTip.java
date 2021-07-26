package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTip {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.seleniumhq.org/");
        WebElement link = webDriver.findElement(By.xpath("//h1/a"));
        System.out.println(link.getAttribute("title"));
    }
}
