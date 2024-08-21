package Collection_Java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        //Add item to array list
        // ArrayList can have duplicate items
        al.add(10);// The value will be stored as an object (not an integer) of in Integer class
        al.add("Java Array List");
        al.add(true);
        al.add(false);
        al.add("Mijanur");
        al.add("Python");
        al.add("PHP");
        System.out.println(al);
        System.out.println(al.size());

        //Removing Array List
        al.remove(0);
        System.out.println(al);

        //fetch from arraylist
        System.out.println(al.get(0));

        // Access multiple value at a time
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        //Alternative way to access via for each loop
        for (Object ob : al) {
            System.out.println(ob);
        }

        //Using Iterator
        Iterator itr= al.iterator();
        //System.out.println(itr.hasNext());
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        // If we want to restriict data type for an Array Lsit then the code needs to be followed
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        //al1.add("aasda"); String won't be added as it is Integer type
        al1.add(1000001);
        System.out.println(al1);

    }
}

