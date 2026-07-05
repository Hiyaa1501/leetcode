class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int num : nums) {
            if(num > 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        int[] ans = new int[nums.length];

        for(int i = 0; i < pos.size(); i++) {
            ans[2*i] = pos.get(i);
            ans[2*i+1] = neg.get(i);
        }
        return ans;
    }
}