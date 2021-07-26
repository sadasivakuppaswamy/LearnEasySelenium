package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {
    public static void main(String[] args) throws InterruptedException {


        //System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");
        WebDriver driver = new FirefoxDriver(); //launch chrome
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("http://spicejet.com/");

        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.className("link"))).clickAndHold().
                moveToElement(driver.findElement(By.xpath("//a[text()='Travel Agent Login']"))).release().click().build().perform();

        Thread.sleep(3000);

        //driver.findElement(By.xpath("//a[text()='Member Login']")).click();

        //a[contains(text(),'Sales')]


    }
}
