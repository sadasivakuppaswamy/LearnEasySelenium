package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTable {
    static WebDriver webDriver;
    public static void main(String[] args) {
        WebTable webTable =new WebTable();

        webDriver =new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.seleniumhq.org/download/");
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        System.out.println(webTable.getReleaseDate("Ruby"));



    }
    /*public String getRelesaeDate(String language){
        return webDriver.findElement(By.xpath("//td[text()=\'"+language+"\']/following-sibling::td[2]")).getText();
    }*/

    public String getReleaseDate(String language){
        int languageIndex=0;
        int releaseDateIndex=0;
        List<WebElement> headers = webDriver.findElements(By.xpath("//thead/tr/th"));
        Iterator<WebElement> iterator= headers.iterator();
        for(int i=1;iterator.hasNext();i++){
            WebElement webElement=iterator.next();
            if(webElement.getText().equals("Language")){
                languageIndex = i;
            }
            else if(webElement.getText().equals("Release Date")){
                releaseDateIndex=i;
            }

        }
        String rowsXpath= "//th[text()='Language']/parent::tr/parent::thead/following-sibling::tbody/tr";
        String languageXpath = "//td["+languageIndex+"]";
        String ReleaseDateXpath = "//td["+releaseDateIndex+"]";
        List<WebElement> rows = webDriver.findElements(By.xpath("//th[text()='Language']/parent::tr/parent::thead/following-sibling::tbody/tr"));
        /*WebElement languageTd= webDriver.findElement(By.xpath("//td[+languageIndex+]"));
        WebElement releaseDateTd = webDriver.findElement(By.xpath("//td[+releaseDateIndex+]"));
*/
        for(int j=1;j<=rows.size();j++){
            if(webDriver.findElement(By.xpath(rowsXpath+"["+j+"]"+languageXpath)).getText().equals(language)){
                return webDriver.findElement(By.xpath(rowsXpath+"["+j+"]"+ReleaseDateXpath)).getText();
            }
        }

        return null;
    }
}
