package test;

import modifiers.ProtectedModifiersDemo1;

public class MyTest extends ProtectedModifiersDemo1 {
    public static void main(String[] args) {
        MyTest mt = new MyTest();
        System.out.println(mt);
        System.out.println(mt.intVariable);
        String stringVariable1 = mt.stringVariable;
        System.out.println("My Test main method...");
    }
}
