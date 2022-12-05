package staticmembers;

public class StaticDemo {
    /*
    * 1.variables
    * 2. blocks
    * 3.
    * */
    static {
        System.out.println("First block");
    }
    static int a = a();
    static String name = "Harish";


    public static void m1(){
        System.out.println("in m1() method..!");
    }
    public static void m2(){
        System.out.println("in m2() method..!");
    }
    public static void m3(){
        System.out.println("in m3() method..!");
    }

    static int b = b();
    static {
        System.out.println("Im in block 1...!");
    }

    static {
        System.out.println("Im in block 2...!");
    }

    static {
        System.out.println("Im in block 3...!");
    }

    static int c =c();
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(name);
        m1();
        m2();
        m3();
       /* StaticDemo sd = new StaticDemo();
        System.out.println( sd.a); //10
        System.out.println( sd.name); // Harish


        StaticDemo sd1 = new StaticDemo();
        System.out.println( sd1.a); // 10
        System.out.println( sd1.name); //Harish*/

    }

    static int d =d();

    static int a(){
        System.out.println("calling a() method");
        return 10;
    }
    static int b(){
        System.out.println("calling b() method");
        return 20;
    }
    static int c(){
        System.out.println("calling c() method");
        return 100;
    }
    static int d(){
        System.out.println("calling d() method");
        return 200;
    }

    static int abc = 100;
    static int abc1 = 100;
    static int abc2 = 100;
    static int abc3 = 100;
    static int abc4 = 100;
    static int abc5 = 100;

}
