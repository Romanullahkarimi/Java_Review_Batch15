package Review5;

import java.util.Scanner;

public class arrayWithScanner {
    public static void main(String[] args) {
        //let's crate array of names using scanner
        Scanner scan=new Scanner(System.in);
        System.out.println("how many names you want to store?");

        int size=scan.nextInt();
        String[] name=new String[size];
        for (int i = 0; i <name.length; i++) {
            System.out.println("please enter name");
           name[i] =scan.next();
        }
        //using loop below we can retrieve element
        //enhanced for loop work with variable
        for(String n:name){
            System.out.println(n);
        }
    }
}
