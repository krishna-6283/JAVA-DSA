package arraysss;

import java.util.Arrays;
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        for(int i=2;i>=0;i--){
            for(int j=2;j>=0;j--){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        for(int j=0;j<3;j++){
            for(int i=2;i>=0;i--){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
