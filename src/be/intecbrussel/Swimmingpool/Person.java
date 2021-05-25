package be.intecbrussel.Swimmingpool;

/***
 * Person class
 *
 * This class defines a Person
 *
 * this person in our application has a First name, an age and ChlorineIntolerance
 */


public class Person{
    //declare instance variables

    private String firstName;
    private String lastName;
    private int age;
    private boolean chlorineIntolerance;

    public void setFirstName(String firstName){
        if (firstName != null){
            this.firstName = firstName;
        }
        else {
            this.firstName = "anonimus";
        }
    }

    public String getFirstName(){

        return firstName;
    }

    public void setLastName(String lastName){
        if (lastName != null){
            this.lastName = lastName;}
        else{
            this.lastName = "anonimus";
        }
    }

    public void setChlorineIntolerance(boolean chlorineIntolerance) {

        this.chlorineIntolerance = chlorineIntolerance;
    }
    public void setAge(int age){
        if (age < 150 && age >-1){
            this.age = age;
        }
        else{
            this.age = 0;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isChlorineIntolerance() {
        return chlorineIntolerance;
    }
    //define custom methods

    public void introduceYourSelf() {
        System.out.println("Hi everybody,I'm: " + firstName + " " +lastName);
        System.out.println("I hope you are all doing okay");
        System.out.println("I'm" + age + "years old and am I intolerant to Chlorine?" + "chlorineIntolerence");
    }
}


