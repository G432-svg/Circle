package be.intecbrussel.graphics;


public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("this program uses a rectangle");
        Rectangle rect = new Rectangle(1,2,1,3);
        Rectangle rect2 = new Rectangle(10,1,1,1);


        //configure rectangle
 /*       rectangle.setHeight(1);
          rectangle.setWight(2);
          rectangle.setX(1);
          rectangle.setY(3);

  */

        //expliciet een waarde toekennen
        rect.setHeight(2);
        rect.setWidth(3);
        rect.setX(20);
        rect.setY(16);

        rect2.setHeight(12);
        rect2.setWidth(10);
        rect2.setX(5);
        rect2.setY(6);

        //print out the value of height,wight,x and y of rect

        System.out.println("height:" + rect.getHeight());
        System.out.println("wight = " + rect.getWidth());
        System.out.println("x:" + rect.getX());
        System.out.println("y:" + rect.getY());

        //print out the values of height,wight,x and y of rect2

        System.out.println("height:" + rect2.getHeight());
        System.out.println("wight = " + rect2.getWidth());
        System.out.println("x:" + rect2.getX());
        System.out.println("y:" + rect2.getY());

        //print out the areas of the rectangles
        System.out.println("rectangle 1 has an area of:" + rect.getArea());
        System.out.println("rectangle 2 has an area of:" +rect2.getArea());


        //print out the perimeter of the rectangles

        System.out.println("The perimeter of the rectangle 1 is:" + rect.getPerimeter());
        System.out.println("The perimeter of the rectangle 2 is:" + rect2.getPerimeter());

    }

}
