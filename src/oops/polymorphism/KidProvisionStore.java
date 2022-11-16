package oops.polymorphism;

public class KidProvisionStore extends ProvisionStore{

    public void run() {
        System.out.println("This is the new business model to run my father business as a kid.");
    }

    public void run(int age) {
        System.out.println("Run Method.." + age);
    }
/*
    public void run(String name) {
        System.out.println("Run Method.." + name);
    }

    public void run(String name,int age) {
        System.out.println("Run Method.." + name + "Age " + age);
    }

    public void otherBusiness() {

        System.out.println("Other Business");
    }
    */

}
