class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum  = nums[0];  //first element as maximum sum

        for(int num : nums) {
            sum += num;
            maxSum = Math.max(maxSum, sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}