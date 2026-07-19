class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;

        int missing = -1;
        int repeated = -1;

        for(int i = 1; i <= n*n; i++) {
            int count = 0;
            for(int row = 0; row < n; row++) {
                for(int col = 0; col < n; col++) {
                    if(grid[row][col] == i) {
                        count++;
                    }
                }
            }
            if(count == 2) {
                repeated = i;
            }
            else if(count == 0) {
                missing = i;
            }
            if(missing != -1 && repeated != -1) {
                break;
            }
        }
        return new int[]{repeated, missing};
    }
}