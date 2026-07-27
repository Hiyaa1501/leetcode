class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurrence(nums, target);
        int last = lastOccurrence(nums, target);

        return new int[]{first, last};
    }

    private int firstOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while(left <= right) {
            int mid = left + (right - left) /2;

            if(nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            } 
            else if( nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }    

    private int lastOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while(left <= right) {
            int mid = left + (right - left) /2;
            if(nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            } 
            else if( nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }
}