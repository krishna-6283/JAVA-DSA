package recursion;

public class reverse {
    public static void main(String[] args) {
        int num=1234;
        int prod=0;
        System.out.println(rev(num,prod));
    }
    static int rev(int num,int prod){
        if(num==0) return prod/10;
        int rem=num%10;
        prod+=rem;
        return rev(num/10,prod*10);
    }

}
