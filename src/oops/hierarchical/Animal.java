package oops.hierarchical;

public class Animal {
    String childValue;
    Animal(String animal){
        childValue = animal;
        System.out.println(animal +" constructor");
    }
    Animal(){
        System.out.println("No org constructor");
    }

    public Animal(String message1, int message2) {
        System.out.println("Animal Constructor " + message1 +" , "+ message2);
    }

    public void eat(){
        System.out.println(childValue + " can eat food...");
    }

}
