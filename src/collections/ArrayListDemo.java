package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();//10
        al.add("Harish");
        al.add("Raju");
        al.add("Ravinder");
        al.add("Harish");
        al.add("Raju");
        al.add("Ravinder");
        al.add("Harish");
        al.add("Raju");
        al.add("Ravinder");
        al.add("Harish");
        al.add("Raju");// index
        al.add("Ravinder");


/*

        System.out.println(al.size()); //3
        System.out.println(al);
        al.set(10,"Ramesh");
        al.set(11,"My New Value");

        al.add("New Value");
        System.out.println(al);

        //al.remove(0);
        al.remove("Harish");
        System.out.println(al);

        al.remove("Harish");

        for (String i:al){
            System.out.println(i);
        }*/

       // al.forEach(System.out::println);

        /*Iterator<String> itr = al.iterator();
        while (itr.hasNext()){ //true false
            String value = itr.next();
            System.out.println(value);
        }*/
    }
}
