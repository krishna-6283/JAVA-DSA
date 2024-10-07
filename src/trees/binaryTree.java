package trees;

import java.util.Scanner;

public class binaryTree {
    private Node root;
    private class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
        }
    }
    //insert elements
    public void populate(Scanner in){
        System.out.println("Enter root node value: ");
        int val=in.nextInt();
        root = new Node(val);
        populate(in,root);
    }
    private void populate(Scanner in,Node node){
        System.out.println("Do u want to enter left of "+node.val);
        boolean left=in.nextBoolean();
        if(left){
            System.out.println("Enter value of left of "+node.val);
            int val=in.nextInt();
            node.left=new Node(val);
            populate(in,node.left);
        }
        System.out.println("Do u want to enter right of "+node.val);
        boolean right=in.nextBoolean();
        if(right){
            System.out.println("Enter value of right of "+node.val);
            int val=in.nextInt();
            node.right= new Node(val);
            populate(in,node.right);
        }
    }

    public void display(){
        display(root);
    }
    private void display(Node node){
        if(node==null) return;

        System.out.println(" " +node.val);
        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        binaryTree tree=new binaryTree();
        tree.populate(in);
        tree.display();
    }
}
