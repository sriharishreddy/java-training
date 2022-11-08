package modifiers;

public class ModifiersDemo2 {
    public static void main(String[] args) {
        System.out.println(" In main method ModifiersDemo2 ");
        ModifiersDemo1 md = new ModifiersDemo1();
        md.method1();
        md.method2();
        System.out.println(md.intVariable);
        System.out.println(md.stringVariable);

    }
}
