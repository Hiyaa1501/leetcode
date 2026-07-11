class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int num : nums) {
            //ignore duplicates
            if(num == first || num == second || num == third) {
                continue;
            }
            if(num > first) {
                third = second;
                second = first;
                first = num;
            }
            else if(num > second) {
                third = second;
                second = num;
            }
            else if(num > third){
                third = num;
            }
        }
        if(third == Long.MIN_VALUE) {  //if third doesnt exist
            return (int)first; //if third doesnt exist 1st will return
        }
        return (int)third;
    }
}