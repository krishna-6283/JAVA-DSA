package LinkedList;

public class CLL {
    public class Node{
        private int val;
        private Node next;

        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
        public Node(int val){
            this.val=val;
            this.next=null;

        }

    }
    private Node head;
    private Node tail;

    public CLL(){
        this.head=null;
        this.tail=null;
    }

    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void delete(int val) {
        Node temp = head;
        if (temp == null) {
            return; // Empty list case
        }

        // Case 1: The head node is the node to be deleted
        if (temp.val == val) {
            if (head == tail) { // Only one node in the list
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        // Case 2: Deleting a node other than the head
        do {
            Node node = temp.next;
            if (node.val == val) {
                temp.next = node.next;
                if (node == tail) { // If tail is to be deleted
                    tail = temp;
                    tail.next = head;
                }
                break;
            }
            temp = temp.next;
        } while (temp != head);
    }


    public void display(){
        Node temp=head;
        if(head!=null){
            do{
                System.out.print(temp.val+"->");
                temp=temp.next;
            }while (temp != head);
        }
        System.out.print("end");
    }
}
