package controlstatements.conditional;

public class DemoIfExample {
    public static void main(String[] args) {
        System.out.println("In Main method");
        int i = 10;
        int b = 200;

        if(i == 100){ // 10== 100 ==> false
            System.out.println(" I value is 100. Executing if condition");
        } else if(i == 90){ // 10== 90 ==> false
            System.out.println("I vaue is 90. Executon else if condition.");
        } else if(i == 10){ // 10 == 10 ==> true
            System.out.println(" I value is 10. Executing another else if condition.");
        } else{ // false block
            System.out.println("I value is not 100. Executing else condition");
        }

        if(b == 50){ // false
            System.out.println("b value is 50. executing the if condition.");
        } else if(b == 200){
            System.out.println("b value is 200. executing the else if condition.");
        }

        System.out.println("Executing the next logic");
        System.out.println("Executing the next logic");
        System.out.println("Executing the next logic");
        System.out.println("Executing the next logic");
        System.out.println("Executing the next logic");

    }
    // if i=100, then execute if condition
    // if i =90, then execute another if condition
    // else i is not 100 and 90 then execute else condition
}
