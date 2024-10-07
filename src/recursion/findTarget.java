package recursion;

import java.util.ArrayList;

public class findTarget {
    public static void main(String[] args) {
        int[] arr={10,4,6,7,6,8,9,6};
        int target=6;
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(findAllIndex(arr,target,0,list).toString());
    }
    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(target==arr[index]){
            list.add(index);
        }

        return findAllIndex2(arr,target,++index);
    }

    public static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
