class Solution {
    public int[] findPeakGrid(int[][] mat) {
       int rows = mat.length;
        int cols = mat[0].length;

        int left = 0;
        int right = cols - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Find maximum element in middle column
            int maxRow = 0;

            for (int i = 1; i < rows; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            // Current element
            int current = mat[maxRow][mid];

            // Left and right neighbors
            int leftValue = (mid > 0) ? mat[maxRow][mid - 1] : -1;
            int rightValue = (mid < cols - 1) ? mat[maxRow][mid + 1] : -1;

            // Peak found
            if (current > leftValue && current > rightValue) {
                return new int[]{maxRow, mid};
            }

            // Move left
            if (leftValue > current) {
                right = mid - 1;
            }

            // Move right
            else {
                left = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}