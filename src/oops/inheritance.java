package oops;
class Room{
    int length;
    int breadth;
    Room(int x,int y){
        length=x;
        breadth=y;
    }
    int area(){
        return length*breadth;

    }
}

class Bedroom extends Room{
    int height;
    Bedroom(int x,int y,int z){
        super(x,y);
        height=z;
    }
    int volume(){
        return super.area()*height;
    }


}
public class inheritance {
    public static void main(String[] args) {
        Bedroom r1=new Bedroom(5,4,3);
        System.out.println(r1.volume());
        System.out.println(r1.area());
    }
}
