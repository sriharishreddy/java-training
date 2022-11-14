package oops.hierarchical;

public class Cat extends Animal{
    public Cat(String cat) {
        super(cat);
        System.out.println("Cat Constructor");
    }

    public Cat(String cat,int message){
        super(cat,message);
    }
    public void meow(){
        System.out.println(" Cat can sound like Meow..!");
    }
}
