package leetcode;

import java.util.*;

public class leetcode451 {
    public static void main(String[] args) {
        Map<Character,Integer> mp=new HashMap<>();
        String s="tree";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        ArrayList<String> ans=new ArrayList<>();
        for(var itr:mp.entrySet()){
            String temp="";
            temp+=itr.getValue();
            temp+=itr.getKey();
            ans.add(temp);
        }
        Collections.sort(ans);
        String fin="";
        for(int i=ans.size()-1;i>=0;i--){
            String temp=ans.get(i);
            int ch=temp.charAt(0)-'0';
            for(int j=0;j<ch;j++){
                char h=temp.charAt(1);
                fin+=h;
            }
        }
    }
}
