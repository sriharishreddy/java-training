package controlstatements.transfer;

public class ForLoopDemo {
    public static void main(String[] args) {
        System.out.println("Before for loop");
        for(int i=0;i<10;i++){
            System.out.println("For Loop Iteration : " + i);
            if(i==7) {
                System.out.println("Applying Break : " + i);
                break;
            }
        }
        System.out.println("After for loop");
    }
}
