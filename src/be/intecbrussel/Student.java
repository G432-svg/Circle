package be.intecbrussel;

public class Student {

        //declare instance variables

        private int studentId;
        private String nameStudent;
        private ReportCard reportCard;
        private int numberOfStudents;

        public void String(String student) {
        }

        public void setNameStudent(String nameStudent){
            if (nameStudent != null){
                this.nameStudent = nameStudent;
            }
            else {
                this.nameStudent = "anonymous";
            }
        }
        public int getStudentId() {
        return studentId;
        }

        public String getNameStudent(){

            return nameStudent;
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
}
