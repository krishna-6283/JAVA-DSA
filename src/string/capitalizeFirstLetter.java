package string;
import java.util.*;
public class capitalizeFirstLetter {
    public static void main(String[] args) {
        String str="code quotient";
        StringBuilder result=new StringBuilder();
        String[] arr=str.split(" ");
        for(var words:arr){
            char[] charArr=words.toCharArray();
            char ch=(char)(charArr[0]-32);
            charArr[0]=ch;
            result.append(new String(charArr));
            result.append(" ");
        }
        String ans=(new String(result));
        System.out.println(ans.trim());
        //97   65
        String f = "Girdhar";
        String l = "Bansal";
        String m = "G.";
        System.out.println(l);
        System.out.println("My name is " + f);
        System.out.println(f + " " + l);
        System.out.println(l + ", " + f + " " + m);
        System.out.println(m + " is for Gopal");
        String str1 = "Code Quotient";
        String str2 = "Get better at Coding";
        str1.toLowerCase().indexOf("Q");
    }
}
