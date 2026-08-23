class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m*k > bloomDay.length) {
            return -1;
        }

        int left = 1;
        int right = 0;

        //max blooming day
        for(int day : bloomDay) {
            right = Math.max(right , day);
        }

        while(left <= right) {
            //no of days we are testing
            int mid = left + (right - left) / 2;

            int bouquets = 0;
            int count = 0;

            for(int day : bloomDay) {
                //flower has bloomed
                if(day <= mid) {
                    count++;
                } else {
                    count = 0;
                }
                if(count == k) {  //one bouquet
                    bouquets++;
                    count = 0;
                }
            }

            if(bouquets >= m) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}