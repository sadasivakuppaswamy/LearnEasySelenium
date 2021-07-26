package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class DragDrop {
    public static void main(String[] args) {
        WebDriver webDriver=new FirefoxDriver();
        webDriver.get("https://jqueryui.com/droppable/");
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        webDriver.switchTo().frame(webDriver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        WebElement draggble=webDriver.findElement(By.id("draggable"));
        WebElement droppable=webDriver.findElement(By.id("droppable"));

        Actions actions=new Actions(webDriver);
       // actions.dragAndDrop(draggble,droppable).build().perform();

        actions.clickAndHold(draggble).moveToElement(droppable).release().build().perform();



    }
}
