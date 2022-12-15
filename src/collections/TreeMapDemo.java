package collections;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> hm = new TreeMap<>(new MyComparator());
        hm.put(1,"Harish");
        hm.put(2,"Sandya");
        hm.put(10,"Sandya");
        hm.put(3,"Rishi");
        hm.put(4,"Harish");
        hm.put(5,"Harish");
        hm.put(8,"Harish");
        hm.put(6,"Harish");


        Set entrySet = hm.entrySet();
        Iterator itr = entrySet.iterator();
        while (itr.hasNext()){
            //System.out.println(itr.next());
            Map.Entry entity = (Map.Entry) itr.next();

            Integer key= (Integer) entity.getKey();
            String value = (String)entity.getValue();
            System.out.println(key +"="+value);
        }

        //hm.remove(3);
        //hm.clear();
        //hm.replace(6,"Raju");
        //hm.replace(2,"Harish","Madhu");

        //System.out.println( hm.get(2));

        /*Set keys = hm.keySet();
        Iterator itr = keys.iterator();
        while (itr.hasNext()){
            Integer key = (Integer)itr.next();
           String value =  (String)hm.get(key);
            System.out.println(key+","+value);
        }*/

       // System.out.println(hm);

//        HashSet hs = new HashSet();
//        hs.add("Harish");
//        hs.add("Sandya");
//        hs.add("Rishi");
//
//        System.out.println(hs);
    }
}
