package Review9;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //topic iterator
        List<String>computer=new ArrayList<>();
        computer.add("Mac pro");
        computer.add("Mac pro");
        computer.add("Mac pro");
        computer.add("Mac pro");
        System.out.println(computer);
        for (int i = 0; i <computer.size() ; i++) {
           String c= computer.get(i);
            System.out.println(c+" ");
        }
        System.out.println("~~~~~~~~~~~~~~~~~");
        for (String a:computer ){
            System.out.println(a);
        }
    }
}
