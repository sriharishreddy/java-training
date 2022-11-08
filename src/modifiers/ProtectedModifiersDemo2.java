package modifiers;

public class ProtectedModifiersDemo2 {

    public static void main(String[] args) {
        System.out.println("in main() ProtectedModifiersDemo2");
        ProtectedModifiersDemo1 pmd = new ProtectedModifiersDemo1();
        System.out.println( pmd.intVariable);
        System.out.println( pmd.stringVariable);
        pmd.method1();
        pmd.method2();
    }
}
