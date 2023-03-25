package review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path="File/config.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Properties properties=new Properties();
            properties.load(fileInputStream);
            System.out.println(properties.getProperty("name"));
        }catch (FileNotFoundException e){
            System.out.println("something gone wrong");
        }catch (NullPointerException e){
            System.out.println("you are trying to call a method on null object");

        } catch (IOException e) {
            System.out.println("IO Exeption occerred");
        }

    }
}
