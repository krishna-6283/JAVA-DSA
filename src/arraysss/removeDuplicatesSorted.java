package arraysss;

import java.util.*;

public class removeDuplicatesSorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");

        int n = in.nextInt();
        int[] arr=new int[n];

        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=in.nextInt();
            nums.add(num);
            arr[i]=num;
        }
        in.close();
        if(n==1) System.out.println(n);
        int k=1;
        for(int i=1;i<n;i++){
            if(nums.get(i) != nums.get(i-1)){
                nums.set(k,nums.get(i));
                k++;
            }
        }
        System.out.println(nums);
        for(int i=nums.size()-1;i>=k;i--){
            nums.remove(i);
        }
        int l=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr[l]=arr[i];
                l++;
            }
        }


        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));

        System.out.println(nums);



    }
}
