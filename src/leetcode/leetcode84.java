package leetcode;

import java.util.*;

public class leetcode84 {
    public static void main(String[] args) {
        String s1="Luthra bhen ka loda hai";
        String s2="Luthra bhen ka pakoda hai";
        ArrayList<String> arr1=new ArrayList<>();
        ArrayList<String> arr2=new ArrayList<>();
        String temp="";
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch==' '){
                arr1.add(temp);
                temp="";
            }
            temp+=ch;
        }
        if(temp.length()>0) arr1.add(temp);
        temp="";
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(ch==' '){
                arr2.add(temp);
                temp="";
            }
            temp+=ch;
        }
        if(temp.length()>0) arr2.add(temp);

        System.out.println(arr1.toString());
        System.out.println(arr2.toString());

        Map<String,Integer> mp=new HashMap<>();

        for(String item:arr1){
            if(mp.containsKey(item)){
                mp.put(item,mp.get(item)+1);
            }
            else{
                mp.put(item,1);
            }
        }
        for(String item:arr2){
            if(mp.containsKey(item)){
                mp.put(item,mp.get(item)+1);
            }
            else{
                mp.put(item,1);
            }
        }
        String[] ans=new String[2];
        int i=0;
        for(Map.Entry<String,Integer> entry:mp.entrySet()){
            if(entry.getValue()==1) {
                if(entry.getKey().trim()!=null){
                    ans[i]=(entry.getKey().trim());
                    i++;
                }

            }
        }
        System.out.println(ans);
    }
}
