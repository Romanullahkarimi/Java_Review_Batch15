package review11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {
    public static void main(String[] args) {
        Map<String,Double>groceries=new HashMap<>();
        groceries.put("soup",12.5);
        groceries.put("banana",9.4);
        groceries.put("dragon fruit",5.6);
        groceries.put("pear",12.5);
        groceries.put("orange",12.5);
        groceries.put("mango",15.5);
      //print only those element which contain the letter a or e in their name and their price is more than 8 doller
       var entrySet=groceries.entrySet();
       for (var entry:entrySet){
           String key=entry.getKey();
           if (key.contains("a")||key.contains("e")&& entry.getValue()>8){
               System.out.println(key+" "+entry.getValue());
           }
       }
    }
}
