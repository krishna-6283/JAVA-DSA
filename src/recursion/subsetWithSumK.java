package recursion;

import java.util.*;

public class subsetWithSumK {
    public static void Subset(List<Integer> list,List<Integer> ans,int idx,int n,int sum,int k){
        if(idx>=n){
            if(sum==k){
                System.out.println(ans.toString());
            }
            return;
        }
        ans.add(list.get(idx));
        sum+=list.get(idx);
        Subset(list,ans,idx+1,n,sum,k);
        ans.remove(ans.size()-1);
        sum-=list.get(idx);

        Subset(list,ans,idx+1,n,sum,k);

    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Subset(list,ans,0,list.size(),0,9);
    }
}
