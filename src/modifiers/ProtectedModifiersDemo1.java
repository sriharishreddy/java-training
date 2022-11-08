package modifiers;

public class ProtectedModifiersDemo1 {
    protected int intVariable = 10;
    protected String stringVariable = "Hello";

    protected int method1(){
        System.out.println("Invoked method1()");
        return 100;
    }

    protected void method2(){
        System.out.println("Invoked method2()");
    }

    public static void main(String[] args) {
        System.out.println("in main() ProtectedModifiersDemo1");
        ProtectedModifiersDemo1 pmd = new ProtectedModifiersDemo1();
        System.out.println( pmd.intVariable);
        System.out.println( pmd.stringVariable);
        pmd.method1();
        pmd.method2();
    }
}
