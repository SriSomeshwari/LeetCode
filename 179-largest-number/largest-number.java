import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String largestNumber(int[] nums) {
        // Convert integers to strings
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = Integer.toString(nums[i]);
        }

        // Sort strings using a custom comparator
        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String num1, String num2) {
                // Compare concatenated results
                return (num2 + num1).compareTo(num1 + num2);
            }
        });

        // Edge case: if the largest number is "0", return "0"
        if (numStrs[0].equals("0")) {
            return "0";
        }

        // Concatenate all numbers to form the largest number
        StringBuilder largestNumber = new StringBuilder();
        for (String numStr : numStrs) {
            largestNumber.append(numStr);
        }

        return largestNumber.toString();
    }

    public static void main(String[] args) {
        // Test the Solution class
        Solution solution = new Solution();
        
        // Test case 1
        int[] nums1 = {10, 2};
        System.out.println(solution.largestNumber(nums1));  // Output: "210"
        
        // Test case 2
        int[] nums2 = {3, 30, 34, 5, 9};
        System.out.println(solution.largestNumber(nums2));  // Output: "9534330"
        
        // Test case 3
        int[] nums3 = {0, 0};
        System.out.println(solution.largestNumber(nums3));  // Output: "0"
    }
}
