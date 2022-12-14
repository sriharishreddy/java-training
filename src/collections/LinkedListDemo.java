package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(11);
        ll.add(12);
        ll.add(13);
        ll.add(14);
        ll.add(10);
        ll.add(11);

        //ll.set(2,100);
        ll.add(2,200);

        ll.remove(2);
        System.out.println("values : "+ll);

        //ll.forEach(System.out::println);
        Iterator<Integer> itr = ll.iterator();
        while (itr.hasNext()){
            Integer value = itr.next();
            System.out.println(value);
        }

       
    }
}
