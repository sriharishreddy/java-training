package arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int value =10;
       // int[] values = {10,11,12,13,14,15}; //0 - 10,1-11,2-12,3-13,4-14,5-15
        int[] values = new int[100]; //0 - 10,1-11,2-12,3-13,4-14,5-15// 0-99


        int getvalueByIndex = values[2];
        System.out.println(getvalueByIndex);
        values[6] = 100;
        int getvalueByIndexAfterChange = values[6];
        System.out.println(getvalueByIndexAfterChange);
       /* for(int i=0;i<values.length;i++){
            System.out.println("Index : "+ i + " -Value :" + values[i]);
        }

        System.out.println(value);
        System.out.println(values);*/
    }
}
