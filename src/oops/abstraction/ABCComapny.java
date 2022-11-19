package oops.abstraction;

public class ABCComapny extends Company{

    @Override
    int harish() {
        System.out.println("Harish Method");
        return 1000;
    }

    @Override
    int rishi() {
        System.out.println("rishi Method");
        return 2000;
    }

    @Override
    int sandya() {
        System.out.println("sandya Method");
        return 3000;
    }

    public static void main(String[] args) {
        ABCComapny abcComapny = new ABCComapny();
        abcComapny.test();
        abcComapny.test1();
        abcComapny.harish();
        abcComapny.rishi();
        abcComapny.sandya();
        int localValue = abcComapny.number;
        int localValue1 = abcComapny.number1;
        System.out.println(abcComapny.number);
        System.out.println(localValue1);
    }
}
