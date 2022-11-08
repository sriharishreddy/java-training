package test;

import modifiers.DefaultModifiersDemo1;
import modifiers.ModifiersDemo1;
import modifiers.PrivateModifierDemo1;
import modifiers.ProtectedModifiersDemo1;

/**
 * This class is to learn Modifiers in java.
 */
// Test comment
    /* test
    comment
    in
    multiple
    lines
     */
public class ModifiersDemoTest extends DefaultModifiersDemo1{
    public static void main(String[] args) {
       /* System.out.println("In main method ModifiersDemoTest of test package");
        ModifiersDemo1 md = new ModifiersDemo1();
        System.out.println(md.intVariable);
        System.out.println(md.stringVariable);
        md.method2();
        md.method1();*/
/**
 * tt
 * rrr
 * g
 *
 *
 */
        PrivateModifierDemo1 pmd = new PrivateModifierDemo1();
        System.out.println(pmd.intVariable);
        System.out.println(pmd.stringVariable);
        pmd.method2();
        pmd.method1();

        ModifiersDemoTest pmd = new ModifiersDemoTest();
        System.out.println(pmd.intVariable);
        System.out.println(pmd.stringVariable);
        pmd.method2();
        pmd.method1();

// single line comment
        System.out.println("");
    }
}
