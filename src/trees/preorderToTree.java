package trees;

import java.util.Stack;

public class preorderToTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    static class pair{
        Node node;
        int state;
        pair (Node node, int state){
            this.node=node;
            this.state=state;
        }
    }

    public static void main(String[] args) {
        Integer[] arr={50,25,12,null,null,37,30,null,null,null,75,60,null,70,null,null,87,null,null};
        Node root = new Node(arr[0],null,null);
        pair rt=new pair(root,1);

        Stack<pair> st=new Stack<>();
        st.push(rt);

        int idx=0;
        while(st.size() > 0){
            pair top=st.peek();
            if(top.state==1){
                idx++;
                if(arr[idx]!=null){
                    top.node.left=new Node(arr[idx],null,null);
                    pair lp=new pair(top.node.left,1);
                    st.push(lp);
                }
                else{
                    top.node.left=null;
                }
            }
            else if (top.state==2) {
                idx++;
                if(arr[idx]!=null){
                    top.node.right=new Node(arr[idx],null,null);
                    pair lp=new pair(top.node.right,1);
                    st.push(lp);
                }
                else{
                    top.node.right=null;
                }
                top.state++;
            }
            else {
                st.pop();
            }
        }
    }
}
