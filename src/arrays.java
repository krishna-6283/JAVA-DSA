import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
//        int[] arr = new int[5];

        Scanner in = new Scanner(System.in);

//        for(int i=0; i<arr.length;i++){
//            arr[i]=in.nextInt();
//        }
//
//        for(int num : arr){
//            System.out.println(num + " ");
//        }
//        System.out.println(Arrays.toString(arr));


        int arr2d[][] = new int[3][3];

        for(int i =0;i<arr2d.length;i++){
            for(int j=0;j<arr2d[i].length;j++){
                arr2d[i][j]=in.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr2d));

    }
}
