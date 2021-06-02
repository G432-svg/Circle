package be.intecbrussel.graphics;
/*
 * Auto class
 *
 * This class defines an auto
 *
 * this auto in our application has a name
 */
public class Auto {

        //declare instance variables

        private String name;

        public void setName(String name){
            if (name != null){
                this.name = name;
            }
            else {
                this.name = "BMW Z4";
            }
        }

        public String getName(){

            return name;
        }

        //define custom methods

        public void String() {
            System.out.println("Auto: " + name +"");

        }
    }



