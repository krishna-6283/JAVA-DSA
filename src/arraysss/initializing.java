package arraysss;
import java.util.*;
public class initializing {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums=new ArrayList<>();
//        int n;
//        System.out.println("Enter size: ");
//        n=in.nextInt();

        while(true){
            int num=in.nextInt();
            if(num==-1) break;
            nums.add(num);
        }
        int n=nums.size();
        System.out.println(n);
//        for(int i=0;i<n;i++){
//            nums.add(in.nextInt());
//        }
        System.out.println(nums);
        for(int num : nums) {
            System.out.println(num);
        }
        String ans=nums.toString();
        System.out.println(ans);

    }
}
