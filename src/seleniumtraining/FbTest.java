package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FbTest {
    static WebDriver webDriver;
    public static void main(String[] args) throws InterruptedException{
        //https://chromedriver.storage.googleapis.com/index.html?path=74.0.3729.6/
        System.setProperty("webdriver.chrome.driver","/Users/sadasivaku/Documents/GitHub/Selenium/src/drivers/chromedriver");

        webDriver =new ChromeDriver();
        webDriver.navigate().to("https://www.facebook.com/"); //to navigate
        System.out.println(webDriver.getCurrentUrl());
        System.out.println(webDriver.getTitle());
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        webDriver.manage().window().maximize();
       // new FbTest().loginFacebook("12347645466","4783457459","Male");
       // new FbTest().getAllLinks();

        /*WebElement day= webDriver.findElement(By.id("day"));
        Select select1 =new Select(day);
        select1.selectByIndex(5);


        WebElement month= webDriver.findElement(By.id("month"));
        Select select2 =new Select(month);
        select2.selectByVisibleText("Apr");

        WebElement year= webDriver.findElement(By.id("year"));
        Select select3 =new Select(year);
        select3.selectByValue("2018");

        System.out.println(select1.getAllSelectedOptions());
        //select1.deselectAll(); --only applicable for multi select
        //select2.deselectByVisibleText("Apr"); - only applicable for multi select
        System.out.println(select3.getOptions().size());
*/

        webDriver.findElement(By.linkText("Create a Page")).click();
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.close();

    }
    public void loginFacebook(String userName,String password,String gender){
        webDriver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);
        String enteredString=webDriver.findElement(By.xpath("//input[@id='email']")).getText();
        if(enteredString.equals(userName)){
            System.out.println("true");
        }
        webDriver.findElement(By.id("pass")).sendKeys(password);
    //  webDriver.findElement(By.xpath("//input[@value='Log In']")).click();
        webDriver.findElement(By.xpath("//label[text()='"+gender+"']/parent::span/input")).click();
        System.out.println("Hi");


    }
    public void getAllLinks(){
       List<WebElement> link= webDriver.findElements(By.tagName("a"));
        System.out.println(link.size());
        Iterator<WebElement> iterator =link.iterator();
        while (iterator.hasNext()){
            WebElement linkWebElement =iterator.next();
            System.out.println(linkWebElement.getAttribute("href"));
            //To click on create a page
            if("Create a Page".equals(linkWebElement.getText())){
                linkWebElement.click();
            }
        }

    }

}
