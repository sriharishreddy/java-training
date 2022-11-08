package controlstatements.conditional.loops;

public class ForLoopDemo {
    public static void main(String[] args) {
        // for loop - fixed no.of iterations
        for(int i=0;i<10;i++){ //starting , upto, increment starting
            if(!(i==5)) { // (0==5) = false --> !false --> true
                //            (5==5) = !true --> false
                //true - !true = false
                //false - !false = true
                System.out.println("For Loop Test : " + i);
            }
        }
    }
}
