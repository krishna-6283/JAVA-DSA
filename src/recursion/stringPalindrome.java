package recursion;

public class stringPalindrome {
    public static void main(String[] args) {
        String str="abccdcba";
        System.out.println(palindrome(str,0,str.length()-1));
    }
    public static boolean palindrome(String str,int l,int r){
        if(l>=r) return true;
        if(str.charAt(l)!=str.charAt(r)) return false;
        return palindrome(str,l+1,r-1);
    }
}
