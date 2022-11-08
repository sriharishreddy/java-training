package modifiers;

public class ModifiersDemo1 {
    public int intVariable = 10;
    public String stringVariable = "Hello";

    public int method1(){
        System.out.println("Invoked method1()");
        return 100;
    }

    public void method2(){
        System.out.println("Invoked method2()");
    }

    public static void main(String[] args) {
        System.out.println("In main method");
        ModifiersDemo1 md = new ModifiersDemo1();

        System.out.println(md.intVariable);
        System.out.println(md.stringVariable);

        md.method1();
        md.method2();
    }
}
