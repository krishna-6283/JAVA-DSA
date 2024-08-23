package arraysss;

public class maxChunksToSort {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,4};
        int ans=0,srt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > srt) srt=arr[i];
            if(srt==i) ans++;
        }
        System.out.println(ans);
    }
}
