package modifiers;

public class DefaultModifiersDemo2 {

    public static void main(String[] args) {
        System.out.println("in main() DefaultModifiersDemo2");
        DefaultModifiersDemo1 pmd = new DefaultModifiersDemo1();
        System.out.println( pmd.intVariable);
        System.out.println( pmd.stringVariable);
        pmd.method1();
        pmd.method2();
    }
}
