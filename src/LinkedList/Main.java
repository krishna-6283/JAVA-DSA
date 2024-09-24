package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
//        list.insertFirst(50);
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(2);
        list.insertLast(99);
        list.insertMiddle(3,9);
        list.display();5
        System.out.println();
        list.deleteFirst();
        list.deleteLast();
        list.display();
//        System.out.println();
        list.deleteAtPos(3);
        System.out.println();
        list.display();
    }
}
