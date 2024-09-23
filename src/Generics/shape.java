package Generics;

public class shape {
    public interface Shape{
        public double getArea();
        public double getPerimeter();
    }

    public static class Circle implements Shape{
        private int radius;
        public Circle(int radius){
            this.radius=radius;
        }

        public double getArea(){
            return Math.PI * radius*radius;
        }
        public double getPerimeter(){
            return Math.PI * 2 * radius;
        }
    }
    public static class Rectangle implements Shape{
        private int l;
        private int b;
        public Rectangle(int l,int b){
            this.l=l;
            this.b=b;
        }

        public double getArea(){
            return l*b;
        }
        public double getPerimeter(){
            return 2*(l+b);
        }
    }
    public static void main(String[] args){
        Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.getArea());      // Output: Circle Area: 78.54
        System.out.println("Circle Perimeter: " + circle.getPerimeter()); // Output: Circle Perimeter: 31.42

        Shape rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle Area: " + rectangle.getArea());    // Output: Rectangle Area: 20
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter()); // Output: Rectangle Perimeter: 18

    }

}
