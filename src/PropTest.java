import java.io.*;
import java.util.Properties;

public class PropTest {
    public static void main(String[] args) {
        writeData();
        getData();

    }
    public static void writeData(){
        try (OutputStream output = new FileOutputStream("/Users/sadasivaku/Documents/GitHub/Selenium/config.properties")) {

            Properties prop = new Properties();

            // set the properties value
            prop.setProperty("db.url", "localhost");
            prop.setProperty("db.user", "mkyong");
            prop.setProperty("db.password", "password");

            // save properties to project root folder
            prop.store(output, null);

            System.out.println(prop);
            //System.getenv("userPassword")

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
    public static void getData(){
        try (InputStream input = new FileInputStream("/Users/sadasivaku/Documents/GitHub/Selenium/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("db.url"));
            System.out.println(prop.getProperty("db.user"));
            System.out.println(prop.getProperty("db.password"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
