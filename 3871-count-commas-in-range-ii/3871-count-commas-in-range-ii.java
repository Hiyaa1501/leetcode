class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long max = 1000;  //first comma

        while(max <= n) {
            ans += n - max + 1; //1005 - 1000 + 1
            max *= 1000;  //2nd comma
        }
        return ans;
    }
}