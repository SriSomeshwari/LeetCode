import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Solution {
    public String largestNumber(int[] nums) {
     
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = Integer.toString(nums[i]);
        }

    
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
               
                return (s2 + s1).compareTo(s1 + s2);
            }
        });

        if (strNums[0].equals("0")) {
            return "0";
        }

     
        StringBuilder largestNum = new StringBuilder();
        for (String num : strNums) {
            largestNum.append(num);
        }

        return largestNum.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
int n=scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        System.out.println("Largest Number: " + solution.largestNumber(nums));

        scanner.close();
    }
}
