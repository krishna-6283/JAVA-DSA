package recursion;

import java.util.*;

public class tryyy {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr={1,3,3,4,5,6,7,7,2};

        ans = helper(arr,0);
        System.out.println(ans);
    }
    static ArrayList<Integer> helper(int[] arr,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length) return list;
        list.add(arr[index]);
        return helper(arr,++index);
    }
}
