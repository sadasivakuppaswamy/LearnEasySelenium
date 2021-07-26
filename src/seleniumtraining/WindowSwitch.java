package seleniumtraining;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowSwitch {
    public static void main(String[] args) throws Exception {
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.salesforce.com/");
        String pareWindowId = driver.getWindowHandle();
        System.out.println("pareWindowId :"+pareWindowId);

        //Taking Screen shot
        File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("/Users/sadasivaku/Documents/GitHub/Selenium/test.png"));

        driver.findElement(By.xpath("//span[contains(text(),'See Salesforce in Action')]/parent::a")).click();



        Set<String> windows =driver.getWindowHandles();
        System.out.println(windows);
        Iterator<String> iterator= windows.iterator();
        while (iterator.hasNext()){
            String childWindow=iterator.next();
            if(!pareWindowId.equals(childWindow)){
                driver.switchTo().window(childWindow);
                System.out.println("child Window :"+childWindow);
                driver.findElement(By.id("UserFirstName")).sendKeys("sadasiva");
                driver.close();
               // System.out.println("current Url : " + driver.getCurrentUrl());

            }

        }
        driver.switchTo().window(pareWindowId);
        System.out.println("current Url : " +driver.getCurrentUrl());
        driver.close();
        Thread.sleep(2000);
    }
}
