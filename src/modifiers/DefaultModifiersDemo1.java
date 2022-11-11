package modifiers;

public class DefaultModifiersDemo1 {
     int intVariable = 10;
     String stringVariable = "Hello";

     int method1(){
        System.out.println("Invoked method1()");
        return 100;
    }

     void method2(){
        System.out.println("Invoked method2()");
    }
int a =10;
    public static void main(String[] args) {
        System.out.println("in main() DefaultModifiersDemo1");
        DefaultModifiersDemo1 pmd = new DefaultModifiersDemo1();
        DefaultModifiersDemo1 test = new DefaultModifiersDemo1();
        System.out.println( pmd.intVariable);
        System.out.println( pmd.stringVariable);
        pmd.method1();
        pmd.method2();
    }
}
