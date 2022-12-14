package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ListHashSetDemo {
    public static void main(String[] args) {
        //HashSet lhs = new HashSet();
        LinkedHashSet lhs = new LinkedHashSet<>(5,.20f);
        lhs.add("A");
        lhs.add("A");
        lhs.add("B");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");
        lhs.add("F");
        lhs.add("Harish");
        lhs.add(100);
        lhs.add(123.12);
        lhs.add(111.12f);
        lhs.add(1234567l);


        System.out.println(lhs);
        System.out.println(lhs.size());
        System.out.println(lhs.isEmpty());

        LinkedHashSet hs1 = new LinkedHashSet(lhs);
        hs1.add("Harish");
        hs1.add("Harish");
        hs1.add("Rishi");
        hs1.add("Sandya");

        System.out.println(hs1);
        System.out.println(hs1.size());
        System.out.println(hs1.isEmpty());

        Iterator itr = hs1.iterator();
        while (itr.hasNext()){

            Object value = itr.next();
            if(value.equals("Harish")){
                itr.remove();
            }else {
                System.out.println(value);
            }


        }

        System.out.println("Final " + hs1);
    }
}
