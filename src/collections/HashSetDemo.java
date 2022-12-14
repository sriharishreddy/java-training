package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        //HashSet hs = new HashSet();
        HashSet hs = new HashSet<>(5,.20f);
        hs.add("A");
        hs.add("A");
        hs.add("B");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");
        hs.add("Harish");
        hs.add(100);
        hs.add(123.12);
        hs.add(111.12f);
        hs.add(1234567l);


//        System.out.println(hs);
//        System.out.println(hs.size());
//        System.out.println(hs.isEmpty());

        HashSet hs1 = new HashSet(hs);
        hs1.add("Harish");
        hs1.add("Harish");
        hs1.add("Rishi");
        hs1.add("Sandya");

//        System.out.println(hs1);
//        System.out.println(hs1.size());
//        System.out.println(hs1.isEmpty());

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
