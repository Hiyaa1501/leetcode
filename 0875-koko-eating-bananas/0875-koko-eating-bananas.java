class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        //count high
        for(int pile : piles) {
            high = Math.max(high, pile);
        }

        while(low <= high) {
            int mid = low + (high - low) / 2;

            long hours = 0;
            //calculate hours
            for(int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if(hours <= h) {    //if finished earlier try smaller speed
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}