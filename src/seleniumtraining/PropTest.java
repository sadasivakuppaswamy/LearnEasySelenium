package seleniumtraining;

import java.io.*;
import java.util.Properties;

public class PropTest {
    public static void main(String[] args) throws IOException {
        File file =new File(System.getProperty("user.dir")+"/src/testng/propstest.prop");
        Properties properties=new Properties();
        /*properties.setProperty("QA_URL","abc.com");
        properties.setProperty("STAGING_URL","xyz.com");
        properties.setProperty("Prod_URL","PQR.com");
        properties.store(new FileOutputStream(file),"storing Data");
        */

        properties.load(new FileInputStream(file));
      //  System.out.println(properties.getProperty("Prod_URL"));
        properties.forEach((k,v)-> System.out.println(k+":"+v));
        System.out.println(System.getenv("ENV"));
        System.out.println(System.getenv("url"));
    }
}
