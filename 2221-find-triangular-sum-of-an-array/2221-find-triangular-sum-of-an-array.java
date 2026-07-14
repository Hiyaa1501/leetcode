class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;

        //Keep creating the next row until only one number is left
        while(n > 1) {
            for(int i = 0; i < n-1; i++) {
                nums[i] = (nums[i] + nums[i+1]) %10;
            }
            n--;  //decrease size then again loop
        }
        return nums[0];
    }
}