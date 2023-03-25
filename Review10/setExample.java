package Review10;

import java.util.HashSet;
import java.util.*;

public class setExample {
    public static void main(String[] args) {
       Set<String>qaJobs = new HashSet<>();
       qaJobs.add("automation Engineer");
       qaJobs.add("Manual Tester");
       qaJobs.add("SDET");
       qaJobs.add("QA Analyst");
       qaJobs.add("Api Tester");
       qaJobs.remove("Manual Tester");

        System.out.println("Removerd an element"+qaJobs);
        Set<String> lset=new LinkedHashSet<>(qaJobs);
        System.out.println("linkedHasset ="+lset);

        Set<String>tset=new TreeSet<>();
        tset.addAll(qaJobs);
        System.out.println("TreeSet ="+tset);



    }
}
