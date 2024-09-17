package leetcode;

import java.util.*;

public class leetcode20 {
    public static boolean valid(String str){
        Stack<Character> st= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') st.push(ch);

            else{
                if(st.empty()) return false;
                char top=st.peek();
                st.pop();
                if((top=='(' && ch==')') || (top=='{' && ch=='}') || (top=='[' && ch==']'))
                    continue;
                else return false;
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        String str="()[]{}";
        System.out.println(valid(str));

    }
}
