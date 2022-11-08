package controlstatements.conditional.switchcase;

public class DemoSwithCaseTest {
    public static void main(String[] args) {
        int i =1000;
        switch (i){ //100
            case 100: //100
                System.out.println("executing value 100 case");
                break;
            case 200:
                System.out.println("executing value 200 case");
                break;

            case 50:
                System.out.println("executing value 50 case");
                break;

            default:
                System.out.println("default case ");
                break;
            case 10:
                System.out.println("executing value 10 case");
                break;
        }
    }
}
