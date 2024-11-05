package trees;

public class BST {
    public static class Node{
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val){
            this.val=val;
        }
        public int getVal(){
            return val;
        }

    }
    private Node root;

    public int height(Node node){
        if(node==null) return -1;

        return node.height;
    }
    public Node getRoot(){
        return root;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void insert(int val){
        root=insert(val,root);
    }
    private Node insert(int val,Node node){
        if(node==null) {
            node = new Node(val);
            return node;
        }
        if(val < node.val){
            node.left=insert(val,node.left);
        }
        if(val> node.val){
            node.right=insert(val,node.right);
        }

        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null) return true;

        return Math.abs(height(node.left) - height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(root,"Root node- ");
    }

    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getVal());
        display(node.left,"Left child of "+node.val+": ");
        display(node.right,"Right child of "+node.val+": ");
    }

    public void populate(int[] nums){
        for (int num : nums) {
            insert(num);
        }
    }
    public void pdisplay(){
        pdisplay(root,0);
    }

    private void pdisplay(Node node, int level) {
        if (node == null) return;
        pdisplay(node.right, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+node.val);
        }

        else{
            System.out.println(node.val);
        }

        pdisplay(node.left, level+1);

    }

    public void populatedSorted(int[] nums){
        populatedSorted(nums,0,nums.length);
    }

    public void populatedSorted(int[] nums,int start,int end){
        if(start<=end){
            return;
        }

        int mid=(start+end)/2;
        insert(nums[mid]);
        populatedSorted(nums,start,mid);
        populatedSorted(nums,mid+1,end);
    }

    public void preOrder(Node node){
        if(node==null) return;

        System.out.println(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(Node node){
        if(node==null) return;

        inOrder(node.left);
        System.out.println(node.val+" ");
        inOrder(node.right);
    }

    public void postOrder(Node node){
        if(node==null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val+" ");

    }




}
