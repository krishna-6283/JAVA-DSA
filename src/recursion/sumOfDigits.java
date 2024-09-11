package recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        int n=5002;
        int sum=0;
        System.out.println(summ(n,sum));
    }

    private static int summ(int n,int sum) {
        if(n==0) return sum;
        int rem=n%10;
        sum+=rem;
        return summ(n/10,sum);
    }
}
