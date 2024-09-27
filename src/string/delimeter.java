package string;

public class delimeter {
    public static void main(String[] args) {
        String words="hello world welcome";
        String del="->";
        words=words.replace(" ",del);
        System.out.println(words);
    }
}
