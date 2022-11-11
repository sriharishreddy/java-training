package oops;

public class Kid extends Parent{

    int harishOwnSavings = 20000;

    public void custructionBusiness(){
        System.out.println("Harish Construction Business");
    }

    public static void main(String[] args) {
        Kid harish = new Kid();
        int harishSavings = harish.savings;
        String harish_land = harish.land;
       // harish.realEstate();

        System.out.println(harishSavings);
        System.out.println(harish_land);
        System.out.println("After His Business");
        harish.harishOwnSavings = harish.harishOwnSavings + harishSavings;
        System.out.println(harish.harishOwnSavings);
        harish.custructionBusiness();

    }
}
