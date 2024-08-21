package Collection_Java;
// hash map is like dictonary in Python
//HashMap contains data as key value pair
//Contains only unique keys
//Not synchronized and no order
// Java HashMap may have one null key and multiple null values

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> hsmp = new HashMap();

        // Add values
        hsmp.put(1, "Java");
        hsmp.put(2, "Python");
        hsmp.put(3, "Node JS");
        hsmp.put(4, "Angular");
        hsmp.put(5, "Javascript");
        hsmp.put(6, "Android");

        System.out.println(hsmp);

        hsmp.remove(1);
        hsmp.remove(2, "Python");
        System.out.println(hsmp);

        Set s = hsmp.keySet();

        for(Integer key: hsmp.keySet()){
            System.out.println("Key is:"+key+" Value is:"+ hsmp.get(key));
        }


    }
}
