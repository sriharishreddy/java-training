package exception;

public class ExceptionsDemo {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            System.out.println("Before Division Operation");

            System.out.println("in try block");
            int c = a / b;//excetion
            System.out.println("Result : " + c);
        }catch (ArithmeticException ae){
            System.out.println("in catch block");
            System.out.println(ae.getMessage());
        }
        System.out.println("After Try Catch Block");

        try {
            String name = null;

            System.out.println(name.toString());
        }catch (NullPointerException ne){
            System.out.println(ne.getMessage());
        }
        try {
            Integer number = Integer.parseInt("test");
            System.out.println("Number " + number);
        }catch (NumberFormatException ne){
            System.out.println(ne.getMessage());
        }


        System.out.println("Last statement");

    }
}
