package leetcode;

import java.util.Arrays;

public class leetcode176 {
    public static void main(String[] args) {
                String[] strArray = { "30", "34", "9", "5", "301" ,"340","350"};

                // Sort the array of strings in lexicographical order
                Arrays.sort(strArray);

                // Print the sorted array
                System.out.println("Sorted array in lexicographical order: " + Arrays.toString(strArray));
    }
}
