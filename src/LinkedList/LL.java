package LinkedList;

public class LL {
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val=val;

        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }

    }
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node = new Node(val,head);
        head=node;
        if(tail==null){
            tail=node;
        }
        size++;

    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertMiddle(int idx,int val){
        if(idx==0) insertFirst(val);
        if(idx==size) insertLast(val);
        Node temp=head;

        while(idx>1){
            idx--;
            temp=temp.next;
        }
        Node node = new Node(val);
        Node sec=temp.next;
        temp.next=node;

        node.next=sec;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.print("end");
    }

}
