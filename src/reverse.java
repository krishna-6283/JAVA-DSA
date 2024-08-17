import java.util.Scanner;

import static java.lang.Math.pow;

public class reverse {
    public static void main(String[] args) {

        int n=23579;
        int ans=0;

        while(n>0){
            int rem=n%10;
            ans=ans * 10 + rem;
            n/=10;

        }
        System.out.println(ans);
        Scanner in = new Scanner(System.in);
//        int a= in.nextInt();
//        int b=in.nextInt();
//
//        System.out.println(a/b);

    }
}
