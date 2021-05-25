package be.intecbrussel.graphics;



public class GarageTesterApp {
    public static void main(String[] args) {

        Auto auto = new Auto();
        Garage garage = new Garage();

        auto.setName("BMW Z4");


        garage.setFirstName("Verstraen");


        garage.setLastName("NV");


        //print out properties of auto an garage

        //print out the auto name and the fist name and last name of garage
        System.out.println(auto.getName());
        System.out.println(garage.getFirstName());
        System.out.println(garage.getLastName());

    }

}





