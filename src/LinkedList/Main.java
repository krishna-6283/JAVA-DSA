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
        list.display();
        System.out.println();
        list.deleteFirst();
        list.deleteLast();
        list.display();
//        System.out.println();
        list.deleteAtPos(3);
        System.out.println();
        list.display();
        System.out.println();
        DLL list2=new DLL();
        list2.insertFirst(3);
        list2.insertFirst(4);
        list2.insertFirst(5);
        list2.insertLast(6);
        list2.insertLast(7);
        list2.display();
        System.out.println();
        CLL list3=new CLL();
        list3.insert(3);
        list3.insert(4);
        list3.insert(5);
        list3.insert(6);
        list3.display();
        System.out.println();
        System.out.println(31/31);
    }
}
