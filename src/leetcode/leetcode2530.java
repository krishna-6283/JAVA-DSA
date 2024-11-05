package leetcode;
import java.util.*;
public class leetcode2530 {
    public static void main(String[] args) {
        int[] nums={1,10,3,3,3};
        int k=3;
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:nums){
            pq.add(i);
        }
        int score=0;
        while(k>0){
            k--;
            int x=pq.poll();
            System.out.println(x);
            double r= (double) x /3;
            score+=x;
            double add=Math.ceil(r);
//            System.out.println(r);
            pq.add((int) add);
        }
        System.out.println(score);
    }
}
