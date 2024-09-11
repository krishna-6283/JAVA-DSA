package recursion;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 11, 2, 4};
        int target = 2;
        System.out.println(helper(arr, target, 0, arr.length - 1));
    }

    static int helper(int[] arr, int target, int s, int e) {
        if (s > e) return -1;

        int m = s + (e - s) / 2;

        if (arr[m] == target) return m;

        // Check if the left side is sorted
        if (arr[s] <= arr[m]) {
            // Check if the target lies in the left sorted part
            if (target >= arr[s] && target < arr[m]) {
                return helper(arr, target, s, m - 1);
            } else {
                return helper(arr, target, m + 1, e);
            }
        }
        // Else, the right side must be sorted
        else {
            // Check if the target lies in the right sorted part
            if (target > arr[m] && target <= arr[e]) {
                return helper(arr, target, m + 1, e);
            } else {
                return helper(arr, target, s, m - 1);
            }
        }

        // In case no conditions are met (though logically they should be)
    }
}
