package recursion;

public class palindrome {
    public static void main(String[] args) {
        int num=2521;
        int temp=num;
        int prod=0;
        System.out.println(pal(num,temp,prod));
    }
    static boolean pal(int num,int temp,int prod){
        if(num==0){
            System.out.println(temp+" "+ prod/10);
            return temp == prod/10;
        }
        int rem=num%10;
        prod+=rem;

        return pal(num/10,temp,prod*10);


    }
}
