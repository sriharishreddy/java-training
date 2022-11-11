package oops;

public class House {

    int mainDoor = 1;
    int internalDoors = 4;
    int bedrooms = 2;
    int windows = 4;

    public void openMainDoor(boolean key) {
        if (key){
            System.out.println("Opened the door");
        }else{
            System.out.println("Wrong Key Inserted");
        }
    }

    public void useKitchen(){
        System.out.println("Using Kitchen to cock the food.. ");
    }

    public void useBedRoom(){
        System.out.println("Using bedroom to sleep..");
    }

}
