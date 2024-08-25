package arraysss;

import java.util.Arrays;
import java.util.Collections;

public class largetEle {
    public static void main(String[] args) {
        int[] arr= {1,4,57,8,3,58 ,66};

        int maxele=arr[0];
        for(int i =0;i<arr.length;i++){
            maxele=Math.max(maxele,arr[i]);
        }
        System.out.println(maxele);
        int n=arr.length;
        int[] newDigits = new int[n+1];
        newDigits[0]=1;
        System.out.println(Arrays.toString(newDigits));

        int[] b= arr;
        Arrays.sort(b);
        Collections.reverse(Arrays.asList(b));
        System.out.println(Arrays.toString(b));
    }
}
