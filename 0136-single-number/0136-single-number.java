class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        //xor of all numbers 
        for(int num : nums){
            xor ^= num;
        }
        return xor;
    }
}