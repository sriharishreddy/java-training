package controlstatements.transfer;

public class ForLoopContinueDemo {
    public static void main(String[] args) {

        System.out.println("Before for loop - main method");

        for(int i=0;i<5;i++){
            System.out.println("Parent For Loop Iteration Start: " + i);

                for (int j=0;j<3;j++){
                    System.out.println("Child For Loop Iteration Start: i value = "+ i + " ,j value = " + j );
                    if(j==1){
                        continue;
                    }
                    System.out.println("Child For Loop Iteration End : i value = "+ i + ", j value  = " + j );
                }


            System.out.println("Parent For Loop Iteration End : " + i);
        }

        System.out.println("After for loop - main method");
    }
}
