package review6;

public class MoreStringMethods {
    public static void main(String[] args) {
        String myString="today  is  monday";
      String[]strArray=  myString.split("  ");
      for(String s:strArray){
          System.out.println(s);
      }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
      //substring is a part of stirng
        System.out.println(myString);
       String name= myString.substring(5);
        System.out.println(name);
        name=myString.substring(11);
        System.out.println(name);

        int index=name.indexOf('m');
        System.out.println(index);

        String another="today is thursday";


    }
}
