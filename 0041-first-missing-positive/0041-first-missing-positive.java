class Solution {
    public int firstMissingPositive(int[] nums) {                          //nums = [3, 4, -1, 1]

        for(int i = 0; i < nums.length; i++) {
            while(nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] -1] != nums[i]) {     //1 should be at index 0
                int temp = nums[i];        //temp = 3                                         //Correct index = value - 1
                nums[i] = nums[temp-1];    //nums[0] = nums[3-1] -> nums[0] = nums[2]
                nums[temp -1] = temp;      //nums[2] = 3         -> [-1, 4, 3, 1]
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) {
                return i+1;
            }
        }
        return nums.length + 1;   //[1,2,0] -> no missing so n+1 is returned
    }
}