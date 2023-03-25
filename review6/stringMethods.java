package review6;

public class stringMethods {
    public static void main(String[] args) {
        //concat use to attach variable


        String str = "Hello";
        System.out.println(str.length());//5
        System.out.println(str.toUpperCase());//HELLO

        System.out.println(str.charAt(1));//E
        String newString=str.concat(" friends");
        System.out.println(newString);//hello friends

        System.out.println(str);
        str=   str.toLowerCase();
        System.out.println(str);
        boolean empty =str.isEmpty();
        System.out.println(empty);

        String str1="     review batch 15    ";
      String newstr1=  str1.trim();
        System.out.println(str1);
        System.out.println(newstr1);


    }
}