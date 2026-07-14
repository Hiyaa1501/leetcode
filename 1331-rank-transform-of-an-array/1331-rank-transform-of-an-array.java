class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for(int num : sorted) {
            //check: number already has rank
            if(!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }
        //replace original array
        for(int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}