package oops.polymorphism;

public class Demo {
    public static void main(String[] args) {
        //ProvisionStore kps = new KidProvisionStore();

        ProvisionStore  kps = new KidProvisionStore(); // Parent - high memory occupied
        // Child - low memory occupied
        kps.run();
        kps.run(100);
//        kps.run("Harish");
//        kps.run("Test Harish",22);

    }
}
