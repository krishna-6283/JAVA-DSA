package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(50);
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(2);
        list.insertLast(99);
        list.insertMiddle(0,9);
        list.display();
    }
}
