package arraysss;

public class largetEle {
    public static void main(String[] args) {
        int[] arr= {1,4,57,8,3,58 ,66};

        int maxele=arr[0];
        for(int i =0;i<arr.length;i++){
            maxele=Math.max(maxele,arr[i]);
        }
        System.out.println(maxele);
    }
}
