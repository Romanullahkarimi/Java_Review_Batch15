package review11;

import java.util.HashMap;
import java.util.Map;

public class EntryDemo1 {
    public static void main(String[] args) {
        Map<String,Double> groceries=new HashMap<>();
        groceries.put("soup",12.5);
        groceries.put("banana",9.4);
        groceries.put("dragon fruit",5.6);
        groceries.put("pear",12.5);
        groceries.put("orange",12.5);;
        groceries.entrySet().removeIf(entry->(entry.getKey().contains("a"))&&entry.getValue()>8);
        System.out.println(groceries);
    }
}
