package collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyComparator());
       // ts.add(null);
        ts.add("A");
        ts.add("Z");
        ts.add("F");
        ts.add("T");

//        ts.add(100);
//        ts.add(10);
//        ts.add(30);
//        ts.add(500);
        //ts.add(10);


        System.out.println(ts);

        ts.forEach(System.out::println);
    }
}
