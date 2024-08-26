package recursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11,24,56};
        int target=24;
        int n=arr.length;
        int ans=search(arr,0,n-1,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int start,int end,int target){
        if(start>end) return -1;

        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid] > target){
            return search(arr,start,mid-1,target);
        }
        return search(arr,mid+1,end,target);
    }
}
