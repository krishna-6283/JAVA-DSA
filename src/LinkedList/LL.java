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
        if(idx>size){
            System.out.println("invalid");
            return;
        }
        if(idx==0) {
            insertFirst(val);
            return;
        }
        if(idx==size) {
            insertLast(val);
            return;
        }
        Node temp=head;

        while(idx>1){
            idx--;
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
//        Node sec=temp.next;
        temp.next=node;

//        node.next=sec;
        size++;
    }


    public void deleteFirst(){
        if(head==null) return;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }

    public void deleteLast(){
        if(head==null){
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        int num=size-1;
        Node temp=head;
        while(num>1){
            num--;
            temp=temp.next;
        }
        temp.next=null;
//        System.out.println(temp.next);
        tail=temp;
        size--;
    }
    public void deleteAtPos(int idx){
        if(idx>=size){
            System.out.println("invalid");
            return;
        }
        Node temp=head;
        if(idx==0) {
            deleteFirst();
            return;
        }
        if(idx==size-1){
            deleteLast();
            return;
        }
        while (idx>1){
            idx--;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
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
