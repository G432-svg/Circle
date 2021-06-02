package be.intecbrussel.graphics;

/*
 * Garage class
 *
 * This class defines a garage
 *
 * this garage in our application has a First name, an and Last name
 */
public  class Garage {

        //declare instance variables

        private String firstName;
        private String lastName;


        public void setFirstName(String firstName){
            if (firstName != null){
                this.firstName = firstName;
            }
            else {
                this.firstName = "Verstraen";
            }
        }

        public String getFirstName(){

            return firstName;
        }

        public void setLastName(String lastName){
            if (lastName != null){
                this.lastName = lastName;}
            else{
                this.lastName = "NV";
            }
        }

        public String getLastName() {
            return lastName;
        }


        //define custom methods

        public void introduceYourSelf() {
            System.out.println("Garage: " + firstName + " " +lastName);

        }
    }



