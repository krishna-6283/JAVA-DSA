package string;

public class reverseString {
    public static void main(String[] args) {
        String str="Gopal Krishna";
        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }
}
