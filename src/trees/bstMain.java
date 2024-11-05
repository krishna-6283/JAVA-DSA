package trees;

import java.util.*;

public class bstMain {
    public static void bfs(BST.Node root){
        if(root==null) return;

        Queue<BST.Node> queue =new LinkedList<>();
        queue.offer(root);  // Start with the root node in the queue

        while (!queue.isEmpty()) {
            BST.Node current = queue.poll();  // Dequeue the front node
            System.out.print(current.getVal() + " ");  // Process the node (print its value)

            // Enqueue the left child if it exists
            if (current.left != null) {
                queue.offer(current.left);
            }

            // Enqueue the right child if it exists
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }

    public static void levelOrderSuccessor(BST.Node root,int k){
        Queue<BST.Node> q=new LinkedList<>();
        q.offer(root);
        if(root==null) return;
        List<Integer> list=new ArrayList<>();
        while (!q.isEmpty()) {
            BST.Node node = q.poll();
            list.add(node.val);  // Add current node's value to the list

            // Add left and right children to the queue
            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == k) {
                if (i == list.size() - 1) {
                    // If 'k' is the last element, no successor
                    System.out.println("No successor found");
                } else {
                    // Print the next element as the successor
                    System.out.println(list.get(i + 1));
                }
                return;
            }
        }
    }


    public static void main(String[] args) {
        BST tree= new BST();
        int[] nums={4,6,2,9,1,7,3,8,10};
        tree.populate(nums);
        tree.display();
        tree.pdisplay();
        BST.Node root=tree.getRoot();
        System.out.println(root.getVal());
//        bfs(root);
        levelOrderSuccessor(root,2);



    }

}
