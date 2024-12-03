package recursion;

import java.util.*;

public class findCombinations {
    public static void main(String[] args) {
        int[] arr={2,3,5};
        int target=8;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(0,arr,ans,list,target);
        for (List<Integer> row : ans) {
            System.out.println(row);
        }
    }
    public static void helper(int idx,int[] arr,List<List<Integer>> ans,List<Integer> list,int target){
        if(idx==arr.length){
            if(target==0) ans.add(new ArrayList<>(list));
            return;
        }
        if(arr[idx]<=target){
            list.add(arr[idx]);
            helper(idx,arr,ans,list,target-arr[idx]);
            list.remove(list.size()-1);
        }
        helper(idx+1,arr,ans,list,target);
    }
}
