package leetcode;

import java.util.*;

public class leetcode1592 {
    public static void main(String[] args) {
        String text="a";
        String temp="";
        int spaces=0;
        List<String> ans=new ArrayList<>();
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch==' '){
                spaces++;
                if(temp.length()>0){
                    ans.add(temp);

                }
                temp="";
            }
            if(ch!=' '){
                temp+=ch;
            }
        }
        if(temp.length()>0){
            ans.add(temp);
        }
        for(var word:ans){
            System.out.println(word + " "+word.length());
        }
        System.out.println(spaces);
        System.out.println(ans.size());
        if(ans.size()==1){
            int esp=spaces;
        }
        else{
            int esp=spaces/(ans.size()-1);

        }
        int cnt=esp;
        System.out.println(ans.toString());
        String fin="";
        for(int i=0;i<ans.size();i++){
            fin+=ans.get(i);
            for(int j=0;j<esp;j++){
                if(spaces!=0){
                    fin+=' ';
                    spaces--;
                }

            }
        }
        System.out.println(spaces);
        for(int i=0;i<spaces;i++){
            fin+=' ';
        }

        System.out.println(fin);


    }
}
