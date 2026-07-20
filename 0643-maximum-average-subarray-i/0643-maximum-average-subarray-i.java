class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        
        //first window
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        //shift window
        for(int i = k; i < nums.length; i++) {
            sum += nums[i];  //add element
            sum -= nums[i - k];  //remove
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}