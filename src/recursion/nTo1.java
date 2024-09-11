package recursion;

public class nTo1 {
    public static void main(String[] args) {
        int n=10;
        num(n);
        revnum(n);
    }
    static void num(int n){
        if(n==0) return;
        System.out.println(n);
        num(n-1);
    }
    static void revnum(int n){
        if(n==0) return;
        revnum(n-1);
        System.out.println(n);
    }
}
