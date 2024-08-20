public class palindrome {
    public static void main(String[] args) {
        String s = "abcdedcba";
        System.out.println(pal(s));
    }
    static boolean pal(String s){
        int start=0;
        int end=s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}
