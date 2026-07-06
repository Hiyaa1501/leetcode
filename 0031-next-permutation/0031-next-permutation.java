class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakpoint = -1;

        for(int i = n-2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                breakpoint = i;
                break;
            }
        }
        if(breakpoint != -1) {
            for(int j = n-1; j > breakpoint; j--) {
                if(nums[j] > nums[breakpoint]) {
                    swap(nums, j, breakpoint);
                    break;
                }
            }
        }
    reverse(nums, breakpoint+1, n-1);
    }
        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        private void reverse(int[] nums, int left, int right) {
            while(left < right) {
                swap(nums, left, right);
                left++;
                right--;
        }
    }
}