package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class FileDownloadExample {


    public static String downloadPath = "/Users/sadasivaku/Documents/GitHub/Selenium";

    public static void main(String[] args) throws Exception {
        FileDownloadExample FileDownloadExample=new FileDownloadExample();
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.download.manager.showWhenStarting", false);
        profile.setPreference("browser.download.dir", downloadPath);
        //https://www.sitepoint.com/mime-types-complete-list/
        profile.setPreference("browser.helperApps.neverAsk.openFile",
                "text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml,application/pdf,application/octet-stream,application/x-compressed,application/x-zip-compressed,application/zip,multipart/x-zip");
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
                "text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml,application/pdf,application/octet-stream,application/x-compressed,application/x-zip-compressed,application/zip,multipart/x-zip");
        profile.setPreference("browser.helperApps.alwaysAsk.force", false);
        profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
        profile.setPreference("browser.download.manager.focusWhenStarting", false);
        profile.setPreference("browser.download.manager.useWindow", false);
        profile.setPreference("browser.download.manager.showAlertOnComplete", false);
        profile.setPreference("browser.download.manager.closeWhenDone", true);
        WebDriver driver = new FirefoxDriver(profile);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        /*driver.get("https://www.seleniumhq.org/download/");
        driver.findElement(By.xpath("//a[text()='Download']")).click();

        driver.findElement(By.xpath("//a[text()='3.141.59']")).click();
        */
        driver.get("https://chromedriver.storage.googleapis.com/index.html?path=75.0.3770.140/");
        driver.findElement(By.xpath("//a[text()='chromedriver_mac64.zip']")).click();
    }

}
