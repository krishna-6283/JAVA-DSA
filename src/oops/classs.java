package oops;
class Square {
    int length;
    int width;
    public int area(int x){
        return x*x;
    }
}
public class classs {
    public static class Rectangle{
        int length;
        int width;
        public int area(int x,int y){
            return x*y;
        }
    }
    public static class triangle{
        int length;
        int width;

    }
    public static void main(String[] args) {
        Rectangle rect1= new Rectangle();
        Rectangle rect2= rect1;
        rect2.length=5;
        Square sq1=new Square();
        sq1.length=5;
        triangle tri1=new triangle();
        tri1.length=5;
        System.out.println(sq1.area(5));
        System.out.println(rect1.area(5,4));
        System.out.println(tri1.length);
        System.out.println(sq1.length);
        System.out.println(rect1.length);
        System.out.println(rect2.length);
    }
}
