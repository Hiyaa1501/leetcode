class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        //expand the window
        for(int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right],0) + 1);
            //shrink if becomes invalid
            while(map.size() > 2) {   //{1=1, 2=1, 3=1}
                map.put(fruits[left], map.get(fruits[left])-1);  //{1=0, 2=1, 3=1}

                if(map.get(fruits[left]) == 0) {   //{1=0} -> removed
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}