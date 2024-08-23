package arraysss;

import java.lang.reflect.Array;
import java.util.*;

public class minimumHeight {
    public static void main(String[] args) {
        int n=6,k=5;
        int[] arr= new int[n];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int res=arr[n-1] - arr[0];
        for(int i =1;i<=n-1;i++){
            int maxele=Math.max(arr[n-1]-k,arr[i-1]+k);
            int minele=Math.min(arr[0]+k,arr[i]-k);
            res=Math.min(res,maxele-minele);
        }
        System.out.println(res);
    }
}
