package review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelDemo {
    public static void main(String[] args) throws FileNotFoundException {
        String path="File/Book1.xlsx";

        try {
            FileInputStream fileInputStream=new FileInputStream(path);
        }catch (Exception e){
            System.out.println("please ");
        }
    }
}
