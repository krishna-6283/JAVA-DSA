import java.util.Scanner;

public class occurances {
    public static void main(String[] args) {
//        long  n=137965564757777L;
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int count=0;
        while(n>0){
            long rem=n%10;
            if(rem==7) {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
