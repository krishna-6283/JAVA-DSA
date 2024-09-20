package string;

public class palindromeInASentence {
    public static void main(String[] args) {
        String str="Mom and Dad are my best friends";

        String[] arr=str.split(" ");
        int count=0;
        for(var word:arr){
            if(palindrome(word)){
                count++;
            }
        }
        System.out.println(count);

    }
    static boolean palindrome(String str){
        str=str.toLowerCase();
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            char ati=str.charAt(i);
            char atj=str.charAt(j);
            if(ati!=atj) return false;
            i++;
            j--;
        }
        return true;
    }
}
