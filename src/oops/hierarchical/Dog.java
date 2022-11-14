package oops.hierarchical;

public class Dog extends Animal {
    Dog(){
        System.out.println("No org constructor");
    }
    Dog(String dog,int message2){
        super(dog,message2);

    }
    public void bark(){
        System.out.println(" Dog can bark...!");
    }
}
