class Solution {
    public void moveZeroes(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
               int temp=nums[res];
               nums[res]=nums[i];
               nums[i]=temp;
               res++;
            }
        }
   
    }
}