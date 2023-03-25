package Review10;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Double> grocery = new HashMap<>();
        grocery.put("Milk",120.4);
        grocery.put("Eggs",100.4);
        grocery.put("Bread",20.4);
        grocery.put("Tea",12.4);
        grocery.put("cucumber",10.4);
    double teaprice=grocery.get("Tea");
        System.out.println(teaprice);
       int size= grocery.size();
        System.out.println("number of entry objects ="+size);
        Map<String,Double>lamp=new HashMap<>();
        lamp.put("Milk",120.4);
        lamp.put("Eggs",100.4);
        lamp.put("Bread",20.4);
        lamp.put("Tea",12.4);
        lamp.put("cucumber",10.4);
        System.out.println("order are preserved "+lamp);




    }


}
