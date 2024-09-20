package leetcode;
import java.util.*;
public class leetcode628 {
    public static void main(String[] args) {
        int nums[]={1,3,7,-9,4};
        ArrayList<Integer> modded=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            modded.add(Math.abs(nums[i]));
        }
        Collections.sort(modded);
        int n = modded.size();
        int prod=modded.get(n-1)*modded.get(n-2);
        int temp=prod;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            prod=temp;
            prod*=nums[i];
            ans=Math.max(ans,prod);

        }
        System.out.println(ans);

    }
}
