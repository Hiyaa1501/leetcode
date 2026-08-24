class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            int missing = arr[mid] - (mid + 1);     //missing = actual - expected

            if(missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + k;

        // low = number of array elements before the answer
        // k   = number of missing numbers we want
    }
}