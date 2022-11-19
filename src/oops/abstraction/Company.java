package oops.abstraction;

public abstract class Company {
    public static int number = 10;
    public static int number1 = 100;

    abstract int harish();
    abstract int rishi();
    abstract int sandya();

    public void test(){
        System.out.println("Non Abstract Method.");
    };
    public void test1(){
        System.out.println("Non Abstract Method.");
    };

    Company(){
        System.out.println("Company");
    }
}
