package leetcode;

public class leetcode1903 {
    public static void main(String[] args) {
        String s="35427";
        for(int i=s.length()-1;i>=0;i--){
            int digit=s.charAt(i)-'0';
            if(digit%2!=0) {
                System.out.println(s.substring(0,i+1));
                break;
            }
        }
    }
}
