package LinkedList;

public class DLL {
    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val=val;
            this.next=null;
            this.prev=null;
        }
        public Node(int val, Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }

    }
    private int size;
    private Node head;
    //        private Node tail;
    public DLL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node=new Node(val,head,null);
        if(head==null){
            head=new Node(val);
        }
        head.prev=node;
        head=node;
        size++;

    }

    public void insertLast(int val){

        Node node =new Node(val);
        int num=size-1;
        Node temp=head;
        while (num>0){
            num--;
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        size++;
    }

    public void insertAtPos(int idx,int val){

    }
    public void display(){
        Node temp=head;
        Node prev=null;
        while (temp!=null){
            System.out.print(temp.val+"-> ");
            prev=temp;
            temp=temp.next;
        }
        System.out.print("end");
        System.out.println();
        System.out.println("Reverse order");
        while(prev!=null){
            System.out.print(prev.val+"-> ");
            prev=prev.prev;
        }
        System.out.print("end");

    }
}
