package recursion;

import java.util.*;

public class subsetsd {
    public static void sub(List<Integer> list, List<Integer> ans,int idx, int n){

//            if(ans.size()==0){
//                System.out.println("{}");
//                return;
//            }
            if(idx>=n) {
                System.out.println(ans.toString());
                return;
            }


        ans.add(list.get(idx));
        sub(list,ans,idx+1,n);
        ans.remove(ans.size()-1);
        sub(list,ans,idx+1,n);
    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer> ans=new ArrayList<>();
        sub(list,ans,0,list.size());
    }
}
