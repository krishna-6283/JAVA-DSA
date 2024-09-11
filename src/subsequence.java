import java.util.*;

public class subsequence {
    public static void main(String[] args) {
        ArrayList<String> ans=new ArrayList<>();

        subse("","abcd");
        System.out.println(subList("","abcd"));
    }
    static void subse(String p, String up ){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subse(p + ch,up.substring(1));
        subse(p,up.substring(1));
    }
    static ArrayList<String> subList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subList(p+ch,up.substring(1));
        ArrayList<String> right=subList(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
