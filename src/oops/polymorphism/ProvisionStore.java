package oops.polymorphism;

public class ProvisionStore {
    public void run(){
        System.out.println(" Running business with old process..");
    }

    public void run(int age) {
        System.out.println("Run Method.." + age);
    }
}
