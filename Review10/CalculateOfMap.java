package Review10;

import java.util.*;

public class CalculateOfMap {
    public static void main(String[] args) {
        Map<String, Double> grocery = new HashMap<>();
        grocery.put("Milk",120.4);
        grocery.put("Eggs",100.4);
        grocery.put("Bread",20.4);
        grocery.put("Tea",12.4);
        grocery.put("cucumber",10.4);
        Set<String> keys=grocery.keySet();
        for(String key:keys){
            System.out.print(key+" = "+grocery.get(key));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~");
       Iterator<String>itr= keys.iterator();
       while (itr.hasNext()){
           String k=itr.next();
           System.out.print(itr.next()+" "+grocery.get(k));


           System.out.println("~~~~~~~~~~");
           Collection<Double>vlaue=grocery.values();
           for (Double val:vlaue){
               System.out.print(val+" ");
           }
       }
    }
}
