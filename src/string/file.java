package string;

public class file {
    public static void main(String[] args) {
        String str = new String("Hello");
        str.concat(", World!");
        String sub = str.substring(1, 4);
        System.out.println(sub);
        String lower = str.toLowerCase();
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
    }
}
