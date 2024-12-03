package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class leetcode38 {
    public static void main(String[] args) {
        int n=7;
        String str="1";
        for(int i=1;i<n;i++){
            str=helper(str);
        }
        System.out.println(str);


    }
    public static String helper(String str){
        StringBuilder ans=new StringBuilder();
        char temp=str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=temp) {
                ans.append(count);
                ans.append(temp);
                temp = ch;
                count = 1;
            }
            else count++;
        }
        ans.append(count);
        ans.append(temp);


        System.out.println(ans.toString());
        return ans.toString();
    }
}
