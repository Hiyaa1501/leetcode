class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m*k > bloomDay.length) {
            return -1;
        }

        int low = 1;
        int high = 0;

        //find high
        for(int day : bloomDay) {
            high = Math.max(high, day);
        }

        while(low <= high) {
            int mid = low + (high - low) / 2;

            int bouquet = 0;
            int count = 0;

            for(int day : bloomDay) {
                if(day <= mid) {   //flower has bloomed
                    count++;
                } else {        //not bloomed
                    count = 0;
                }

                if(count == k) { //check wether collected k flowers
                    bouquet++;
                    count = 0;
                }
            }

            if(bouquet >= m) {       //more bouquet then search left
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}