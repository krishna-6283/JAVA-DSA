package string;

import java.util.Arrays;

public class swapFirstAndLastChar {
    public static void main(String[] args) {
        String str="Code Quotient";
        StringBuilder sb=new StringBuilder();
        String[] arr=str.split(" ");
        for(var word:arr){
             char[] charArr=word.toCharArray();
             char a=charArr[charArr.length-1];
             charArr[charArr.length-1]=charArr[0];
             charArr[0]=a;
             sb.append(new String(charArr));
             sb.append(" ");

        }
        System.out.println(sb.toString().trim());

    }
}
