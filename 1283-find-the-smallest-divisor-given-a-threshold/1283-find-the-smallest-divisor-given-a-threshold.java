class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;

        //find high
        for(int num : nums) {
            high = Math.max(high, num);
        }

        while(low < high) {
            int mid = low + (high - low) / 2;

            int sum = 0;

            for(int num : nums) {
                sum += (num + mid - 1) / mid;
            }

            if(sum <= threshold) {
                high = mid;   //search left
            } else {
                low = mid + 1;  //search right
            }
        }
        return low;
    }
}