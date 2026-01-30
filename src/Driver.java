import dt.*;

public class Driver {

    public static void main(String[] args) {
        if (args.length > 0) {

            String choix = args[0];
            if (choix.equals("truck")) {
                testTruck();
            } else if (choix.equals("suv")) {
                testSuv();
            }
        }
    }
static void testTruck() {

    String[] materiaux1 = {"sand", "traffic cones"};
    String[] materiaux2 = {"sand", "traffic cones","concrete","trees","flowers"};
    String[] materiaux3 = { "traffic cones","sand","wood","furniture","food","ice"};


    Truck cityTruck = new Truck(materiaux1,1001,"Ville de Montreal",
            "Valerie Plante", "City Hall", "Chevrolet","Silverado","MTL 001",40000.f);

    Truck westmountTruck = new Truck(materiaux2,2001,"Westmount",
            "Michelle Desjardins", "75 Belvedere", "Ford","XLT","WMT 100",27000.f);

    Truck expensiveTruck = new Truck(materiaux3,3003,"Griffintown",
            "Jean Montagne", "1122 Peel", "Toyota","Tundra","RST 002",45000.f);

    System.out.println(cityTruck.toString());
    System.out.println(westmountTruck.toString());
    System.out.println(expensiveTruck.toString());

}

    static void testSuv() {

        Suv cheapSuv = new Suv((byte) 12,(byte)4,(byte)2,"Jeanne Tremblay", "1100 Notre-Dame","Fiat","500X",
                "ABC 123", 25000.f);

        Suv mediumSuv = new Suv((byte) 7,(byte)2,(byte)2,"Pierre Maisonneuve", "","Honda","Odyssey",
                "FHG 789", 36000.f);

        Suv expensiveSuv = new Suv((byte) 8,(byte)2,(byte)2,"Justin Levesque", "1400 McGill","BMW","X6",
                "", 74000.f);


        System.out.println(cheapSuv.toString());
        System.out.println(mediumSuv.toString());
        System.out.println(expensiveSuv.toString());
    }

}
