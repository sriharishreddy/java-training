package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();

        /*v.addElement(1);
        v.addElement(2);
        v.addElement(3);*/

        for(int i=0;i<10;i++){
            v.addElement(i);
        }
        System.out.println(v);

       // Enumeration itr = v.elements();
        Iterator itr =  v.iterator();
        while (itr.hasNext()){
            Integer value = (Integer) itr.next();
            if(value%2 ==0) {
                System.out.println("Even : "+value);
            }
        }
    }
}
