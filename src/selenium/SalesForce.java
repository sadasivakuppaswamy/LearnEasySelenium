/*
package selenium;

import org.apache.commons.io.FileUtils;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SalesForce {
    public static void main(String[] args) {
        WebDriver driver =new FirefoxDriver() ;
        driver.get("https://www.salesforce.com/in/?ir=1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        String parentWindow= driver.getWindowHandle();
        driver.findElement(By.xpath("//span[contains(text(),'See Salesforce in Action')]/parent::a")).click();
        Set<String>  windows = driver.getWindowHandles();
        Iterator<String> iterator=windows.iterator();
        while(iterator.hasNext()){
            String cWindow =iterator.next();
            if(!parentWindow.equals(cWindow)){
                driver.switchTo().window(cWindow);
                System.out.println(driver.getCurrentUrl());
                System.out.println(driver.getTitle());
            }

        }
        driver.switchTo().window(parentWindow);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the  screenshot to desired location using copyFile //method
            String path=System.getProperty("user.dir");
            System.out.println(path);
            FileUtils.copyFile(src, new File(path+"/salesforce.png"));
        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());

        }
        System.out.println(closeAllOtherWindows(driver,parentWindow));

    }
    public static boolean closeAllOtherWindows(WebDriver driver, String openWindowHandle) {
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String currentWindowHandle : allWindowHandles) {
            if (!currentWindowHandle.equals(openWindowHandle)) {
                driver.switchTo().window(currentWindowHandle);
                driver.close();
            }
        }

        driver.switchTo().window(openWindowHandle);
        if (driver.getWindowHandles().size() == 1)
            return true;
        else
            return false;
    }
}
*/
