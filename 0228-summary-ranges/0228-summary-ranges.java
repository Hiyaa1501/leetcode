class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        int n = nums.length;
        int start = 0;

        for(int i = 0; i < n; i++) {
            if(i == n-1 || nums[i] + 1 != nums[i+1]) {  //2+1 != 4
                //if single number
                if(start == i) {  //start = 7
                    ans.add(String.valueOf(nums[start]));  //Converts integer to String
                }
                else{
                    ans.add(nums[start] + "->" + nums[i]);
                }
                start = i+1;
            }
        }
        return ans;
    }
}