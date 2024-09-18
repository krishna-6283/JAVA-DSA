package leetcode;

import java.util.Arrays;

public class leetcode179 {
    public static void main(String[] args) {
        int[] nums={3,30,34,5,9};
        char[] ans=new char[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=(char)(nums[i]+'0');
        }
        System.out.println(Arrays.toString(ans));
        Arrays.sort(ans);
        String sortedStr = new String(ans);
        System.out.println(Arrays.toString(ans));

    }
}
