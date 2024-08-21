package Collection_Java;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<Integer> hsetdemo = new HashSet<Integer>();
        hsetdemo.add(10);
        hsetdemo.add(20);
        hsetdemo.add(30);
        hsetdemo.add(40);
        hsetdemo.add(50);
        hsetdemo.add(60);
        hsetdemo.add(70);
        hsetdemo.add(20);
        System.out.println(hsetdemo);

        //Remove Item by object not by index
        hsetdemo.remove(10);
        System.out.println(hsetdemo);

        // Hash Set is not ordered, or it has no index so we can not access Hashset by it's index. (1st way)
        Iterator itr = hsetdemo.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Hash Set is not ordered, or it has no index so we can not access Hashset by it's index. (2nd way)
        for (Integer intdemo : hsetdemo) {
            System.out.println(intdemo);
        }
        hsetdemo.clear();
        System.out.println(hsetdemo);
    }
}
