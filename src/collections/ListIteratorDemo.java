package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        for(int i=0;i<10;i++){
            ll.add(i);
        }

        System.out.println(ll);

        ListIterator itr = ll.listIterator();
        while (itr.hasNext()){
            Integer value = (Integer)itr.next();
            System.out.println(value);
            //itr.set(200);
            itr.add(100);
        }
        System.out.println(ll);
        System.out.println("Previous Values..");
        while (itr.hasPrevious()){
            Integer value = (Integer)itr.previous();
            System.out.println(value);
            if(value == 100){
                itr.remove();
                System.out.println("Removed : " + value);
            }
        }
        System.out.println(ll);
    }
}
