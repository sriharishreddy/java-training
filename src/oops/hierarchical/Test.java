package oops.hierarchical;

public class Test {
    public static void main(String[] args) {

        Cat cat = new Cat("cat",150);
        cat.meow();
        cat.eat();
       // cat.bark();


        //Dog dog = new Dog("dog");
        Dog dog = new Dog("dog",100);
        dog.eat();
        dog.bark();
       // dog.meow();
    }
}
