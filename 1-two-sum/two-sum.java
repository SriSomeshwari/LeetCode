class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n2 = nums.length;
        for (int ind = 0; ind < n2 - 1; ind++) {
            for (int j = ind + 1; j < n2; j++) {
                if (nums[ind] + nums[j] == target) {
                    return new int[]{ind, j};
                }
            }
        }
        return new int[]{};
    }
}