package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestngGroup {
    WebDriver webDriver;
    @BeforeClass(groups = {"sanity","regression"})
    @Parameters("browser")
    public void setUp(String browser){
        switch (browser){
            case "firefox":{
                webDriver =new FirefoxDriver();
                break;
            }
            case "chrome":{

            }
            System.setProperty("webdriver.chrome.driver","/Users/sadasivaku/Documents/GitHub/Selenium/src/drivers/chromedriver");
            webDriver =new ChromeDriver();

        }

        //webDriver=new FirefoxDriver();
        webDriver.get("https://www.facebook.com/");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    /*@Test(groups ={"sanity"})
    @Parameters({"userName","password","gender"})
    public void login(String userName,String password,String gender){
            webDriver.navigate().to("https://www.facebook.com/");
            loginFacebook(userName,password,gender);
    }*/


    @Test(groups ={"sanity"},dataProvider = "LoginDetails")
    public void login(String userName,String password,String gender){
        System.out.println(userName+password+gender);
        webDriver.navigate().to("https://www.facebook.com/");
        loginFacebook(userName,password,gender);
    }

    @Test(groups = {"sanity","regression"},dependsOnMethods ="login",enabled = false)
    public void createNewPage(){

        webDriver.findElement(By.linkText("Create a Page")).click();
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        //webDriver.close();
    }


    @DataProvider(name = "LoginDetails")
    public Object[][] getLoginDetails(){
        String[][] loginDetails=new String[][]{{"sadasiva","password","Male"},{"Srinath","password1","Male"}};
        return loginDetails;
    }



    @AfterClass
    public void tearDown(){
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
}
