package leetcode;

import java.util.*;
public class leetcode151 {
    public static void main(String[] args) {
        String s="a good   example";
        String str=s.trim();
        List<String> arr=new ArrayList<>();
        String temp="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                temp+=ch;
            }
            if(ch==' ') {
                if(temp.length()>0){
                    arr.add(temp.trim());

                }
                temp="";
            }
        }
        if(temp.length()>0) arr.add(temp);
        String ans="";
        for(int i=arr.size()-1;i>=0;i--){
            System.out.println(arr.get(i));
            ans+=arr.get(i);
            if(i!=0) ans+=' ';
        }
        System.out.println(ans);
    }
}
