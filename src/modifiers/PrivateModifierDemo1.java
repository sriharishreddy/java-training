package modifiers;

public class PrivateModifierDemo1 {

    private int intVariable = 10;
    private String stringVariable = "Hello";

    private int method1(){
        System.out.println("Invoked method1()");
        return 100;
    }

    private void method2(){
        System.out.println("Invoked method2()");
    }

    public static void main(String[] args) {
        System.out.println("in main() PrivateModifierDemo1 class");
        PrivateModifierDemo1 pmd = new PrivateModifierDemo1();
        System.out.println(pmd.intVariable);
        System.out.println(pmd.stringVariable);
        pmd.method1();
        pmd.method2();
    }
}
