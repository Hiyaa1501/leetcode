class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        // Find minimum and maximum possible capacity
        for(int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        while(low <= high)  {
            int mid = low + (high - low) / 2;

            int day = 1;
            int currentWeight = 0;

            for(int weight : weights) {
                if(currentWeight + weight > mid) {
                    day++;
                    currentWeight = 0;
                }
                currentWeight += weight;
            }
            if(day <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}