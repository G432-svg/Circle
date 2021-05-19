package be.intecbrussel.graphics;

public class Rectangle {

    /* Initialisatie tijdens declaratie */
    private int height = 0;
    private int width = 0;
    private int x = 0;
    private int y = 0;

    /* Initialisatie in initialisatieblok */
    {
        height=0;
        width=0;
        x=0;
        y=0;

    }
    /* Initialisatie in constructor */
    public Rectangle(int height,int width,int x,int y) {
        setHeight(height);
        setWidth(width);
        setX(x);
        setY(y);
    }


    public double getArea() {
        return height * width;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth() {
        return width;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
    public void setPosition(int x, int y){
            this.x = x;
            this.y = y;
    }
    public void grow(int d) {
        width = width + d;
        height += d;
    }
    public double getPerimeter() {
       return width * 2 + height * 2;
   }

}


