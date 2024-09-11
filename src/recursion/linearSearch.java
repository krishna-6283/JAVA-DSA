package recursion;

import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,4,4,4,6,4,9};
        int target=4;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        helper(arr,target,0,ans);
        System.out.println(ans);
    }

    private static ArrayList<Integer> helper(int[] arr, int target, int index, ArrayList<Integer> ans) {
        if(arr.length==index) return ans;

        if(arr[index]==target) {
            ans.add(index);
        }
        return helper(arr,target,++index,ans);
    }
}
