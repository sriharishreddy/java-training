package controlstatements.operators.arthimetic;

public class ArthemeticDemo {
    public static void main(String[] args) {
        int number1= 200;
        int number2= 100;

        //+,-,*,/,%
//        int result = number1 + number2; // 300
//        System.out.println(" Output : " + (number1 + number2));
//        System.out.println(" Output : " + (number1 + number2));

//        int sub = number1 -number2;
//        System.out.println("Result : " + sub);
//
//        int multiply = number1*number2;
//        System.out.println(multiply);
//
//        int divison = number1/number2;
//        System.out.println(divison);
//
//        int module = number1 % number2;
//        System.out.println(module);

        // A AND B Result
        // T    T = T
        // T       F = F
        // F    T = F
        // F    F = F

        // A OR B Result
        // T    T = T
        // T       F = T
        // F    T = T
        // F    F = F

        // Not !
        // T ==> F
        // F ==> T

        // If conditions we will use to test true or false
/*
        boolean male = true;
        boolean female = true;
        // && ||
        boolean result = male && female; // F || T ==> T ==>!T ==> F

        if (!result){ // T && F = F
            System.out.println(" Result is true");
        }else{
            System.out.println(" Result is false");
        }*/


        ArthemeticDemo ad = new ArthemeticDemo();
        boolean accResult = ad.isAccountIsValid(-10); // true
        boolean balResult = ad.validAmount(200.00); // false

        if(accResult && balResult){
            System.out.println("Valid Transaction...!");
            //
        }else{
            System.out.println("Invalid Transaction...!");
        }

    }

    public boolean isAccountIsValid(int accountNumber){

        boolean dbResponse = false;
        if(accountNumber >0){
            dbResponse = true;
        }else{
            dbResponse = false;
        }
        return dbResponse;
    }

    public  boolean validAmount(double amount){//2000.00
        //connect t account balance and get the balance
        // connect to DB
        boolean isValidAmount = false;
        double accountBalance = 1000.00;
        if(amount <= accountBalance){ // 2000 < 1000 // false
            isValidAmount = true;
            System.out.println("Account has valid Balance");
        }else {
            System.out.println("Account  Invalid Balance");
            isValidAmount = false;
        }
        return isValidAmount;
    }
}
