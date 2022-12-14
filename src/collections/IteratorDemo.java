package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        for(int i=0;i<10;i++){
            ll.add(i);
        }

        System.out.println(ll);
        Iterator itr = ll.iterator();
        while (itr.hasNext()) {
            Integer value = (Integer) itr.next();
            if (!(value%2 == 0)) {
                itr.remove();
                System.out.println("Removed : " + value);
            }
        }
        System.out.println(ll);
    }
}
