package be.intecbrussel.Swimmingpool;

import be.intecbrussel.Swimmingpool.Person;

public class SwimmingpoolApp {
    public static void main(String[] args) {


        //

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        //configure person1
        person1.setFirstName("Nikolas");
        person1.setLastName("Daem");
        person1.setAge(25);
        person1.setChlorineIntolerance(false);

        //print out properties of person 1
        person1.introduceYourSelf();


        //print out the first name of the first person
        System.out.println(person1.getFirstName());





    }
}
