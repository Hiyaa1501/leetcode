class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        //row
        for(int i = 0; i <= rowIndex; i++) {
            row.add(1);
            //3-1 -> 2nd index then 1st index
            for(int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j-1)); //1+2
            }
        }
        return row;
    }
}