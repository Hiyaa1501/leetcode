class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        long N = (long) n * n;

        long expectedSum = (long) N*(N+1)/2;
        long expectSumSquare = (long) N*(N+1)*(2*N+1)/6;

        long actualSum = 0;
        long actualSumSquare = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                actualSum += grid[i][j];
                actualSumSquare += (long) grid[i][j] * grid[i][j];
            }
        }

        long diff = actualSum - expectedSum;
        long sqDiff = actualSumSquare - expectSumSquare;

        long sum = (long) sqDiff/diff; //x+y

        int repeating = (int) ((sum + diff)/2);  //(x-y)(x+y)/2
        int missing = (int) (sum - repeating);  //y = sum - x

        return new int[]{repeating, missing};
    }
}